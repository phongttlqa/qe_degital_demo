package Bonus;

import jxl.*;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    private static List<SinhVien> sinhViens = new ArrayList<>();

    public static void main(String[] args) throws BiffException, IOException {
        loadData(sinhViens);
//        showDanhSachSV(sinhViens);
        sapXepSVTheoTen(sinhViens);
//        showDanhSachSV(sinhViens);
//        sapXepSVTheoNamSinh(sinhViens);
//        sapXepSVTheoHocLuc(sinhViens);
//        showDanhSachSV(sinhViens);
        editNameSV(sinhViens);
        showDanhSachSV(sinhViens);

    }


    private static void editNameSV(List<SinhVien> sinhViens) {
        String[] plusNames = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "K", "L", "M", "N"};
        for (int i = 0; i < sinhViens.size(); i++) {
            int flag = 0;
            String name = sinhViens.get(i).getTen();
            for (int j = i+1; j < sinhViens.size(); j++) {
                if (name.equals(sinhViens.get(j).getTen())) {
                    sinhViens.get(j).setTen(sinhViens.get(j).getTen() + " " + plusNames[flag+1]);
                    flag ++;
                }
            }
            if (flag > 0) {
                sinhViens.get(i).setTen(sinhViens.get(i).getTen() + " " + plusNames[0]);
            }
        }
    }

    private static List<SinhVien> getStudentGoods(List<SinhVien> sinhViens) {
        List<SinhVien> goodlist = new ArrayList<>();
        for (SinhVien sinhVien : sinhViens) {
            if (sinhVien.getXepLoai().equals("Giỏi")) {
                goodlist.add(sinhVien);
            }
        }
        return goodlist;
    }

    private static List<SinhVien> getStudentCNTTs(List<SinhVien> sinhViens) {
        List<SinhVien> cnttlist = new ArrayList<>();
        for (SinhVien sinhVien : sinhViens) {
            if (sinhVien.getNganh().equals("CNTT")) {
                cnttlist.add(sinhVien);
            }
        }
        return cnttlist;
    }

    private static List<SinhVien> getStudent57s(List<SinhVien> sinhViens) {
        List<SinhVien> list = new ArrayList<>();
        for (SinhVien sinhVien : sinhViens) {
            if (sinhVien.getKhoa().contains("57")) {
                list.add(sinhVien);
            }
        }
        return list;
    }

    private static List<SinhVien> getStudentNamChan(List<SinhVien> sinhViens) {
        List<SinhVien> list = new ArrayList<>();
        for (SinhVien sinhVien : sinhViens) {
            String[] svns = sinhVien.getSinhNhat().split("/");
            if (Integer.parseInt(svns[2]) % 2 == 0) {
                list.add(sinhVien);
            }
        }
        return list;
    }

    private static void sapXepSVTheoTen(List<SinhVien> sinhViens) {
        sinhViens.sort((sv1, sv2) -> sv1.getTen().compareTo(sv2.getTen()));
    }

    private static void sapXepSVTheoNamSinh(List<SinhVien> sinhViens) {
        Collections.sort(sinhViens, (o1, o2) -> {
            String[] oo1 = o1.getSinhNhat().split("/");
            String[] oo2 = o2.getSinhNhat().split("/");
            return oo1[2].compareTo(oo2[2]);
        });
    }

    private static void sapXepSVTheoHocLuc(List<SinhVien> sinhViens) {
        Collections.sort(sinhViens, (o1, o2) -> {
            return o1.getXepLoai().compareTo(o2.getXepLoai());
        });
        for (int i = 0; i < sinhViens.size(); i++) {
            for (int j = i + 1; j < sinhViens.size(); j++) {
                if (sinhViens.get(i).getXepLoai().equals("Trung bình") &&
                        sinhViens.get(j).getXepLoai().equals("Trung bình khá")) {
                    swapSV(sinhViens, i, j);
                }
            }
        }
    }

    private static void swapSV(List<SinhVien> sinhViens, int i, int j) {
        SinhVien sinhVien = sinhViens.get(i);
        sinhViens.set(i, sinhViens.get(j));
        sinhViens.set(j, sinhVien);
    }

    private static void showDanhSachSV(List<SinhVien> sinhViens) {
        for (SinhVien sinhVien : sinhViens) {
            sinhVien.showInformation();
        }
    }

    private static void loadData(List<SinhVien> sinhViens) throws IOException, BiffException {
        WorkbookSettings ws = new WorkbookSettings();
        ws.setEncoding("Cp1252"); // setting dòng này để không bị lỗi font
        Workbook workbook = Workbook.getWorkbook(new File("C:/Users/phongtt5/IdeaProjects/Buoi1/src/Bonus/data.xls"), ws);
        Sheet sheet = workbook.getSheet(0);
        for (int row = 1; row < 151; row++) {
            SinhVien sinhVien = new SinhVien();
            for (int col = 0; col < 7; col++) {
                Cell cell = sheet.getCell(col, row);

                String value = cell.getContents();
                if (col == 0) sinhVien.setMaSV(value);
                if (col == 1) sinhVien.setHo(value);
                if (col == 2) sinhVien.setTen(value);
                if (col == 3) {
                    sinhVien.setSinhNhat(value);
                }
                if (col == 4) sinhVien.setKhoa(value);
                if (col == 5) sinhVien.setXepLoai(value);
                if (col == 6) sinhVien.setNganh(value);
            }
            sinhViens.add(sinhVien);
        }
        workbook.close();
        String[] ss = sinhViens.get(149).getSinhNhat().split("/");
        System.out.println(sinhViens.size() + sinhViens.get(149).getSinhNhat() + ss[1]);
    }
}

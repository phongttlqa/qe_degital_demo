package Bonus;

import jxl.*;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    private static final int SEARCH_BY_NAME = 1;
    private static final int SEARCH_BY_MASV = 0;
    private static List<SinhVien> sinhViens = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static SinhVien searchSV = new SinhVien();

    public static void main(String[] args) throws BiffException, IOException {
        loadData(sinhViens);
//        showDanhSachSV(sinhViens);
//        sapXepSVTheoTen(sinhViens);
//        showDanhSachSV(sinhViens);
//        sapXepSVTheoNamSinh(sinhViens);
//        sapXepSVTheoHocLuc(sinhViens);
//        showDanhSachSV(sinhViens);
//        editNameSV(sinhViens);
//        showDanhSachSV(sinhViens);
        manager();
    }

    private static void manager() {
        switch (showMenu()) {
            case 1:
                addSV();
                manager();
                break;
            case 2:
                searchSV();
                manager();
                break;
            case 0:
                break;
        }
    }


    private static int showMenu() {
        int number;
        do {
            System.out.println("========== QUẢN LÝ SINH VIÊN ========");
            System.out.println("1 . Thêm sinh viên");
            System.out.println("2 . Tìm kiếm sinh viên");
            System.out.println("0 . Thoát");
            System.out.println("========== Chọn : ");
            number = scanner.nextInt();
        } while (number != 1 && number != 2 && number != 0);
        return number;
    }

    private static int showMenuSearch() {
        int number;
        do {
            System.out.println("1 . Tìm kiếm theo tên");
            System.out.println("2 . Tìm kiếm theo mã sv");
            number = scanner.nextInt();
        } while (number != 1 && number != 2);
        return number;
    }

    public static void searchSV() {
        String search = "";
        System.out.println("========== TÌM KIẾM SINH VIÊN ========");
        boolean flag = false;
        int typeSearch = SEARCH_BY_NAME;
        switch (showMenuSearch()) {
            case 1:
                System.out.println("Nhập tên sinh viên muốn tìm kiếm : ");
                scanner.nextLine();
                search = scanner.nextLine();
                System.out.println("Kết quả tìm kiếm : ");
                for (SinhVien s : sinhViens) {
                    if (s.getTen().contains(search)) {
                        flag = true;
                        s.showInformation();
                        searchSV = s;
                        break;
                    }
                }
                break;
            case 2:
                typeSearch = SEARCH_BY_MASV;
                System.out.println("Nhập mã sinh viên muốn tìm kiếm : ");
                scanner.nextLine();
                search = scanner.nextLine();
                System.out.println("Kết quả tìm kiếm : ");
                for (SinhVien s : sinhViens) {
                    if (s.getMaSV().contains(search)) {
                        flag = true;
                        s.showInformation();
                        searchSV = s;
                        break;
                    }
                }
                break;
        }
        if (!flag) {
            System.out.println("SV không tồn tại!");
            suggestSearch(search, typeSearch);
        } else {
            switch (showMenuEditAndDeleteSV()) {
                case 1:
                    editSV();
                    break;
                case 2:
                    deleteSV();
                    break;
                case 3:
                    manager();
                    break;
            }
        }
    }

    private static void deleteSV() {
        for (SinhVien sinhVien : sinhViens) {
            if (sinhVien.getMaSV().equals(searchSV.getMaSV())) {
                sinhViens.remove(sinhVien);
                System.out.println("Đã xóa thành công sinh viên !");
                searchSV = null;
                break;
            }
        }
    }

    private static void editSV() {
        if (searchSV == null) {
            System.out.println("Sinh viên này không tồn tại !");
        } else {
            searchSV.showInformation();
            switch (showMenuEdit()) {
                case 1:
                    System.out.println("Nhập tên mới : ");
                    scanner.nextLine();
                    String newName = scanner.nextLine();
                    searchSV.setTen(newName);
                    break;
                case 2:
                    System.out.println("Nhập họ mới : ");
                    scanner.nextLine();
                    String ss = scanner.nextLine();
                    searchSV.setHo(ss);
                    break;
            }
            searchSV.showInformation();
        }
    }

    private static int showMenuEdit() {
        int number;
        do {
            System.out.println("1 . Chỉnh sửa tên sv");
            System.out.println("2 . Chỉnh sửa họ sv");
            number = scanner.nextInt();
        } while (number != 1 && number != 2);
        return number;
    }

    private static int showMenuEditAndDeleteSV() {
        int number;
        do {
            System.out.println("1 . Chỉnh sửa thông tin sv");
            System.out.println("2 . Xóa sv");
            System.out.println("3 . Quay trở lại menu quản lý sinh viên");
            number = scanner.nextInt();
        } while (number != 1 && number != 2 && number != 3);
        return number;
    }

    public static String inputString(String s) {
        System.out.print(s);
        return scanner.nextLine();
    }

    public static void addSV() {
        SinhVien sinhVien = new SinhVien();
        System.out.println("========== THÊM SINH VIÊN ========");
        //
        sinhVien.setMaSV(randomMaSV());
        scanner.nextLine();
        sinhVien.setHo(inputString("Họ : "));
        sinhVien.setTen(inputString("Tên : "));
        sinhVien.setSinhNhat(inputString("Sinh nhật : "));
        sinhVien.setKhoa(inputString("Khoa : "));
        sinhVien.setXepLoai(inputString("Xếp loại : "));
        sinhVien.setNganh(inputString("Ngành : "));
        //
        sinhViens.add(sinhVien);
        //
        System.out.println("SV mới là : ");
        sinhVien.showInformation();
    }

    private static String randomMaSV() {
        sinhViens.sort((sv1, sv2) -> sv1.getMaSV().compareTo(sv2.getMaSV()));
        return String.valueOf(Double.parseDouble(sinhViens.get(sinhViens.size() - 1).getMaSV()) + 1);
    }


    private static void editNameSV(List<SinhVien> sinhViens) {
        String[] plusNames = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "K", "L", "M", "N", "O", "P", "Q", "X", "Y", "Z"};
        for (int i = 0; i < sinhViens.size(); i++) {
            int flag = 0;
            String name = sinhViens.get(i).getTen();
            for (int j = i + 1; j < sinhViens.size(); j++) {
                if (name.equals(sinhViens.get(j).getTen())) {
                    sinhViens.get(j).setTen(sinhViens.get(j).getTen() + " " + plusNames[flag + 1]);
                    flag++;
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

    public static int getTailMASV(String maSV) {
        return Integer.parseInt(maSV.substring(maSV.length() - 3));
    }

    public static void suggestSearch(String search, int type) {
        List<SinhVien> listSuggest = new ArrayList<>();
        if (type == SEARCH_BY_MASV) {
            for (SinhVien sinhVien : sinhViens) {
                int num = getTailMASV(sinhVien.getMaSV()) - getTailMASV(search);
                if (-5 < num && num < 5) {
                    listSuggest.add(sinhVien);
                }
            }
        } else {
            String s1 = search.substring(0, search.length() - 1);
            for (SinhVien sinhVien : sinhViens) {
                if (sinhVien.getTen().equals(s1)) {
                    listSuggest.add(sinhVien);
                }
            }
            if (listSuggest.size() == 0) {
                String s2 = search.substring(0, search.length() - 2);
                for (SinhVien sinhVien : sinhViens) {
                    if (sinhVien.getTen().equals(s2)) {
                        listSuggest.add(sinhVien);
                    }
                }
            }
        }
        if (listSuggest.size() > 0) {
            System.out.println("Danh sach sinh viên gần giống : ");
            for (SinhVien sinhVien :
                    listSuggest) {
                sinhVien.showInformation();
            }
        }
    }
}

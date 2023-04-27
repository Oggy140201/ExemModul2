package controller;

import model.ReadAndWrite;
import model.SinhVien;

import java.util.*;

public class Manager extends SinhVien {
    ArrayList<SinhVien> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    ReadAndWrite readAndWrite = new ReadAndWrite();
    public Manager(){
        list.add(new SinhVien("anh",22,"1","nam","haiphong",5));
        list.add(new SinhVien("sơn",23,"2","nữ","hanoi",6));
        list.add(new SinhVien("vũ",24,"3","nam","hanoi",7));
        list.add(new SinhVien("hải",25,"4","nữ","namdinh",8));
        list.add(new SinhVien("tùng",26,"5","nam","mocchau",9));
        list.add(new SinhVien("quân",27,"6","nữ","laocai",4));
        list.add(new SinhVien("tuấn",28,"7","nam","danang",3));
        list.add(new SinhVien("uyên",29,"8","nữ","saigon",2));
        list.add(new SinhVien("dủa",30,"9","nam","vungtau",1));
        list.add(new SinhVien("giang",31,"10","nữ","anlao",10));
        System.out.println( "Đây là danh sách sinh viên: " + list);
    }

    public void HienThiSinhVien(){
        for (SinhVien q : list) {
            System.out.println(q);
        }
    }
    public void addSinhVien(){
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập id: ");
        String id = scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        String sex = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("Nhập điểm trung bình: ");
        int point = Integer.parseInt(scanner.nextLine());
        list.add(new SinhVien(name,age,id,sex,address,point));
        System.out.println(list);
        int choice = Integer.parseInt(scanner.nextLine());
        do{
            switch (choice){
                case 1:
                    System.out.println("1. ");
            }
        }while (choice != 2);
    }
    public void searchAndUpdateSinhVien() {

        for (SinhVien sinhVien : list) {
            if (sinhVien.getId().equals(id)) {
                System.out.println("Thông tin sinh viên: " + sinhVien);
                System.out.print("Bạn muốn cập nhật thông tin sinh viên này? (Y/N): ");
                String luaChon = new Scanner(System.in).nextLine();
                if (luaChon.equalsIgnoreCase("Y")) {
                    System.out.println("Nhập mã sinh viên mới");
                    String maSinhVienMoi = new Scanner(System.in).nextLine();
                    System.out.print("Nhập tên mới: ");
                    String hoVaTen = new Scanner(System.in).nextLine();
                    System.out.print("Nhập tuổi mới: ");
                    int age = new Scanner(System.in).nextInt();
                    System.out.print("Nhập giới tính mới: ");
                    String gioiTinh = new Scanner(System.in).nextLine();
                    System.out.print("Nhập địa chỉ mới: ");
                    String diaChi = new Scanner(System.in).nextLine();
                    System.out.print("Nhập điểm trung bình mới: ");
                    double diemTrungBinh = new Scanner(System.in).nextDouble();
                    sinhVien.setId(Integer.parseInt(maSinhVienMoi));
                    sinhVien.setName(hoVaTen);
                    sinhVien.setAge(age);
                    sinhVien.setSex(gioiTinh);
                    sinhVien.setAddress(diaChi);
                    sinhVien.setPoint((int) diemTrungBinh);
                    System.out.println("Cập nhật thông tin sinh viên thành công!");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên có mã " + id);
    }
    public void xoaSinhVien() {
        for (SinhVien sinhVien : list) {
            if (sinhVien.getId().equals(id)) {
                System.out.println("Thông tin sinh viên: " + sinhVien);
                System.out.print("Bạn có muốn xóa sinh viên này? (Y/N): ");
                String luaChon = new Scanner(System.in).nextLine();
                if (luaChon.equalsIgnoreCase("Y")) {
                    list.remove(sinhVien);
                    System.out.println("Xóa sinh viên thành công!");
                }
                return; // Quay lại menu
            }
        }
        System.out.println("Không tìm thấy sinh viên có mã " + id);
    }
   public void TangtheoTrungBinh(){
        Collections.sort(list, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getPoint() - o2.getPoint();
            }
        });
   }

   public void GiamTheoTrungBinh(){
        Collections.sort(list, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o2.getPoint() - o1.getPoint();
            }
        });
   }


    public void Read(){
        readAndWrite.readFile("src/data.csv");
    }

    public void Write(){
        readAndWrite.writeFile(list,"src/data.csv");
    }
}

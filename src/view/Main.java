package view;

import controller.Manager;
import model.SinhVien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("""
                    1.Thêm
                    2.Sắp xếp(Theo điểm tăng dần)
                    3.Tìm kiếm và update
                    4.Xóa
                    5.Hiển thị
                    6.Ghi file
                    7.Đọc file
                    0.Thoát
                    """);
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1://thêm
                    manager.addSinhVien();
                    break;
                case 2://Sắp xếp nhân viên theo điểm tăng dần
                    main.Sort();
                    break;
                case 3://Tìm kiếm và cập nhật nhân viên
                    manager.searchAndUpdateSinhVien();
                    break;
                case 4://xóa sinh viên
                    manager.xoaSinhVien();
                    break;
                case 5:
                    manager.HienThiSinhVien();
                    break;
                case 6:
                    manager.Write();
                    break;
                case 7:
                    manager.Read();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
    public void Sort(){
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("""
                    1.Hiển thị theo điểm tăng dần
                    2.Hiển thị theo điểm giảm dần
                    3.Hiển thị danh sách
                    4.Out
                    """);
            System.out.println("Nhập lựa chọn");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                 manager.TangtheoTrungBinh();
                 break;
                case 2:
                    manager.GiamTheoTrungBinh();
                    break;
                case 3:
                    manager.HienThiSinhVien();
                    break;
                case 4:
                    break;
            }
        }while (choice != 4);
    }
}

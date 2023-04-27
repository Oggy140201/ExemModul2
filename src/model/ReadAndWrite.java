
package model;

import model.SinhVien;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import controller.Manager;
public class ReadAndWrite {
    public ReadAndWrite() {
    }

    public List<SinhVien> readFile(String path) {
        List<SinhVien> sinhVienList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
                sinhVienList = (List<SinhVien>) ois.readObject();
                System.out.println("Đọc thành công" + sinhVienList);
            } catch(IOException e){
            System.out.println(e.getMessage());

            }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        return sinhVienList;
    }

        public  void writeFile(List<SinhVien> sinhVienList,String path) {
            try (FileOutputStream fos = new FileOutputStream(path);
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(sinhVienList);
            } catch (Exception e) {
                System.out.println("File không tồn tại " +
                        "hoặc có lỗi trong lúc ghi.");
                e.printStackTrace();
            }
        }
}

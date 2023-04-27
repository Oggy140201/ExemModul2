package model;

import java.io.Serializable;

public class SinhVien implements Serializable {
    public String name;
    public int age;
    public String id;
    public String sex;
    public String address;
    public double point;

    public SinhVien(String name, int age, String id, String sex, String address, double point) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.sex = sex;
        this.address = address;
        this.point = point;
    }

    public SinhVien() {
    }

    //    public SinhVien(String name, String age, int id, String sex, String address, double point) {
//        this.name = name;
//        this.age = Integer.parseInt(age);
//        this.id = String.valueOf(id);
//        this.sex = sex;
//        this.address = address;
//        this.point = point;
//    }
//
//    public SinhVien() {
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(int id) {
        this.id = String.valueOf(id);
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPoint() {
        return (int) point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return
                "Tên: " + name + "\t" +
                "Tuổi: " + age + "\t" +
                "ID: " + id + "\t" +
                "Giới tính: " + sex + "\t" +
                "Địa chỉ: " + address + "\t" +
                "Điểm trung bình: " + point + "\n"
                ;
    }
}

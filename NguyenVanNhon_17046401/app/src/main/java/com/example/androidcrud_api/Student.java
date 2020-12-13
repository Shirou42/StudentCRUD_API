package com.example.androidcrud_api;
public class Student {
    private String mssv;
    private String tenSV;

    public Student(String mssv, String tenSV) {
        this.mssv = mssv;
        this.tenSV = tenSV;
    }

    public Student() {
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    @Override
    public String toString() {
        return "Student{" +
                "mssv='" + mssv + '\'' +
                ", tenSV='" + tenSV + '\'' +
                '}';
    }
}


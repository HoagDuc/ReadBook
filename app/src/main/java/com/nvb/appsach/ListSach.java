package com.nvb.appsach;

public class ListSach {
    private String TenSach;
    private String TenTG;
    private int Anh;

    public ListSach(String tenSach, String tenTG, int anh) {
        TenSach = tenSach;
        TenTG = tenTG;
        Anh = anh;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String tenSach) {
        TenSach = tenSach;
    }

    public String getTenTG() {
        return TenTG;
    }

    public void setTenTG(String tenTG) {
        TenTG = tenTG;
    }

    public int getAnh() {
        return Anh;
    }

    public void setAnh(int anh) {
        Anh = anh;
    }
}

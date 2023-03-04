package com.example.recyclerview;

public class ModelClass {
    private int imageView;
    private String txtview1;
    private String txtview2;
    private String txtview3;
    private String divider;

    public ModelClass(int imageView, String txtview1, String txtview2, String txtview3, String divider) {
        this.imageView = imageView;
        this.txtview1 = txtview1;
        this.txtview2 = txtview2;
        this.txtview3 = txtview3;
        this.divider = divider;
    }

    public int getImageView() {
        return imageView;
    }

    public String getTxtview1() {
        return txtview1;
    }

    public String getTxtview2() {
        return txtview2;
    }

    public String getTxtview3() {
        return txtview3;
    }

    public String getDivider() {
        return divider;
    }
}

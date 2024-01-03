package com.project.layanglayangserver.dto;

public class OutputDTO extends InputDTO{
    private String jenisPerhitungan;
    private double result;

    public String getJenisPerhitungan() {
        return jenisPerhitungan;
    }

    public void setJenisPerhitungan(String jenisPerhitungan) {
        this.jenisPerhitungan = jenisPerhitungan;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}

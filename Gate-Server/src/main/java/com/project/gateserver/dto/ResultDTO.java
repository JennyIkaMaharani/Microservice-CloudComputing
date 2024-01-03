package com.project.gateserver.dto;

public class ResultDTO {
    private Integer a;
    private Integer b;
    private String jenisPerhitungan;
    private double result;

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

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

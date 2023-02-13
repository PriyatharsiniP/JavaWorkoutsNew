package org.example.immutablePractice;

public class Address implements Cloneable{
    private int flatNo;
    private String areaName;
    private String pinCode;

    public int getFlatNo() {
        return flatNo;
    }
    public void setFlatNo(int flatNo) {
        this.flatNo = flatNo;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "flatNo=" + flatNo +
                ", areaName='" + areaName + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

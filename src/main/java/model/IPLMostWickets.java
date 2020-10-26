package model;

import com.opencsv.bean.CsvBindByName;

public class IPLMostWickets {
    @CsvBindByName(column = "POS")
    public String POS;
    @CsvBindByName(column = "PLAYER")
    public String PLAYER;
    @CsvBindByName(column = "Mat")
    public String Mat;
    @CsvBindByName(column = "Inns")
    public String Inns;
    @CsvBindByName(column = "Ov")
    public String Ov;
    @CsvBindByName(column = "Runs")
    public String Runs;
    @CsvBindByName(column = "Wkts")
    public String Wkts;
    @CsvBindByName(column = "BBI")
    public String BBI;
    @CsvBindByName(column = "Avg")
    public double Avg;
    @CsvBindByName(column = "Econ")
    public String Econ;
    @CsvBindByName(column = "SR")
    public double SR;
    @CsvBindByName(column = "4w")
    public String FourWickets;
    @CsvBindByName(column = "5w")
    public String FiveWickets;

    public String getPOS() {
        return POS;
    }

    public void setPOS(String POS) {
        this.POS = POS;
    }

    public String getPLAYER() {
        return PLAYER;
    }

    public void setPLAYER(String PLAYER) {
        this.PLAYER = PLAYER;
    }

    public String getMat() {
        return Mat;
    }

    public void setMat(String mat) {
        Mat = mat;
    }

    public String getInns() {
        return Inns;
    }

    public void setInns(String inns) {
        Inns = inns;
    }

    public String getOv() {
        return Ov;
    }

    public void setOv(String ov) {
        Ov = ov;
    }

    public String getRuns() {
        return Runs;
    }

    public void setRuns(String runs) {
        Runs = runs;
    }

    public String getWkts() {
        return Wkts;
    }

    public void setWkts(String wkts) {
        Wkts = wkts;
    }

    public String getBBI() {
        return BBI;
    }

    public void setBBI(String BBI) {
        this.BBI = BBI;
    }

    public double getAvg() {
        return Avg;
    }

    public void setAvg(double avg) {
        Avg = avg;
    }

    public String getEcon() {
        return Econ;
    }

    public void setEcon(String econ) {
        Econ = econ;
    }

    public double getSR() {
        return SR;
    }

    public void setSR(double SR) {
        this.SR = SR;
    }

    public String getFourWickets() {
        return FourWickets;
    }

    public void setFourWickets(String fourWickets) {
        FourWickets = fourWickets;
    }

    public String getFiveWickets() {
        return FiveWickets;
    }

    public void setFiveWickets(String fiveWickets) {
        FiveWickets = fiveWickets;
    }

    @Override
    public String toString() {
        return "IplMostWickets{" +
                "POS='" + POS + '\'' +
                ", PLAYER='" + PLAYER + '\'' +
                ", Mat='" + Mat + '\'' +
                ", Inns='" + Inns + '\'' +
                ", Ov='" + Ov + '\'' +
                ", Runs='" + Runs + '\'' +
                ", Wkts='" + Wkts + '\'' +
                ", BBI='" + BBI + '\'' +
                ", Avg='" + Avg + '\'' +
                ", Econ='" + Econ + '\'' +
                ", SR='" + SR + '\'' +
                ", FourWickets='" + FourWickets + '\'' +
                ", FiveWickets='" + FiveWickets + '\'' +
                '}';
    }
}

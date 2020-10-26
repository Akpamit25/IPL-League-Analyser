package model;

import com.opencsv.bean.CsvBindByName;

public class IPLMostRuns {
    @CsvBindByName(column = "POS")
    public String POS;

    @CsvBindByName(column = "PLAYER")
    public String PLAYER;

    @CsvBindByName(column = "Mat")
    public String Mat;

    @CsvBindByName(column = "Inns")
    public String Inns;

    @CsvBindByName(column = "NO")
    public String NO;

    @CsvBindByName(column = "Runs")
    public String Runs;

    @CsvBindByName(column = "HS")
    public String HS;

    @CsvBindByName(column = "Avg")
    public double Avg;

    @CsvBindByName(column = "BF")
    public String BF;

    @CsvBindByName(column = "SR")
    public double SR;

    @CsvBindByName(column = "100")
    public String hundred;

    @CsvBindByName(column = "50")
    public String fifty;

    @CsvBindByName(column = "4s")
    public String fours;

    @CsvBindByName(column = "6s")
    public String sixs;

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

    public String getNO() {
        return NO;
    }

    public void setNO(String NO) {
        this.NO = NO;
    }

    public String getRuns() {
        return Runs;
    }

    public void setRuns(String runs) {
        Runs = runs;
    }

    public String getHS() {
        return HS;
    }

    public void setHS(String HS) {
        this.HS = HS;
    }

    public double getAvg() {
        return Avg;
    }

    public void setAvg(double avg) {
        Avg = avg;
    }

    public String getBF() {
        return BF;
    }

    public void setBF(String BF) {
        this.BF = BF;
    }

    public double getSR() {
        return SR;
    }

    public void setSR(double SR) {
        this.SR = SR;
    }

    public String getHundred() {
        return hundred;
    }

    public void setHundred(String hundred) {
        this.hundred = hundred;
    }

    public String getFifty() {
        return fifty;
    }

    public void setFifty(String fifty) {
        this.fifty = fifty;
    }

    public String getFours() {
        return fours;
    }

    public void setFours(String fours) {
        this.fours = fours;
    }

    public String getSixs() {
        return sixs;
    }

    public void setSixs(String sixs) {
        this.sixs = sixs;
    }

    @Override
    public String toString() {
        return "IplMostRuns{" +
                "POS='" + POS + '\'' +
                ", PLAYER='" + PLAYER + '\'' +
                ", Mat='" + Mat + '\'' +
                ", Inns='" + Inns + '\'' +
                ", NO='" + NO + '\'' +
                ", Runs='" + Runs + '\'' +
                ", HS='" + HS + '\'' +
                ", Avg='" + Avg + '\'' +
                ", BF='" + BF + '\'' +
                ", SR='" + SR + '\'' +
                ", hundred='" + hundred + '\'' +
                ", fifty='" + fifty + '\'' +
                ", fours='" + fours + '\'' +
                ", sixs='" + sixs + '\'' +
                '}';
    }
}
package model;

import com.opencsv.bean.CsvBindByName;

public class IPLMostRuns {
    @CsvBindByName(column = "POS")
    private String POS;

    @CsvBindByName(column = "PLAYER")
    private String PLAYER;

    @CsvBindByName(column = "Mat")
    private String Mat;

    @CsvBindByName(column = "Inns")
    private String Inns;

    @CsvBindByName(column = "NO")
    private String NO;

    @CsvBindByName(column = "Runs")
    private String Runs;

    @CsvBindByName(column = "HS")
    private String HS;

    @CsvBindByName(column = "Avg")
    private String Avg;

    @CsvBindByName(column = "BF")
    private String BF;

    @CsvBindByName(column = "SR")
    private String SR;

    @CsvBindByName(column = "100")
    private String hundred;

    @CsvBindByName(column = "50")
    private String fifty;

    @CsvBindByName(column = "4s")
    private String fours;

    @CsvBindByName(column = "6s")
    private String sixs;

    public String getPOS() {
        return POS;
    }
    public void setPOS(String POS)
    {
        this.POS = POS;
    }
    public String getPLAYER()
    {
        return PLAYER;
    }
    public void setPLAYER(String PLAYER)
    {
        this.PLAYER = PLAYER;
    }
    public String getMat()
    {
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
    public String getAvg() {
        return Avg;
    }
    public void setAvg(String avg) {
        Avg = avg;
    }
    public String getBF() {
        return BF;
    }
    public void setBF(String BF) {
        this.BF = BF;
    }
    public String getSR() {
        return SR;
    }
    public void setSR(String SR) {
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
}

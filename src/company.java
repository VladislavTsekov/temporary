public class company {
    private String type, date, code;

    public String getCode() { return code; }
    public String getDate() { return date; }
    public String getType() { return type; }

    public void setCode(String code) { if (code.length()==10)this.code = code; else this.code = "0x00000000"; }
    public void setDate(String date) { this.date = date; }
    public void setType(String type) { this.type = type; }
}

public class Item {
    private String date, mode, unit, current, interactive;

    @Override
    public String toString() {
        return "Item{" +
                "date='" + date + '\'' +
                ", mode='" + mode + '\'' +
                ", unit='" + unit + '\'' +
                ", curent='" + current + '\'' +
                ", interactive='" + interactive + '\'' +
                '}';
    }




    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getMode() {
        return mode;
    }
    public void setMode(String mode) {
        this.mode = mode;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public String getCurent() {
        return current;
    }
    public void setCurent(String curent) {
        this.current = curent;
    }
    public String getInteractive() {
        return interactive;
    }
    public void setInteractive(String interactive) {
        this.interactive = interactive;
    }
}

package linearlayout.example.manh.onthi_sms_map_json.Model;

/**
 * Created by MANH on 27-Jul-16.
 */
public class Sms {
    private String name;
    private String number;
    private String date;

    public Sms(String name, String number, String date) {
        this.name = name;
        this.number = number;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

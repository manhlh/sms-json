package linearlayout.example.manh.onthi_sms_map_json.Model;

import android.graphics.Bitmap;

/**
 * Created by MANH on 27-Jul-16.
 */
public class Contact {
    private String name;
    private String mobile;
    private String address;
    private Bitmap image;


    public Contact(String name, String mobile, String address, Bitmap image) {
        this.name = name;
        this.mobile = mobile;
        this.address = address;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }
}

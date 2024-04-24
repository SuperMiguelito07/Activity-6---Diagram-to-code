package Activitat_6_1;
import java.util.Date;
public class Payment {
    private float amount;
}

class Cash extends Payment {
    private float cashTendered;
}

class Check extends Payment {
    private String name;
    private String bankID;

    void authorized() {
    }
}

class Credit extends Payment {
    private String type;
    private String number;
    private Date expDate;

    public void authorized() {

    }
}
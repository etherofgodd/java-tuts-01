
public class AccessBank extends BankAccount {

    private String fatherName;
    private String bvn;
    private boolean hasBvn;

    public AccessBank() {
        hasBvn = false;
    }

    public String getFatherName() {
        return this.fatherName;
    }

    public String getBvn() {
        return this.bvn;
    }

    public Boolean getHasBvn() {
        return this.hasBvn;
    }

    public void setFatherName(String fathersName) {
        this.fatherName = fathersName;
    }

    public void setBvn(String bvn) {
        this.bvn = bvn;
    }

    public void setHasBvn() {
        this.hasBvn = true;
    }


}

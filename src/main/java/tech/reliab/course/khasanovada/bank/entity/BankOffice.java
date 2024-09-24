package tech.reliab.course.khasanovada.bank.entity;


public class BankOffice {
    private int id;
    private String name;
    private String address;
    private int idBank; //
    private boolean isStatusOfJob;
    private boolean canAtmPlacement;
    private int numberOfAtm;
    private boolean canGetLoan;
    private boolean canTakeMoney;
    private boolean canDepositAllowed;
    private int allMoney;
    private int costOfRent;

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIdBank() {
        return idBank;
    }

    public void setIdBank(int idBank) {
        this.idBank = idBank;
    }

    public boolean isStatusOfJob() {
        return isStatusOfJob;
    }

    public void setStatusOfJob(boolean statusOfJob) {
        isStatusOfJob = statusOfJob;
    }


    public boolean isCanAtmPlacement() {
        return canAtmPlacement;
    }

    public void setCanAtmPlacement(boolean canAtmPlacement) {
        this.canAtmPlacement = canAtmPlacement;
    }

    public int getNumberOfAtm() {
        return numberOfAtm;
    }

    public void setNumberOfAtm(int numberOfAtm) {
        this.numberOfAtm = numberOfAtm;
    }

    public boolean isCanGetLoan() {
        return canGetLoan;
    }


    public void setCanGetLoan(boolean canGetLoan) {
        this.canGetLoan = canGetLoan;
    }


    public boolean isCanTakeMoney() {
        return canTakeMoney;
    }

    public void setCanTakeMoney(boolean canTakeMoney) {
        this.canTakeMoney = canTakeMoney;
    }


    public boolean isCanDepositAllowed() {
        return canDepositAllowed;
    }

    public void setCanDepositAllowed(boolean canDepositAllowed) {
        this.canDepositAllowed = canDepositAllowed;
    }

    public int getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(int allMoney) {
        this.allMoney = allMoney;
    }

    public int getCostOfRent() {
        return costOfRent;
    }

    public void setCostOfRent(int costOfRent) {
        this.costOfRent = costOfRent;
    }

    @Override
    public String toString() {
        return "BankOffice{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", isStatusOfJob=" + isStatusOfJob +
                ", canAtmPlacement=" + canAtmPlacement +
                ", numberOfAtm=" + numberOfAtm +
                ", canGetLoan=" + canGetLoan +
                ", canTakeMoney=" + canTakeMoney +
                ", canDepositAllowed=" + canDepositAllowed +
                ", allMoney=" + allMoney +
                ", costOfRent=" + costOfRent +
                '}';
    }
}

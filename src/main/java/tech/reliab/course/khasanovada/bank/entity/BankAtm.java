package tech.reliab.course.khasanovada.bank.entity;

//банкомат
public class BankAtm {
    private int id;
    private String name;
    private String address;
    private WorkStatus workStatus;
    private int idBank;
    private int idEmployee;
    private boolean isDispensingCash;
    private boolean canDepositAllowed;
    private int allMoney;
    private int atmMaintenanceCost;


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


    public WorkStatus getWorkStatus() {
        return workStatus;
    }


    public void setWorkStatus(WorkStatus workStatus) {
        this.workStatus = workStatus;
    }

    public int getIdBank() {
        return idBank;
    }

    public void setIdBank(int idBank) {
        this.idBank = idBank;
    }

    public int getIdEmployee() {
        return idEmployee;
    }


    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }


    public boolean isDispensingCash() {
        return isDispensingCash;
    }


    public void setDispensingCash(boolean dispensingCash) {
        isDispensingCash = dispensingCash;
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


    public int getAtmMaintenanceCost() {
        return atmMaintenanceCost;
    }


    public void setAtmMaintenanceCost(int atmMaintenanceCost) {
        this.atmMaintenanceCost = atmMaintenanceCost;
    }


    @Override
    public String toString() {
        return "BankAtm{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", workStatus=" + workStatus +
                ", idBank=" + idBank +
                ", idEmployee=" + idEmployee +
                ", isDispensingCash=" + isDispensingCash +
                ", canDepositAllowed=" + canDepositAllowed +
                ", allMoney=" + allMoney +
                ", atmMaintenanceCost=" + atmMaintenanceCost +
                '}';
    }
}



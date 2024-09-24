package tech.reliab.course.khasanovada.bank.entity;

public class Employee  {
    private int id;
    private String fullName;
    private String dateOfBirth;
    private String position;
    private int idBank;
    private boolean isOfficeJob;
    private int idBankOffice;
    private boolean canGiveLoan;
    private int salaryAmount;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getIdBank() {
        return idBank;
    }

    public void setIdBank(int idBank) {
        this.idBank = idBank;
    }

    public boolean isOfficeJob() {
        return isOfficeJob;
    }

    public void setOfficeJob(boolean officeJob) {
        isOfficeJob = officeJob;
    }

    public int getIdBankOffice() {
        return idBankOffice;
    }


    public void setIdBankOffice(int idBankOffice) {
        this.idBankOffice = idBankOffice;
    }


    public boolean isCanGiveLoan() {
        return canGiveLoan;
    }


    public void setCanGiveLoan(boolean canGiveLoan) {
        this.canGiveLoan = canGiveLoan;
    }


    public int getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(int salaryAmount) {
        this.salaryAmount = salaryAmount;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", position='" + position + '\'' +
                ", idBank=" + idBank +
                ", isOfficeJob=" + isOfficeJob +
                ", idBankOffice=" + idBankOffice +
                ", canGiveLoan=" + canGiveLoan +
                ", salaryAmount=" + salaryAmount +
                '}';
    }
}




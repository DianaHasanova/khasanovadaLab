package tech.reliab.course.khasanovada.bank.entity;


import java.util.ArrayList;
import java.util.Arrays;

public class User {
    private int id;
    private String fullName;
    private String dateOfBirth;
    private String placeOfWork;
    private int salaryAmount;
    private ArrayList<Integer> arrayOfIdBanks;
    private ArrayList<Integer> arrayOfIdCreditAccounts = new ArrayList<>();
    private ArrayList<Integer> arrayOfIdPaymentAccounts = new ArrayList<>();
    private int creditRatingForBank;


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


    public String getPlaceOfWork() {
        return placeOfWork;
    }


    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }


    public int getSalaryAmount() {
        return salaryAmount;
    }


    public void setSalaryAmount(int salaryAmount) {
        this.salaryAmount = salaryAmount;
    }

    public ArrayList<Integer> getArrayOfIdBanks() {
        return arrayOfIdBanks;
    }

    public ArrayList<Integer> getArrayOfIdCreditAccounts() {
        return arrayOfIdCreditAccounts;
    }

    public ArrayList<Integer> getArrayOfIdPaymentAccounts() {
        return arrayOfIdPaymentAccounts;
    }

    public void setArrayOfIdBanks(ArrayList<Integer> arrayOfIdBanks) {
        this.arrayOfIdBanks = arrayOfIdBanks;
    }

    public void setArrayOfIdCreditAccounts(ArrayList<Integer> arrayOfIdCreditAccounts) {
        this.arrayOfIdCreditAccounts = arrayOfIdCreditAccounts;
    }

    public void setArrayOfIdPaymentAccounts(ArrayList<Integer> arrayOfIdPaymentAccounts) {
        this.arrayOfIdPaymentAccounts = arrayOfIdPaymentAccounts;
    }

    public int getCreditRatingForBank() {
        return creditRatingForBank;
    }

    public void setCreditRatingForBank(int creditRatingForBank) {
        this.creditRatingForBank = creditRatingForBank;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", placeOfWork='" + placeOfWork + '\'' +
                ", salaryAmount=" + salaryAmount +
                ", arrayOfIdBanks=" + Arrays.toString(new ArrayList[]{arrayOfIdBanks}) +
                ", arrayOfIdCreditAccounts=" + Arrays.toString(new ArrayList[]{arrayOfIdCreditAccounts}) +
                ", arrayOfIdPaymentAccounts=" + Arrays.toString(new ArrayList[]{arrayOfIdPaymentAccounts}) +
                ", creditRatingForBank=" + creditRatingForBank +
                '}';
    }
}


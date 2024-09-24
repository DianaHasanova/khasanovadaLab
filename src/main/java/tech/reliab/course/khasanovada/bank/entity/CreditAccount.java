package tech.reliab.course.khasanovada.bank.entity;


import java.time.LocalDate;

public class CreditAccount {
    private int id;
    private int idUser;
    private int idBank;
    private LocalDate loanStartDate;
    private LocalDate loanEndDate;
    private long loanLongInMonths;
    private int creditAmount;
    private double monthlyPayment;
    private int interestRate;
    private int idEmployee;
    private int idPaymentAccount;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdBank() {
        return idBank;
    }

    public void setIdBank(int idBank) {
        this.idBank = idBank;
    }

    public LocalDate getLoanStartDate() {
        return loanStartDate;
    }

    public LocalDate getLoanEndDate() {
        return loanEndDate;
    }

    public void setLoanStartDate(LocalDate loanStartDate) {
        this.loanStartDate = loanStartDate;
    }

    public void setLoanEndDate(LocalDate loanEndDate) {
        this.loanEndDate = loanEndDate;
    }

    public void setLoanLongInMonths(long loanLongInMonths) {
        this.loanLongInMonths = loanLongInMonths;
    }

    public long getLoanLongInMonths() {
        return loanLongInMonths;
    }


    public int getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(int creditAmount) {
        this.creditAmount = creditAmount;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public int getIdEmployee() {
        return idEmployee;
    }


    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }


    public int getIdPaymentAccount() {
        return idPaymentAccount;
    }

    public void setIdPaymentAccount(int idPaymentAccount) {
        this.idPaymentAccount = idPaymentAccount;
    }


    @Override
    public String toString() {
        return "CreditAccount{" +
                "id=" + id +
                ", idUser=" + idUser +
                ", idBank=" + idBank +
                ", loanStartDate='" + loanStartDate + '\'' +
                ", loanEndDate='" + loanEndDate + '\'' +
                ", loanLongInMonths=" + loanLongInMonths +
                ", creditAmount=" + creditAmount +
                ", monthlyPayment=" + monthlyPayment +
                ", interestRate=" + interestRate +
                ", idEmployee=" + idEmployee +
                ", idPaymentAccount=" + idPaymentAccount +
                '}';
    }
}

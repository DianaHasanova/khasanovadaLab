package tech.reliab.course.khasanovada.bank.entity;

public class Bank {
    private int id;
    private String name;
    private int numberOfOffice = 0;
    private int numberOfBankAtm = 0;
    private int numberOfEmployee = 0;
    private int numberOfUser = 0;
    private int rating;
    private int allMoney;
    private int interestRate;

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

    public int getNumberOfOffice() {
        return numberOfOffice;
    }

    public void setNumberOfOffice(int numberOfOffice) {
        this.numberOfOffice = numberOfOffice;
    }

    public int getNumberOfBankAtm() {
        return numberOfBankAtm;
    }

    public void setNumberOfBankAtm(int numberOfBankAtm) {
        this.numberOfBankAtm = numberOfBankAtm;
    }

    public int getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public void setNumberOfEmployee(int numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }

    public int getNumberOfUser() {
        return numberOfUser;
    }

    public void setNumberOfUser(int numberOfUser) {
        this.numberOfUser = numberOfUser;
    }


    public int getRating() {
        return rating;
    }


    public void setRating(int rating) {
        this.rating = rating;
    }


    public int getAllMoney() {
        return allMoney;
    }


    public void setAllMoney(int allMoney) {
        this.allMoney = allMoney;
    }


    public int getInterestRate() {
        return interestRate;
    }


    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberOfOffice=" + numberOfOffice +
                ", numberOfBankAtm=" + numberOfBankAtm +
                ", numberOfEmployee=" + numberOfEmployee +
                ", numberOfUser=" + numberOfUser +
                ", rating=" + rating +
                ", allMoney=" + allMoney +
                ", interestRate=" + interestRate +
                '}';
    }

}

package tech.reliab.course.khasanovada.bank.service.impl;

import tech.reliab.course.khasanovada.bank.entity.Bank;
import tech.reliab.course.khasanovada.bank.service.BankService;

import java.util.ArrayList;
import java.util.Random;

public class BankServiceImpl implements BankService {
    ArrayList<Bank> banks = new ArrayList<>();

    @Override
    public Bank createBank(String name) {
        Bank bank = new Bank();
        bank.setId(banks.size());
        banks.add(bank);
        bank.setName(name);
        int rating = givesRandomRating();
        bank.setRating(rating);
        bank.setAllMoney(givesRandomAllMoney());
        bank.setInterestRate(givesRandomInterestRate(rating));
        return bank;
    }

    @Override
    public void addOffice(Bank bank) {
        bank.setNumberOfOffice(bank.getNumberOfOffice() + 1);
    }

    @Override
    public void addATM(Bank bank) {
        bank.setNumberOfBankAtm(bank.getNumberOfBankAtm() + 1);
    }

    @Override
    public void addEmployee(Bank bank) {
        bank.setNumberOfEmployee(bank.getNumberOfEmployee() + 1);
    }

    @Override
    public void addUser(Bank bank) {
        bank.setNumberOfUser(bank.getNumberOfUser() + 1);
    }

    @Override
    public int givesRandomRating() {
        return new Random().nextInt(MAX_RATING + 1);
    }

    @Override
    public int givesRandomAllMoney() {
        return new Random().nextInt(MAX_ALL_MONEY + 1);
    }

    @Override
    public int givesRandomInterestRate(int rating) {
        return MAX_INTEREST_RATE - rating / 5;
    }

    @Override
    public String toString() {
        String str = "BankServiceImpl{\n";
        int indexDelete = 0;
        for (Bank bank : banks) {
            str += "indexDelete = " + indexDelete++ + " ";
            str += bank.toString() + "\n";
        }
        str += '}';
        return str;
    }

    @Override
    public void deleteBank(int index) {
        banks.remove(index);
    }

    @Override
    public Bank givesBankById(int id) {
        for (Bank bank : banks)
            if (bank.getId() == id)
                return bank;
        return null;
    }
}
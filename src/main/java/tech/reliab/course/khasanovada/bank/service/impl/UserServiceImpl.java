package tech.reliab.course.khasanovada.bank.service.impl;

import tech.reliab.course.khasanovada.bank.entity.Bank;
import tech.reliab.course.khasanovada.bank.entity.User;
import tech.reliab.course.khasanovada.bank.service.UserService;

import java.util.ArrayList;
import java.util.Random;

public class UserServiceImpl implements UserService {
    ArrayList<User> users = new ArrayList<>();

    @Override
    public User createUser(String fullName, String dateOfBirth, String placeOfWork, ArrayList<Integer> arrayOfIdBanks,
                           BankServiceImpl bankService) {
        User user = new User();
        user.setId(users.size());
        users.add(user);

        user.setFullName(fullName);
        user.setDateOfBirth(dateOfBirth);
        user.setPlaceOfWork(placeOfWork);
        int salaryAmount = givesRandomSalaryAmount();
        user.setSalaryAmount(salaryAmount);
        user.setArrayOfIdBanks(arrayOfIdBanks);
        addUserToBanks(arrayOfIdBanks, bankService);
        user.setCreditRatingForBank(givesRandomRating(salaryAmount));
        return user;
    }

    @Override
    public int givesRandomSalaryAmount() {
        return new Random().nextInt(MAX_SALARY_AMOUNT + 1);
    }


    @Override
    public int givesRandomRating(int salaryAmount) {
        int rating = salaryAmount / 1000;
        if (salaryAmount % 1000 != 0)
            rating++;
        return rating * 100;
    }

    @Override
    public void addUserToBanks(ArrayList<Integer> arrayOfIdBanks, BankServiceImpl bankService) {
        for (int idBank : arrayOfIdBanks) {
            Bank bank = bankService.givesBankById(idBank);
            bankService.addUser(bank);
        }
    }

    public void addUser(Bank bank) {
        bank.setNumberOfUser(bank.getNumberOfUser() + 1);
    }

    @Override
    public User givesUserById(int idUser) {
        for (User user : users)
            if (user.getId() == idUser)
                return user;
        return null;
    }

    @Override
    public void addPaymentAccount(User user, int idPaymentAccount){
        ArrayList<Integer> newAccount=user.getArrayOfIdPaymentAccounts();
        newAccount.add(idPaymentAccount);
        user.setArrayOfIdPaymentAccounts(newAccount);
    }

    @Override
    public void addCreditAccount(User user, int idCreditAccount){
        ArrayList<Integer> newAccount=user.getArrayOfIdCreditAccounts();
        newAccount.add(idCreditAccount);
        user.setArrayOfIdCreditAccounts(newAccount);
    }

    @Override
    public String toString() {
        String str = "UserServiceImpl{\n";
        int indexDelete = 0;
        for (User user : users) {
            str += "indexDelete = " + indexDelete++ + " ";
            str += user.toString() + "\n";
        }
        str += '}';
        return str;
    }
}

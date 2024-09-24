package tech.reliab.course.khasanovada.bank.service.impl;

import tech.reliab.course.khasanovada.bank.entity.Bank;
import tech.reliab.course.khasanovada.bank.entity.CreditAccount;
import tech.reliab.course.khasanovada.bank.entity.User;
import tech.reliab.course.khasanovada.bank.service.CreditAccountService;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class CreditAccountServiceImpl implements CreditAccountService {
    ArrayList<CreditAccount> creditAccounts = new ArrayList<>();

    @Override
    public CreditAccount createCreditAccount(int idUser, int idBank, LocalDate loanStartDate, LocalDate loanEndDate,
                                             int creditAmount, int idEmployee, int idPaymentAccount,
                                             BankServiceImpl bankService, UserServiceImpl userService) {
        CreditAccount account = new CreditAccount();
        int id = creditAccounts.size();
        account.setId(id);
        creditAccounts.add(account);
        Bank bank = bankService.givesBankById(idBank);

        account.setIdUser(idUser);
        this.addCreditAccount(userService, idUser, id);
        account.setIdBank(idBank);
        account.setLoanStartDate(loanStartDate);
        account.setLoanEndDate(loanEndDate);
        long loanLongInMonths = getMonthsBetween(loanStartDate, loanEndDate);
        account.setLoanLongInMonths(loanLongInMonths);
        account.setCreditAmount(creditAmount);
        int interestRate = bank.getInterestRate();
        account.setInterestRate(interestRate);
        double monthlyPayment = calculateMonthlyPayment(creditAmount, interestRate, loanLongInMonths);
        account.setMonthlyPayment(monthlyPayment);

        account.setIdEmployee(idEmployee);
        account.setIdPaymentAccount(idPaymentAccount);

        return account;
    }

    @Override
    public void addCreditAccount(UserServiceImpl userService, int idUser, int idCreditAccount) {
        User user = userService.givesUserById(idUser);
        userService.addCreditAccount(user, idCreditAccount);
    }

    @Override
    public long getMonthsBetween(LocalDate startDate, LocalDate endDate) {
        return ChronoUnit.MONTHS.between(startDate, endDate);
    }

    @Override
    public double calculateMonthlyPayment(long creditAmount, int interestRate, long loanLongInMonths) {
        double monthlyInterestRate = (double) interestRate / 12 / 100;

        double monthlyPayment = (creditAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, loanLongInMonths))
                / (Math.pow(1 + monthlyInterestRate, loanLongInMonths) - 1);

        return monthlyPayment;
    }

    @Override
    public String toString() {
        String str = "CreditAccountServiceImpl{\n";
        int indexDelete = 0;
        for (CreditAccount creditAccount : creditAccounts) {
            str += "indexDelete = " + indexDelete++ + " ";
            str += creditAccount.toString() + "\n";
        }
        str += '}';
        return str;
    }

    @Override
    public void deleteCreditAccount(int index) {
        creditAccounts.remove(index);
    }
}

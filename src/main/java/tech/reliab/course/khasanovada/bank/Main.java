package tech.reliab.course.khasanovada.bank;

import tech.reliab.course.khasanovada.bank.entity.*;
import tech.reliab.course.khasanovada.bank.service.CreditAccountService;
import tech.reliab.course.khasanovada.bank.service.impl.*;
import tech.reliab.course.khasanovada.bank.utils.CreateRandomObjects;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        int numberOfBanks = 5;
        int numberOfAtms = 1;
        int numberOfOffices = 3;
        int numberOfEmployees = 5;
        int numberOfUsers = 5;
        int numberOfCreditAccounts = 2;
        int numberOfPaymentAccounts = 2;

        CreateRandomObjects randomObjects = new CreateRandomObjects();
        randomObjects.createBanks(numberOfBanks);
        randomObjects.createOffices(numberOfBanks, numberOfOffices);
        randomObjects.createEmployees(numberOfEmployees);
        randomObjects.createAtm(numberOfAtms);
        randomObjects.createUsers(numberOfUsers);
        randomObjects.createPaymentAccount(numberOfPaymentAccounts);
        randomObjects.createCreditAccount(numberOfCreditAccounts);

        randomObjects.printBanks();
        randomObjects.printOffices(0);
        randomObjects.printEmployees(0);
        randomObjects.printAtms(0);
        randomObjects.printUsers(0);
        randomObjects.printPaymentAccounts(0);
        randomObjects.printCreditAccount(0);

/*
        BankServiceImpl bankService = new BankServiceImpl();
        BankOfficeServiceImpl officeService = new BankOfficeServiceImpl(bankService);
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl(bankService);
        AtmServiceImpl atmService = new AtmServiceImpl(bankService, officeService);
        UserServiceImpl userService = new UserServiceImpl(bankService);
        PaymentAccountServiceImpl paymentAccountService = new PaymentAccountServiceImpl(bankService, userService);
        CreditAccountServiceImpl creditAccountService = new CreditAccountServiceImpl(bankService, userService);



        BankOffice office;
        Employee employee;
        BankAtm atm;
        User user;
        ArrayList<Integer> arrayIdBank = new ArrayList<>();
        //arrayIdBank.add(0);
        arrayIdBank.add(1);
        PaymentAccount paymentAccount;
        CreditAccount creditAccount;


        LocalDate startDate = LocalDate.of(2023, 1, 15);
        LocalDate endDate = LocalDate.of(2024, 9, 23);



        employee = employeeService.createEmployee("Ivanov Ivan Ivanovich", "19-02-1987",
                "Service specialist", 0, true, 0, false, 4000);
        atm = atmService.createAtm("568-A", WorkStatus.WORKS, 0, 0, 0,
                true, true, 5600);
        user = userService.createUser("Ivanov Ivan Ivanovich", "19-02-1987", "Service specialist",
                arrayIdBank);
        paymentAccount = paymentAccountService.createPaymentAccount(0, 0);
        creditAccount = creditAccountService.createCreditAccount(0, 0, startDate, endDate, 10000,
                0, 0);
*/

    }


}


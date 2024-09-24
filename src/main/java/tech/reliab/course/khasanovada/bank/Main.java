package tech.reliab.course.khasanovada.bank;

import tech.reliab.course.khasanovada.bank.entity.*;
import tech.reliab.course.khasanovada.bank.service.CreditAccountService;
import tech.reliab.course.khasanovada.bank.service.impl.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Bank bank;
        BankOffice office;
        Employee employee;
        BankAtm atm;
        User user;
        ArrayList<Integer> arrayIdBank = new ArrayList<>();
        arrayIdBank.add(0);
        arrayIdBank.add(1);
        PaymentAccount paymentAccount;
        CreditAccount creditAccount;

        BankServiceImpl bankService = new BankServiceImpl();
        BankOfficeServiceImpl officeService = new BankOfficeServiceImpl();
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        AtmServiceImpl atmService = new AtmServiceImpl();
        UserServiceImpl userService = new UserServiceImpl();
        PaymentAccountServiceImpl paymentAccountService = new PaymentAccountServiceImpl();
        CreditAccountServiceImpl creditAccountService = new CreditAccountServiceImpl();
        LocalDate startDate = LocalDate.of(2023, 1, 15);
        LocalDate endDate = LocalDate.of(2024, 9, 23);

        bank = bankService.createBank("cber");
        bank = bankService.createBank("cber1");
        office = officeService.createOffice("office1", "Trimwor 23", 0, true,
                true, true, true, true, 6700, bankService);
        employee = employeeService.createEmployee("Ivanov Ivan Ivanovich", "19-02-1987",
                "Service specialist", 0, true, 0, false, 4000, bankService);
        atm = atmService.createAtm("568-A", WorkStatus.WORKS, 0, 0, 0,
                true, true, 5600, bankService, officeService);
        user = userService.createUser("Ivanov Ivan Ivanovich", "19-02-1987", "Service specialist",
                arrayIdBank, bankService);
        paymentAccount = paymentAccountService.createPaymentAccount(0, 0, userService);
        creditAccount = creditAccountService.createCreditAccount(0, 0, startDate, endDate, 10000,
                0, 0, bankService, userService);

        System.out.println(bankService.toString());
        System.out.println(officeService.toString());
        System.out.println(employeeService.toString());
        System.out.println(atmService.toString());
        System.out.println(userService.toString());
        System.out.println(paymentAccountService.toString());
        System.out.println(creditAccountService.toString());

    }

}


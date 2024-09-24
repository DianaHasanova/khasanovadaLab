package tech.reliab.course.khasanovada.bank.service;

import tech.reliab.course.khasanovada.bank.entity.Bank;
import tech.reliab.course.khasanovada.bank.entity.BankAtm;
import tech.reliab.course.khasanovada.bank.entity.BankOffice;
import tech.reliab.course.khasanovada.bank.entity.WorkStatus;
import tech.reliab.course.khasanovada.bank.service.impl.BankOfficeServiceImpl;
import tech.reliab.course.khasanovada.bank.service.impl.BankServiceImpl;

import java.util.Random;

public interface AtmService {
    /* создание банкомата */
    public BankAtm createAtm(String name, WorkStatus workStatus, int idBank, int idOffice, int idEmployee,
                             boolean isDispensingCash, boolean canDepositAllowed, int atmMaintenanceCost,
                             BankServiceImpl bankService, BankOfficeServiceImpl officeService);

    /* удаление банкомата */
    public void deleteAtm(int index);

    /* возвращается сумму денег в банкомате в зависимости от их количества в банке*/
    public int givesAllMoney(int moneyInBank);
}
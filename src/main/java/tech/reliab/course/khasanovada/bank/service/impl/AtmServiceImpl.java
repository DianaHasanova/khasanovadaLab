package tech.reliab.course.khasanovada.bank.service.impl;

import tech.reliab.course.khasanovada.bank.entity.Bank;
import tech.reliab.course.khasanovada.bank.entity.BankAtm;
import tech.reliab.course.khasanovada.bank.entity.BankOffice;
import tech.reliab.course.khasanovada.bank.entity.WorkStatus;
import tech.reliab.course.khasanovada.bank.service.AtmService;

import java.util.ArrayList;
import java.util.Random;

public class AtmServiceImpl implements AtmService {
    ArrayList<BankAtm> atms = new ArrayList<>();

    @Override
    public BankAtm createAtm(String name, WorkStatus workStatus, int idBank, int idOffice, int idEmployee,
                             boolean isDispensingCash, boolean canDepositAllowed, int atmMaintenanceCost,
                             BankServiceImpl bankService, BankOfficeServiceImpl officeService) {
        BankAtm atm = new BankAtm();
        atm.setId(atms.size());
        atms.add(atm);
        Bank bank = bankService.givesBankById(idBank);
        bankService.addATM(bank);
        BankOffice office = officeService.givesOfficeById(idOffice);
        officeService.addAtm(office);

        atm.setName(name);
        atm.setAddress(office.getAddress());
        atm.setWorkStatus(workStatus);
        atm.setIdBank(idBank);
        atm.setIdEmployee(idEmployee);
        atm.setDispensingCash(isDispensingCash);
        atm.setCanDepositAllowed(canDepositAllowed);
        atm.setAllMoney(givesAllMoney(bank.getAllMoney()));
        atm.setAtmMaintenanceCost(atmMaintenanceCost);

        return atm;
    }

    @Override
    public String toString() {
        String str = "AtmServiceImpl{\n";
        int indexDelete = 0;
        for (BankAtm atm : atms) {
            str += "indexDelete = " + indexDelete++ + " ";
            str += atm.toString() + "\n";
        }
        str += '}';
        return str;
    }

    @Override
    public void deleteAtm(int index) {
        atms.remove(index);
    }

    @Override
    public int givesAllMoney(int moneyInBank) {
        return new Random().nextInt(moneyInBank);
    }
}

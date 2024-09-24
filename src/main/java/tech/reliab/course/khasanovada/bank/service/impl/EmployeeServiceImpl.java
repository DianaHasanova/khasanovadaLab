package tech.reliab.course.khasanovada.bank.service.impl;


import tech.reliab.course.khasanovada.bank.entity.Bank;
import tech.reliab.course.khasanovada.bank.entity.Employee;
import tech.reliab.course.khasanovada.bank.service.EmployeeService;

import java.util.ArrayList;

public class EmployeeServiceImpl implements EmployeeService {
    ArrayList<Employee> employees = new ArrayList<>();

    @Override
    public Employee createEmployee(String fullName, String dateOfBirth, String position, int idBank,
                                   boolean isOfficeJob, int idBankOffice, boolean canGiveLoan, int salaryAmount, BankServiceImpl bankService) {
        Employee employee = new Employee();
        employee.setId(employees.size());
        employees.add(employee);
        Bank bank = bankService.givesBankById(idBank);
        bankService.addEmployee(bank);

        employee.setFullName(fullName);
        employee.setDateOfBirth(dateOfBirth);
        employee.setPosition(position);
        employee.setIdBank(idBank);
        employee.setOfficeJob(isOfficeJob);
        employee.setIdBankOffice(idBankOffice);
        employee.setCanGiveLoan(canGiveLoan);
        employee.setSalaryAmount(salaryAmount);
        return employee;
    }

    public void deleteEmployee(int index) {
        employees.remove(index);
    }

    @Override
    public String toString() {
        String str = "EmployeeServiceImpl{\n";
        int indexDelete = 0;
        for (Employee employee : employees) {
            str += "indexDelete = " + indexDelete++ + " ";
            str += employee.toString() + "\n";
        }
        str += '}';
        return str;
    }
}

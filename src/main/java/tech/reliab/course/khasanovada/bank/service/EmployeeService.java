package tech.reliab.course.khasanovada.bank.service;

import tech.reliab.course.khasanovada.bank.entity.Bank;
import tech.reliab.course.khasanovada.bank.entity.Employee;
import tech.reliab.course.khasanovada.bank.service.impl.BankServiceImpl;

public interface EmployeeService {
    /* создание сотрудника*/
    public Employee createEmployee(String fullName, String dateOfBirth, String position, int idBank,
                                   boolean isOfficeJob, int idBankOffice, boolean canGiveLoan, int salaryAmount,
                                   BankServiceImpl bankService);

    /* удаление сотрудника*/
    public void deleteEmployee(int index);

}

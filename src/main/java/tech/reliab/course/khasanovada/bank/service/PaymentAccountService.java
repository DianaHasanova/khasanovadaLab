package tech.reliab.course.khasanovada.bank.service;

import tech.reliab.course.khasanovada.bank.entity.PaymentAccount;
import tech.reliab.course.khasanovada.bank.entity.User;
import tech.reliab.course.khasanovada.bank.service.impl.UserServiceImpl;

public interface PaymentAccountService {
    /* создает платежный счет*/
    public PaymentAccount createPaymentAccount(int idUser, int idBank, UserServiceImpl userService);

    /* создает платежный счет*/
    public PaymentAccount createPaymentAccount(int idUser, int idBank, int sum, UserServiceImpl userService);

    /* добавляет платежный счет в список клиента, которому принадлежит*/
    public void addPaymentAccountToUser(UserServiceImpl userService, int idUser, int idPaymentAccount);

    /* удаляет платежный счет*/
    public void deletePaymentAccount(int index);
}

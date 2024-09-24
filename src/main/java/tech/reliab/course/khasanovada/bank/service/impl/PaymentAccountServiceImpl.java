package tech.reliab.course.khasanovada.bank.service.impl;

import tech.reliab.course.khasanovada.bank.entity.PaymentAccount;
import tech.reliab.course.khasanovada.bank.entity.User;
import tech.reliab.course.khasanovada.bank.service.PaymentAccountService;

import java.util.ArrayList;

public class PaymentAccountServiceImpl implements PaymentAccountService {
    ArrayList<PaymentAccount> paymentAccounts = new ArrayList<>();

    @Override
    public PaymentAccount createPaymentAccount(int idUser, int idBank, UserServiceImpl userService) {
        PaymentAccount paymentAccount = new PaymentAccount();
        int id = paymentAccounts.size();
        paymentAccount.setId(id);
        paymentAccounts.add(paymentAccount);

        paymentAccount.setIdBank(idBank);
        paymentAccount.setIdUser(idUser);
        this.addPaymentAccountToUser(userService, idUser, id);

        return paymentAccount;
    }

    @Override
    public PaymentAccount createPaymentAccount(int idUser, int idBank, int sum, UserServiceImpl userService) {
        PaymentAccount paymentAccount = this.createPaymentAccount(idUser, idBank, userService);
        paymentAccount.setSum(sum);
        return paymentAccount;
    }

    @Override
    public void addPaymentAccountToUser(UserServiceImpl userService, int idUser, int idPaymentAccount) {
        User user = userService.givesUserById(idUser);
        userService.addPaymentAccount(user, idPaymentAccount);
    }

    @Override
    public void deletePaymentAccount(int index) {
        paymentAccounts.remove(index);
    }

    @Override
    public String toString() {
        String str = "PaymentAccountServiceImpl{\n";
        int indexDelete = 0;
        for (PaymentAccount paymentAccount : paymentAccounts) {
            str += "indexDelete = " + indexDelete++ + " ";
            str += paymentAccount.toString() + "\n";
        }
        str += '}';
        return str;
    }
}

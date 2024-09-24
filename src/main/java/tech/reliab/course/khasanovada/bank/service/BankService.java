package tech.reliab.course.khasanovada.bank.service;

import tech.reliab.course.khasanovada.bank.entity.Bank;

import java.util.ArrayList;

public interface BankService {
    static final int MAX_RATING = 100;
    static final int MAX_ALL_MONEY = 1000000;
    static final int MAX_INTEREST_RATE = 20;


    /* создание объекта банк */
    public Bank createBank(String name);

    /* увеличивает количество офисов */
    void addOffice(Bank bank);

    /* увеличивает количество банкоматов */
    void addATM(Bank bank);

    /* увеличивает количество работников */
    void addEmployee(Bank bank);

    /* увеличивает количество клиентов */
    void addUser(Bank bank);

    /* возвращает рандомный рейтинг от 0 до 100 */
    int givesRandomRating();

    /* возвращает рандомно сумму всех денег в банке не более 1 000 000 */
    int givesRandomAllMoney();

    /* возвращает рандомно процентную ставку в процентах не более 20% в зависимости от рейтинга банка,
    чем он выше, тем ставка должна сгенерироваться меньше*/
    int givesRandomInterestRate(int rating);

    /* удаляет банк */
    void deleteBank(int index);

    /* возвращает банк по id*/
    public Bank givesBankById(int id);
}
package dao;

import model.Bet;

import java.util.List;

//Наш класс для работы с базой данных и таблицей ставок
public interface BetDao {

    void add(Bet bet);
    List<Bet> getAll();
}

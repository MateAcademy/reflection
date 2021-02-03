package dao;

import db.Storage;
import model.Bet;

import java.util.List;

//Класс для доступа к данным хранилища ставок
//Наш класс для работы с базой данных и таблицей ставок
public class BetDaoImpl implements BetDao{

    //Должен быть написан код, инициализация соединения, открытие транзакции,
    // выполнение запроса, генерация запроса, получение результата, распарсивание результата
    @Override
    public void add(Bet bet) {
        Storage.bets.add(bet);
    }

    @Override
    public List<Bet> getAll() {
        return Storage.bets;
    }

}

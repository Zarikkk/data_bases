package controller;

import model.Battary;
import model.dao.AbstractGenericDaoImpl;
import model.dao.BattaryDao;

public class BattaryController extends AbstractGenericControllerImpl<Battary>{
    private final BattaryDao battaryDao = new BattaryDao();

    @Override
    public AbstractGenericDaoImpl<Battary> getDao() {
        return battaryDao;
    }
}

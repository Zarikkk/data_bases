package controller;

import model.Meteostation;
import model.dao.AbstractGenericDaoImpl;
import model.dao.MeteostationDao;

public class MeteostationController extends AbstractGenericControllerImpl<Meteostation> {
    private final MeteostationDao meteostationDao = new MeteostationDao();


    @Override
    public AbstractGenericDaoImpl<Meteostation> getDao() {
        return meteostationDao;
    }
}

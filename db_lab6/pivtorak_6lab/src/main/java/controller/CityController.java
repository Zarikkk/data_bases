package controller;

import model.City;
import model.dao.AbstractGenericDaoImpl;
import model.dao.CityDao;

public class CityController extends AbstractGenericControllerImpl<City>{
    private final CityDao cityDao = new CityDao();

    @Override
    public AbstractGenericDaoImpl<City> getDao() {
        return cityDao;
    }
}

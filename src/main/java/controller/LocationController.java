package controller;

import model.Location;
import model.dao.AbstractGenericDaoImpl;
import model.dao.LocationDao;

public class LocationController extends AbstractGenericControllerImpl<Location> {
    private final LocationDao locationDao = new LocationDao();

    @Override
    public AbstractGenericDaoImpl<Location> getDao() {
        return locationDao;
    }
}

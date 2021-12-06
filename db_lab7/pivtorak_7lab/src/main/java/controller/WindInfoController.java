package controller;

import model.WindInfo;
import model.dao.AbstractGenericDaoImpl;
import model.dao.WindInfoDao;

public class WindInfoController extends AbstractGenericControllerImpl<WindInfo> {
    private final WindInfoDao windInfoDao = new WindInfoDao();

    @Override
    public AbstractGenericDaoImpl<WindInfo> getDao() {
        return windInfoDao;
    }
}

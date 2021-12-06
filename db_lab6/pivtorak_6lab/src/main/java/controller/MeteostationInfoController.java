package controller;

import model.MeteostationInfo;
import model.dao.AbstractGenericDaoImpl;
import model.dao.MeteostationInfoDao;

public class MeteostationInfoController extends AbstractGenericControllerImpl<MeteostationInfo> {
    private final MeteostationInfoDao meteostationInfoDao = new MeteostationInfoDao();

    @Override
    public AbstractGenericDaoImpl<MeteostationInfo> getDao() {
        return meteostationInfoDao;
    }
}

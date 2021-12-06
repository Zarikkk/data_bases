package controller;

import model.ServiceInfo;
import model.dao.AbstractGenericDaoImpl;
import model.dao.ServiceInfoDao;

public class ServiceInfoController extends AbstractGenericControllerImpl<ServiceInfo> {
    private final ServiceInfoDao serviceInfoDao = new ServiceInfoDao();
    @Override
    public AbstractGenericDaoImpl<ServiceInfo> getDao() {
        return serviceInfoDao;
    }
}

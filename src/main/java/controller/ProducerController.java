package controller;

import model.Producer;
import model.dao.AbstractGenericDaoImpl;
import model.dao.ProducerDao;

public class ProducerController extends AbstractGenericControllerImpl<Producer> {
    private final ProducerDao producerDao = new ProducerDao();

    @Override
    public AbstractGenericDaoImpl<Producer> getDao() {
        return producerDao;
    }
}

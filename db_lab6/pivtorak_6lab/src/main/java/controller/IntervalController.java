package controller;

import model.Interval;
import model.dao.AbstractGenericDaoImpl;
import model.dao.IntervalDao;

public class IntervalController extends AbstractGenericControllerImpl<Interval> {
    private final IntervalDao intervalDao = new IntervalDao();
    @Override
    public AbstractGenericDaoImpl<Interval> getDao() {
        return intervalDao;
    }
}


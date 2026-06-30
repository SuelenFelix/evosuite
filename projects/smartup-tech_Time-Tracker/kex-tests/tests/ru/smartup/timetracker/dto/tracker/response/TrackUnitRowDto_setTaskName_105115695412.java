package ru.smartup.timetracker.dto.tracker.response;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static ru.smartup.timetracker.dto.tracker.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class TrackUnitRowDto_setTaskName_105115695412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5281;

    public TrackUnitRowDto_setTaskName_105115695412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5312 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5314 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5312, term5312.getClass(), "id", 50358265865610362L);
        setLongField(term5314, term5314.getClass(), "fastTime", 1276505397937L);
        setField(term5314, term5314.getClass(), "cdate", null);
        setField(term5312, term5312.getClass(), "workDay", term5314);
        setFloatField(term5312, term5312.getClass(), "hours", 0.2946385F);
        setBooleanField(term5312, term5312.getClass(), "blocked", false);
        setBooleanField(term5312, term5312.getClass(), "billable", false);
        setField(term5312, term5312.getClass(), "comment", "");
        setField(term5312, term5312.getClass(), "rejectReason", "");
        setBooleanField(term5312, term5312.getClass(), "rejected", false);
        Object term5322 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5324 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5322, term5322.getClass(), "id", 5510783420697225605L);
        setLongField(term5324, term5324.getClass(), "fastTime", 1278177575793L);
        setField(term5324, term5324.getClass(), "cdate", null);
        setField(term5322, term5322.getClass(), "workDay", term5324);
        setFloatField(term5322, term5322.getClass(), "hours", 0.07802445F);
        setBooleanField(term5322, term5322.getClass(), "blocked", true);
        setBooleanField(term5322, term5322.getClass(), "billable", true);
        setField(term5322, term5322.getClass(), "comment", "");
        setField(term5322, term5322.getClass(), "rejectReason", "");
        setBooleanField(term5322, term5322.getClass(), "rejected", true);
        Object term5332 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5334 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5332, term5332.getClass(), "id", 6005241913654469005L);
        setLongField(term5334, term5334.getClass(), "fastTime", 1272776321768L);
        setField(term5334, term5334.getClass(), "cdate", null);
        setField(term5332, term5332.getClass(), "workDay", term5334);
        setFloatField(term5332, term5332.getClass(), "hours", 0.36114347F);
        setBooleanField(term5332, term5332.getClass(), "blocked", true);
        setBooleanField(term5332, term5332.getClass(), "billable", false);
        setField(term5332, term5332.getClass(), "comment", "");
        setField(term5332, term5332.getClass(), "rejectReason", "");
        setBooleanField(term5332, term5332.getClass(), "rejected", false);
        Object term5342 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5344 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5342, term5342.getClass(), "id", -1983291584002806658L);
        setLongField(term5344, term5344.getClass(), "fastTime", 1597352397295L);
        setField(term5344, term5344.getClass(), "cdate", null);
        setField(term5342, term5342.getClass(), "workDay", term5344);
        setFloatField(term5342, term5342.getClass(), "hours", 0.52792794F);
        setBooleanField(term5342, term5342.getClass(), "blocked", true);
        setBooleanField(term5342, term5342.getClass(), "billable", false);
        setField(term5342, term5342.getClass(), "comment", "");
        setField(term5342, term5342.getClass(), "rejectReason", "");
        setBooleanField(term5342, term5342.getClass(), "rejected", true);
        Object term5352 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5354 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5352, term5352.getClass(), "id", 5946780097489996391L);
        setLongField(term5354, term5354.getClass(), "fastTime", 1713891155263L);
        setField(term5354, term5354.getClass(), "cdate", null);
        setField(term5352, term5352.getClass(), "workDay", term5354);
        setFloatField(term5352, term5352.getClass(), "hours", 0.24759698F);
        setBooleanField(term5352, term5352.getClass(), "blocked", true);
        setBooleanField(term5352, term5352.getClass(), "billable", true);
        setField(term5352, term5352.getClass(), "comment", "");
        setField(term5352, term5352.getClass(), "rejectReason", "");
        setBooleanField(term5352, term5352.getClass(), "rejected", false);
        ArrayList term5310 = new ArrayList();
        ((ArrayList) term5310).add(term5312);
        ((ArrayList) term5310).add(term5322);
        ((ArrayList) term5310).add(term5332);
        ((ArrayList) term5310).add(term5342);
        ((ArrayList) term5310).add(term5352);
        term5281 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term5281, term5281.getClass(), "employeeId", -1007160944);
        setIntField(term5281, term5281.getClass(), "projectId", 1135664017);
        setField(term5281, term5281.getClass(), "projectName", "aNWLJdrZMq");
        setLongField(term5281, term5281.getClass(), "taskId", 7862575738391801707L);
        setField(term5281, term5281.getClass(), "taskName", "HHmNoYxIGj");
        setBooleanField(term5281, term5281.getClass(), "observed", false);
        setField(term5281, term5281.getClass(), "units", term5310);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XYtryyobou";
        callMethod(klass, "setTaskName", argTypes, term5281, args);
    }

};



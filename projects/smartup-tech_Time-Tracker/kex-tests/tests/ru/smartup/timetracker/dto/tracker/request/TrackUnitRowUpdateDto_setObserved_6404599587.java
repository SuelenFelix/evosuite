package ru.smartup.timetracker.dto.tracker.request;

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
import static ru.smartup.timetracker.dto.tracker.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Boolean;

public class TrackUnitRowUpdateDto_setObserved_6404599587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term738;
     Object term758;

    public TrackUnitRowUpdateDto_setObserved_6404599587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term744 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term745 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term745, term745.getClass(), "fastTime", 1663413767651L);
        setField(term745, term745.getClass(), "cdate", null);
        setField(term744, term744.getClass(), "workDay", term745);
        setFloatField(term744, term744.getClass(), "hours", 0.9472605F);
        setField(term744, term744.getClass(), "comment", "");
        setBooleanField(term744, term744.getClass(), "billable", false);
        Object term750 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term751 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term751, term751.getClass(), "fastTime", 1263744156294L);
        setField(term751, term751.getClass(), "cdate", null);
        setField(term750, term750.getClass(), "workDay", term751);
        setFloatField(term750, term750.getClass(), "hours", 0.27797186F);
        setField(term750, term750.getClass(), "comment", "");
        setBooleanField(term750, term750.getClass(), "billable", false);
        ArrayList term742 = new ArrayList();
        ((ArrayList) term742).add(term744);
        ((ArrayList) term742).add(term750);
        term738 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitRowUpdateDto"));
        setIntField(term738, term738.getClass(), "employeeId", -1685132342);
        setLongField(term738, term738.getClass(), "taskId", 6811161968424632369L);
        setBooleanField(term738, term738.getClass(), "observed", false);
        setField(term738, term738.getClass(), "units", term742);
        term758 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitRowUpdateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term758;
        callMethod(klass, "setObserved", argTypes, term738, args);
    }

};



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
import java.lang.Integer;

public class TrackUnitRowUpdateDto_setEmployeeId_9686193835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term712;
     Object term726;

    public TrackUnitRowUpdateDto_setEmployeeId_9686193835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term718 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitCellUpdateDto"));
        Object term719 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term719, term719.getClass(), "fastTime", 1713891155263L);
        setField(term719, term719.getClass(), "cdate", null);
        setField(term718, term718.getClass(), "workDay", term719);
        setFloatField(term718, term718.getClass(), "hours", 0.9828442F);
        setField(term718, term718.getClass(), "comment", "");
        setBooleanField(term718, term718.getClass(), "billable", true);
        ArrayList term716 = new ArrayList();
        ((ArrayList) term716).add(term718);
        term712 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitRowUpdateDto"));
        setIntField(term712, term712.getClass(), "employeeId", -883034806);
        setLongField(term712, term712.getClass(), "taskId", 5270370404989704783L);
        setBooleanField(term712, term712.getClass(), "observed", true);
        setField(term712, term712.getClass(), "units", term716);
        term726 = new Integer(1585847225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.request.TrackUnitRowUpdateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term726;
        callMethod(klass, "setEmployeeId", argTypes, term712, args);
    }

};



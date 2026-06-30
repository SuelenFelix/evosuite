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
import java.lang.Object;
import java.lang.Float;

public class TrackUnitCellDto_setHours_78998094811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3516;
     Object term3548;

    public TrackUnitCellDto_setHours_78998094811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3516 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term3518 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term3516, term3516.getClass(), "id", -8885298608300233488L);
        setLongField(term3518, term3518.getClass(), "fastTime", 1589457921030L);
        setField(term3518, term3518.getClass(), "cdate", null);
        setField(term3516, term3516.getClass(), "workDay", term3518);
        setFloatField(term3516, term3516.getClass(), "hours", 0.6608425F);
        setBooleanField(term3516, term3516.getClass(), "blocked", false);
        setBooleanField(term3516, term3516.getClass(), "billable", false);
        setField(term3516, term3516.getClass(), "comment", "hNxWaHcfhY");
        setField(term3516, term3516.getClass(), "rejectReason", "RkybSrpybU");
        setBooleanField(term3516, term3516.getClass(), "rejected", false);
        term3548 = new Float(0.37773192F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term3548;
        callMethod(klass, "setHours", argTypes, term3516, args);
    }

};



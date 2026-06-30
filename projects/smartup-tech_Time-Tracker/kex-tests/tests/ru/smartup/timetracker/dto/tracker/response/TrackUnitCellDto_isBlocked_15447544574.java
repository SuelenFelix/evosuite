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

public class TrackUnitCellDto_isBlocked_15447544574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3148;

    public TrackUnitCellDto_isBlocked_15447544574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3148 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term3150 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term3148, term3148.getClass(), "id", -8400487765614892086L);
        setLongField(term3150, term3150.getClass(), "fastTime", 1606045635837L);
        setField(term3150, term3150.getClass(), "cdate", null);
        setField(term3148, term3148.getClass(), "workDay", term3150);
        setFloatField(term3148, term3148.getClass(), "hours", 0.40176582F);
        setBooleanField(term3148, term3148.getClass(), "blocked", false);
        setBooleanField(term3148, term3148.getClass(), "billable", false);
        setField(term3148, term3148.getClass(), "comment", "SzjVpOQTyS");
        setField(term3148, term3148.getClass(), "rejectReason", "MjGYSRKTNF");
        setBooleanField(term3148, term3148.getClass(), "rejected", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBlocked", argTypes, term3148, args);
    }

};



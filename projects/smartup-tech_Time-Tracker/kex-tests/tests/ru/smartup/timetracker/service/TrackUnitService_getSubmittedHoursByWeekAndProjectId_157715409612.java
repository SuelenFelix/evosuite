package ru.smartup.timetracker.service;

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
import static ru.smartup.timetracker.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class TrackUnitService_getSubmittedHoursByWeekAndProjectId_157715409612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3277;
     Object term3279;

    public TrackUnitService_getSubmittedHoursByWeekAndProjectId_157715409612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3277 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term3277, term3277.getClass(), "fastTime", 1606045635837L);
        setField(term3277, term3277.getClass(), "cdate", null);
        term3279 = new Integer(-1618206977);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.TrackUnitService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.sql.Date");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term3277;
        args[1] = term3279;
        callMethod(klass, "getSubmittedHoursByWeekAndProjectId", argTypes, null, args);
    }

};



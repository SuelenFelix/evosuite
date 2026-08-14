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

public class TrackUnitService_getByEmployeeIdAndRange_20034234883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3209;
     Object term3211;
     Object term3215;

    public TrackUnitService_getByEmployeeIdAndRange_20034234883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3209 = new Integer(880977281);
        term3211 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3211, term3211.getClass(), "year", 2027);
        setShortField(term3211, term3211.getClass(), "month", (short) 8);
        setShortField(term3211, term3211.getClass(), "day", (short) 25);
        term3215 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3215, term3215.getClass(), "year", 2014);
        setShortField(term3215, term3215.getClass(), "month", (short) 5);
        setShortField(term3215, term3215.getClass(), "day", (short) 21);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.TrackUnitService");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.time.LocalDate");
        argTypes[2] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[3];
        args[0] = term3209;
        args[1] = term3211;
        args[2] = term3215;
        callMethod(klass, "getByEmployeeIdAndRange", argTypes, null, args);
    }

};



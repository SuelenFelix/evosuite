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

public class TrackUnitService_getSubmittedHoursForEmployee_43280747313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3305;
     Object term3309;

    public TrackUnitService_getSubmittedHoursForEmployee_43280747313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3305 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3305, term3305.getClass(), "year", 2028);
        setShortField(term3305, term3305.getClass(), "month", (short) 9);
        setShortField(term3305, term3305.getClass(), "day", (short) 30);
        term3309 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3309, term3309.getClass(), "year", 2026);
        setShortField(term3309, term3309.getClass(), "month", (short) 11);
        setShortField(term3309, term3309.getClass(), "day", (short) 29);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.TrackUnitService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.time.LocalDate");
        argTypes[1] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[2];
        args[0] = term3305;
        args[1] = term3309;
        callMethod(klass, "getSubmittedHoursForEmployee", argTypes, null, args);
    }

};



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
import java.lang.Object;

public class TrackUnitService_unfreezeAllByDate_133711441521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3393;

    public TrackUnitService_unfreezeAllByDate_133711441521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3393 = newInstance(Class.forName("ru.smartup.timetracker.pojo.freeze.UnfreezeDateInterval"));
        Object term3394 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3398 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3394, term3394.getClass(), "year", 2025);
        setShortField(term3394, term3394.getClass(), "month", (short) 11);
        setShortField(term3394, term3394.getClass(), "day", (short) 3);
        setField(term3393, term3393.getClass(), "startDate", term3394);
        setIntField(term3398, term3398.getClass(), "year", 2014);
        setShortField(term3398, term3398.getClass(), "month", (short) 3);
        setShortField(term3398, term3398.getClass(), "day", (short) 22);
        setField(term3393, term3393.getClass(), "endDate", term3398);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.TrackUnitService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.pojo.freeze.UnfreezeDateInterval");
        Object[] args = new Object[1];
        args[0] = term3393;
        callMethod(klass, "unfreezeAllByDate", argTypes, null, args);
    }

};



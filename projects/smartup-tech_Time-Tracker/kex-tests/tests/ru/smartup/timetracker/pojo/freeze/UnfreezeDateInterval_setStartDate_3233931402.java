package ru.smartup.timetracker.pojo.freeze;

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
import static ru.smartup.timetracker.pojo.freeze.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UnfreezeDateInterval_setStartDate_3233931402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19;
     Object term28;

    public UnfreezeDateInterval_setStartDate_3233931402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19 = newInstance(Class.forName("ru.smartup.timetracker.pojo.freeze.UnfreezeDateInterval"));
        Object term20 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term20, term20.getClass(), "year", 2015);
        setShortField(term20, term20.getClass(), "month", (short) 9);
        setShortField(term20, term20.getClass(), "day", (short) 19);
        setField(term19, term19.getClass(), "startDate", term20);
        setIntField(term24, term24.getClass(), "year", 2018);
        setShortField(term24, term24.getClass(), "month", (short) 1);
        setShortField(term24, term24.getClass(), "day", (short) 13);
        setField(term19, term19.getClass(), "endDate", term24);
        term28 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term28, term28.getClass(), "year", 2015);
        setShortField(term28, term28.getClass(), "month", (short) 4);
        setShortField(term28, term28.getClass(), "day", (short) 14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.freeze.UnfreezeDateInterval");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term28;
        callMethod(klass, "setStartDate", argTypes, term19, args);
    }

};



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

public class UnfreezeDateInterval_setEndDate_8397896513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32;
     Object term41;

    public UnfreezeDateInterval_setEndDate_8397896513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32 = newInstance(Class.forName("ru.smartup.timetracker.pojo.freeze.UnfreezeDateInterval"));
        Object term33 = newInstance(Class.forName("java.time.LocalDate"));
        Object term37 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term33, term33.getClass(), "year", 2017);
        setShortField(term33, term33.getClass(), "month", (short) 5);
        setShortField(term33, term33.getClass(), "day", (short) 21);
        setField(term32, term32.getClass(), "startDate", term33);
        setIntField(term37, term37.getClass(), "year", 2022);
        setShortField(term37, term37.getClass(), "month", (short) 2);
        setShortField(term37, term37.getClass(), "day", (short) 25);
        setField(term32, term32.getClass(), "endDate", term37);
        term41 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term41, term41.getClass(), "year", 2017);
        setShortField(term41, term41.getClass(), "month", (short) 7);
        setShortField(term41, term41.getClass(), "day", (short) 22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.freeze.UnfreezeDateInterval");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term41;
        callMethod(klass, "setEndDate", argTypes, term32, args);
    }

};



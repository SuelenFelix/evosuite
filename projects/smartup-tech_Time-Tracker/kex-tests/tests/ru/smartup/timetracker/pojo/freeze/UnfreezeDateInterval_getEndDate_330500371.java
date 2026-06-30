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

public class UnfreezeDateInterval_getEndDate_330500371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10;

    public UnfreezeDateInterval_getEndDate_330500371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10 = newInstance(Class.forName("ru.smartup.timetracker.pojo.freeze.UnfreezeDateInterval"));
        Object term11 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term11, term11.getClass(), "year", 2021);
        setShortField(term11, term11.getClass(), "month", (short) 1);
        setShortField(term11, term11.getClass(), "day", (short) 18);
        setField(term10, term10.getClass(), "startDate", term11);
        setIntField(term15, term15.getClass(), "year", 2020);
        setShortField(term15, term15.getClass(), "month", (short) 11);
        setShortField(term15, term15.getClass(), "day", (short) 22);
        setField(term10, term10.getClass(), "endDate", term15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.freeze.UnfreezeDateInterval");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndDate", argTypes, term10, args);
    }

};



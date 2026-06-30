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

public class UnfreezeDateInterval_getStartDate_1558942900 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public UnfreezeDateInterval_getStartDate_1558942900() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("ru.smartup.timetracker.pojo.freeze.UnfreezeDateInterval"));
        Object term2 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term2, term2.getClass(), "year", 2012);
        setShortField(term2, term2.getClass(), "month", (short) 8);
        setShortField(term2, term2.getClass(), "day", (short) 25);
        setField(term1, term1.getClass(), "startDate", term2);
        setIntField(term6, term6.getClass(), "year", 2016);
        setShortField(term6, term6.getClass(), "month", (short) 11);
        setShortField(term6, term6.getClass(), "day", (short) 29);
        setField(term1, term1.getClass(), "endDate", term6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.freeze.UnfreezeDateInterval");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartDate", argTypes, term1, args);
    }

};



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

public class UnfreezeDateInterval_equals_5989756144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45;
     Object term54;

    public UnfreezeDateInterval_equals_5989756144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45 = newInstance(Class.forName("ru.smartup.timetracker.pojo.freeze.UnfreezeDateInterval"));
        Object term46 = newInstance(Class.forName("java.time.LocalDate"));
        Object term50 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term46, term46.getClass(), "year", 2026);
        setShortField(term46, term46.getClass(), "month", (short) 12);
        setShortField(term46, term46.getClass(), "day", (short) 13);
        setField(term45, term45.getClass(), "startDate", term46);
        setIntField(term50, term50.getClass(), "year", 2020);
        setShortField(term50, term50.getClass(), "month", (short) 5);
        setShortField(term50, term50.getClass(), "day", (short) 14);
        setField(term45, term45.getClass(), "endDate", term50);
        term54 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.freeze.UnfreezeDateInterval");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term54;
        callMethod(klass, "equals", argTypes, term45, args);
    }

};



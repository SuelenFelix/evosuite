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

public class UnfreezeDateInterval_canEqual_2051870155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55;
     Object term64;

    public UnfreezeDateInterval_canEqual_2051870155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55 = newInstance(Class.forName("ru.smartup.timetracker.pojo.freeze.UnfreezeDateInterval"));
        Object term56 = newInstance(Class.forName("java.time.LocalDate"));
        Object term60 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term56, term56.getClass(), "year", 2025);
        setShortField(term56, term56.getClass(), "month", (short) 4);
        setShortField(term56, term56.getClass(), "day", (short) 23);
        setField(term55, term55.getClass(), "startDate", term56);
        setIntField(term60, term60.getClass(), "year", 2012);
        setShortField(term60, term60.getClass(), "month", (short) 10);
        setShortField(term60, term60.getClass(), "day", (short) 1);
        setField(term55, term55.getClass(), "endDate", term60);
        term64 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.freeze.UnfreezeDateInterval");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term64;
        callMethod(klass, "canEqual", argTypes, term55, args);
    }

};



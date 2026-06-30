package ru.smartup.timetracker.pojo;

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
import static ru.smartup.timetracker.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ScheduledFreeze_init_19189530830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22150;

    public ScheduledFreeze_init_19189530830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22150 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term22150, term22150.getClass(), "year", 2020);
        setShortField(term22150, term22150.getClass(), "month", (short) 11);
        setShortField(term22150, term22150.getClass(), "day", (short) 22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.ScheduledFreeze");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.concurrent.ScheduledFuture");
        argTypes[1] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term22150;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



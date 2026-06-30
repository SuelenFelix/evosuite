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
import java.lang.Object;

public class SubmittedHours_getHours_7392064481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22316;

    public SubmittedHours_getHours_7392064481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22316 = newInstance(Class.forName("ru.smartup.timetracker.pojo.SubmittedHours"));
        Object term22317 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term22317, term22317.getClass(), "year", 2025);
        setShortField(term22317, term22317.getClass(), "month", (short) 2);
        setShortField(term22317, term22317.getClass(), "day", (short) 13);
        setField(term22316, term22316.getClass(), "week", term22317);
        setFloatField(term22316, term22316.getClass(), "hours", 0.6853048F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.SubmittedHours");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHours", argTypes, term22316, args);
    }

};



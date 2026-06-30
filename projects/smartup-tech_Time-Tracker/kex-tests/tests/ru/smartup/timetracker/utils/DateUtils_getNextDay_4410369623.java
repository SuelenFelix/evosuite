package ru.smartup.timetracker.utils;

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
import static ru.smartup.timetracker.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DateUtils_getNextDay_4410369623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320;

    public DateUtils_getNextDay_4410369623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term320 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term321 = newInstance(Class.forName("java.time.LocalDate"));
        Object term325 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term321, term321.getClass(), "year", 2012);
        setShortField(term321, term321.getClass(), "month", (short) 8);
        setShortField(term321, term321.getClass(), "day", (short) 25);
        setField(term320, term320.getClass(), "date", term321);
        setByteField(term325, term325.getClass(), "hour", (byte) 5);
        setByteField(term325, term325.getClass(), "minute", (byte) 20);
        setByteField(term325, term325.getClass(), "second", (byte) 50);
        setIntField(term325, term325.getClass(), "nano", 345595912);
        setField(term320, term320.getClass(), "time", term325);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.utils.DateUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term320;
        callMethod(klass, "getNextDay", argTypes, null, args);
    }

};



package com.vivek.pattern.models;

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
import static com.vivek.pattern.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Show_withDateTime_9663332632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91;
     Object term115;

    public Show_withDateTime_9663332632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91 = newInstance(Class.forName("com.vivek.pattern.models.Show"));
        Object term92 = newInstance(Class.forName("com.vivek.pattern.models.Movie"));
        Object term105 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term106 = newInstance(Class.forName("java.time.LocalDate"));
        Object term110 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term92, term92.getClass(), "title", "xxtlPwDYFs");
        setField(term91, term91.getClass(), "movie", term92);
        setIntField(term106, term106.getClass(), "year", 2015);
        setShortField(term106, term106.getClass(), "month", (short) 9);
        setShortField(term106, term106.getClass(), "day", (short) 19);
        setField(term105, term105.getClass(), "date", term106);
        setByteField(term110, term110.getClass(), "hour", (byte) 9);
        setByteField(term110, term110.getClass(), "minute", (byte) 4);
        setByteField(term110, term110.getClass(), "second", (byte) 10);
        setIntField(term110, term110.getClass(), "nano", 401765865);
        setField(term105, term105.getClass(), "time", term110);
        setField(term91, term91.getClass(), "dateTime", term105);
        term115 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term116, term116.getClass(), "year", 2015);
        setShortField(term116, term116.getClass(), "month", (short) 4);
        setShortField(term116, term116.getClass(), "day", (short) 14);
        setField(term115, term115.getClass(), "date", term116);
        setByteField(term120, term120.getClass(), "hour", (byte) 18);
        setByteField(term120, term120.getClass(), "minute", (byte) 24);
        setByteField(term120, term120.getClass(), "second", (byte) 32);
        setIntField(term120, term120.getClass(), "nano", 369233818);
        setField(term115, term115.getClass(), "time", term120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.vivek.pattern.models.Show");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term115;
        callMethod(klass, "withDateTime", argTypes, term91, args);
    }

};



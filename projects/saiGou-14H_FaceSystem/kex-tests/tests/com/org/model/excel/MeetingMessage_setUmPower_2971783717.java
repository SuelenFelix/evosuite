package com.org.model.excel;

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
import static com.org.model.excel.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class MeetingMessage_setUmPower_2971783717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1899;
     Object term1972;

    public MeetingMessage_setUmPower_2971783717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1936 = new Integer(-73683645);
        Integer term1938 = new Integer(-226514366);
        term1899 = newInstance(Class.forName("com.org.model.excel.MeetingMessage"));
        Object term1940 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1941 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1945 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1950 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1951 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1955 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1899, term1899.getClass(), "username", "tPlsykYBqO");
        setField(term1899, term1899.getClass(), "nickname", "bLPjGVBhlX");
        setField(term1899, term1899.getClass(), "sex", "whBvTVIIlC");
        setField(term1899, term1899.getClass(), "umPower", term1936);
        setField(term1899, term1899.getClass(), "state", term1938);
        setIntField(term1941, term1941.getClass(), "year", 2012);
        setShortField(term1941, term1941.getClass(), "month", (short) 3);
        setShortField(term1941, term1941.getClass(), "day", (short) 27);
        setField(term1940, term1940.getClass(), "date", term1941);
        setByteField(term1945, term1945.getClass(), "hour", (byte) 17);
        setByteField(term1945, term1945.getClass(), "minute", (byte) 49);
        setByteField(term1945, term1945.getClass(), "second", (byte) 24);
        setIntField(term1945, term1945.getClass(), "nano", 530647398);
        setField(term1940, term1940.getClass(), "time", term1945);
        setField(term1899, term1899.getClass(), "startTime", term1940);
        setIntField(term1951, term1951.getClass(), "year", 2010);
        setShortField(term1951, term1951.getClass(), "month", (short) 6);
        setShortField(term1951, term1951.getClass(), "day", (short) 14);
        setField(term1950, term1950.getClass(), "date", term1951);
        setByteField(term1955, term1955.getClass(), "hour", (byte) 6);
        setByteField(term1955, term1955.getClass(), "minute", (byte) 22);
        setByteField(term1955, term1955.getClass(), "second", (byte) 20);
        setIntField(term1955, term1955.getClass(), "nano", 25133051);
        setField(term1950, term1950.getClass(), "time", term1955);
        setField(term1899, term1899.getClass(), "endTime", term1950);
        setField(term1899, term1899.getClass(), "allTime", "IgRJUzaCwW");
        term1972 = new Integer(1193880199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.excel.MeetingMessage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1972;
        callMethod(klass, "setUmPower", argTypes, term1899, args);
    }

};



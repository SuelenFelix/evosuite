package com.org.model;

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
import static com.org.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Meeting_equals_62381895929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31853;
     Object term31967;

    public Meeting_equals_62381895929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term31854 = new Integer(1166664554);
        Integer term31936 = new Integer(-1287204441);
        Integer term31938 = new Integer(1826016641);
        Integer term31953 = new Integer(1726886771);
        term31853 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term31856 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31857 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31861 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31902 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31903 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31907 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31853, term31853.getClass(), "id", term31854);
        setIntField(term31857, term31857.getClass(), "year", 2014);
        setShortField(term31857, term31857.getClass(), "month", (short) 1);
        setShortField(term31857, term31857.getClass(), "day", (short) 6);
        setField(term31856, term31856.getClass(), "date", term31857);
        setByteField(term31861, term31861.getClass(), "hour", (byte) 13);
        setByteField(term31861, term31861.getClass(), "minute", (byte) 4);
        setByteField(term31861, term31861.getClass(), "second", (byte) 34);
        setIntField(term31861, term31861.getClass(), "nano", 465558975);
        setField(term31856, term31856.getClass(), "time", term31861);
        setField(term31853, term31853.getClass(), "createTime", term31856);
        setField(term31853, term31853.getClass(), "name", "QeLmDPNEJJ");
        setField(term31853, term31853.getClass(), "link", "vKCMbZqDQh");
        setField(term31853, term31853.getClass(), "introduce", "jplaiEGqAX");
        setIntField(term31903, term31903.getClass(), "year", 2016);
        setShortField(term31903, term31903.getClass(), "month", (short) 8);
        setShortField(term31903, term31903.getClass(), "day", (short) 23);
        setField(term31902, term31902.getClass(), "date", term31903);
        setByteField(term31907, term31907.getClass(), "hour", (byte) 15);
        setByteField(term31907, term31907.getClass(), "minute", (byte) 21);
        setByteField(term31907, term31907.getClass(), "second", (byte) 10);
        setIntField(term31907, term31907.getClass(), "nano", 549669034);
        setField(term31902, term31902.getClass(), "time", term31907);
        setField(term31853, term31853.getClass(), "updateTime", term31902);
        setField(term31853, term31853.getClass(), "meetingTime", "jBEIjwXBat");
        setField(term31853, term31853.getClass(), "signTime", "YoXZiTWIfq");
        setField(term31853, term31853.getClass(), "signNumber", term31936);
        setField(term31853, term31853.getClass(), "userNumber", term31938);
        setField(term31853, term31853.getClass(), "fileUrl", "axiEfmpYKn");
        setBooleanField(term31853, term31853.getClass(), "online", false);
        setField(term31853, term31853.getClass(), "deleted", term31953);
        setField(term31853, term31853.getClass(), "host", "qHOoQEXGDJ");
        term31967 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term31967;
        callMethod(klass, "equals", argTypes, term31853, args);
    }

};



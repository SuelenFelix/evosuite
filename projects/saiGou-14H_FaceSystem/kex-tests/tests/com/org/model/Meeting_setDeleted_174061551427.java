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

public class Meeting_setDeleted_174061551427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31461;
     Object term31575;

    public Meeting_setDeleted_174061551427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term31462 = new Integer(690762493);
        Integer term31544 = new Integer(-1050083704);
        Integer term31546 = new Integer(-1513402749);
        Integer term31561 = new Integer(-1865692837);
        term31461 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term31464 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31465 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31469 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31510 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31511 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31515 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31461, term31461.getClass(), "id", term31462);
        setIntField(term31465, term31465.getClass(), "year", 2019);
        setShortField(term31465, term31465.getClass(), "month", (short) 4);
        setShortField(term31465, term31465.getClass(), "day", (short) 30);
        setField(term31464, term31464.getClass(), "date", term31465);
        setByteField(term31469, term31469.getClass(), "hour", (byte) 11);
        setByteField(term31469, term31469.getClass(), "minute", (byte) 21);
        setByteField(term31469, term31469.getClass(), "second", (byte) 24);
        setIntField(term31469, term31469.getClass(), "nano", 799334249);
        setField(term31464, term31464.getClass(), "time", term31469);
        setField(term31461, term31461.getClass(), "createTime", term31464);
        setField(term31461, term31461.getClass(), "name", "yvvGTFDzWl");
        setField(term31461, term31461.getClass(), "link", "smEWGoimYP");
        setField(term31461, term31461.getClass(), "introduce", "QViiWIrVBm");
        setIntField(term31511, term31511.getClass(), "year", 2012);
        setShortField(term31511, term31511.getClass(), "month", (short) 10);
        setShortField(term31511, term31511.getClass(), "day", (short) 18);
        setField(term31510, term31510.getClass(), "date", term31511);
        setByteField(term31515, term31515.getClass(), "hour", (byte) 0);
        setByteField(term31515, term31515.getClass(), "minute", (byte) 2);
        setByteField(term31515, term31515.getClass(), "second", (byte) 34);
        setIntField(term31515, term31515.getClass(), "nano", 773422612);
        setField(term31510, term31510.getClass(), "time", term31515);
        setField(term31461, term31461.getClass(), "updateTime", term31510);
        setField(term31461, term31461.getClass(), "meetingTime", "kzXrBwaqJb");
        setField(term31461, term31461.getClass(), "signTime", "AxcOeEhUhX");
        setField(term31461, term31461.getClass(), "signNumber", term31544);
        setField(term31461, term31461.getClass(), "userNumber", term31546);
        setField(term31461, term31461.getClass(), "fileUrl", "iFdFaQoJtd");
        setBooleanField(term31461, term31461.getClass(), "online", false);
        setField(term31461, term31461.getClass(), "deleted", term31561);
        setField(term31461, term31461.getClass(), "host", "jwbrWhGlmx");
        term31575 = new Integer(966678407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term31575;
        callMethod(klass, "setDeleted", argTypes, term31461, args);
    }

};



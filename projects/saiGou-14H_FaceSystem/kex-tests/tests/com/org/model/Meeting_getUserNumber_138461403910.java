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

public class Meeting_getUserNumber_138461403910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28173;

    public Meeting_getUserNumber_138461403910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term28174 = new Integer(2073870078);
        Integer term28256 = new Integer(1649066040);
        Integer term28258 = new Integer(-640093979);
        Integer term28273 = new Integer(1665282382);
        term28173 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term28176 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28177 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28181 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28222 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28223 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28227 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28173, term28173.getClass(), "id", term28174);
        setIntField(term28177, term28177.getClass(), "year", 2025);
        setShortField(term28177, term28177.getClass(), "month", (short) 3);
        setShortField(term28177, term28177.getClass(), "day", (short) 2);
        setField(term28176, term28176.getClass(), "date", term28177);
        setByteField(term28181, term28181.getClass(), "hour", (byte) 23);
        setByteField(term28181, term28181.getClass(), "minute", (byte) 28);
        setByteField(term28181, term28181.getClass(), "second", (byte) 42);
        setIntField(term28181, term28181.getClass(), "nano", 204636448);
        setField(term28176, term28176.getClass(), "time", term28181);
        setField(term28173, term28173.getClass(), "createTime", term28176);
        setField(term28173, term28173.getClass(), "name", "LwEVtHWUbm");
        setField(term28173, term28173.getClass(), "link", "CprHpAIkGr");
        setField(term28173, term28173.getClass(), "introduce", "xdyDUmqjTv");
        setIntField(term28223, term28223.getClass(), "year", 2023);
        setShortField(term28223, term28223.getClass(), "month", (short) 8);
        setShortField(term28223, term28223.getClass(), "day", (short) 30);
        setField(term28222, term28222.getClass(), "date", term28223);
        setByteField(term28227, term28227.getClass(), "hour", (byte) 9);
        setByteField(term28227, term28227.getClass(), "minute", (byte) 28);
        setByteField(term28227, term28227.getClass(), "second", (byte) 51);
        setIntField(term28227, term28227.getClass(), "nano", 285035808);
        setField(term28222, term28222.getClass(), "time", term28227);
        setField(term28173, term28173.getClass(), "updateTime", term28222);
        setField(term28173, term28173.getClass(), "meetingTime", "ckzmrYUHZc");
        setField(term28173, term28173.getClass(), "signTime", "aTmYFKjOly");
        setField(term28173, term28173.getClass(), "signNumber", term28256);
        setField(term28173, term28173.getClass(), "userNumber", term28258);
        setField(term28173, term28173.getClass(), "fileUrl", "VMCGtPaBtR");
        setBooleanField(term28173, term28173.getClass(), "online", false);
        setField(term28173, term28173.getClass(), "deleted", term28273);
        setField(term28173, term28173.getClass(), "host", "hkZCYOvvsd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserNumber", argTypes, term28173, args);
    }

};



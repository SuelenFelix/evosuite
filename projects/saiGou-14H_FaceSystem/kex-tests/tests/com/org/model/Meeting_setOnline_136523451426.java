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
import java.lang.Boolean;

public class Meeting_setOnline_136523451426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31275;
     Object term31389;

    public Meeting_setOnline_136523451426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term31276 = new Integer(-779100899);
        Integer term31358 = new Integer(-1750603840);
        Integer term31360 = new Integer(2088919651);
        Integer term31375 = new Integer(949997254);
        term31275 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term31278 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31279 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31283 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31324 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31325 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31329 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31275, term31275.getClass(), "id", term31276);
        setIntField(term31279, term31279.getClass(), "year", 2027);
        setShortField(term31279, term31279.getClass(), "month", (short) 7);
        setShortField(term31279, term31279.getClass(), "day", (short) 21);
        setField(term31278, term31278.getClass(), "date", term31279);
        setByteField(term31283, term31283.getClass(), "hour", (byte) 9);
        setByteField(term31283, term31283.getClass(), "minute", (byte) 42);
        setByteField(term31283, term31283.getClass(), "second", (byte) 16);
        setIntField(term31283, term31283.getClass(), "nano", 660359132);
        setField(term31278, term31278.getClass(), "time", term31283);
        setField(term31275, term31275.getClass(), "createTime", term31278);
        setField(term31275, term31275.getClass(), "name", "xOKXQZHixc");
        setField(term31275, term31275.getClass(), "link", "oDEauryLsd");
        setField(term31275, term31275.getClass(), "introduce", "FNdPPGkJAQ");
        setIntField(term31325, term31325.getClass(), "year", 2022);
        setShortField(term31325, term31325.getClass(), "month", (short) 12);
        setShortField(term31325, term31325.getClass(), "day", (short) 24);
        setField(term31324, term31324.getClass(), "date", term31325);
        setByteField(term31329, term31329.getClass(), "hour", (byte) 7);
        setByteField(term31329, term31329.getClass(), "minute", (byte) 20);
        setByteField(term31329, term31329.getClass(), "second", (byte) 0);
        setIntField(term31329, term31329.getClass(), "nano", 127843410);
        setField(term31324, term31324.getClass(), "time", term31329);
        setField(term31275, term31275.getClass(), "updateTime", term31324);
        setField(term31275, term31275.getClass(), "meetingTime", "KLfGLavjuw");
        setField(term31275, term31275.getClass(), "signTime", "QKrxGrDGYI");
        setField(term31275, term31275.getClass(), "signNumber", term31358);
        setField(term31275, term31275.getClass(), "userNumber", term31360);
        setField(term31275, term31275.getClass(), "fileUrl", "PCykSpNbZJ");
        setBooleanField(term31275, term31275.getClass(), "online", false);
        setField(term31275, term31275.getClass(), "deleted", term31375);
        setField(term31275, term31275.getClass(), "host", "joQLIHDujG");
        term31389 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term31389;
        callMethod(klass, "setOnline", argTypes, term31275, args);
    }

};



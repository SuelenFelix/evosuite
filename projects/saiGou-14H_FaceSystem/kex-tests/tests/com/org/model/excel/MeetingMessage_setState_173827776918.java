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

public class MeetingMessage_setState_173827776918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2014;
     Object term2087;

    public MeetingMessage_setState_173827776918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2051 = new Integer(-1087774327);
        Integer term2053 = new Integer(-1530420153);
        term2014 = newInstance(Class.forName("com.org.model.excel.MeetingMessage"));
        Object term2055 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2056 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2060 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2065 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2066 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2070 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2014, term2014.getClass(), "username", "JUmudUmaaV");
        setField(term2014, term2014.getClass(), "nickname", "KoyGrUJeJW");
        setField(term2014, term2014.getClass(), "sex", "HqBOwkVqjD");
        setField(term2014, term2014.getClass(), "umPower", term2051);
        setField(term2014, term2014.getClass(), "state", term2053);
        setIntField(term2056, term2056.getClass(), "year", 2010);
        setShortField(term2056, term2056.getClass(), "month", (short) 5);
        setShortField(term2056, term2056.getClass(), "day", (short) 2);
        setField(term2055, term2055.getClass(), "date", term2056);
        setByteField(term2060, term2060.getClass(), "hour", (byte) 2);
        setByteField(term2060, term2060.getClass(), "minute", (byte) 22);
        setByteField(term2060, term2060.getClass(), "second", (byte) 33);
        setIntField(term2060, term2060.getClass(), "nano", 530835039);
        setField(term2055, term2055.getClass(), "time", term2060);
        setField(term2014, term2014.getClass(), "startTime", term2055);
        setIntField(term2066, term2066.getClass(), "year", 2024);
        setShortField(term2066, term2066.getClass(), "month", (short) 4);
        setShortField(term2066, term2066.getClass(), "day", (short) 24);
        setField(term2065, term2065.getClass(), "date", term2066);
        setByteField(term2070, term2070.getClass(), "hour", (byte) 7);
        setByteField(term2070, term2070.getClass(), "minute", (byte) 2);
        setByteField(term2070, term2070.getClass(), "second", (byte) 51);
        setIntField(term2070, term2070.getClass(), "nano", 635502964);
        setField(term2065, term2065.getClass(), "time", term2070);
        setField(term2014, term2014.getClass(), "endTime", term2065);
        setField(term2014, term2014.getClass(), "allTime", "MAcUBcBckh");
        term2087 = new Integer(-469968304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.excel.MeetingMessage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term2087;
        callMethod(klass, "setState", argTypes, term2014, args);
    }

};



package com.org.model.vo;

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
import static com.org.model.vo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class MeetingVO_setOnline_118955910119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10343;
     Object term10458;

    public MeetingVO_setOnline_118955910119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10344 = new Integer(754055848);
        Integer term10382 = new Integer(-19246901);
        Integer term10442 = new Integer(-370828664);
        Integer term10454 = new Integer(1168633950);
        Integer term10456 = new Integer(1607082164);
        term10343 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term10384 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10385 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10389 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10444 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10445 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10449 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term10343, term10343.getClass(), "id", term10344);
        setField(term10343, term10343.getClass(), "name", "nvXqvMSAjc");
        setField(term10343, term10343.getClass(), "host", "agbhgbQisl");
        setField(term10343, term10343.getClass(), "roomName", "EZvlAVCXCm");
        setField(term10343, term10343.getClass(), "online", term10382);
        setIntField(term10385, term10385.getClass(), "year", 2021);
        setShortField(term10385, term10385.getClass(), "month", (short) 4);
        setShortField(term10385, term10385.getClass(), "day", (short) 17);
        setField(term10384, term10384.getClass(), "date", term10385);
        setByteField(term10389, term10389.getClass(), "hour", (byte) 4);
        setByteField(term10389, term10389.getClass(), "minute", (byte) 11);
        setByteField(term10389, term10389.getClass(), "second", (byte) 16);
        setIntField(term10389, term10389.getClass(), "nano", 509895858);
        setField(term10384, term10384.getClass(), "time", term10389);
        setField(term10343, term10343.getClass(), "createTime", term10384);
        setField(term10343, term10343.getClass(), "link", "axtbmWOSRY");
        setField(term10343, term10343.getClass(), "meetingTime", "TLlyjzxJUz");
        setField(term10343, term10343.getClass(), "signTime", "YclIWGPKZY");
        setField(term10343, term10343.getClass(), "introduce", "gChBjLUhbg");
        setField(term10343, term10343.getClass(), "state", term10442);
        setIntField(term10445, term10445.getClass(), "year", 2011);
        setShortField(term10445, term10445.getClass(), "month", (short) 6);
        setShortField(term10445, term10445.getClass(), "day", (short) 26);
        setField(term10444, term10444.getClass(), "date", term10445);
        setByteField(term10449, term10449.getClass(), "hour", (byte) 22);
        setByteField(term10449, term10449.getClass(), "minute", (byte) 39);
        setByteField(term10449, term10449.getClass(), "second", (byte) 11);
        setIntField(term10449, term10449.getClass(), "nano", 686293604);
        setField(term10444, term10444.getClass(), "time", term10449);
        setField(term10343, term10343.getClass(), "updateTime", term10444);
        setField(term10343, term10343.getClass(), "userNumber", term10454);
        setField(term10343, term10343.getClass(), "signNumber", term10456);
        term10458 = new Integer(1890399366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term10458;
        callMethod(klass, "setOnline", argTypes, term10343, args);
    }

};



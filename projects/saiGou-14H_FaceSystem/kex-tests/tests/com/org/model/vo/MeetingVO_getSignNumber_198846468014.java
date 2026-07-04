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

public class MeetingVO_getSignNumber_198846468014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9350;

    public MeetingVO_getSignNumber_198846468014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9351 = new Integer(1496340209);
        Integer term9389 = new Integer(-1748391876);
        Integer term9449 = new Integer(43258317);
        Integer term9461 = new Integer(1707220033);
        Integer term9463 = new Integer(-1792504217);
        term9350 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term9391 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9392 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9396 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9451 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9452 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9456 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term9350, term9350.getClass(), "id", term9351);
        setField(term9350, term9350.getClass(), "name", "ITJMSWaPGZ");
        setField(term9350, term9350.getClass(), "host", "ivvEvcUacU");
        setField(term9350, term9350.getClass(), "roomName", "gbSukHPGfP");
        setField(term9350, term9350.getClass(), "online", term9389);
        setIntField(term9392, term9392.getClass(), "year", 2027);
        setShortField(term9392, term9392.getClass(), "month", (short) 11);
        setShortField(term9392, term9392.getClass(), "day", (short) 8);
        setField(term9391, term9391.getClass(), "date", term9392);
        setByteField(term9396, term9396.getClass(), "hour", (byte) 11);
        setByteField(term9396, term9396.getClass(), "minute", (byte) 59);
        setByteField(term9396, term9396.getClass(), "second", (byte) 14);
        setIntField(term9396, term9396.getClass(), "nano", 322375591);
        setField(term9391, term9391.getClass(), "time", term9396);
        setField(term9350, term9350.getClass(), "createTime", term9391);
        setField(term9350, term9350.getClass(), "link", "jEDnJjwhoo");
        setField(term9350, term9350.getClass(), "meetingTime", "TkTHRRicKc");
        setField(term9350, term9350.getClass(), "signTime", "xwBoTnuoQg");
        setField(term9350, term9350.getClass(), "introduce", "HHAcgDPghN");
        setField(term9350, term9350.getClass(), "state", term9449);
        setIntField(term9452, term9452.getClass(), "year", 2020);
        setShortField(term9452, term9452.getClass(), "month", (short) 8);
        setShortField(term9452, term9452.getClass(), "day", (short) 15);
        setField(term9451, term9451.getClass(), "date", term9452);
        setByteField(term9456, term9456.getClass(), "hour", (byte) 2);
        setByteField(term9456, term9456.getClass(), "minute", (byte) 0);
        setByteField(term9456, term9456.getClass(), "second", (byte) 38);
        setIntField(term9456, term9456.getClass(), "nano", 146431486);
        setField(term9451, term9451.getClass(), "time", term9456);
        setField(term9350, term9350.getClass(), "updateTime", term9451);
        setField(term9350, term9350.getClass(), "userNumber", term9461);
        setField(term9350, term9350.getClass(), "signNumber", term9463);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSignNumber", argTypes, term9350, args);
    }

};



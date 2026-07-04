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

public class MeetingMessage_canEqual_2868391193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250;
     Object term323;

    public MeetingMessage_canEqual_2868391193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term287 = new Integer(-1922583790);
        Integer term289 = new Integer(-616727354);
        term250 = newInstance(Class.forName("com.org.model.excel.MeetingMessage"));
        Object term291 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term292 = newInstance(Class.forName("java.time.LocalDate"));
        Object term296 = newInstance(Class.forName("java.time.LocalTime"));
        Object term301 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term302 = newInstance(Class.forName("java.time.LocalDate"));
        Object term306 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term250, term250.getClass(), "username", "RMFIsYGgne");
        setField(term250, term250.getClass(), "nickname", "NRdvgJlhkX");
        setField(term250, term250.getClass(), "sex", "uuaPigETmJ");
        setField(term250, term250.getClass(), "umPower", term287);
        setField(term250, term250.getClass(), "state", term289);
        setIntField(term292, term292.getClass(), "year", 2022);
        setShortField(term292, term292.getClass(), "month", (short) 2);
        setShortField(term292, term292.getClass(), "day", (short) 26);
        setField(term291, term291.getClass(), "date", term292);
        setByteField(term296, term296.getClass(), "hour", (byte) 11);
        setByteField(term296, term296.getClass(), "minute", (byte) 42);
        setByteField(term296, term296.getClass(), "second", (byte) 15);
        setIntField(term296, term296.getClass(), "nano", 377731937);
        setField(term291, term291.getClass(), "time", term296);
        setField(term250, term250.getClass(), "startTime", term291);
        setIntField(term302, term302.getClass(), "year", 2026);
        setShortField(term302, term302.getClass(), "month", (short) 12);
        setShortField(term302, term302.getClass(), "day", (short) 14);
        setField(term301, term301.getClass(), "date", term302);
        setByteField(term306, term306.getClass(), "hour", (byte) 16);
        setByteField(term306, term306.getClass(), "minute", (byte) 34);
        setByteField(term306, term306.getClass(), "second", (byte) 9);
        setIntField(term306, term306.getClass(), "nano", 518326996);
        setField(term301, term301.getClass(), "time", term306);
        setField(term250, term250.getClass(), "endTime", term301);
        setField(term250, term250.getClass(), "allTime", "MxlszYVzRf");
        term323 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.excel.MeetingMessage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term323;
        callMethod(klass, "canEqual", argTypes, term250, args);
    }

};



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

public class MeetingMessage_setEndTime_91019603920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2252;
     Object term2325;

    public MeetingMessage_setEndTime_91019603920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2289 = new Integer(1962444399);
        Integer term2291 = new Integer(767834723);
        term2252 = newInstance(Class.forName("com.org.model.excel.MeetingMessage"));
        Object term2293 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2294 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2298 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2303 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2304 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2308 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2252, term2252.getClass(), "username", "idgaQsnJpQ");
        setField(term2252, term2252.getClass(), "nickname", "VgZnGoIFwQ");
        setField(term2252, term2252.getClass(), "sex", "jUbSRrkrYZ");
        setField(term2252, term2252.getClass(), "umPower", term2289);
        setField(term2252, term2252.getClass(), "state", term2291);
        setIntField(term2294, term2294.getClass(), "year", 2018);
        setShortField(term2294, term2294.getClass(), "month", (short) 7);
        setShortField(term2294, term2294.getClass(), "day", (short) 12);
        setField(term2293, term2293.getClass(), "date", term2294);
        setByteField(term2298, term2298.getClass(), "hour", (byte) 1);
        setByteField(term2298, term2298.getClass(), "minute", (byte) 3);
        setByteField(term2298, term2298.getClass(), "second", (byte) 47);
        setIntField(term2298, term2298.getClass(), "nano", 2729929);
        setField(term2293, term2293.getClass(), "time", term2298);
        setField(term2252, term2252.getClass(), "startTime", term2293);
        setIntField(term2304, term2304.getClass(), "year", 2015);
        setShortField(term2304, term2304.getClass(), "month", (short) 12);
        setShortField(term2304, term2304.getClass(), "day", (short) 23);
        setField(term2303, term2303.getClass(), "date", term2304);
        setByteField(term2308, term2308.getClass(), "hour", (byte) 14);
        setByteField(term2308, term2308.getClass(), "minute", (byte) 17);
        setByteField(term2308, term2308.getClass(), "second", (byte) 50);
        setIntField(term2308, term2308.getClass(), "nano", 325544804);
        setField(term2303, term2303.getClass(), "time", term2308);
        setField(term2252, term2252.getClass(), "endTime", term2303);
        setField(term2252, term2252.getClass(), "allTime", "bWWfajKbEX");
        term2325 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2326 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2330 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term2326, term2326.getClass(), "year", 2027);
        setShortField(term2326, term2326.getClass(), "month", (short) 11);
        setShortField(term2326, term2326.getClass(), "day", (short) 8);
        setField(term2325, term2325.getClass(), "date", term2326);
        setByteField(term2330, term2330.getClass(), "hour", (byte) 11);
        setByteField(term2330, term2330.getClass(), "minute", (byte) 59);
        setByteField(term2330, term2330.getClass(), "second", (byte) 14);
        setIntField(term2330, term2330.getClass(), "nano", 322375591);
        setField(term2325, term2325.getClass(), "time", term2330);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.excel.MeetingMessage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term2325;
        callMethod(klass, "setEndTime", argTypes, term2252, args);
    }

};



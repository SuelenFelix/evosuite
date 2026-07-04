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

public class MeetingMessage_setSex_8682795316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1764;

    public MeetingMessage_setSex_8682795316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1801 = new Integer(-203030934);
        Integer term1803 = new Integer(-1179120542);
        term1764 = newInstance(Class.forName("com.org.model.excel.MeetingMessage"));
        Object term1805 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1806 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1810 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1815 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1816 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1820 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1764, term1764.getClass(), "username", "eqJfYWRaEL");
        setField(term1764, term1764.getClass(), "nickname", "fhkbdRViHi");
        setField(term1764, term1764.getClass(), "sex", "uWHnvSvaPl");
        setField(term1764, term1764.getClass(), "umPower", term1801);
        setField(term1764, term1764.getClass(), "state", term1803);
        setIntField(term1806, term1806.getClass(), "year", 2016);
        setShortField(term1806, term1806.getClass(), "month", (short) 6);
        setShortField(term1806, term1806.getClass(), "day", (short) 15);
        setField(term1805, term1805.getClass(), "date", term1806);
        setByteField(term1810, term1810.getClass(), "hour", (byte) 21);
        setByteField(term1810, term1810.getClass(), "minute", (byte) 23);
        setByteField(term1810, term1810.getClass(), "second", (byte) 23);
        setIntField(term1810, term1810.getClass(), "nano", 433372070);
        setField(term1805, term1805.getClass(), "time", term1810);
        setField(term1764, term1764.getClass(), "startTime", term1805);
        setIntField(term1816, term1816.getClass(), "year", 2012);
        setShortField(term1816, term1816.getClass(), "month", (short) 8);
        setShortField(term1816, term1816.getClass(), "day", (short) 25);
        setField(term1815, term1815.getClass(), "date", term1816);
        setByteField(term1820, term1820.getClass(), "hour", (byte) 19);
        setByteField(term1820, term1820.getClass(), "minute", (byte) 49);
        setByteField(term1820, term1820.getClass(), "second", (byte) 8);
        setIntField(term1820, term1820.getClass(), "nano", 912685024);
        setField(term1815, term1815.getClass(), "time", term1820);
        setField(term1764, term1764.getClass(), "endTime", term1815);
        setField(term1764, term1764.getClass(), "allTime", "kBdSllIBVz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.excel.MeetingMessage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TJmVBGfTML";
        callMethod(klass, "setSex", argTypes, term1764, args);
    }

};



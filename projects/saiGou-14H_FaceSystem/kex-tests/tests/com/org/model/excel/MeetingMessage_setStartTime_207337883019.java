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

public class MeetingMessage_setStartTime_207337883019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2129;
     Object term2202;

    public MeetingMessage_setStartTime_207337883019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2166 = new Integer(-1145578966);
        Integer term2168 = new Integer(679763016);
        term2129 = newInstance(Class.forName("com.org.model.excel.MeetingMessage"));
        Object term2170 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2171 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2175 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2180 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2181 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2185 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2129, term2129.getClass(), "username", "oVgzLbrsFr");
        setField(term2129, term2129.getClass(), "nickname", "vQVyKLdtaz");
        setField(term2129, term2129.getClass(), "sex", "OWKQODBLzb");
        setField(term2129, term2129.getClass(), "umPower", term2166);
        setField(term2129, term2129.getClass(), "state", term2168);
        setIntField(term2171, term2171.getClass(), "year", 2010);
        setShortField(term2171, term2171.getClass(), "month", (short) 1);
        setShortField(term2171, term2171.getClass(), "day", (short) 17);
        setField(term2170, term2170.getClass(), "date", term2171);
        setByteField(term2175, term2175.getClass(), "hour", (byte) 13);
        setByteField(term2175, term2175.getClass(), "minute", (byte) 5);
        setByteField(term2175, term2175.getClass(), "second", (byte) 51);
        setIntField(term2175, term2175.getClass(), "nano", 362260580);
        setField(term2170, term2170.getClass(), "time", term2175);
        setField(term2129, term2129.getClass(), "startTime", term2170);
        setIntField(term2181, term2181.getClass(), "year", 2010);
        setShortField(term2181, term2181.getClass(), "month", (short) 9);
        setShortField(term2181, term2181.getClass(), "day", (short) 28);
        setField(term2180, term2180.getClass(), "date", term2181);
        setByteField(term2185, term2185.getClass(), "hour", (byte) 6);
        setByteField(term2185, term2185.getClass(), "minute", (byte) 4);
        setByteField(term2185, term2185.getClass(), "second", (byte) 54);
        setIntField(term2185, term2185.getClass(), "nano", 604713782);
        setField(term2180, term2180.getClass(), "time", term2185);
        setField(term2129, term2129.getClass(), "endTime", term2180);
        setField(term2129, term2129.getClass(), "allTime", "wGmYcqUkgE");
        term2202 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2203 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2207 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term2203, term2203.getClass(), "year", 2023);
        setShortField(term2203, term2203.getClass(), "month", (short) 7);
        setShortField(term2203, term2203.getClass(), "day", (short) 16);
        setField(term2202, term2202.getClass(), "date", term2203);
        setByteField(term2207, term2207.getClass(), "hour", (byte) 3);
        setByteField(term2207, term2207.getClass(), "minute", (byte) 1);
        setByteField(term2207, term2207.getClass(), "second", (byte) 19);
        setIntField(term2207, term2207.getClass(), "nano", 488629554);
        setField(term2202, term2202.getClass(), "time", term2207);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.excel.MeetingMessage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term2202;
        callMethod(klass, "setStartTime", argTypes, term2129, args);
    }

};



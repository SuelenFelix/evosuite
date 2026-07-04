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

public class UserMeeting_getDeleted_176687494910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40390;

    public UserMeeting_getDeleted_176687494910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term40391 = new Integer(-942615253);
        Integer term40393 = new Integer(1642227506);
        Integer term40405 = new Integer(-1930855861);
        Integer term40407 = new Integer(-59278290);
        Integer term40429 = new Integer(862799975);
        Integer term40441 = new Integer(785517219);
        term40390 = newInstance(Class.forName("com.org.model.UserMeeting"));
        Object term40395 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40396 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40400 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40409 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40410 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40414 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40419 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40420 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40424 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40431 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40432 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40436 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term40390, term40390.getClass(), "id", term40391);
        setField(term40390, term40390.getClass(), "umPower", term40393);
        setIntField(term40396, term40396.getClass(), "year", 2029);
        setShortField(term40396, term40396.getClass(), "month", (short) 9);
        setShortField(term40396, term40396.getClass(), "day", (short) 22);
        setField(term40395, term40395.getClass(), "date", term40396);
        setByteField(term40400, term40400.getClass(), "hour", (byte) 9);
        setByteField(term40400, term40400.getClass(), "minute", (byte) 11);
        setByteField(term40400, term40400.getClass(), "second", (byte) 48);
        setIntField(term40400, term40400.getClass(), "nano", 904292704);
        setField(term40395, term40395.getClass(), "time", term40400);
        setField(term40390, term40390.getClass(), "createTime", term40395);
        setField(term40390, term40390.getClass(), "userId", term40405);
        setField(term40390, term40390.getClass(), "meetingId", term40407);
        setIntField(term40410, term40410.getClass(), "year", 2029);
        setShortField(term40410, term40410.getClass(), "month", (short) 8);
        setShortField(term40410, term40410.getClass(), "day", (short) 27);
        setField(term40409, term40409.getClass(), "date", term40410);
        setByteField(term40414, term40414.getClass(), "hour", (byte) 10);
        setByteField(term40414, term40414.getClass(), "minute", (byte) 54);
        setByteField(term40414, term40414.getClass(), "second", (byte) 17);
        setIntField(term40414, term40414.getClass(), "nano", 953558700);
        setField(term40409, term40409.getClass(), "time", term40414);
        setField(term40390, term40390.getClass(), "updateTime", term40409);
        setIntField(term40420, term40420.getClass(), "year", 2012);
        setShortField(term40420, term40420.getClass(), "month", (short) 1);
        setShortField(term40420, term40420.getClass(), "day", (short) 12);
        setField(term40419, term40419.getClass(), "date", term40420);
        setByteField(term40424, term40424.getClass(), "hour", (byte) 16);
        setByteField(term40424, term40424.getClass(), "minute", (byte) 4);
        setByteField(term40424, term40424.getClass(), "second", (byte) 10);
        setIntField(term40424, term40424.getClass(), "nano", 245911854);
        setField(term40419, term40419.getClass(), "time", term40424);
        setField(term40390, term40390.getClass(), "startTime", term40419);
        setField(term40390, term40390.getClass(), "state", term40429);
        setIntField(term40432, term40432.getClass(), "year", 2020);
        setShortField(term40432, term40432.getClass(), "month", (short) 5);
        setShortField(term40432, term40432.getClass(), "day", (short) 18);
        setField(term40431, term40431.getClass(), "date", term40432);
        setByteField(term40436, term40436.getClass(), "hour", (byte) 0);
        setByteField(term40436, term40436.getClass(), "minute", (byte) 6);
        setByteField(term40436, term40436.getClass(), "second", (byte) 7);
        setIntField(term40436, term40436.getClass(), "nano", 597786302);
        setField(term40431, term40431.getClass(), "time", term40436);
        setField(term40390, term40390.getClass(), "endTime", term40431);
        setField(term40390, term40390.getClass(), "deleted", term40441);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.UserMeeting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeleted", argTypes, term40390, args);
    }

};



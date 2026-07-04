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

public class UserMeeting_setCreateTime_208288051413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40553;
     Object term40606;

    public UserMeeting_setCreateTime_208288051413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term40554 = new Integer(159521199);
        Integer term40556 = new Integer(2020510924);
        Integer term40568 = new Integer(-644848160);
        Integer term40570 = new Integer(-413768483);
        Integer term40592 = new Integer(565614678);
        Integer term40604 = new Integer(-1248504675);
        term40553 = newInstance(Class.forName("com.org.model.UserMeeting"));
        Object term40558 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40559 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40563 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40572 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40573 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40577 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40582 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40583 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40587 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40594 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40595 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40599 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term40553, term40553.getClass(), "id", term40554);
        setField(term40553, term40553.getClass(), "umPower", term40556);
        setIntField(term40559, term40559.getClass(), "year", 2029);
        setShortField(term40559, term40559.getClass(), "month", (short) 8);
        setShortField(term40559, term40559.getClass(), "day", (short) 12);
        setField(term40558, term40558.getClass(), "date", term40559);
        setByteField(term40563, term40563.getClass(), "hour", (byte) 20);
        setByteField(term40563, term40563.getClass(), "minute", (byte) 27);
        setByteField(term40563, term40563.getClass(), "second", (byte) 47);
        setIntField(term40563, term40563.getClass(), "nano", 668392287);
        setField(term40558, term40558.getClass(), "time", term40563);
        setField(term40553, term40553.getClass(), "createTime", term40558);
        setField(term40553, term40553.getClass(), "userId", term40568);
        setField(term40553, term40553.getClass(), "meetingId", term40570);
        setIntField(term40573, term40573.getClass(), "year", 2019);
        setShortField(term40573, term40573.getClass(), "month", (short) 5);
        setShortField(term40573, term40573.getClass(), "day", (short) 2);
        setField(term40572, term40572.getClass(), "date", term40573);
        setByteField(term40577, term40577.getClass(), "hour", (byte) 7);
        setByteField(term40577, term40577.getClass(), "minute", (byte) 38);
        setByteField(term40577, term40577.getClass(), "second", (byte) 2);
        setIntField(term40577, term40577.getClass(), "nano", 148685302);
        setField(term40572, term40572.getClass(), "time", term40577);
        setField(term40553, term40553.getClass(), "updateTime", term40572);
        setIntField(term40583, term40583.getClass(), "year", 2019);
        setShortField(term40583, term40583.getClass(), "month", (short) 4);
        setShortField(term40583, term40583.getClass(), "day", (short) 21);
        setField(term40582, term40582.getClass(), "date", term40583);
        setByteField(term40587, term40587.getClass(), "hour", (byte) 5);
        setByteField(term40587, term40587.getClass(), "minute", (byte) 35);
        setByteField(term40587, term40587.getClass(), "second", (byte) 51);
        setIntField(term40587, term40587.getClass(), "nano", 345346848);
        setField(term40582, term40582.getClass(), "time", term40587);
        setField(term40553, term40553.getClass(), "startTime", term40582);
        setField(term40553, term40553.getClass(), "state", term40592);
        setIntField(term40595, term40595.getClass(), "year", 2014);
        setShortField(term40595, term40595.getClass(), "month", (short) 4);
        setShortField(term40595, term40595.getClass(), "day", (short) 29);
        setField(term40594, term40594.getClass(), "date", term40595);
        setByteField(term40599, term40599.getClass(), "hour", (byte) 11);
        setByteField(term40599, term40599.getClass(), "minute", (byte) 34);
        setByteField(term40599, term40599.getClass(), "second", (byte) 37);
        setIntField(term40599, term40599.getClass(), "nano", 983028354);
        setField(term40594, term40594.getClass(), "time", term40599);
        setField(term40553, term40553.getClass(), "endTime", term40594);
        setField(term40553, term40553.getClass(), "deleted", term40604);
        term40606 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40607 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40611 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term40607, term40607.getClass(), "year", 2029);
        setShortField(term40607, term40607.getClass(), "month", (short) 7);
        setShortField(term40607, term40607.getClass(), "day", (short) 3);
        setField(term40606, term40606.getClass(), "date", term40607);
        setByteField(term40611, term40611.getClass(), "hour", (byte) 18);
        setByteField(term40611, term40611.getClass(), "minute", (byte) 33);
        setByteField(term40611, term40611.getClass(), "second", (byte) 32);
        setIntField(term40611, term40611.getClass(), "nano", 464450762);
        setField(term40606, term40606.getClass(), "time", term40611);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.UserMeeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term40606;
        callMethod(klass, "setCreateTime", argTypes, term40553, args);
    }

};



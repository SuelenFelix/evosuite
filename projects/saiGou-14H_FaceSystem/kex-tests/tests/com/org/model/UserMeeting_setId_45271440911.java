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

public class UserMeeting_setId_45271440911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40443;
     Object term40496;

    public UserMeeting_setId_45271440911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term40444 = new Integer(-96163747);
        Integer term40446 = new Integer(1191473962);
        Integer term40458 = new Integer(110101710);
        Integer term40460 = new Integer(1819101781);
        Integer term40482 = new Integer(-1430157795);
        Integer term40494 = new Integer(-1943692500);
        term40443 = newInstance(Class.forName("com.org.model.UserMeeting"));
        Object term40448 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40449 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40453 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40462 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40463 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40467 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40472 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40473 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40477 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40484 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40485 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40489 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term40443, term40443.getClass(), "id", term40444);
        setField(term40443, term40443.getClass(), "umPower", term40446);
        setIntField(term40449, term40449.getClass(), "year", 2022);
        setShortField(term40449, term40449.getClass(), "month", (short) 10);
        setShortField(term40449, term40449.getClass(), "day", (short) 9);
        setField(term40448, term40448.getClass(), "date", term40449);
        setByteField(term40453, term40453.getClass(), "hour", (byte) 13);
        setByteField(term40453, term40453.getClass(), "minute", (byte) 29);
        setByteField(term40453, term40453.getClass(), "second", (byte) 0);
        setIntField(term40453, term40453.getClass(), "nano", 479809645);
        setField(term40448, term40448.getClass(), "time", term40453);
        setField(term40443, term40443.getClass(), "createTime", term40448);
        setField(term40443, term40443.getClass(), "userId", term40458);
        setField(term40443, term40443.getClass(), "meetingId", term40460);
        setIntField(term40463, term40463.getClass(), "year", 2027);
        setShortField(term40463, term40463.getClass(), "month", (short) 5);
        setShortField(term40463, term40463.getClass(), "day", (short) 9);
        setField(term40462, term40462.getClass(), "date", term40463);
        setByteField(term40467, term40467.getClass(), "hour", (byte) 18);
        setByteField(term40467, term40467.getClass(), "minute", (byte) 17);
        setByteField(term40467, term40467.getClass(), "second", (byte) 45);
        setIntField(term40467, term40467.getClass(), "nano", 184100659);
        setField(term40462, term40462.getClass(), "time", term40467);
        setField(term40443, term40443.getClass(), "updateTime", term40462);
        setIntField(term40473, term40473.getClass(), "year", 2029);
        setShortField(term40473, term40473.getClass(), "month", (short) 7);
        setShortField(term40473, term40473.getClass(), "day", (short) 19);
        setField(term40472, term40472.getClass(), "date", term40473);
        setByteField(term40477, term40477.getClass(), "hour", (byte) 21);
        setByteField(term40477, term40477.getClass(), "minute", (byte) 46);
        setByteField(term40477, term40477.getClass(), "second", (byte) 27);
        setIntField(term40477, term40477.getClass(), "nano", 413909191);
        setField(term40472, term40472.getClass(), "time", term40477);
        setField(term40443, term40443.getClass(), "startTime", term40472);
        setField(term40443, term40443.getClass(), "state", term40482);
        setIntField(term40485, term40485.getClass(), "year", 2024);
        setShortField(term40485, term40485.getClass(), "month", (short) 7);
        setShortField(term40485, term40485.getClass(), "day", (short) 15);
        setField(term40484, term40484.getClass(), "date", term40485);
        setByteField(term40489, term40489.getClass(), "hour", (byte) 14);
        setByteField(term40489, term40489.getClass(), "minute", (byte) 18);
        setByteField(term40489, term40489.getClass(), "second", (byte) 58);
        setIntField(term40489, term40489.getClass(), "nano", 537827095);
        setField(term40484, term40484.getClass(), "time", term40489);
        setField(term40443, term40443.getClass(), "endTime", term40484);
        setField(term40443, term40443.getClass(), "deleted", term40494);
        term40496 = new Integer(-108045978);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.UserMeeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term40496;
        callMethod(klass, "setId", argTypes, term40443, args);
    }

};



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

public class UserMeeting_getState_20361220358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40284;

    public UserMeeting_getState_20361220358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term40285 = new Integer(-1620783951);
        Integer term40287 = new Integer(1400387811);
        Integer term40299 = new Integer(903826116);
        Integer term40301 = new Integer(641366348);
        Integer term40323 = new Integer(-353276989);
        Integer term40335 = new Integer(-505563323);
        term40284 = newInstance(Class.forName("com.org.model.UserMeeting"));
        Object term40289 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40290 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40294 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40303 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40304 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40308 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40313 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40314 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40318 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40325 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40326 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40330 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term40284, term40284.getClass(), "id", term40285);
        setField(term40284, term40284.getClass(), "umPower", term40287);
        setIntField(term40290, term40290.getClass(), "year", 2024);
        setShortField(term40290, term40290.getClass(), "month", (short) 7);
        setShortField(term40290, term40290.getClass(), "day", (short) 11);
        setField(term40289, term40289.getClass(), "date", term40290);
        setByteField(term40294, term40294.getClass(), "hour", (byte) 0);
        setByteField(term40294, term40294.getClass(), "minute", (byte) 35);
        setByteField(term40294, term40294.getClass(), "second", (byte) 43);
        setIntField(term40294, term40294.getClass(), "nano", 994892189);
        setField(term40289, term40289.getClass(), "time", term40294);
        setField(term40284, term40284.getClass(), "createTime", term40289);
        setField(term40284, term40284.getClass(), "userId", term40299);
        setField(term40284, term40284.getClass(), "meetingId", term40301);
        setIntField(term40304, term40304.getClass(), "year", 2027);
        setShortField(term40304, term40304.getClass(), "month", (short) 8);
        setShortField(term40304, term40304.getClass(), "day", (short) 28);
        setField(term40303, term40303.getClass(), "date", term40304);
        setByteField(term40308, term40308.getClass(), "hour", (byte) 18);
        setByteField(term40308, term40308.getClass(), "minute", (byte) 28);
        setByteField(term40308, term40308.getClass(), "second", (byte) 45);
        setIntField(term40308, term40308.getClass(), "nano", 351559461);
        setField(term40303, term40303.getClass(), "time", term40308);
        setField(term40284, term40284.getClass(), "updateTime", term40303);
        setIntField(term40314, term40314.getClass(), "year", 2016);
        setShortField(term40314, term40314.getClass(), "month", (short) 9);
        setShortField(term40314, term40314.getClass(), "day", (short) 28);
        setField(term40313, term40313.getClass(), "date", term40314);
        setByteField(term40318, term40318.getClass(), "hour", (byte) 13);
        setByteField(term40318, term40318.getClass(), "minute", (byte) 19);
        setByteField(term40318, term40318.getClass(), "second", (byte) 21);
        setIntField(term40318, term40318.getClass(), "nano", 258693118);
        setField(term40313, term40313.getClass(), "time", term40318);
        setField(term40284, term40284.getClass(), "startTime", term40313);
        setField(term40284, term40284.getClass(), "state", term40323);
        setIntField(term40326, term40326.getClass(), "year", 2024);
        setShortField(term40326, term40326.getClass(), "month", (short) 5);
        setShortField(term40326, term40326.getClass(), "day", (short) 7);
        setField(term40325, term40325.getClass(), "date", term40326);
        setByteField(term40330, term40330.getClass(), "hour", (byte) 11);
        setByteField(term40330, term40330.getClass(), "minute", (byte) 43);
        setByteField(term40330, term40330.getClass(), "second", (byte) 25);
        setIntField(term40330, term40330.getClass(), "nano", 863939499);
        setField(term40325, term40325.getClass(), "time", term40330);
        setField(term40284, term40284.getClass(), "endTime", term40325);
        setField(term40284, term40284.getClass(), "deleted", term40335);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.UserMeeting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getState", argTypes, term40284, args);
    }

};



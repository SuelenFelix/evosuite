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

public class UserMeeting_getUpdateTime_16793267956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40178;

    public UserMeeting_getUpdateTime_16793267956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term40179 = new Integer(1886882056);
        Integer term40181 = new Integer(-689559993);
        Integer term40193 = new Integer(263696243);
        Integer term40195 = new Integer(-2012537672);
        Integer term40217 = new Integer(-879433115);
        Integer term40229 = new Integer(275958841);
        term40178 = newInstance(Class.forName("com.org.model.UserMeeting"));
        Object term40183 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40184 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40188 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40197 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40198 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40202 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40207 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40208 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40212 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40219 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40220 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40224 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term40178, term40178.getClass(), "id", term40179);
        setField(term40178, term40178.getClass(), "umPower", term40181);
        setIntField(term40184, term40184.getClass(), "year", 2025);
        setShortField(term40184, term40184.getClass(), "month", (short) 3);
        setShortField(term40184, term40184.getClass(), "day", (short) 6);
        setField(term40183, term40183.getClass(), "date", term40184);
        setByteField(term40188, term40188.getClass(), "hour", (byte) 12);
        setByteField(term40188, term40188.getClass(), "minute", (byte) 2);
        setByteField(term40188, term40188.getClass(), "second", (byte) 23);
        setIntField(term40188, term40188.getClass(), "nano", 463787680);
        setField(term40183, term40183.getClass(), "time", term40188);
        setField(term40178, term40178.getClass(), "createTime", term40183);
        setField(term40178, term40178.getClass(), "userId", term40193);
        setField(term40178, term40178.getClass(), "meetingId", term40195);
        setIntField(term40198, term40198.getClass(), "year", 2014);
        setShortField(term40198, term40198.getClass(), "month", (short) 6);
        setShortField(term40198, term40198.getClass(), "day", (short) 26);
        setField(term40197, term40197.getClass(), "date", term40198);
        setByteField(term40202, term40202.getClass(), "hour", (byte) 23);
        setByteField(term40202, term40202.getClass(), "minute", (byte) 29);
        setByteField(term40202, term40202.getClass(), "second", (byte) 42);
        setIntField(term40202, term40202.getClass(), "nano", 792765324);
        setField(term40197, term40197.getClass(), "time", term40202);
        setField(term40178, term40178.getClass(), "updateTime", term40197);
        setIntField(term40208, term40208.getClass(), "year", 2019);
        setShortField(term40208, term40208.getClass(), "month", (short) 3);
        setShortField(term40208, term40208.getClass(), "day", (short) 23);
        setField(term40207, term40207.getClass(), "date", term40208);
        setByteField(term40212, term40212.getClass(), "hour", (byte) 1);
        setByteField(term40212, term40212.getClass(), "minute", (byte) 15);
        setByteField(term40212, term40212.getClass(), "second", (byte) 57);
        setIntField(term40212, term40212.getClass(), "nano", 53985671);
        setField(term40207, term40207.getClass(), "time", term40212);
        setField(term40178, term40178.getClass(), "startTime", term40207);
        setField(term40178, term40178.getClass(), "state", term40217);
        setIntField(term40220, term40220.getClass(), "year", 2011);
        setShortField(term40220, term40220.getClass(), "month", (short) 6);
        setShortField(term40220, term40220.getClass(), "day", (short) 27);
        setField(term40219, term40219.getClass(), "date", term40220);
        setByteField(term40224, term40224.getClass(), "hour", (byte) 12);
        setByteField(term40224, term40224.getClass(), "minute", (byte) 48);
        setByteField(term40224, term40224.getClass(), "second", (byte) 45);
        setIntField(term40224, term40224.getClass(), "nano", 332145929);
        setField(term40219, term40219.getClass(), "time", term40224);
        setField(term40178, term40178.getClass(), "endTime", term40219);
        setField(term40178, term40178.getClass(), "deleted", term40229);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.UserMeeting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdateTime", argTypes, term40178, args);
    }

};



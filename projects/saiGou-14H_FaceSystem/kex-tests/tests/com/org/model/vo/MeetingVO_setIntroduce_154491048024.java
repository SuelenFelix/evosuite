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

public class MeetingVO_setIntroduce_154491048024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11346;

    public MeetingVO_setIntroduce_154491048024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term11347 = new Integer(-1133405894);
        Integer term11385 = new Integer(1289741214);
        Integer term11445 = new Integer(243280944);
        Integer term11457 = new Integer(-726681073);
        Integer term11459 = new Integer(-1724487863);
        term11346 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term11387 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11388 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11392 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11447 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11448 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11452 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11346, term11346.getClass(), "id", term11347);
        setField(term11346, term11346.getClass(), "name", "KIBOVYItqe");
        setField(term11346, term11346.getClass(), "host", "GUztJeVeCc");
        setField(term11346, term11346.getClass(), "roomName", "YNXFGgstqj");
        setField(term11346, term11346.getClass(), "online", term11385);
        setIntField(term11388, term11388.getClass(), "year", 2016);
        setShortField(term11388, term11388.getClass(), "month", (short) 10);
        setShortField(term11388, term11388.getClass(), "day", (short) 20);
        setField(term11387, term11387.getClass(), "date", term11388);
        setByteField(term11392, term11392.getClass(), "hour", (byte) 18);
        setByteField(term11392, term11392.getClass(), "minute", (byte) 39);
        setByteField(term11392, term11392.getClass(), "second", (byte) 1);
        setIntField(term11392, term11392.getClass(), "nano", 196253988);
        setField(term11387, term11387.getClass(), "time", term11392);
        setField(term11346, term11346.getClass(), "createTime", term11387);
        setField(term11346, term11346.getClass(), "link", "xZTWqxWsAc");
        setField(term11346, term11346.getClass(), "meetingTime", "sWchglYniO");
        setField(term11346, term11346.getClass(), "signTime", "lohegbXyjA");
        setField(term11346, term11346.getClass(), "introduce", "HlddItIexw");
        setField(term11346, term11346.getClass(), "state", term11445);
        setIntField(term11448, term11448.getClass(), "year", 2019);
        setShortField(term11448, term11448.getClass(), "month", (short) 1);
        setShortField(term11448, term11448.getClass(), "day", (short) 6);
        setField(term11447, term11447.getClass(), "date", term11448);
        setByteField(term11452, term11452.getClass(), "hour", (byte) 18);
        setByteField(term11452, term11452.getClass(), "minute", (byte) 8);
        setByteField(term11452, term11452.getClass(), "second", (byte) 46);
        setIntField(term11452, term11452.getClass(), "nano", 934136445);
        setField(term11447, term11447.getClass(), "time", term11452);
        setField(term11346, term11346.getClass(), "updateTime", term11447);
        setField(term11346, term11346.getClass(), "userNumber", term11457);
        setField(term11346, term11346.getClass(), "signNumber", term11459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HnpLvemmRI";
        callMethod(klass, "setIntroduce", argTypes, term11346, args);
    }

};



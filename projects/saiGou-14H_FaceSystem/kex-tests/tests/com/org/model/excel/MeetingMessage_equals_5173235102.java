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

public class MeetingMessage_equals_5173235102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136;
     Object term209;

    public MeetingMessage_equals_5173235102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term173 = new Integer(1484323161);
        Integer term175 = new Integer(391863371);
        term136 = newInstance(Class.forName("com.org.model.excel.MeetingMessage"));
        Object term177 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term178 = newInstance(Class.forName("java.time.LocalDate"));
        Object term182 = newInstance(Class.forName("java.time.LocalTime"));
        Object term187 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term188 = newInstance(Class.forName("java.time.LocalDate"));
        Object term192 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term136, term136.getClass(), "username", "EGtDIRbSSb");
        setField(term136, term136.getClass(), "nickname", "SzjVpOQTyS");
        setField(term136, term136.getClass(), "sex", "MjGYSRKTNF");
        setField(term136, term136.getClass(), "umPower", term173);
        setField(term136, term136.getClass(), "state", term175);
        setIntField(term178, term178.getClass(), "year", 2015);
        setShortField(term178, term178.getClass(), "month", (short) 9);
        setShortField(term178, term178.getClass(), "day", (short) 19);
        setField(term177, term177.getClass(), "date", term178);
        setByteField(term182, term182.getClass(), "hour", (byte) 9);
        setByteField(term182, term182.getClass(), "minute", (byte) 4);
        setByteField(term182, term182.getClass(), "second", (byte) 10);
        setIntField(term182, term182.getClass(), "nano", 401765865);
        setField(term177, term177.getClass(), "time", term182);
        setField(term136, term136.getClass(), "startTime", term177);
        setIntField(term188, term188.getClass(), "year", 2015);
        setShortField(term188, term188.getClass(), "month", (short) 4);
        setShortField(term188, term188.getClass(), "day", (short) 14);
        setField(term187, term187.getClass(), "date", term188);
        setByteField(term192, term192.getClass(), "hour", (byte) 18);
        setByteField(term192, term192.getClass(), "minute", (byte) 24);
        setByteField(term192, term192.getClass(), "second", (byte) 32);
        setIntField(term192, term192.getClass(), "nano", 369233818);
        setField(term187, term187.getClass(), "time", term192);
        setField(term136, term136.getClass(), "endTime", term187);
        setField(term136, term136.getClass(), "allTime", "hRNSzYYIrc");
        term209 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.excel.MeetingMessage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term209;
        callMethod(klass, "equals", argTypes, term136, args);
    }

};



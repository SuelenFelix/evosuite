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

public class Meeting2VO_setId_2209442896 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4290;
     Object term4329;

    public Meeting2VO_setId_2209442896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4291 = new Integer(1725571209);
        Integer term4315 = new Integer(-522618178);
        term4290 = newInstance(Class.forName("com.org.model.vo.Meeting2VO"));
        Object term4305 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4306 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4310 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4290, term4290.getClass(), "id", term4291);
        setField(term4290, term4290.getClass(), "username", "HxCEzaCcgj");
        setIntField(term4306, term4306.getClass(), "year", 2026);
        setShortField(term4306, term4306.getClass(), "month", (short) 12);
        setShortField(term4306, term4306.getClass(), "day", (short) 14);
        setField(term4305, term4305.getClass(), "date", term4306);
        setByteField(term4310, term4310.getClass(), "hour", (byte) 16);
        setByteField(term4310, term4310.getClass(), "minute", (byte) 34);
        setByteField(term4310, term4310.getClass(), "second", (byte) 9);
        setIntField(term4310, term4310.getClass(), "nano", 518326996);
        setField(term4305, term4305.getClass(), "time", term4310);
        setField(term4290, term4290.getClass(), "startTime", term4305);
        setField(term4290, term4290.getClass(), "state", term4315);
        setField(term4290, term4290.getClass(), "faceUrl", "PDYPOQncAB");
        term4329 = new Integer(1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.Meeting2VO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term4329;
        callMethod(klass, "setId", argTypes, term4290, args);
    }

};



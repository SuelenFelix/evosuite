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

public class Meeting2VO_getStartTime_8397048943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4113;

    public Meeting2VO_getStartTime_8397048943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4114 = new Integer(-1922583790);
        Integer term4138 = new Integer(-616727354);
        term4113 = newInstance(Class.forName("com.org.model.vo.Meeting2VO"));
        Object term4128 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4129 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4133 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4113, term4113.getClass(), "id", term4114);
        setField(term4113, term4113.getClass(), "username", "QbfKDAwhSB");
        setIntField(term4129, term4129.getClass(), "year", 2015);
        setShortField(term4129, term4129.getClass(), "month", (short) 9);
        setShortField(term4129, term4129.getClass(), "day", (short) 19);
        setField(term4128, term4128.getClass(), "date", term4129);
        setByteField(term4133, term4133.getClass(), "hour", (byte) 9);
        setByteField(term4133, term4133.getClass(), "minute", (byte) 4);
        setByteField(term4133, term4133.getClass(), "second", (byte) 10);
        setIntField(term4133, term4133.getClass(), "nano", 401765865);
        setField(term4128, term4128.getClass(), "time", term4133);
        setField(term4113, term4113.getClass(), "startTime", term4128);
        setField(term4113, term4113.getClass(), "state", term4138);
        setField(term4113, term4113.getClass(), "faceUrl", "ckTRHEIcCK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.Meeting2VO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartTime", argTypes, term4113, args);
    }

};



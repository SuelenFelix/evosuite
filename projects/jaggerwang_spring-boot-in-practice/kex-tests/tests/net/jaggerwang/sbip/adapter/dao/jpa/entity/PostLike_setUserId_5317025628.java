package net.jaggerwang.sbip.adapter.dao.jpa.entity;

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
import static net.jaggerwang.sbip.adapter.dao.jpa.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class PostLike_setUserId_5317025628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31333;
     Object term31360;

    public PostLike_setUserId_5317025628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31334 = new Long(2014229530618878786L);
        Long term31336 = new Long(-3684549603148553700L);
        Long term31338 = new Long(4665980239039735158L);
        term31333 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike"));
        Object term31340 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31341 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31345 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31350 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31351 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31355 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31333, term31333.getClass(), "id", term31334);
        setField(term31333, term31333.getClass(), "userId", term31336);
        setField(term31333, term31333.getClass(), "postId", term31338);
        setIntField(term31341, term31341.getClass(), "year", 2023);
        setShortField(term31341, term31341.getClass(), "month", (short) 1);
        setShortField(term31341, term31341.getClass(), "day", (short) 10);
        setField(term31340, term31340.getClass(), "date", term31341);
        setByteField(term31345, term31345.getClass(), "hour", (byte) 2);
        setByteField(term31345, term31345.getClass(), "minute", (byte) 12);
        setByteField(term31345, term31345.getClass(), "second", (byte) 45);
        setIntField(term31345, term31345.getClass(), "nano", 793047168);
        setField(term31340, term31340.getClass(), "time", term31345);
        setField(term31333, term31333.getClass(), "createdAt", term31340);
        setIntField(term31351, term31351.getClass(), "year", 2028);
        setShortField(term31351, term31351.getClass(), "month", (short) 6);
        setShortField(term31351, term31351.getClass(), "day", (short) 12);
        setField(term31350, term31350.getClass(), "date", term31351);
        setByteField(term31355, term31355.getClass(), "hour", (byte) 9);
        setByteField(term31355, term31355.getClass(), "minute", (byte) 39);
        setByteField(term31355, term31355.getClass(), "second", (byte) 7);
        setIntField(term31355, term31355.getClass(), "nano", 950068890);
        setField(term31350, term31350.getClass(), "time", term31355);
        setField(term31333, term31333.getClass(), "updatedAt", term31350);
        term31360 = new Long(7429946509853918683L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term31360;
        callMethod(klass, "setUserId", argTypes, term31333, args);
    }

};



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

public class PostLike_getUpdatedAt_5880278336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31277;

    public PostLike_getUpdatedAt_5880278336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31278 = new Long(2155219577693802424L);
        Long term31280 = new Long(-4033544645261759750L);
        Long term31282 = new Long(593230449611047187L);
        term31277 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike"));
        Object term31284 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31285 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31289 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31294 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31295 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31299 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31277, term31277.getClass(), "id", term31278);
        setField(term31277, term31277.getClass(), "userId", term31280);
        setField(term31277, term31277.getClass(), "postId", term31282);
        setIntField(term31285, term31285.getClass(), "year", 2021);
        setShortField(term31285, term31285.getClass(), "month", (short) 5);
        setShortField(term31285, term31285.getClass(), "day", (short) 7);
        setField(term31284, term31284.getClass(), "date", term31285);
        setByteField(term31289, term31289.getClass(), "hour", (byte) 16);
        setByteField(term31289, term31289.getClass(), "minute", (byte) 55);
        setByteField(term31289, term31289.getClass(), "second", (byte) 11);
        setIntField(term31289, term31289.getClass(), "nano", 243196047);
        setField(term31284, term31284.getClass(), "time", term31289);
        setField(term31277, term31277.getClass(), "createdAt", term31284);
        setIntField(term31295, term31295.getClass(), "year", 2023);
        setShortField(term31295, term31295.getClass(), "month", (short) 8);
        setShortField(term31295, term31295.getClass(), "day", (short) 23);
        setField(term31294, term31294.getClass(), "date", term31295);
        setByteField(term31299, term31299.getClass(), "hour", (byte) 12);
        setByteField(term31299, term31299.getClass(), "minute", (byte) 18);
        setByteField(term31299, term31299.getClass(), "second", (byte) 57);
        setIntField(term31299, term31299.getClass(), "nano", 764903264);
        setField(term31294, term31294.getClass(), "time", term31299);
        setField(term31277, term31277.getClass(), "updatedAt", term31294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdatedAt", argTypes, term31277, args);
    }

};



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

public class PostLike_setPostId_4917880839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31362;
     Object term31389;

    public PostLike_setPostId_4917880839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31363 = new Long(-7148236042086608592L);
        Long term31365 = new Long(7716258711075652753L);
        Long term31367 = new Long(-3988042285731673145L);
        term31362 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike"));
        Object term31369 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31370 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31374 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31379 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31380 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31384 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31362, term31362.getClass(), "id", term31363);
        setField(term31362, term31362.getClass(), "userId", term31365);
        setField(term31362, term31362.getClass(), "postId", term31367);
        setIntField(term31370, term31370.getClass(), "year", 2018);
        setShortField(term31370, term31370.getClass(), "month", (short) 4);
        setShortField(term31370, term31370.getClass(), "day", (short) 7);
        setField(term31369, term31369.getClass(), "date", term31370);
        setByteField(term31374, term31374.getClass(), "hour", (byte) 22);
        setByteField(term31374, term31374.getClass(), "minute", (byte) 6);
        setByteField(term31374, term31374.getClass(), "second", (byte) 38);
        setIntField(term31374, term31374.getClass(), "nano", 958732191);
        setField(term31369, term31369.getClass(), "time", term31374);
        setField(term31362, term31362.getClass(), "createdAt", term31369);
        setIntField(term31380, term31380.getClass(), "year", 2017);
        setShortField(term31380, term31380.getClass(), "month", (short) 7);
        setShortField(term31380, term31380.getClass(), "day", (short) 25);
        setField(term31379, term31379.getClass(), "date", term31380);
        setByteField(term31384, term31384.getClass(), "hour", (byte) 20);
        setByteField(term31384, term31384.getClass(), "minute", (byte) 19);
        setByteField(term31384, term31384.getClass(), "second", (byte) 55);
        setIntField(term31384, term31384.getClass(), "nano", 617531786);
        setField(term31379, term31379.getClass(), "time", term31384);
        setField(term31362, term31362.getClass(), "updatedAt", term31379);
        term31389 = new Long(1729206737148270563L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term31389;
        callMethod(klass, "setPostId", argTypes, term31362, args);
    }

};



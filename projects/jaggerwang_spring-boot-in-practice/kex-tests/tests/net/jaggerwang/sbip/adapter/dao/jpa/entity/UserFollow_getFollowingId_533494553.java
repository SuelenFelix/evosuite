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

public class UserFollow_getFollowingId_533494553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11590;

    public UserFollow_getFollowingId_533494553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11591 = new Long(7800835025296877231L);
        Long term11593 = new Long(-187772971269812453L);
        Long term11595 = new Long(468487103823886117L);
        term11590 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow"));
        Object term11597 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11598 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11602 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11607 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11608 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11612 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11590, term11590.getClass(), "id", term11591);
        setField(term11590, term11590.getClass(), "followingId", term11593);
        setField(term11590, term11590.getClass(), "followerId", term11595);
        setIntField(term11598, term11598.getClass(), "year", 2023);
        setShortField(term11598, term11598.getClass(), "month", (short) 11);
        setShortField(term11598, term11598.getClass(), "day", (short) 14);
        setField(term11597, term11597.getClass(), "date", term11598);
        setByteField(term11602, term11602.getClass(), "hour", (byte) 15);
        setByteField(term11602, term11602.getClass(), "minute", (byte) 2);
        setByteField(term11602, term11602.getClass(), "second", (byte) 47);
        setIntField(term11602, term11602.getClass(), "nano", 703984770);
        setField(term11597, term11597.getClass(), "time", term11602);
        setField(term11590, term11590.getClass(), "createdAt", term11597);
        setIntField(term11608, term11608.getClass(), "year", 2024);
        setShortField(term11608, term11608.getClass(), "month", (short) 4);
        setShortField(term11608, term11608.getClass(), "day", (short) 26);
        setField(term11607, term11607.getClass(), "date", term11608);
        setByteField(term11612, term11612.getClass(), "hour", (byte) 15);
        setByteField(term11612, term11612.getClass(), "minute", (byte) 12);
        setByteField(term11612, term11612.getClass(), "second", (byte) 31);
        setIntField(term11612, term11612.getClass(), "nano", 839979637);
        setField(term11607, term11607.getClass(), "time", term11612);
        setField(term11590, term11590.getClass(), "updatedAt", term11607);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFollowingId", argTypes, term11590, args);
    }

};



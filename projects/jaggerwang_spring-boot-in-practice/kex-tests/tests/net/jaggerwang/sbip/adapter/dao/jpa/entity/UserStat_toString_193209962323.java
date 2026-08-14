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

public class UserStat_toString_193209962323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32599;

    public UserStat_toString_193209962323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32600 = new Long(1978286377020745883L);
        Long term32602 = new Long(2957284484642534979L);
        Long term32604 = new Long(-4645802432501468482L);
        Long term32606 = new Long(797348855178248421L);
        Long term32608 = new Long(4140938707845767186L);
        Long term32610 = new Long(-6049958218605558734L);
        term32599 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat"));
        Object term32612 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32613 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32617 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32622 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32623 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32627 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term32599, term32599.getClass(), "id", term32600);
        setField(term32599, term32599.getClass(), "userId", term32602);
        setField(term32599, term32599.getClass(), "postCount", term32604);
        setField(term32599, term32599.getClass(), "likeCount", term32606);
        setField(term32599, term32599.getClass(), "followingCount", term32608);
        setField(term32599, term32599.getClass(), "followerCount", term32610);
        setIntField(term32613, term32613.getClass(), "year", 2019);
        setShortField(term32613, term32613.getClass(), "month", (short) 10);
        setShortField(term32613, term32613.getClass(), "day", (short) 4);
        setField(term32612, term32612.getClass(), "date", term32613);
        setByteField(term32617, term32617.getClass(), "hour", (byte) 14);
        setByteField(term32617, term32617.getClass(), "minute", (byte) 11);
        setByteField(term32617, term32617.getClass(), "second", (byte) 28);
        setIntField(term32617, term32617.getClass(), "nano", 963604727);
        setField(term32612, term32612.getClass(), "time", term32617);
        setField(term32599, term32599.getClass(), "createdAt", term32612);
        setIntField(term32623, term32623.getClass(), "year", 2029);
        setShortField(term32623, term32623.getClass(), "month", (short) 8);
        setShortField(term32623, term32623.getClass(), "day", (short) 18);
        setField(term32622, term32622.getClass(), "date", term32623);
        setByteField(term32627, term32627.getClass(), "hour", (byte) 8);
        setByteField(term32627, term32627.getClass(), "minute", (byte) 52);
        setByteField(term32627, term32627.getClass(), "second", (byte) 59);
        setIntField(term32627, term32627.getClass(), "nano", 526040172);
        setField(term32622, term32622.getClass(), "time", term32627);
        setField(term32599, term32599.getClass(), "updatedAt", term32622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term32599, args);
    }

};



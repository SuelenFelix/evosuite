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

public class UserStat_getCreatedAt_98875597010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32136;

    public UserStat_getCreatedAt_98875597010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32137 = new Long(6631484353678437959L);
        Long term32139 = new Long(-1763360854589438694L);
        Long term32141 = new Long(-4225690761644993738L);
        Long term32143 = new Long(4498588544424613697L);
        Long term32145 = new Long(6207481297504886524L);
        Long term32147 = new Long(-8869783148712995243L);
        term32136 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat"));
        Object term32149 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32150 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32154 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32159 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32160 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32164 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term32136, term32136.getClass(), "id", term32137);
        setField(term32136, term32136.getClass(), "userId", term32139);
        setField(term32136, term32136.getClass(), "postCount", term32141);
        setField(term32136, term32136.getClass(), "likeCount", term32143);
        setField(term32136, term32136.getClass(), "followingCount", term32145);
        setField(term32136, term32136.getClass(), "followerCount", term32147);
        setIntField(term32150, term32150.getClass(), "year", 2013);
        setShortField(term32150, term32150.getClass(), "month", (short) 9);
        setShortField(term32150, term32150.getClass(), "day", (short) 12);
        setField(term32149, term32149.getClass(), "date", term32150);
        setByteField(term32154, term32154.getClass(), "hour", (byte) 19);
        setByteField(term32154, term32154.getClass(), "minute", (byte) 26);
        setByteField(term32154, term32154.getClass(), "second", (byte) 25);
        setIntField(term32154, term32154.getClass(), "nano", 897835144);
        setField(term32149, term32149.getClass(), "time", term32154);
        setField(term32136, term32136.getClass(), "createdAt", term32149);
        setIntField(term32160, term32160.getClass(), "year", 2014);
        setShortField(term32160, term32160.getClass(), "month", (short) 6);
        setShortField(term32160, term32160.getClass(), "day", (short) 17);
        setField(term32159, term32159.getClass(), "date", term32160);
        setByteField(term32164, term32164.getClass(), "hour", (byte) 1);
        setByteField(term32164, term32164.getClass(), "minute", (byte) 42);
        setByteField(term32164, term32164.getClass(), "second", (byte) 16);
        setIntField(term32164, term32164.getClass(), "nano", 607959128);
        setField(term32159, term32159.getClass(), "time", term32164);
        setField(term32136, term32136.getClass(), "updatedAt", term32159);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term32136, args);
    }

};



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

public class UserStat_UserStatBuilder_followerCount_14955477746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4311;
     Object term4344;

    public UserStat_UserStatBuilder_followerCount_14955477746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4312 = new Long(6273754186658578034L);
        Long term4314 = new Long(3620247240684476031L);
        Long term4316 = new Long(8313800941204938919L);
        Long term4318 = new Long(-1214968196781083707L);
        Long term4320 = new Long(-1804015692891701666L);
        Long term4322 = new Long(-6432617521836576658L);
        term4311 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat$UserStatBuilder"));
        Object term4324 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4325 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4329 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4334 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4335 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4339 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4311, term4311.getClass(), "id", term4312);
        setField(term4311, term4311.getClass(), "userId", term4314);
        setField(term4311, term4311.getClass(), "postCount", term4316);
        setField(term4311, term4311.getClass(), "likeCount", term4318);
        setField(term4311, term4311.getClass(), "followingCount", term4320);
        setField(term4311, term4311.getClass(), "followerCount", term4322);
        setIntField(term4325, term4325.getClass(), "year", 2022);
        setShortField(term4325, term4325.getClass(), "month", (short) 4);
        setShortField(term4325, term4325.getClass(), "day", (short) 15);
        setField(term4324, term4324.getClass(), "date", term4325);
        setByteField(term4329, term4329.getClass(), "hour", (byte) 20);
        setByteField(term4329, term4329.getClass(), "minute", (byte) 58);
        setByteField(term4329, term4329.getClass(), "second", (byte) 46);
        setIntField(term4329, term4329.getClass(), "nano", 435562727);
        setField(term4324, term4324.getClass(), "time", term4329);
        setField(term4311, term4311.getClass(), "createdAt", term4324);
        setIntField(term4335, term4335.getClass(), "year", 2026);
        setShortField(term4335, term4335.getClass(), "month", (short) 10);
        setShortField(term4335, term4335.getClass(), "day", (short) 31);
        setField(term4334, term4334.getClass(), "date", term4335);
        setByteField(term4339, term4339.getClass(), "hour", (byte) 17);
        setByteField(term4339, term4339.getClass(), "minute", (byte) 6);
        setByteField(term4339, term4339.getClass(), "second", (byte) 30);
        setIntField(term4339, term4339.getClass(), "nano", 785931660);
        setField(term4334, term4334.getClass(), "time", term4339);
        setField(term4311, term4311.getClass(), "updatedAt", term4334);
        term4344 = new Long(-2255965562447970862L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat$UserStatBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4344;
        callMethod(klass, "followerCount", argTypes, term4311, args);
    }

};



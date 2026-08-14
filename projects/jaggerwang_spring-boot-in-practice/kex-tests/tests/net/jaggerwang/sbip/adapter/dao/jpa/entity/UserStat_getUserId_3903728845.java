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

public class UserStat_getUserId_3903728845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31971;

    public UserStat_getUserId_3903728845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31972 = new Long(5592372218942533021L);
        Long term31974 = new Long(8423938983545919786L);
        Long term31976 = new Long(-6523933176535405885L);
        Long term31978 = new Long(6558561920118298074L);
        Long term31980 = new Long(-6261257793045898313L);
        Long term31982 = new Long(6383832776430121737L);
        term31971 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat"));
        Object term31984 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31985 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31989 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31994 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31995 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31999 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31971, term31971.getClass(), "id", term31972);
        setField(term31971, term31971.getClass(), "userId", term31974);
        setField(term31971, term31971.getClass(), "postCount", term31976);
        setField(term31971, term31971.getClass(), "likeCount", term31978);
        setField(term31971, term31971.getClass(), "followingCount", term31980);
        setField(term31971, term31971.getClass(), "followerCount", term31982);
        setIntField(term31985, term31985.getClass(), "year", 2018);
        setShortField(term31985, term31985.getClass(), "month", (short) 11);
        setShortField(term31985, term31985.getClass(), "day", (short) 14);
        setField(term31984, term31984.getClass(), "date", term31985);
        setByteField(term31989, term31989.getClass(), "hour", (byte) 18);
        setByteField(term31989, term31989.getClass(), "minute", (byte) 31);
        setByteField(term31989, term31989.getClass(), "second", (byte) 15);
        setIntField(term31989, term31989.getClass(), "nano", 39699749);
        setField(term31984, term31984.getClass(), "time", term31989);
        setField(term31971, term31971.getClass(), "createdAt", term31984);
        setIntField(term31995, term31995.getClass(), "year", 2019);
        setShortField(term31995, term31995.getClass(), "month", (short) 4);
        setShortField(term31995, term31995.getClass(), "day", (short) 21);
        setField(term31994, term31994.getClass(), "date", term31995);
        setByteField(term31999, term31999.getClass(), "hour", (byte) 12);
        setByteField(term31999, term31999.getClass(), "minute", (byte) 13);
        setByteField(term31999, term31999.getClass(), "second", (byte) 21);
        setIntField(term31999, term31999.getClass(), "nano", 906802544);
        setField(term31994, term31994.getClass(), "time", term31999);
        setField(term31971, term31971.getClass(), "updatedAt", term31994);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserId", argTypes, term31971, args);
    }

};



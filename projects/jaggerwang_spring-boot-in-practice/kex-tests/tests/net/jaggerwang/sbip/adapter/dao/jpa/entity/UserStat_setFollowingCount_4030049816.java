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

public class UserStat_setFollowingCount_4030049816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32342;
     Object term32375;

    public UserStat_setFollowingCount_4030049816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32343 = new Long(-3817606000638396608L);
        Long term32345 = new Long(-1435639144971145612L);
        Long term32347 = new Long(-921066654455496205L);
        Long term32349 = new Long(7622401904339010124L);
        Long term32351 = new Long(-761256632171362830L);
        Long term32353 = new Long(6975846341920664143L);
        term32342 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat"));
        Object term32355 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32356 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32360 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32365 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32366 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32370 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term32342, term32342.getClass(), "id", term32343);
        setField(term32342, term32342.getClass(), "userId", term32345);
        setField(term32342, term32342.getClass(), "postCount", term32347);
        setField(term32342, term32342.getClass(), "likeCount", term32349);
        setField(term32342, term32342.getClass(), "followingCount", term32351);
        setField(term32342, term32342.getClass(), "followerCount", term32353);
        setIntField(term32356, term32356.getClass(), "year", 2028);
        setShortField(term32356, term32356.getClass(), "month", (short) 4);
        setShortField(term32356, term32356.getClass(), "day", (short) 9);
        setField(term32355, term32355.getClass(), "date", term32356);
        setByteField(term32360, term32360.getClass(), "hour", (byte) 16);
        setByteField(term32360, term32360.getClass(), "minute", (byte) 26);
        setByteField(term32360, term32360.getClass(), "second", (byte) 35);
        setIntField(term32360, term32360.getClass(), "nano", 546233932);
        setField(term32355, term32355.getClass(), "time", term32360);
        setField(term32342, term32342.getClass(), "createdAt", term32355);
        setIntField(term32366, term32366.getClass(), "year", 2022);
        setShortField(term32366, term32366.getClass(), "month", (short) 3);
        setShortField(term32366, term32366.getClass(), "day", (short) 19);
        setField(term32365, term32365.getClass(), "date", term32366);
        setByteField(term32370, term32370.getClass(), "hour", (byte) 6);
        setByteField(term32370, term32370.getClass(), "minute", (byte) 55);
        setByteField(term32370, term32370.getClass(), "second", (byte) 49);
        setIntField(term32370, term32370.getClass(), "nano", 478088059);
        setField(term32365, term32365.getClass(), "time", term32370);
        setField(term32342, term32342.getClass(), "updatedAt", term32365);
        term32375 = new Long(-7055293192926325895L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term32375;
        callMethod(klass, "setFollowingCount", argTypes, term32342, args);
    }

};



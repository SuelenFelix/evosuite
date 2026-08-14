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

public class UserStat_fromBO_9234760030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31839;

    public UserStat_fromBO_9234760030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31840 = new Long(5255768275907389358L);
        Long term31842 = new Long(-8859332911664940963L);
        Long term31844 = new Long(0L);
        Long term31846 = new Long(0L);
        Long term31848 = new Long(0L);
        Long term31850 = new Long(0L);
        term31839 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO"));
        Object term31852 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31853 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31857 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31862 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31863 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31867 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31839, term31839.getClass(), "id", term31840);
        setField(term31839, term31839.getClass(), "userId", term31842);
        setField(term31839, term31839.getClass(), "postCount", term31844);
        setField(term31839, term31839.getClass(), "likeCount", term31846);
        setField(term31839, term31839.getClass(), "followingCount", term31848);
        setField(term31839, term31839.getClass(), "followerCount", term31850);
        setIntField(term31853, term31853.getClass(), "year", 2016);
        setShortField(term31853, term31853.getClass(), "month", (short) 5);
        setShortField(term31853, term31853.getClass(), "day", (short) 9);
        setField(term31852, term31852.getClass(), "date", term31853);
        setByteField(term31857, term31857.getClass(), "hour", (byte) 22);
        setByteField(term31857, term31857.getClass(), "minute", (byte) 50);
        setByteField(term31857, term31857.getClass(), "second", (byte) 14);
        setIntField(term31857, term31857.getClass(), "nano", 185148211);
        setField(term31852, term31852.getClass(), "time", term31857);
        setField(term31839, term31839.getClass(), "createdAt", term31852);
        setIntField(term31863, term31863.getClass(), "year", 2014);
        setShortField(term31863, term31863.getClass(), "month", (short) 3);
        setShortField(term31863, term31863.getClass(), "day", (short) 7);
        setField(term31862, term31862.getClass(), "date", term31863);
        setByteField(term31867, term31867.getClass(), "hour", (byte) 2);
        setByteField(term31867, term31867.getClass(), "minute", (byte) 57);
        setByteField(term31867, term31867.getClass(), "second", (byte) 26);
        setIntField(term31867, term31867.getClass(), "nano", 493613741);
        setField(term31862, term31862.getClass(), "time", term31867);
        setField(term31839, term31839.getClass(), "updatedAt", term31862);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserStat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.UserStatBO");
        Object[] args = new Object[1];
        args[0] = term31839;
        callMethod(klass, "fromBO", argTypes, null, args);
    }

};



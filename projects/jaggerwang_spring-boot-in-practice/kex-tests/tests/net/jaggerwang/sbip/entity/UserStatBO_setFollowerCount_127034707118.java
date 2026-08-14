package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class UserStatBO_setFollowerCount_127034707118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12074;
     Object term12107;

    public UserStatBO_setFollowerCount_127034707118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12075 = new Long(-1333707622307134180L);
        Long term12077 = new Long(-4360569253593381888L);
        Long term12079 = new Long(0L);
        Long term12081 = new Long(0L);
        Long term12083 = new Long(0L);
        Long term12085 = new Long(0L);
        term12074 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO"));
        Object term12087 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12088 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12092 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12097 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12098 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12102 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12074, term12074.getClass(), "id", term12075);
        setField(term12074, term12074.getClass(), "userId", term12077);
        setField(term12074, term12074.getClass(), "postCount", term12079);
        setField(term12074, term12074.getClass(), "likeCount", term12081);
        setField(term12074, term12074.getClass(), "followingCount", term12083);
        setField(term12074, term12074.getClass(), "followerCount", term12085);
        setIntField(term12088, term12088.getClass(), "year", 2021);
        setShortField(term12088, term12088.getClass(), "month", (short) 4);
        setShortField(term12088, term12088.getClass(), "day", (short) 26);
        setField(term12087, term12087.getClass(), "date", term12088);
        setByteField(term12092, term12092.getClass(), "hour", (byte) 11);
        setByteField(term12092, term12092.getClass(), "minute", (byte) 34);
        setByteField(term12092, term12092.getClass(), "second", (byte) 15);
        setIntField(term12092, term12092.getClass(), "nano", 638206023);
        setField(term12087, term12087.getClass(), "time", term12092);
        setField(term12074, term12074.getClass(), "createdAt", term12087);
        setIntField(term12098, term12098.getClass(), "year", 2013);
        setShortField(term12098, term12098.getClass(), "month", (short) 9);
        setShortField(term12098, term12098.getClass(), "day", (short) 13);
        setField(term12097, term12097.getClass(), "date", term12098);
        setByteField(term12102, term12102.getClass(), "hour", (byte) 14);
        setByteField(term12102, term12102.getClass(), "minute", (byte) 36);
        setByteField(term12102, term12102.getClass(), "second", (byte) 59);
        setIntField(term12102, term12102.getClass(), "nano", 363124001);
        setField(term12097, term12097.getClass(), "time", term12102);
        setField(term12074, term12074.getClass(), "updatedAt", term12097);
        term12107 = new Long(1457594663983990440L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term12107;
        callMethod(klass, "setFollowerCount", argTypes, term12074, args);
    }

};



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

public class UserStatBO_getFollowerCount_145450253910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11800;

    public UserStatBO_getFollowerCount_145450253910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11801 = new Long(-6432617521836576658L);
        Long term11803 = new Long(-2255965562447970862L);
        Long term11805 = new Long(0L);
        Long term11807 = new Long(0L);
        Long term11809 = new Long(0L);
        Long term11811 = new Long(0L);
        term11800 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO"));
        Object term11813 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11814 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11818 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11823 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11824 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11828 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11800, term11800.getClass(), "id", term11801);
        setField(term11800, term11800.getClass(), "userId", term11803);
        setField(term11800, term11800.getClass(), "postCount", term11805);
        setField(term11800, term11800.getClass(), "likeCount", term11807);
        setField(term11800, term11800.getClass(), "followingCount", term11809);
        setField(term11800, term11800.getClass(), "followerCount", term11811);
        setIntField(term11814, term11814.getClass(), "year", 2011);
        setShortField(term11814, term11814.getClass(), "month", (short) 8);
        setShortField(term11814, term11814.getClass(), "day", (short) 1);
        setField(term11813, term11813.getClass(), "date", term11814);
        setByteField(term11818, term11818.getClass(), "hour", (byte) 7);
        setByteField(term11818, term11818.getClass(), "minute", (byte) 2);
        setByteField(term11818, term11818.getClass(), "second", (byte) 46);
        setIntField(term11818, term11818.getClass(), "nano", 187178462);
        setField(term11813, term11813.getClass(), "time", term11818);
        setField(term11800, term11800.getClass(), "createdAt", term11813);
        setIntField(term11824, term11824.getClass(), "year", 2020);
        setShortField(term11824, term11824.getClass(), "month", (short) 9);
        setShortField(term11824, term11824.getClass(), "day", (short) 3);
        setField(term11823, term11823.getClass(), "date", term11824);
        setByteField(term11828, term11828.getClass(), "hour", (byte) 10);
        setByteField(term11828, term11828.getClass(), "minute", (byte) 44);
        setByteField(term11828, term11828.getClass(), "second", (byte) 5);
        setIntField(term11828, term11828.getClass(), "nano", 572560230);
        setField(term11823, term11823.getClass(), "time", term11828);
        setField(term11800, term11800.getClass(), "updatedAt", term11823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFollowerCount", argTypes, term11800, args);
    }

};



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

public class UserStatBO_getUpdatedAt_100305591712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11866;

    public UserStatBO_getUpdatedAt_100305591712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11867 = new Long(6843866297465638866L);
        Long term11869 = new Long(-4023935540989049732L);
        Long term11871 = new Long(0L);
        Long term11873 = new Long(0L);
        Long term11875 = new Long(0L);
        Long term11877 = new Long(0L);
        term11866 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO"));
        Object term11879 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11880 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11884 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11889 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11890 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11894 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11866, term11866.getClass(), "id", term11867);
        setField(term11866, term11866.getClass(), "userId", term11869);
        setField(term11866, term11866.getClass(), "postCount", term11871);
        setField(term11866, term11866.getClass(), "likeCount", term11873);
        setField(term11866, term11866.getClass(), "followingCount", term11875);
        setField(term11866, term11866.getClass(), "followerCount", term11877);
        setIntField(term11880, term11880.getClass(), "year", 2011);
        setShortField(term11880, term11880.getClass(), "month", (short) 4);
        setShortField(term11880, term11880.getClass(), "day", (short) 19);
        setField(term11879, term11879.getClass(), "date", term11880);
        setByteField(term11884, term11884.getClass(), "hour", (byte) 12);
        setByteField(term11884, term11884.getClass(), "minute", (byte) 0);
        setByteField(term11884, term11884.getClass(), "second", (byte) 14);
        setIntField(term11884, term11884.getClass(), "nano", 849079063);
        setField(term11879, term11879.getClass(), "time", term11884);
        setField(term11866, term11866.getClass(), "createdAt", term11879);
        setIntField(term11890, term11890.getClass(), "year", 2014);
        setShortField(term11890, term11890.getClass(), "month", (short) 8);
        setShortField(term11890, term11890.getClass(), "day", (short) 17);
        setField(term11889, term11889.getClass(), "date", term11890);
        setByteField(term11894, term11894.getClass(), "hour", (byte) 19);
        setByteField(term11894, term11894.getClass(), "minute", (byte) 32);
        setByteField(term11894, term11894.getClass(), "second", (byte) 5);
        setIntField(term11894, term11894.getClass(), "nano", 604713831);
        setField(term11889, term11889.getClass(), "time", term11894);
        setField(term11866, term11866.getClass(), "updatedAt", term11889);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdatedAt", argTypes, term11866, args);
    }

};



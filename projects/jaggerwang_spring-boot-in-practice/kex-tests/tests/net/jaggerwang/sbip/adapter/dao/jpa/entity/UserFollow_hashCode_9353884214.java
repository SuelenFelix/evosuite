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

public class UserFollow_hashCode_9353884214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11915;

    public UserFollow_hashCode_9353884214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11916 = new Long(4552367707739103094L);
        Long term11918 = new Long(-6001151456088965547L);
        Long term11920 = new Long(1740732617708040141L);
        term11915 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow"));
        Object term11922 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11923 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11927 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11932 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11933 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11937 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11915, term11915.getClass(), "id", term11916);
        setField(term11915, term11915.getClass(), "followingId", term11918);
        setField(term11915, term11915.getClass(), "followerId", term11920);
        setIntField(term11923, term11923.getClass(), "year", 2027);
        setShortField(term11923, term11923.getClass(), "month", (short) 5);
        setShortField(term11923, term11923.getClass(), "day", (short) 2);
        setField(term11922, term11922.getClass(), "date", term11923);
        setByteField(term11927, term11927.getClass(), "hour", (byte) 6);
        setByteField(term11927, term11927.getClass(), "minute", (byte) 10);
        setByteField(term11927, term11927.getClass(), "second", (byte) 19);
        setIntField(term11927, term11927.getClass(), "nano", 422884120);
        setField(term11922, term11922.getClass(), "time", term11927);
        setField(term11915, term11915.getClass(), "createdAt", term11922);
        setIntField(term11933, term11933.getClass(), "year", 2029);
        setShortField(term11933, term11933.getClass(), "month", (short) 10);
        setShortField(term11933, term11933.getClass(), "day", (short) 19);
        setField(term11932, term11932.getClass(), "date", term11933);
        setByteField(term11937, term11937.getClass(), "hour", (byte) 15);
        setByteField(term11937, term11937.getClass(), "minute", (byte) 8);
        setByteField(term11937, term11937.getClass(), "second", (byte) 15);
        setIntField(term11937, term11937.getClass(), "nano", 25396748);
        setField(term11932, term11932.getClass(), "time", term11937);
        setField(term11915, term11915.getClass(), "updatedAt", term11932);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term11915, args);
    }

};



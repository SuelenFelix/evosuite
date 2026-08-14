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

public class RoleBO_getCreatedAt_15217174813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29895;

    public RoleBO_getCreatedAt_15217174813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29896 = new Long(3535528164828723056L);
        term29895 = newInstance(Class.forName("net.jaggerwang.sbip.entity.RoleBO"));
        Object term29910 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29911 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29915 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29920 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29921 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29925 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term29895, term29895.getClass(), "id", term29896);
        setField(term29895, term29895.getClass(), "name", "IkpjUOuWQU");
        setIntField(term29911, term29911.getClass(), "year", 2023);
        setShortField(term29911, term29911.getClass(), "month", (short) 12);
        setShortField(term29911, term29911.getClass(), "day", (short) 3);
        setField(term29910, term29910.getClass(), "date", term29911);
        setByteField(term29915, term29915.getClass(), "hour", (byte) 14);
        setByteField(term29915, term29915.getClass(), "minute", (byte) 6);
        setByteField(term29915, term29915.getClass(), "second", (byte) 20);
        setIntField(term29915, term29915.getClass(), "nano", 660325634);
        setField(term29910, term29910.getClass(), "time", term29915);
        setField(term29895, term29895.getClass(), "createdAt", term29910);
        setIntField(term29921, term29921.getClass(), "year", 2019);
        setShortField(term29921, term29921.getClass(), "month", (short) 2);
        setShortField(term29921, term29921.getClass(), "day", (short) 13);
        setField(term29920, term29920.getClass(), "date", term29921);
        setByteField(term29925, term29925.getClass(), "hour", (byte) 5);
        setByteField(term29925, term29925.getClass(), "minute", (byte) 59);
        setByteField(term29925, term29925.getClass(), "second", (byte) 42);
        setIntField(term29925, term29925.getClass(), "nano", 720385556);
        setField(term29920, term29920.getClass(), "time", term29925);
        setField(term29895, term29895.getClass(), "updatedAt", term29920);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.RoleBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term29895, args);
    }

};



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

public class UserBO_getCreatedAt_22995328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25857;

    public UserBO_getCreatedAt_22995328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term25858 = new Long(-1889784286465977825L);
        Long term25908 = new Long(5592522907226111065L);
        term25857 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO"));
        Object term25922 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25923 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25927 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25932 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25933 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25937 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term25857, term25857.getClass(), "id", term25858);
        setField(term25857, term25857.getClass(), "username", "WVRMUmrljA");
        setField(term25857, term25857.getClass(), "password", "NTlKJDDWlk");
        setField(term25857, term25857.getClass(), "mobile", "vOuMEpOQAg");
        setField(term25857, term25857.getClass(), "email", "SIODFGaQhr");
        setField(term25857, term25857.getClass(), "avatarId", term25908);
        setField(term25857, term25857.getClass(), "intro", "qYzsiuXOgS");
        setIntField(term25923, term25923.getClass(), "year", 2020);
        setShortField(term25923, term25923.getClass(), "month", (short) 5);
        setShortField(term25923, term25923.getClass(), "day", (short) 31);
        setField(term25922, term25922.getClass(), "date", term25923);
        setByteField(term25927, term25927.getClass(), "hour", (byte) 17);
        setByteField(term25927, term25927.getClass(), "minute", (byte) 5);
        setByteField(term25927, term25927.getClass(), "second", (byte) 38);
        setIntField(term25927, term25927.getClass(), "nano", 709012300);
        setField(term25922, term25922.getClass(), "time", term25927);
        setField(term25857, term25857.getClass(), "createdAt", term25922);
        setIntField(term25933, term25933.getClass(), "year", 2021);
        setShortField(term25933, term25933.getClass(), "month", (short) 7);
        setShortField(term25933, term25933.getClass(), "day", (short) 6);
        setField(term25932, term25932.getClass(), "date", term25933);
        setByteField(term25937, term25937.getClass(), "hour", (byte) 12);
        setByteField(term25937, term25937.getClass(), "minute", (byte) 46);
        setByteField(term25937, term25937.getClass(), "second", (byte) 42);
        setIntField(term25937, term25937.getClass(), "nano", 512890850);
        setField(term25932, term25932.getClass(), "time", term25937);
        setField(term25857, term25857.getClass(), "updatedAt", term25932);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term25857, args);
    }

};



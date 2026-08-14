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

public class UserFollow_canEqual_115931046213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11887;
     Object term11914;

    public UserFollow_canEqual_115931046213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11888 = new Long(-3850323135468805420L);
        Long term11890 = new Long(-5207216109884759743L);
        Long term11892 = new Long(8765880103547975810L);
        term11887 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow"));
        Object term11894 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11895 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11899 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11904 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11905 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11909 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11887, term11887.getClass(), "id", term11888);
        setField(term11887, term11887.getClass(), "followingId", term11890);
        setField(term11887, term11887.getClass(), "followerId", term11892);
        setIntField(term11895, term11895.getClass(), "year", 2026);
        setShortField(term11895, term11895.getClass(), "month", (short) 2);
        setShortField(term11895, term11895.getClass(), "day", (short) 5);
        setField(term11894, term11894.getClass(), "date", term11895);
        setByteField(term11899, term11899.getClass(), "hour", (byte) 1);
        setByteField(term11899, term11899.getClass(), "minute", (byte) 38);
        setByteField(term11899, term11899.getClass(), "second", (byte) 15);
        setIntField(term11899, term11899.getClass(), "nano", 167345230);
        setField(term11894, term11894.getClass(), "time", term11899);
        setField(term11887, term11887.getClass(), "createdAt", term11894);
        setIntField(term11905, term11905.getClass(), "year", 2029);
        setShortField(term11905, term11905.getClass(), "month", (short) 6);
        setShortField(term11905, term11905.getClass(), "day", (short) 4);
        setField(term11904, term11904.getClass(), "date", term11905);
        setByteField(term11909, term11909.getClass(), "hour", (byte) 22);
        setByteField(term11909, term11909.getClass(), "minute", (byte) 1);
        setByteField(term11909, term11909.getClass(), "second", (byte) 38);
        setIntField(term11909, term11909.getClass(), "nano", 329228491);
        setField(term11904, term11904.getClass(), "time", term11909);
        setField(term11887, term11887.getClass(), "updatedAt", term11904);
        term11914 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term11914;
        callMethod(klass, "canEqual", argTypes, term11887, args);
    }

};



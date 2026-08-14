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

public class PostStat_setUpdatedAt_26402016413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3945;
     Object term3972;

    public PostStat_setUpdatedAt_26402016413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3946 = new Long(-6723783499250797216L);
        Long term3948 = new Long(41775768178052008L);
        Long term3950 = new Long(6682528376118987775L);
        term3945 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat"));
        Object term3952 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3953 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3957 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3962 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3963 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3967 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3945, term3945.getClass(), "id", term3946);
        setField(term3945, term3945.getClass(), "postId", term3948);
        setField(term3945, term3945.getClass(), "likeCount", term3950);
        setIntField(term3953, term3953.getClass(), "year", 2013);
        setShortField(term3953, term3953.getClass(), "month", (short) 5);
        setShortField(term3953, term3953.getClass(), "day", (short) 26);
        setField(term3952, term3952.getClass(), "date", term3953);
        setByteField(term3957, term3957.getClass(), "hour", (byte) 4);
        setByteField(term3957, term3957.getClass(), "minute", (byte) 39);
        setByteField(term3957, term3957.getClass(), "second", (byte) 5);
        setIntField(term3957, term3957.getClass(), "nano", 392869354);
        setField(term3952, term3952.getClass(), "time", term3957);
        setField(term3945, term3945.getClass(), "createdAt", term3952);
        setIntField(term3963, term3963.getClass(), "year", 2012);
        setShortField(term3963, term3963.getClass(), "month", (short) 4);
        setShortField(term3963, term3963.getClass(), "day", (short) 25);
        setField(term3962, term3962.getClass(), "date", term3963);
        setByteField(term3967, term3967.getClass(), "hour", (byte) 21);
        setByteField(term3967, term3967.getClass(), "minute", (byte) 14);
        setByteField(term3967, term3967.getClass(), "second", (byte) 15);
        setIntField(term3967, term3967.getClass(), "nano", 561700934);
        setField(term3962, term3962.getClass(), "time", term3967);
        setField(term3945, term3945.getClass(), "updatedAt", term3962);
        term3972 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3973 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3977 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term3973, term3973.getClass(), "year", 2011);
        setShortField(term3973, term3973.getClass(), "month", (short) 10);
        setShortField(term3973, term3973.getClass(), "day", (short) 25);
        setField(term3972, term3972.getClass(), "date", term3973);
        setByteField(term3977, term3977.getClass(), "hour", (byte) 10);
        setByteField(term3977, term3977.getClass(), "minute", (byte) 33);
        setByteField(term3977, term3977.getClass(), "second", (byte) 8);
        setIntField(term3977, term3977.getClass(), "nano", 268304014);
        setField(term3972, term3972.getClass(), "time", term3977);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term3972;
        callMethod(klass, "setUpdatedAt", argTypes, term3945, args);
    }

};



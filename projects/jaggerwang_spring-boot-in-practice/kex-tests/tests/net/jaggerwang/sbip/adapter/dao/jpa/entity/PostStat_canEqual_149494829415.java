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

public class PostStat_canEqual_149494829415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4010;
     Object term4037;

    public PostStat_canEqual_149494829415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4011 = new Long(9013624480170062917L);
        Long term4013 = new Long(7862575738391801707L);
        Long term4015 = new Long(50358265865610362L);
        term4010 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat"));
        Object term4017 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4018 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4022 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4027 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4028 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4032 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4010, term4010.getClass(), "id", term4011);
        setField(term4010, term4010.getClass(), "postId", term4013);
        setField(term4010, term4010.getClass(), "likeCount", term4015);
        setIntField(term4018, term4018.getClass(), "year", 2011);
        setShortField(term4018, term4018.getClass(), "month", (short) 6);
        setShortField(term4018, term4018.getClass(), "day", (short) 26);
        setField(term4017, term4017.getClass(), "date", term4018);
        setByteField(term4022, term4022.getClass(), "hour", (byte) 22);
        setByteField(term4022, term4022.getClass(), "minute", (byte) 39);
        setByteField(term4022, term4022.getClass(), "second", (byte) 11);
        setIntField(term4022, term4022.getClass(), "nano", 686293604);
        setField(term4017, term4017.getClass(), "time", term4022);
        setField(term4010, term4010.getClass(), "createdAt", term4017);
        setIntField(term4028, term4028.getClass(), "year", 2012);
        setShortField(term4028, term4028.getClass(), "month", (short) 7);
        setShortField(term4028, term4028.getClass(), "day", (short) 21);
        setField(term4027, term4027.getClass(), "date", term4028);
        setByteField(term4032, term4032.getClass(), "hour", (byte) 13);
        setByteField(term4032, term4032.getClass(), "minute", (byte) 41);
        setByteField(term4032, term4032.getClass(), "second", (byte) 44);
        setIntField(term4032, term4032.getClass(), "nano", 394467282);
        setField(term4027, term4027.getClass(), "time", term4032);
        setField(term4010, term4010.getClass(), "updatedAt", term4027);
        term4037 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4037;
        callMethod(klass, "canEqual", argTypes, term4010, args);
    }

};



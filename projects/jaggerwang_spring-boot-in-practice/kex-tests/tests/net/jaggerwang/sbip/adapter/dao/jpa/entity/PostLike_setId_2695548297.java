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

public class PostLike_setId_2695548297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31304;
     Object term31331;

    public PostLike_setId_2695548297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31305 = new Long(-3355167737637002830L);
        Long term31307 = new Long(-8854988339892073229L);
        Long term31309 = new Long(2769081086274438111L);
        term31304 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike"));
        Object term31311 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31312 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31316 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31321 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31322 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31326 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31304, term31304.getClass(), "id", term31305);
        setField(term31304, term31304.getClass(), "userId", term31307);
        setField(term31304, term31304.getClass(), "postId", term31309);
        setIntField(term31312, term31312.getClass(), "year", 2026);
        setShortField(term31312, term31312.getClass(), "month", (short) 4);
        setShortField(term31312, term31312.getClass(), "day", (short) 10);
        setField(term31311, term31311.getClass(), "date", term31312);
        setByteField(term31316, term31316.getClass(), "hour", (byte) 3);
        setByteField(term31316, term31316.getClass(), "minute", (byte) 39);
        setByteField(term31316, term31316.getClass(), "second", (byte) 42);
        setIntField(term31316, term31316.getClass(), "nano", 840728841);
        setField(term31311, term31311.getClass(), "time", term31316);
        setField(term31304, term31304.getClass(), "createdAt", term31311);
        setIntField(term31322, term31322.getClass(), "year", 2029);
        setShortField(term31322, term31322.getClass(), "month", (short) 3);
        setShortField(term31322, term31322.getClass(), "day", (short) 7);
        setField(term31321, term31321.getClass(), "date", term31322);
        setByteField(term31326, term31326.getClass(), "hour", (byte) 11);
        setByteField(term31326, term31326.getClass(), "minute", (byte) 6);
        setByteField(term31326, term31326.getClass(), "second", (byte) 29);
        setIntField(term31326, term31326.getClass(), "nano", 899404417);
        setField(term31321, term31321.getClass(), "time", term31326);
        setField(term31304, term31304.getClass(), "updatedAt", term31321);
        term31331 = new Long(-6339531459447942677L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term31331;
        callMethod(klass, "setId", argTypes, term31304, args);
    }

};



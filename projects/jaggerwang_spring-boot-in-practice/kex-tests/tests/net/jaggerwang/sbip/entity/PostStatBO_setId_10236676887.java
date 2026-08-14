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

public class PostStatBO_setId_10236676887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24599;
     Object term24626;

    public PostStatBO_setId_10236676887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24600 = new Long(-7840999196900383276L);
        Long term24602 = new Long(1528628920302068646L);
        Long term24604 = new Long(0L);
        term24599 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostStatBO"));
        Object term24606 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24607 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24611 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24616 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24617 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24621 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term24599, term24599.getClass(), "id", term24600);
        setField(term24599, term24599.getClass(), "postId", term24602);
        setField(term24599, term24599.getClass(), "likeCount", term24604);
        setIntField(term24607, term24607.getClass(), "year", 2024);
        setShortField(term24607, term24607.getClass(), "month", (short) 12);
        setShortField(term24607, term24607.getClass(), "day", (short) 11);
        setField(term24606, term24606.getClass(), "date", term24607);
        setByteField(term24611, term24611.getClass(), "hour", (byte) 19);
        setByteField(term24611, term24611.getClass(), "minute", (byte) 38);
        setByteField(term24611, term24611.getClass(), "second", (byte) 23);
        setIntField(term24611, term24611.getClass(), "nano", 207336939);
        setField(term24606, term24606.getClass(), "time", term24611);
        setField(term24599, term24599.getClass(), "createdAt", term24606);
        setIntField(term24617, term24617.getClass(), "year", 2023);
        setShortField(term24617, term24617.getClass(), "month", (short) 3);
        setShortField(term24617, term24617.getClass(), "day", (short) 29);
        setField(term24616, term24616.getClass(), "date", term24617);
        setByteField(term24621, term24621.getClass(), "hour", (byte) 12);
        setByteField(term24621, term24621.getClass(), "minute", (byte) 11);
        setByteField(term24621, term24621.getClass(), "second", (byte) 3);
        setIntField(term24621, term24621.getClass(), "nano", 876063258);
        setField(term24616, term24616.getClass(), "time", term24621);
        setField(term24599, term24599.getClass(), "updatedAt", term24616);
        term24626 = new Long(3161040540173678206L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostStatBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term24626;
        callMethod(klass, "setId", argTypes, term24599, args);
    }

};



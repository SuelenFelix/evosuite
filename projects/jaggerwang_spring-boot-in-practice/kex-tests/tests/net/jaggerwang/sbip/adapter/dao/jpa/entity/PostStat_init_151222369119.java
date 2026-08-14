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

public class PostStat_init_151222369119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4092;
     Object term4094;
     Object term4096;
     Object term4098;
     Object term4108;

    public PostStat_init_151222369119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4092 = new Long(4474998035090263139L);
        term4094 = new Long(2848819812340321742L);
        term4096 = new Long(-8876856890348836498L);
        term4098 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4099 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4103 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4099, term4099.getClass(), "year", 2025);
        setShortField(term4099, term4099.getClass(), "month", (short) 3);
        setShortField(term4099, term4099.getClass(), "day", (short) 28);
        setField(term4098, term4098.getClass(), "date", term4099);
        setByteField(term4103, term4103.getClass(), "hour", (byte) 19);
        setByteField(term4103, term4103.getClass(), "minute", (byte) 56);
        setByteField(term4103, term4103.getClass(), "second", (byte) 52);
        setIntField(term4103, term4103.getClass(), "nano", 738558930);
        setField(term4098, term4098.getClass(), "time", term4103);
        term4108 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4109 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4113 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4109, term4109.getClass(), "year", 2024);
        setShortField(term4109, term4109.getClass(), "month", (short) 2);
        setShortField(term4109, term4109.getClass(), "day", (short) 29);
        setField(term4108, term4108.getClass(), "date", term4109);
        setByteField(term4113, term4113.getClass(), "hour", (byte) 17);
        setByteField(term4113, term4113.getClass(), "minute", (byte) 54);
        setByteField(term4113, term4113.getClass(), "second", (byte) 21);
        setIntField(term4113, term4113.getClass(), "nano", 605973408);
        setField(term4108, term4108.getClass(), "time", term4113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.Long");
        argTypes[2] = Class.forName("java.lang.Long");
        argTypes[3] = Class.forName("java.time.LocalDateTime");
        argTypes[4] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[5];
        args[0] = term4092;
        args[1] = term4094;
        args[2] = term4096;
        args[3] = term4098;
        args[4] = term4108;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



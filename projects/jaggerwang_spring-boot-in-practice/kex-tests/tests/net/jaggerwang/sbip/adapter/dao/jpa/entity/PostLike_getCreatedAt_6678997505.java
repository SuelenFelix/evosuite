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

public class PostLike_getCreatedAt_6678997505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31250;

    public PostLike_getCreatedAt_6678997505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31251 = new Long(6604328992663797314L);
        Long term31253 = new Long(-5133307284441518726L);
        Long term31255 = new Long(7921404547326630089L);
        term31250 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike"));
        Object term31257 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31258 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31262 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31267 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31268 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31272 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31250, term31250.getClass(), "id", term31251);
        setField(term31250, term31250.getClass(), "userId", term31253);
        setField(term31250, term31250.getClass(), "postId", term31255);
        setIntField(term31258, term31258.getClass(), "year", 2012);
        setShortField(term31258, term31258.getClass(), "month", (short) 4);
        setShortField(term31258, term31258.getClass(), "day", (short) 21);
        setField(term31257, term31257.getClass(), "date", term31258);
        setByteField(term31262, term31262.getClass(), "hour", (byte) 8);
        setByteField(term31262, term31262.getClass(), "minute", (byte) 7);
        setByteField(term31262, term31262.getClass(), "second", (byte) 21);
        setIntField(term31262, term31262.getClass(), "nano", 641327534);
        setField(term31257, term31257.getClass(), "time", term31262);
        setField(term31250, term31250.getClass(), "createdAt", term31257);
        setIntField(term31268, term31268.getClass(), "year", 2028);
        setShortField(term31268, term31268.getClass(), "month", (short) 6);
        setShortField(term31268, term31268.getClass(), "day", (short) 11);
        setField(term31267, term31267.getClass(), "date", term31268);
        setByteField(term31272, term31272.getClass(), "hour", (byte) 15);
        setByteField(term31272, term31272.getClass(), "minute", (byte) 2);
        setByteField(term31272, term31272.getClass(), "second", (byte) 44);
        setIntField(term31272, term31272.getClass(), "nano", 463103620);
        setField(term31267, term31267.getClass(), "time", term31272);
        setField(term31250, term31250.getClass(), "updatedAt", term31267);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term31250, args);
    }

};



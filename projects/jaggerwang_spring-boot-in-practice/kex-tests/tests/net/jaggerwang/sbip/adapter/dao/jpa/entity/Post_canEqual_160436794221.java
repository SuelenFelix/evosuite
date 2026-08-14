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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Post_canEqual_160436794221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10407;
     Object term10460;

    public Post_canEqual_160436794221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10408 = new Long(-7191625829563442696L);
        Long term10410 = new Long(1463379874413441830L);
        Class<? extends Object> term10462 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term10461 = ((Class) term10462).getDeclaredField((String) "TEXT");
        ((Field) term10461).setAccessible(true);
        Object enum31 = ((Field) term10461).get((Object) null);
        Long term10434 = new Long(7998051124369147543L);
        ArrayList term10432 = new ArrayList();
        ((ArrayList) term10432).add(term10434);
        Long term10438 = new Long(-1481367303699139651L);
        term10407 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post"));
        Object term10440 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10441 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10445 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10450 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10451 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10455 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term10407, term10407.getClass(), "id", term10408);
        setField(term10407, term10407.getClass(), "userId", term10410);
        setField(term10407, term10407.getClass(), "type", enum31);
        setField(term10407, term10407.getClass(), "text", "uWHnvSvaPl");
        setField(term10407, term10407.getClass(), "imageIds", term10432);
        setField(term10407, term10407.getClass(), "videoId", term10438);
        setIntField(term10441, term10441.getClass(), "year", 2016);
        setShortField(term10441, term10441.getClass(), "month", (short) 4);
        setShortField(term10441, term10441.getClass(), "day", (short) 18);
        setField(term10440, term10440.getClass(), "date", term10441);
        setByteField(term10445, term10445.getClass(), "hour", (byte) 15);
        setByteField(term10445, term10445.getClass(), "minute", (byte) 56);
        setByteField(term10445, term10445.getClass(), "second", (byte) 45);
        setIntField(term10445, term10445.getClass(), "nano", 248103350);
        setField(term10440, term10440.getClass(), "time", term10445);
        setField(term10407, term10407.getClass(), "createdAt", term10440);
        setIntField(term10451, term10451.getClass(), "year", 2028);
        setShortField(term10451, term10451.getClass(), "month", (short) 3);
        setShortField(term10451, term10451.getClass(), "day", (short) 25);
        setField(term10450, term10450.getClass(), "date", term10451);
        setByteField(term10455, term10455.getClass(), "hour", (byte) 6);
        setByteField(term10455, term10455.getClass(), "minute", (byte) 9);
        setByteField(term10455, term10455.getClass(), "second", (byte) 35);
        setIntField(term10455, term10455.getClass(), "nano", 744453524);
        setField(term10450, term10450.getClass(), "time", term10455);
        setField(term10407, term10407.getClass(), "updatedAt", term10450);
        term10460 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term10460;
        callMethod(klass, "canEqual", argTypes, term10407, args);
    }

};



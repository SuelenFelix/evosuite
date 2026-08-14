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

public class Post_setVideoId_182022595317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9266;
     Object term9319;

    public Post_setVideoId_182022595317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9267 = new Long(-113028659747841511L);
        Long term9269 = new Long(7271112616766426991L);
        Class<? extends Object> term9322 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term9321 = ((Class) term9322).getDeclaredField((String) "TEXT");
        ((Field) term9321).setAccessible(true);
        Object enum27 = ((Field) term9321).get((Object) null);
        Long term9293 = new Long(-8514728180792822493L);
        ArrayList term9291 = new ArrayList();
        ((ArrayList) term9291).add(term9293);
        Long term9297 = new Long(5315236285592892506L);
        term9266 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post"));
        Object term9299 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9300 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9304 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9309 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9310 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9314 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term9266, term9266.getClass(), "id", term9267);
        setField(term9266, term9266.getClass(), "userId", term9269);
        setField(term9266, term9266.getClass(), "type", enum27);
        setField(term9266, term9266.getClass(), "text", "dEnhdmILtU");
        setField(term9266, term9266.getClass(), "imageIds", term9291);
        setField(term9266, term9266.getClass(), "videoId", term9297);
        setIntField(term9300, term9300.getClass(), "year", 2026);
        setShortField(term9300, term9300.getClass(), "month", (short) 10);
        setShortField(term9300, term9300.getClass(), "day", (short) 19);
        setField(term9299, term9299.getClass(), "date", term9300);
        setByteField(term9304, term9304.getClass(), "hour", (byte) 7);
        setByteField(term9304, term9304.getClass(), "minute", (byte) 22);
        setByteField(term9304, term9304.getClass(), "second", (byte) 11);
        setIntField(term9304, term9304.getClass(), "nano", 17846677);
        setField(term9299, term9299.getClass(), "time", term9304);
        setField(term9266, term9266.getClass(), "createdAt", term9299);
        setIntField(term9310, term9310.getClass(), "year", 2018);
        setShortField(term9310, term9310.getClass(), "month", (short) 10);
        setShortField(term9310, term9310.getClass(), "day", (short) 17);
        setField(term9309, term9309.getClass(), "date", term9310);
        setByteField(term9314, term9314.getClass(), "hour", (byte) 5);
        setByteField(term9314, term9314.getClass(), "minute", (byte) 10);
        setByteField(term9314, term9314.getClass(), "second", (byte) 23);
        setIntField(term9314, term9314.getClass(), "nano", 571520422);
        setField(term9309, term9309.getClass(), "time", term9314);
        setField(term9266, term9266.getClass(), "updatedAt", term9309);
        term9319 = new Long(-6969704322644192945L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term9319;
        callMethod(klass, "setVideoId", argTypes, term9266, args);
    }

};



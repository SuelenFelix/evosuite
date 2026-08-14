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

public class PostLike_equals_68400246212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31465;
     Object term31492;

    public PostLike_equals_68400246212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31466 = new Long(-4069312743655862444L);
        Long term31468 = new Long(3233502115953753827L);
        Long term31470 = new Long(-308461294344616496L);
        term31465 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike"));
        Object term31472 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31473 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31477 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31482 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31483 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31487 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31465, term31465.getClass(), "id", term31466);
        setField(term31465, term31465.getClass(), "userId", term31468);
        setField(term31465, term31465.getClass(), "postId", term31470);
        setIntField(term31473, term31473.getClass(), "year", 2026);
        setShortField(term31473, term31473.getClass(), "month", (short) 10);
        setShortField(term31473, term31473.getClass(), "day", (short) 26);
        setField(term31472, term31472.getClass(), "date", term31473);
        setByteField(term31477, term31477.getClass(), "hour", (byte) 16);
        setByteField(term31477, term31477.getClass(), "minute", (byte) 45);
        setByteField(term31477, term31477.getClass(), "second", (byte) 43);
        setIntField(term31477, term31477.getClass(), "nano", 206234347);
        setField(term31472, term31472.getClass(), "time", term31477);
        setField(term31465, term31465.getClass(), "createdAt", term31472);
        setIntField(term31483, term31483.getClass(), "year", 2024);
        setShortField(term31483, term31483.getClass(), "month", (short) 3);
        setShortField(term31483, term31483.getClass(), "day", (short) 27);
        setField(term31482, term31482.getClass(), "date", term31483);
        setByteField(term31487, term31487.getClass(), "hour", (byte) 23);
        setByteField(term31487, term31487.getClass(), "minute", (byte) 48);
        setByteField(term31487, term31487.getClass(), "second", (byte) 45);
        setIntField(term31487, term31487.getClass(), "nano", 181365728);
        setField(term31482, term31482.getClass(), "time", term31487);
        setField(term31465, term31465.getClass(), "updatedAt", term31482);
        term31492 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term31492;
        callMethod(klass, "equals", argTypes, term31465, args);
    }

};



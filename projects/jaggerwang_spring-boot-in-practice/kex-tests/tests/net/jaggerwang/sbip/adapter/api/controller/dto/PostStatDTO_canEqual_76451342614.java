package net.jaggerwang.sbip.adapter.api.controller.dto;

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
import static net.jaggerwang.sbip.adapter.api.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class PostStatDTO_canEqual_76451342614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90555;
     Object term90582;

    public PostStatDTO_canEqual_76451342614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term90556 = new Long(-6264785127930873499L);
        Long term90558 = new Long(-3057089152637139157L);
        Long term90560 = new Long(3094322609315685109L);
        term90555 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO"));
        Object term90562 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90563 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90567 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90572 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90573 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90577 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term90555, term90555.getClass(), "id", term90556);
        setField(term90555, term90555.getClass(), "postId", term90558);
        setField(term90555, term90555.getClass(), "likeCount", term90560);
        setIntField(term90563, term90563.getClass(), "year", 2026);
        setShortField(term90563, term90563.getClass(), "month", (short) 5);
        setShortField(term90563, term90563.getClass(), "day", (short) 27);
        setField(term90562, term90562.getClass(), "date", term90563);
        setByteField(term90567, term90567.getClass(), "hour", (byte) 17);
        setByteField(term90567, term90567.getClass(), "minute", (byte) 53);
        setByteField(term90567, term90567.getClass(), "second", (byte) 50);
        setIntField(term90567, term90567.getClass(), "nano", 28025394);
        setField(term90562, term90562.getClass(), "time", term90567);
        setField(term90555, term90555.getClass(), "createdAt", term90562);
        setIntField(term90573, term90573.getClass(), "year", 2021);
        setShortField(term90573, term90573.getClass(), "month", (short) 8);
        setShortField(term90573, term90573.getClass(), "day", (short) 12);
        setField(term90572, term90572.getClass(), "date", term90573);
        setByteField(term90577, term90577.getClass(), "hour", (byte) 2);
        setByteField(term90577, term90577.getClass(), "minute", (byte) 55);
        setByteField(term90577, term90577.getClass(), "second", (byte) 38);
        setIntField(term90577, term90577.getClass(), "nano", 881864768);
        setField(term90572, term90572.getClass(), "time", term90577);
        setField(term90555, term90555.getClass(), "updatedAt", term90572);
        term90582 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term90582;
        callMethod(klass, "canEqual", argTypes, term90555, args);
    }

};



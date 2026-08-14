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

public class PostLike_setCreatedAt_33710887810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31391;
     Object term31418;

    public PostLike_setCreatedAt_33710887810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31392 = new Long(-932981811228171529L);
        Long term31394 = new Long(5817794709356277010L);
        Long term31396 = new Long(-205762347192500511L);
        term31391 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike"));
        Object term31398 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31399 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31403 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31408 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31409 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31413 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31391, term31391.getClass(), "id", term31392);
        setField(term31391, term31391.getClass(), "userId", term31394);
        setField(term31391, term31391.getClass(), "postId", term31396);
        setIntField(term31399, term31399.getClass(), "year", 2019);
        setShortField(term31399, term31399.getClass(), "month", (short) 11);
        setShortField(term31399, term31399.getClass(), "day", (short) 22);
        setField(term31398, term31398.getClass(), "date", term31399);
        setByteField(term31403, term31403.getClass(), "hour", (byte) 12);
        setByteField(term31403, term31403.getClass(), "minute", (byte) 32);
        setByteField(term31403, term31403.getClass(), "second", (byte) 48);
        setIntField(term31403, term31403.getClass(), "nano", 850810582);
        setField(term31398, term31398.getClass(), "time", term31403);
        setField(term31391, term31391.getClass(), "createdAt", term31398);
        setIntField(term31409, term31409.getClass(), "year", 2024);
        setShortField(term31409, term31409.getClass(), "month", (short) 11);
        setShortField(term31409, term31409.getClass(), "day", (short) 18);
        setField(term31408, term31408.getClass(), "date", term31409);
        setByteField(term31413, term31413.getClass(), "hour", (byte) 9);
        setByteField(term31413, term31413.getClass(), "minute", (byte) 40);
        setByteField(term31413, term31413.getClass(), "second", (byte) 54);
        setIntField(term31413, term31413.getClass(), "nano", 533273343);
        setField(term31408, term31408.getClass(), "time", term31413);
        setField(term31391, term31391.getClass(), "updatedAt", term31408);
        term31418 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31419 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31423 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term31419, term31419.getClass(), "year", 2014);
        setShortField(term31419, term31419.getClass(), "month", (short) 6);
        setShortField(term31419, term31419.getClass(), "day", (short) 26);
        setField(term31418, term31418.getClass(), "date", term31419);
        setByteField(term31423, term31423.getClass(), "hour", (byte) 1);
        setByteField(term31423, term31423.getClass(), "minute", (byte) 48);
        setByteField(term31423, term31423.getClass(), "second", (byte) 51);
        setIntField(term31423, term31423.getClass(), "nano", 770527454);
        setField(term31418, term31418.getClass(), "time", term31423);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term31418;
        callMethod(klass, "setCreatedAt", argTypes, term31391, args);
    }

};



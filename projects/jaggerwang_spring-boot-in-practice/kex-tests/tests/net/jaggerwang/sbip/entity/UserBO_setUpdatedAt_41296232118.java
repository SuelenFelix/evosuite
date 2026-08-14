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

public class UserBO_setUpdatedAt_41296232118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27331;
     Object term27416;

    public UserBO_setUpdatedAt_41296232118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27332 = new Long(-823085399570394644L);
        Long term27382 = new Long(-894705411488729365L);
        term27331 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO"));
        Object term27396 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27397 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27401 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27406 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27407 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27411 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27331, term27331.getClass(), "id", term27332);
        setField(term27331, term27331.getClass(), "username", "qnvxzwuGKX");
        setField(term27331, term27331.getClass(), "password", "EdPAvpluZg");
        setField(term27331, term27331.getClass(), "mobile", "DzHVBMqWtE");
        setField(term27331, term27331.getClass(), "email", "THZSpzBRYP");
        setField(term27331, term27331.getClass(), "avatarId", term27382);
        setField(term27331, term27331.getClass(), "intro", "ZfBIVGBQOE");
        setIntField(term27397, term27397.getClass(), "year", 2029);
        setShortField(term27397, term27397.getClass(), "month", (short) 5);
        setShortField(term27397, term27397.getClass(), "day", (short) 12);
        setField(term27396, term27396.getClass(), "date", term27397);
        setByteField(term27401, term27401.getClass(), "hour", (byte) 23);
        setByteField(term27401, term27401.getClass(), "minute", (byte) 20);
        setByteField(term27401, term27401.getClass(), "second", (byte) 4);
        setIntField(term27401, term27401.getClass(), "nano", 378307890);
        setField(term27396, term27396.getClass(), "time", term27401);
        setField(term27331, term27331.getClass(), "createdAt", term27396);
        setIntField(term27407, term27407.getClass(), "year", 2020);
        setShortField(term27407, term27407.getClass(), "month", (short) 4);
        setShortField(term27407, term27407.getClass(), "day", (short) 16);
        setField(term27406, term27406.getClass(), "date", term27407);
        setByteField(term27411, term27411.getClass(), "hour", (byte) 7);
        setByteField(term27411, term27411.getClass(), "minute", (byte) 46);
        setByteField(term27411, term27411.getClass(), "second", (byte) 47);
        setIntField(term27411, term27411.getClass(), "nano", 687690824);
        setField(term27406, term27406.getClass(), "time", term27411);
        setField(term27331, term27331.getClass(), "updatedAt", term27406);
        term27416 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27417 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27421 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term27417, term27417.getClass(), "year", 2010);
        setShortField(term27417, term27417.getClass(), "month", (short) 7);
        setShortField(term27417, term27417.getClass(), "day", (short) 15);
        setField(term27416, term27416.getClass(), "date", term27417);
        setByteField(term27421, term27421.getClass(), "hour", (byte) 11);
        setByteField(term27421, term27421.getClass(), "minute", (byte) 28);
        setByteField(term27421, term27421.getClass(), "second", (byte) 5);
        setIntField(term27421, term27421.getClass(), "nano", 471613968);
        setField(term27416, term27416.getClass(), "time", term27421);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term27416;
        callMethod(klass, "setUpdatedAt", argTypes, term27331, args);
    }

};



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

public class PostStatBO_getUpdatedAt_1660850266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24572;

    public PostStatBO_getUpdatedAt_1660850266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24573 = new Long(-6792339614909987294L);
        Long term24575 = new Long(-1978508496784157882L);
        Long term24577 = new Long(0L);
        term24572 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostStatBO"));
        Object term24579 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24580 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24584 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24589 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24590 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24594 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term24572, term24572.getClass(), "id", term24573);
        setField(term24572, term24572.getClass(), "postId", term24575);
        setField(term24572, term24572.getClass(), "likeCount", term24577);
        setIntField(term24580, term24580.getClass(), "year", 2023);
        setShortField(term24580, term24580.getClass(), "month", (short) 8);
        setShortField(term24580, term24580.getClass(), "day", (short) 8);
        setField(term24579, term24579.getClass(), "date", term24580);
        setByteField(term24584, term24584.getClass(), "hour", (byte) 20);
        setByteField(term24584, term24584.getClass(), "minute", (byte) 17);
        setByteField(term24584, term24584.getClass(), "second", (byte) 40);
        setIntField(term24584, term24584.getClass(), "nano", 834219024);
        setField(term24579, term24579.getClass(), "time", term24584);
        setField(term24572, term24572.getClass(), "createdAt", term24579);
        setIntField(term24590, term24590.getClass(), "year", 2012);
        setShortField(term24590, term24590.getClass(), "month", (short) 2);
        setShortField(term24590, term24590.getClass(), "day", (short) 12);
        setField(term24589, term24589.getClass(), "date", term24590);
        setByteField(term24594, term24594.getClass(), "hour", (byte) 16);
        setByteField(term24594, term24594.getClass(), "minute", (byte) 39);
        setByteField(term24594, term24594.getClass(), "second", (byte) 57);
        setIntField(term24594, term24594.getClass(), "nano", 651756700);
        setField(term24589, term24589.getClass(), "time", term24594);
        setField(term24572, term24572.getClass(), "updatedAt", term24589);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostStatBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdatedAt", argTypes, term24572, args);
    }

};



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

public class PostStatBO_getPostId_19785609063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24491;

    public PostStatBO_getPostId_19785609063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24492 = new Long(5047215164896153648L);
        Long term24494 = new Long(6695041041196724237L);
        Long term24496 = new Long(0L);
        term24491 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostStatBO"));
        Object term24498 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24499 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24503 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24508 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24509 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24513 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term24491, term24491.getClass(), "id", term24492);
        setField(term24491, term24491.getClass(), "postId", term24494);
        setField(term24491, term24491.getClass(), "likeCount", term24496);
        setIntField(term24499, term24499.getClass(), "year", 2020);
        setShortField(term24499, term24499.getClass(), "month", (short) 1);
        setShortField(term24499, term24499.getClass(), "day", (short) 23);
        setField(term24498, term24498.getClass(), "date", term24499);
        setByteField(term24503, term24503.getClass(), "hour", (byte) 17);
        setByteField(term24503, term24503.getClass(), "minute", (byte) 24);
        setByteField(term24503, term24503.getClass(), "second", (byte) 54);
        setIntField(term24503, term24503.getClass(), "nano", 261767355);
        setField(term24498, term24498.getClass(), "time", term24503);
        setField(term24491, term24491.getClass(), "createdAt", term24498);
        setIntField(term24509, term24509.getClass(), "year", 2011);
        setShortField(term24509, term24509.getClass(), "month", (short) 1);
        setShortField(term24509, term24509.getClass(), "day", (short) 20);
        setField(term24508, term24508.getClass(), "date", term24509);
        setByteField(term24513, term24513.getClass(), "hour", (byte) 5);
        setByteField(term24513, term24513.getClass(), "minute", (byte) 23);
        setByteField(term24513, term24513.getClass(), "second", (byte) 54);
        setIntField(term24513, term24513.getClass(), "nano", 4207750);
        setField(term24508, term24508.getClass(), "time", term24513);
        setField(term24491, term24491.getClass(), "updatedAt", term24508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostStatBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPostId", argTypes, term24491, args);
    }

};



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

public class PostStatBO_getLikeCount_13138294794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24518;

    public PostStatBO_getLikeCount_13138294794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24519 = new Long(-9133417318192430290L);
        Long term24521 = new Long(3447455321955655601L);
        Long term24523 = new Long(0L);
        term24518 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostStatBO"));
        Object term24525 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24526 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24530 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24535 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24536 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24540 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term24518, term24518.getClass(), "id", term24519);
        setField(term24518, term24518.getClass(), "postId", term24521);
        setField(term24518, term24518.getClass(), "likeCount", term24523);
        setIntField(term24526, term24526.getClass(), "year", 2028);
        setShortField(term24526, term24526.getClass(), "month", (short) 3);
        setShortField(term24526, term24526.getClass(), "day", (short) 20);
        setField(term24525, term24525.getClass(), "date", term24526);
        setByteField(term24530, term24530.getClass(), "hour", (byte) 15);
        setByteField(term24530, term24530.getClass(), "minute", (byte) 5);
        setByteField(term24530, term24530.getClass(), "second", (byte) 16);
        setIntField(term24530, term24530.getClass(), "nano", 223082659);
        setField(term24525, term24525.getClass(), "time", term24530);
        setField(term24518, term24518.getClass(), "createdAt", term24525);
        setIntField(term24536, term24536.getClass(), "year", 2019);
        setShortField(term24536, term24536.getClass(), "month", (short) 4);
        setShortField(term24536, term24536.getClass(), "day", (short) 1);
        setField(term24535, term24535.getClass(), "date", term24536);
        setByteField(term24540, term24540.getClass(), "hour", (byte) 8);
        setByteField(term24540, term24540.getClass(), "minute", (byte) 11);
        setByteField(term24540, term24540.getClass(), "second", (byte) 4);
        setIntField(term24540, term24540.getClass(), "nano", 648208624);
        setField(term24535, term24535.getClass(), "time", term24540);
        setField(term24518, term24518.getClass(), "updatedAt", term24535);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostStatBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLikeCount", argTypes, term24518, args);
    }

};



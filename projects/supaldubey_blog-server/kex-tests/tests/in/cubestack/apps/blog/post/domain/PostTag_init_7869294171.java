package in.cubestack.apps.blog.post.domain;

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
import static in.cubestack.apps.blog.post.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class PostTag_init_7869294171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18012;

    public PostTag_init_7869294171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18049 = new Long(4576699120365923235L);
        term18012 = newInstance(Class.forName("in.cubestack.apps.blog.post.domain.Tag"));
        Object term18051 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18052 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18056 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18061 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18062 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18066 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term18012, term18012.getClass(), "title", "gXFNBHJSey");
        setField(term18012, term18012.getClass(), "slug", "wUcSfItZgv");
        setField(term18012, term18012.getClass(), "content", "rOfPCPHmtJ");
        setField(term18012, term18012.getClass(), "id", term18049);
        setIntField(term18052, term18052.getClass(), "year", 2021);
        setShortField(term18052, term18052.getClass(), "month", (short) 11);
        setShortField(term18052, term18052.getClass(), "day", (short) 19);
        setField(term18051, term18051.getClass(), "date", term18052);
        setByteField(term18056, term18056.getClass(), "hour", (byte) 4);
        setByteField(term18056, term18056.getClass(), "minute", (byte) 39);
        setByteField(term18056, term18056.getClass(), "second", (byte) 43);
        setIntField(term18056, term18056.getClass(), "nano", 638695514);
        setField(term18051, term18051.getClass(), "time", term18056);
        setField(term18012, term18012.getClass(), "createdAt", term18051);
        setIntField(term18062, term18062.getClass(), "year", 2015);
        setShortField(term18062, term18062.getClass(), "month", (short) 10);
        setShortField(term18062, term18062.getClass(), "day", (short) 4);
        setField(term18061, term18061.getClass(), "date", term18062);
        setByteField(term18066, term18066.getClass(), "hour", (byte) 1);
        setByteField(term18066, term18066.getClass(), "minute", (byte) 29);
        setByteField(term18066, term18066.getClass(), "second", (byte) 20);
        setIntField(term18066, term18066.getClass(), "nano", 558273892);
        setField(term18061, term18061.getClass(), "time", term18066);
        setField(term18012, term18012.getClass(), "updatedAt", term18061);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.domain.PostTag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.post.domain.Tag");
        Object[] args = new Object[1];
        args[0] = term18012;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class PostBO_getId_7537911901 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13316;

    public PostBO_getId_7537911901() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13317 = new Long(1044883697493326351L);
        Long term13319 = new Long(-7406618974062419277L);
        Class<? extends Object> term13377 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term13376 = ((Class) term13377).getDeclaredField((String) "IMAGE");
        ((Field) term13376).setAccessible(true);
        Object enum33 = ((Field) term13376).get((Object) null);
        Long term13344 = new Long(868503089567085985L);
        Long term13346 = new Long(-3277773415369003529L);
        Long term13348 = new Long(1253549421411622358L);
        Long term13350 = new Long(3666226122807672448L);
        ArrayList term13342 = new ArrayList();
        ((ArrayList) term13342).add(term13344);
        ((ArrayList) term13342).add(term13346);
        ((ArrayList) term13342).add(term13348);
        ((ArrayList) term13342).add(term13350);
        Long term13354 = new Long(3108750145697087661L);
        term13316 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO"));
        Object term13356 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13357 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13361 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13366 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13367 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13371 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term13316, term13316.getClass(), "id", term13317);
        setField(term13316, term13316.getClass(), "userId", term13319);
        setField(term13316, term13316.getClass(), "type", enum33);
        setField(term13316, term13316.getClass(), "text", "PtirvZmsGt");
        setField(term13316, term13316.getClass(), "imageIds", term13342);
        setField(term13316, term13316.getClass(), "videoId", term13354);
        setIntField(term13357, term13357.getClass(), "year", 2012);
        setShortField(term13357, term13357.getClass(), "month", (short) 5);
        setShortField(term13357, term13357.getClass(), "day", (short) 25);
        setField(term13356, term13356.getClass(), "date", term13357);
        setByteField(term13361, term13361.getClass(), "hour", (byte) 5);
        setByteField(term13361, term13361.getClass(), "minute", (byte) 8);
        setByteField(term13361, term13361.getClass(), "second", (byte) 47);
        setIntField(term13361, term13361.getClass(), "nano", 455554221);
        setField(term13356, term13356.getClass(), "time", term13361);
        setField(term13316, term13316.getClass(), "createdAt", term13356);
        setIntField(term13367, term13367.getClass(), "year", 2029);
        setShortField(term13367, term13367.getClass(), "month", (short) 11);
        setShortField(term13367, term13367.getClass(), "day", (short) 18);
        setField(term13366, term13366.getClass(), "date", term13367);
        setByteField(term13371, term13371.getClass(), "hour", (byte) 5);
        setByteField(term13371, term13371.getClass(), "minute", (byte) 36);
        setByteField(term13371, term13371.getClass(), "second", (byte) 57);
        setIntField(term13371, term13371.getClass(), "nano", 394167804);
        setField(term13366, term13366.getClass(), "time", term13371);
        setField(term13316, term13316.getClass(), "updatedAt", term13366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term13316, args);
    }

};



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

public class PostBO_setId_11838329489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15566;
     Object term15619;

    public PostBO_setId_11838329489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15567 = new Long(-7191625829563442696L);
        Long term15569 = new Long(1463379874413441830L);
        Class<? extends Object> term15622 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term15621 = ((Class) term15622).getDeclaredField((String) "TEXT");
        ((Field) term15621).setAccessible(true);
        Object enum41 = ((Field) term15621).get((Object) null);
        Long term15593 = new Long(7998051124369147543L);
        ArrayList term15591 = new ArrayList();
        ((ArrayList) term15591).add(term15593);
        Long term15597 = new Long(-1481367303699139651L);
        term15566 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO"));
        Object term15599 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15600 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15604 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15609 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15610 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15614 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term15566, term15566.getClass(), "id", term15567);
        setField(term15566, term15566.getClass(), "userId", term15569);
        setField(term15566, term15566.getClass(), "type", enum41);
        setField(term15566, term15566.getClass(), "text", "PapWxkhEWe");
        setField(term15566, term15566.getClass(), "imageIds", term15591);
        setField(term15566, term15566.getClass(), "videoId", term15597);
        setIntField(term15600, term15600.getClass(), "year", 2018);
        setShortField(term15600, term15600.getClass(), "month", (short) 9);
        setShortField(term15600, term15600.getClass(), "day", (short) 3);
        setField(term15599, term15599.getClass(), "date", term15600);
        setByteField(term15604, term15604.getClass(), "hour", (byte) 16);
        setByteField(term15604, term15604.getClass(), "minute", (byte) 48);
        setByteField(term15604, term15604.getClass(), "second", (byte) 45);
        setIntField(term15604, term15604.getClass(), "nano", 919694917);
        setField(term15599, term15599.getClass(), "time", term15604);
        setField(term15566, term15566.getClass(), "createdAt", term15599);
        setIntField(term15610, term15610.getClass(), "year", 2021);
        setShortField(term15610, term15610.getClass(), "month", (short) 8);
        setShortField(term15610, term15610.getClass(), "day", (short) 23);
        setField(term15609, term15609.getClass(), "date", term15610);
        setByteField(term15614, term15614.getClass(), "hour", (byte) 15);
        setByteField(term15614, term15614.getClass(), "minute", (byte) 43);
        setByteField(term15614, term15614.getClass(), "second", (byte) 10);
        setIntField(term15614, term15614.getClass(), "nano", 893504165);
        setField(term15609, term15609.getClass(), "time", term15614);
        setField(term15566, term15566.getClass(), "updatedAt", term15609);
        term15619 = new Long(-7709317346333670618L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term15619;
        callMethod(klass, "setId", argTypes, term15566, args);
    }

};



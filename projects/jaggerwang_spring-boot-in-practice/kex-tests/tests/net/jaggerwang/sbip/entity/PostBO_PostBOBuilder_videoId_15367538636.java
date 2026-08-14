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

public class PostBO_PostBOBuilder_videoId_15367538636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23012;
     Object term23072;

    public PostBO_PostBOBuilder_videoId_15367538636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23013 = new Long(5818741986224130131L);
        Long term23015 = new Long(370847120687610747L);
        Class<? extends Object> term23075 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term23074 = ((Class) term23075).getDeclaredField((String) "IMAGE");
        ((Field) term23074).setAccessible(true);
        Object enum65 = ((Field) term23074).get((Object) null);
        Long term23040 = new Long(-6399462725251497844L);
        Long term23042 = new Long(-4855037955202452256L);
        Long term23044 = new Long(-5903549884298836343L);
        Long term23046 = new Long(-3058119213533262883L);
        ArrayList term23038 = new ArrayList();
        ((ArrayList) term23038).add(term23040);
        ((ArrayList) term23038).add(term23042);
        ((ArrayList) term23038).add(term23044);
        ((ArrayList) term23038).add(term23046);
        Long term23050 = new Long(1950957495500453461L);
        term23012 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO$PostBOBuilder"));
        Object term23052 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23053 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23057 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23062 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23063 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23067 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term23012, term23012.getClass(), "id", term23013);
        setField(term23012, term23012.getClass(), "userId", term23015);
        setField(term23012, term23012.getClass(), "type", enum65);
        setField(term23012, term23012.getClass(), "text", "tlzpzIjMib");
        setField(term23012, term23012.getClass(), "imageIds", term23038);
        setField(term23012, term23012.getClass(), "videoId", term23050);
        setIntField(term23053, term23053.getClass(), "year", 2010);
        setShortField(term23053, term23053.getClass(), "month", (short) 9);
        setShortField(term23053, term23053.getClass(), "day", (short) 20);
        setField(term23052, term23052.getClass(), "date", term23053);
        setByteField(term23057, term23057.getClass(), "hour", (byte) 3);
        setByteField(term23057, term23057.getClass(), "minute", (byte) 41);
        setByteField(term23057, term23057.getClass(), "second", (byte) 7);
        setIntField(term23057, term23057.getClass(), "nano", 796515800);
        setField(term23052, term23052.getClass(), "time", term23057);
        setField(term23012, term23012.getClass(), "createdAt", term23052);
        setIntField(term23063, term23063.getClass(), "year", 2015);
        setShortField(term23063, term23063.getClass(), "month", (short) 10);
        setShortField(term23063, term23063.getClass(), "day", (short) 2);
        setField(term23062, term23062.getClass(), "date", term23063);
        setByteField(term23067, term23067.getClass(), "hour", (byte) 21);
        setByteField(term23067, term23067.getClass(), "minute", (byte) 18);
        setByteField(term23067, term23067.getClass(), "second", (byte) 42);
        setIntField(term23067, term23067.getClass(), "nano", 185569616);
        setField(term23062, term23062.getClass(), "time", term23067);
        setField(term23012, term23012.getClass(), "updatedAt", term23062);
        term23072 = new Long(-6423955170741487890L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO$PostBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term23072;
        callMethod(klass, "videoId", argTypes, term23012, args);
    }

};



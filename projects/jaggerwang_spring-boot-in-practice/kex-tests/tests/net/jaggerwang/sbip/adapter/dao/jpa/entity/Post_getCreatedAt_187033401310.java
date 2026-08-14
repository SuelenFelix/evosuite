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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Post_getCreatedAt_187033401310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7064;

    public Post_getCreatedAt_187033401310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7065 = new Long(-419800263764810394L);
        Long term7067 = new Long(5904678961906211249L);
        Class<? extends Object> term7118 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term7117 = ((Class) term7118).getDeclaredField((String) "TEXT");
        ((Field) term7117).setAccessible(true);
        Object enum19 = ((Field) term7117).get((Object) null);
        Long term7091 = new Long(-1820639665251914495L);
        ArrayList term7089 = new ArrayList();
        ((ArrayList) term7089).add(term7091);
        Long term7095 = new Long(3238645206498300107L);
        term7064 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post"));
        Object term7097 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7098 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7102 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7107 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7108 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7112 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7064, term7064.getClass(), "id", term7065);
        setField(term7064, term7064.getClass(), "userId", term7067);
        setField(term7064, term7064.getClass(), "type", enum19);
        setField(term7064, term7064.getClass(), "text", "JDswTTCZHV");
        setField(term7064, term7064.getClass(), "imageIds", term7089);
        setField(term7064, term7064.getClass(), "videoId", term7095);
        setIntField(term7098, term7098.getClass(), "year", 2027);
        setShortField(term7098, term7098.getClass(), "month", (short) 6);
        setShortField(term7098, term7098.getClass(), "day", (short) 20);
        setField(term7097, term7097.getClass(), "date", term7098);
        setByteField(term7102, term7102.getClass(), "hour", (byte) 23);
        setByteField(term7102, term7102.getClass(), "minute", (byte) 21);
        setByteField(term7102, term7102.getClass(), "second", (byte) 6);
        setIntField(term7102, term7102.getClass(), "nano", 897776059);
        setField(term7097, term7097.getClass(), "time", term7102);
        setField(term7064, term7064.getClass(), "createdAt", term7097);
        setIntField(term7108, term7108.getClass(), "year", 2016);
        setShortField(term7108, term7108.getClass(), "month", (short) 3);
        setShortField(term7108, term7108.getClass(), "day", (short) 20);
        setField(term7107, term7107.getClass(), "date", term7108);
        setByteField(term7112, term7112.getClass(), "hour", (byte) 0);
        setByteField(term7112, term7112.getClass(), "minute", (byte) 54);
        setByteField(term7112, term7112.getClass(), "second", (byte) 6);
        setIntField(term7112, term7112.getClass(), "nano", 183302469);
        setField(term7107, term7107.getClass(), "time", term7112);
        setField(term7064, term7064.getClass(), "updatedAt", term7107);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term7064, args);
    }

};



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

public class Post_PostBuilder_updatedAt_7116035188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26379;
     Object term26433;

    public Post_PostBuilder_updatedAt_7116035188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term26380 = new Long(2054808971423494757L);
        Long term26382 = new Long(8734518435788772658L);
        Class<? extends Object> term26444 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term26443 = ((Class) term26444).getDeclaredField((String) "IMAGE");
        ((Field) term26443).setAccessible(true);
        Object enum67 = ((Field) term26443).get((Object) null);
        Long term26407 = new Long(2289954139848415685L);
        ArrayList term26405 = new ArrayList();
        ((ArrayList) term26405).add(term26407);
        Long term26411 = new Long(-6137280723045949220L);
        term26379 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post$PostBuilder"));
        Object term26413 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26414 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26418 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26423 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26424 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26428 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26379, term26379.getClass(), "id", term26380);
        setField(term26379, term26379.getClass(), "userId", term26382);
        setField(term26379, term26379.getClass(), "type", enum67);
        setField(term26379, term26379.getClass(), "text", "WVbxuoDBcn");
        setField(term26379, term26379.getClass(), "imageIds", term26405);
        setField(term26379, term26379.getClass(), "videoId", term26411);
        setIntField(term26414, term26414.getClass(), "year", 2013);
        setShortField(term26414, term26414.getClass(), "month", (short) 11);
        setShortField(term26414, term26414.getClass(), "day", (short) 7);
        setField(term26413, term26413.getClass(), "date", term26414);
        setByteField(term26418, term26418.getClass(), "hour", (byte) 9);
        setByteField(term26418, term26418.getClass(), "minute", (byte) 3);
        setByteField(term26418, term26418.getClass(), "second", (byte) 32);
        setIntField(term26418, term26418.getClass(), "nano", 53548583);
        setField(term26413, term26413.getClass(), "time", term26418);
        setField(term26379, term26379.getClass(), "createdAt", term26413);
        setIntField(term26424, term26424.getClass(), "year", 2024);
        setShortField(term26424, term26424.getClass(), "month", (short) 11);
        setShortField(term26424, term26424.getClass(), "day", (short) 26);
        setField(term26423, term26423.getClass(), "date", term26424);
        setByteField(term26428, term26428.getClass(), "hour", (byte) 3);
        setByteField(term26428, term26428.getClass(), "minute", (byte) 8);
        setByteField(term26428, term26428.getClass(), "second", (byte) 47);
        setIntField(term26428, term26428.getClass(), "nano", 559634968);
        setField(term26423, term26423.getClass(), "time", term26428);
        setField(term26379, term26379.getClass(), "updatedAt", term26423);
        term26433 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26434 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26438 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term26434, term26434.getClass(), "year", 2018);
        setShortField(term26434, term26434.getClass(), "month", (short) 4);
        setShortField(term26434, term26434.getClass(), "day", (short) 20);
        setField(term26433, term26433.getClass(), "date", term26434);
        setByteField(term26438, term26438.getClass(), "hour", (byte) 16);
        setByteField(term26438, term26438.getClass(), "minute", (byte) 13);
        setByteField(term26438, term26438.getClass(), "second", (byte) 15);
        setIntField(term26438, term26438.getClass(), "nano", 195741881);
        setField(term26433, term26433.getClass(), "time", term26438);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post$PostBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term26433;
        callMethod(klass, "updatedAt", argTypes, term26379, args);
    }

};



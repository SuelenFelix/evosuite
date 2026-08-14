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
import java.util.LinkedList;

public class Post_init_66478233425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11240;
     Object term11242;
     Object enum34;
     Object term11265;
     Object term11268;
     Object term11270;
     Object term11280;

    public Post_init_66478233425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11240 = new Long(-8890284990655172580L);
        term11242 = new Long(-5951743062322506095L);
        Class<? extends Object> term11291 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term11290 = ((Class) term11291).getDeclaredField((String) "IMAGE");
        ((Field) term11290).setAccessible(true);
        enum34 = ((Field) term11290).get((Object) null);
        term11265 = new LinkedList();
        term11268 = new Long(768144790810175653L);
        term11270 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11271 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11275 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term11271, term11271.getClass(), "year", 2019);
        setShortField(term11271, term11271.getClass(), "month", (short) 6);
        setShortField(term11271, term11271.getClass(), "day", (short) 12);
        setField(term11270, term11270.getClass(), "date", term11271);
        setByteField(term11275, term11275.getClass(), "hour", (byte) 5);
        setByteField(term11275, term11275.getClass(), "minute", (byte) 13);
        setByteField(term11275, term11275.getClass(), "second", (byte) 8);
        setIntField(term11275, term11275.getClass(), "nano", 838117658);
        setField(term11270, term11270.getClass(), "time", term11275);
        term11280 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11281 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11285 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term11281, term11281.getClass(), "year", 2014);
        setShortField(term11281, term11281.getClass(), "month", (short) 8);
        setShortField(term11281, term11281.getClass(), "day", (short) 13);
        setField(term11280, term11280.getClass(), "date", term11281);
        setByteField(term11285, term11285.getClass(), "hour", (byte) 13);
        setByteField(term11285, term11285.getClass(), "minute", (byte) 15);
        setByteField(term11285, term11285.getClass(), "second", (byte) 51);
        setIntField(term11285, term11285.getClass(), "nano", 433726678);
        setField(term11280, term11280.getClass(), "time", term11285);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.Long");
        argTypes[2] = Class.forName("net.jaggerwang.sbip.entity.PostBO$Type");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.util.List");
        argTypes[5] = Class.forName("java.lang.Long");
        argTypes[6] = Class.forName("java.time.LocalDateTime");
        argTypes[7] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[8];
        args[0] = term11240;
        args[1] = term11242;
        args[2] = enum34;
        args[3] = "tPlsykYBqO";
        args[4] = term11265;
        args[5] = term11268;
        args[6] = term11270;
        args[7] = term11280;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



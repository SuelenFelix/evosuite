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

public class File_init_30054550425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22214;
     Object term22216;
     Object enum58;
     Object term22251;
     Object term22278;
     Object term22288;

    public File_init_30054550425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22214 = new Long(5047215164896153648L);
        term22216 = new Long(6695041041196724237L);
        Class<? extends Object> term22299 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term22298 = ((Class) term22299).getDeclaredField((String) "LOCAL");
        ((Field) term22298).setAccessible(true);
        enum58 = ((Field) term22298).get((Object) null);
        Long term22264 = new Long(-9133417318192430290L);
        term22251 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        setField(term22251, term22251.getClass(), "name", "TwfWVQGiIj");
        setField(term22251, term22251.getClass(), "size", term22264);
        setField(term22251, term22251.getClass(), "type", "gUvcueTURF");
        term22278 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22279 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22283 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term22279, term22279.getClass(), "year", 2022);
        setShortField(term22279, term22279.getClass(), "month", (short) 8);
        setShortField(term22279, term22279.getClass(), "day", (short) 16);
        setField(term22278, term22278.getClass(), "date", term22279);
        setByteField(term22283, term22283.getClass(), "hour", (byte) 4);
        setByteField(term22283, term22283.getClass(), "minute", (byte) 38);
        setByteField(term22283, term22283.getClass(), "second", (byte) 51);
        setIntField(term22283, term22283.getClass(), "nano", 348952212);
        setField(term22278, term22278.getClass(), "time", term22283);
        term22288 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22289 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22293 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term22289, term22289.getClass(), "year", 2016);
        setShortField(term22289, term22289.getClass(), "month", (short) 7);
        setShortField(term22289, term22289.getClass(), "day", (short) 21);
        setField(term22288, term22288.getClass(), "date", term22289);
        setByteField(term22293, term22293.getClass(), "hour", (byte) 22);
        setByteField(term22293, term22293.getClass(), "minute", (byte) 2);
        setByteField(term22293, term22293.getClass(), "second", (byte) 21);
        setIntField(term22293, term22293.getClass(), "nano", 729266668);
        setField(term22288, term22288.getClass(), "time", term22293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.Long");
        argTypes[2] = Class.forName("net.jaggerwang.sbip.entity.FileBO$Region");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta");
        argTypes[6] = Class.forName("java.time.LocalDateTime");
        argTypes[7] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[8];
        args[0] = term22214;
        args[1] = term22216;
        args[2] = enum58;
        args[3] = "qCpEbQDHdF";
        args[4] = "AHbZyFOmlo";
        args[5] = term22251;
        args[6] = term22278;
        args[7] = term22288;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



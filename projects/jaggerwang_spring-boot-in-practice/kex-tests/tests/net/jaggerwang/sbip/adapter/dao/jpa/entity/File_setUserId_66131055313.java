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

public class File_setUserId_66131055313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18282;
     Object term18367;

    public File_setUserId_66131055313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18283 = new Long(-6237686742902369498L);
        Long term18285 = new Long(-2286229228641472715L);
        Class<? extends Object> term18370 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term18369 = ((Class) term18370).getDeclaredField((String) "LOCAL");
        ((Field) term18369).setAccessible(true);
        Object enum47 = ((Field) term18369).get((Object) null);
        Long term18333 = new Long(7464122056779140588L);
        term18282 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File"));
        Object term18320 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term18347 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18348 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18352 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18357 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18358 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18362 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term18282, term18282.getClass(), "id", term18283);
        setField(term18282, term18282.getClass(), "userId", term18285);
        setField(term18282, term18282.getClass(), "region", enum47);
        setField(term18282, term18282.getClass(), "bucket", "JmcmxoGhIK");
        setField(term18282, term18282.getClass(), "path", "jXzmYyrnnT");
        setField(term18320, term18320.getClass(), "name", "igCAtimmYB");
        setField(term18320, term18320.getClass(), "size", term18333);
        setField(term18320, term18320.getClass(), "type", "DyiXbeYIaN");
        setField(term18282, term18282.getClass(), "meta", term18320);
        setIntField(term18348, term18348.getClass(), "year", 2020);
        setShortField(term18348, term18348.getClass(), "month", (short) 7);
        setShortField(term18348, term18348.getClass(), "day", (short) 24);
        setField(term18347, term18347.getClass(), "date", term18348);
        setByteField(term18352, term18352.getClass(), "hour", (byte) 22);
        setByteField(term18352, term18352.getClass(), "minute", (byte) 16);
        setByteField(term18352, term18352.getClass(), "second", (byte) 59);
        setIntField(term18352, term18352.getClass(), "nano", 588569833);
        setField(term18347, term18347.getClass(), "time", term18352);
        setField(term18282, term18282.getClass(), "createdAt", term18347);
        setIntField(term18358, term18358.getClass(), "year", 2019);
        setShortField(term18358, term18358.getClass(), "month", (short) 8);
        setShortField(term18358, term18358.getClass(), "day", (short) 6);
        setField(term18357, term18357.getClass(), "date", term18358);
        setByteField(term18362, term18362.getClass(), "hour", (byte) 5);
        setByteField(term18362, term18362.getClass(), "minute", (byte) 32);
        setByteField(term18362, term18362.getClass(), "second", (byte) 47);
        setIntField(term18362, term18362.getClass(), "nano", 73220317);
        setField(term18357, term18357.getClass(), "time", term18362);
        setField(term18282, term18282.getClass(), "updatedAt", term18357);
        term18367 = new Long(6542357174275680335L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term18367;
        callMethod(klass, "setUserId", argTypes, term18282, args);
    }

};



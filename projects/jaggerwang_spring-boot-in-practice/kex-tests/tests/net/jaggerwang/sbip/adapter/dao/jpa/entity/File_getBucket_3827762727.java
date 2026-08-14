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

public class File_getBucket_3827762727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16198;

    public File_getBucket_3827762727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16199 = new Long(1867943942587005261L);
        Long term16201 = new Long(-9168517519350392654L);
        Class<? extends Object> term16284 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term16283 = ((Class) term16284).getDeclaredField((String) "LOCAL");
        ((Field) term16283).setAccessible(true);
        Object enum41 = ((Field) term16283).get((Object) null);
        Long term16249 = new Long(4828755228445882127L);
        term16198 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File"));
        Object term16236 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term16263 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16264 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16268 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16273 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16274 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16278 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term16198, term16198.getClass(), "id", term16199);
        setField(term16198, term16198.getClass(), "userId", term16201);
        setField(term16198, term16198.getClass(), "region", enum41);
        setField(term16198, term16198.getClass(), "bucket", "VYkqXKVlAJ");
        setField(term16198, term16198.getClass(), "path", "XkIoWJRNwN");
        setField(term16236, term16236.getClass(), "name", "aNWLJdrZMq");
        setField(term16236, term16236.getClass(), "size", term16249);
        setField(term16236, term16236.getClass(), "type", "HHmNoYxIGj");
        setField(term16198, term16198.getClass(), "meta", term16236);
        setIntField(term16264, term16264.getClass(), "year", 2023);
        setShortField(term16264, term16264.getClass(), "month", (short) 8);
        setShortField(term16264, term16264.getClass(), "day", (short) 8);
        setField(term16263, term16263.getClass(), "date", term16264);
        setByteField(term16268, term16268.getClass(), "hour", (byte) 20);
        setByteField(term16268, term16268.getClass(), "minute", (byte) 17);
        setByteField(term16268, term16268.getClass(), "second", (byte) 40);
        setIntField(term16268, term16268.getClass(), "nano", 834219024);
        setField(term16263, term16263.getClass(), "time", term16268);
        setField(term16198, term16198.getClass(), "createdAt", term16263);
        setIntField(term16274, term16274.getClass(), "year", 2012);
        setShortField(term16274, term16274.getClass(), "month", (short) 2);
        setShortField(term16274, term16274.getClass(), "day", (short) 12);
        setField(term16273, term16273.getClass(), "date", term16274);
        setByteField(term16278, term16278.getClass(), "hour", (byte) 16);
        setByteField(term16278, term16278.getClass(), "minute", (byte) 39);
        setByteField(term16278, term16278.getClass(), "second", (byte) 57);
        setIntField(term16278, term16278.getClass(), "nano", 651756700);
        setField(term16273, term16273.getClass(), "time", term16278);
        setField(term16198, term16198.getClass(), "updatedAt", term16273);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBucket", argTypes, term16198, args);
    }

};



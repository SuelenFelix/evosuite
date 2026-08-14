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

public class File_setBucket_146313754415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18978;

    public File_setBucket_146313754415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18979 = new Long(4354242424632479389L);
        Long term18981 = new Long(-4146453776626172590L);
        Class<? extends Object> term19076 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term19075 = ((Class) term19076).getDeclaredField((String) "LOCAL");
        ((Field) term19075).setAccessible(true);
        Object enum49 = ((Field) term19075).get((Object) null);
        Long term19029 = new Long(-5876259280451647338L);
        term18978 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File"));
        Object term19016 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term19043 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19044 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19048 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19053 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19054 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19058 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term18978, term18978.getClass(), "id", term18979);
        setField(term18978, term18978.getClass(), "userId", term18981);
        setField(term18978, term18978.getClass(), "region", enum49);
        setField(term18978, term18978.getClass(), "bucket", "YpJbIgJWWv");
        setField(term18978, term18978.getClass(), "path", "JppkknKVOw");
        setField(term19016, term19016.getClass(), "name", "iljANwuEjk");
        setField(term19016, term19016.getClass(), "size", term19029);
        setField(term19016, term19016.getClass(), "type", "kNqaJKIATy");
        setField(term18978, term18978.getClass(), "meta", term19016);
        setIntField(term19044, term19044.getClass(), "year", 2011);
        setShortField(term19044, term19044.getClass(), "month", (short) 9);
        setShortField(term19044, term19044.getClass(), "day", (short) 7);
        setField(term19043, term19043.getClass(), "date", term19044);
        setByteField(term19048, term19048.getClass(), "hour", (byte) 0);
        setByteField(term19048, term19048.getClass(), "minute", (byte) 51);
        setByteField(term19048, term19048.getClass(), "second", (byte) 44);
        setIntField(term19048, term19048.getClass(), "nano", 245610060);
        setField(term19043, term19043.getClass(), "time", term19048);
        setField(term18978, term18978.getClass(), "createdAt", term19043);
        setIntField(term19054, term19054.getClass(), "year", 2018);
        setShortField(term19054, term19054.getClass(), "month", (short) 1);
        setShortField(term19054, term19054.getClass(), "day", (short) 29);
        setField(term19053, term19053.getClass(), "date", term19054);
        setByteField(term19058, term19058.getClass(), "hour", (byte) 22);
        setByteField(term19058, term19058.getClass(), "minute", (byte) 20);
        setByteField(term19058, term19058.getClass(), "second", (byte) 36);
        setIntField(term19058, term19058.getClass(), "nano", 74678080);
        setField(term19053, term19053.getClass(), "time", term19058);
        setField(term18978, term18978.getClass(), "updatedAt", term19053);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vKQukfbJUd";
        callMethod(klass, "setBucket", argTypes, term18978, args);
    }

};



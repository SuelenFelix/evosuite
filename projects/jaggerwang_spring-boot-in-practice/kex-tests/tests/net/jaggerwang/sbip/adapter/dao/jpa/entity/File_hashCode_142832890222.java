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

public class File_hashCode_142832890222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21520;

    public File_hashCode_142832890222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21521 = new Long(1377567570761089535L);
        Long term21523 = new Long(-8531377551015443915L);
        Class<? extends Object> term21606 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term21605 = ((Class) term21606).getDeclaredField((String) "LOCAL");
        ((Field) term21605).setAccessible(true);
        Object enum56 = ((Field) term21605).get((Object) null);
        Long term21571 = new Long(-3048863932438585863L);
        term21520 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File"));
        Object term21558 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term21585 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21586 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21590 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21595 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21596 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21600 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term21520, term21520.getClass(), "id", term21521);
        setField(term21520, term21520.getClass(), "userId", term21523);
        setField(term21520, term21520.getClass(), "region", enum56);
        setField(term21520, term21520.getClass(), "bucket", "GrqozDKFOk");
        setField(term21520, term21520.getClass(), "path", "CFyoseFGLF");
        setField(term21558, term21558.getClass(), "name", "SFqCrhEWLm");
        setField(term21558, term21558.getClass(), "size", term21571);
        setField(term21558, term21558.getClass(), "type", "GZdcJyZntS");
        setField(term21520, term21520.getClass(), "meta", term21558);
        setIntField(term21586, term21586.getClass(), "year", 2012);
        setShortField(term21586, term21586.getClass(), "month", (short) 2);
        setShortField(term21586, term21586.getClass(), "day", (short) 18);
        setField(term21585, term21585.getClass(), "date", term21586);
        setByteField(term21590, term21590.getClass(), "hour", (byte) 4);
        setByteField(term21590, term21590.getClass(), "minute", (byte) 27);
        setByteField(term21590, term21590.getClass(), "second", (byte) 19);
        setIntField(term21590, term21590.getClass(), "nano", 948215601);
        setField(term21585, term21585.getClass(), "time", term21590);
        setField(term21520, term21520.getClass(), "createdAt", term21585);
        setIntField(term21596, term21596.getClass(), "year", 2029);
        setShortField(term21596, term21596.getClass(), "month", (short) 11);
        setShortField(term21596, term21596.getClass(), "day", (short) 23);
        setField(term21595, term21595.getClass(), "date", term21596);
        setByteField(term21600, term21600.getClass(), "hour", (byte) 18);
        setByteField(term21600, term21600.getClass(), "minute", (byte) 47);
        setByteField(term21600, term21600.getClass(), "second", (byte) 36);
        setIntField(term21600, term21600.getClass(), "nano", 43248731);
        setField(term21595, term21595.getClass(), "time", term21600);
        setField(term21520, term21520.getClass(), "updatedAt", term21595);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term21520, args);
    }

};



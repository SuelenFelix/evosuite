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

public class FileBO_setCreatedAt_104095787715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9133;
     Object term9218;

    public FileBO_setCreatedAt_104095787715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9134 = new Long(6689117472719450333L);
        Long term9136 = new Long(5836128569274066678L);
        Class<? extends Object> term9229 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term9228 = ((Class) term9229).getDeclaredField((String) "LOCAL");
        ((Field) term9228).setAccessible(true);
        Object enum24 = ((Field) term9228).get((Object) null);
        Long term9184 = new Long(-2177368829816872572L);
        term9133 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO"));
        Object term9171 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term9198 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9199 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9203 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9208 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9209 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9213 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term9133, term9133.getClass(), "id", term9134);
        setField(term9133, term9133.getClass(), "userId", term9136);
        setField(term9133, term9133.getClass(), "region", enum24);
        setField(term9133, term9133.getClass(), "bucket", "xIeFjkHkOe");
        setField(term9133, term9133.getClass(), "path", "SdCKLMIYnX");
        setField(term9171, term9171.getClass(), "name", "OJJtVNPyKZ");
        setField(term9171, term9171.getClass(), "size", term9184);
        setField(term9171, term9171.getClass(), "type", "AKNapTAfmD");
        setField(term9133, term9133.getClass(), "meta", term9171);
        setIntField(term9199, term9199.getClass(), "year", 2024);
        setShortField(term9199, term9199.getClass(), "month", (short) 5);
        setShortField(term9199, term9199.getClass(), "day", (short) 6);
        setField(term9198, term9198.getClass(), "date", term9199);
        setByteField(term9203, term9203.getClass(), "hour", (byte) 20);
        setByteField(term9203, term9203.getClass(), "minute", (byte) 14);
        setByteField(term9203, term9203.getClass(), "second", (byte) 27);
        setIntField(term9203, term9203.getClass(), "nano", 900636101);
        setField(term9198, term9198.getClass(), "time", term9203);
        setField(term9133, term9133.getClass(), "createdAt", term9198);
        setIntField(term9209, term9209.getClass(), "year", 2021);
        setShortField(term9209, term9209.getClass(), "month", (short) 4);
        setShortField(term9209, term9209.getClass(), "day", (short) 17);
        setField(term9208, term9208.getClass(), "date", term9209);
        setByteField(term9213, term9213.getClass(), "hour", (byte) 4);
        setByteField(term9213, term9213.getClass(), "minute", (byte) 11);
        setByteField(term9213, term9213.getClass(), "second", (byte) 16);
        setIntField(term9213, term9213.getClass(), "nano", 509895858);
        setField(term9208, term9208.getClass(), "time", term9213);
        setField(term9133, term9133.getClass(), "updatedAt", term9208);
        term9218 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9219 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9223 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term9219, term9219.getClass(), "year", 2011);
        setShortField(term9219, term9219.getClass(), "month", (short) 6);
        setShortField(term9219, term9219.getClass(), "day", (short) 26);
        setField(term9218, term9218.getClass(), "date", term9219);
        setByteField(term9223, term9223.getClass(), "hour", (byte) 22);
        setByteField(term9223, term9223.getClass(), "minute", (byte) 39);
        setByteField(term9223, term9223.getClass(), "second", (byte) 11);
        setIntField(term9223, term9223.getClass(), "nano", 686293604);
        setField(term9218, term9218.getClass(), "time", term9223);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.FileBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term9218;
        callMethod(klass, "setCreatedAt", argTypes, term9133, args);
    }

};



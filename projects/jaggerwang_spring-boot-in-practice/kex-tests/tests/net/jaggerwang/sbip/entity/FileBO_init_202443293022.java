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

public class FileBO_init_202443293022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11237;
     Object term11239;
     Object enum30;
     Object term11274;
     Object term11301;
     Object term11311;

    public FileBO_init_202443293022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11237 = new Long(-3936701866695933852L);
        term11239 = new Long(1215116475929634177L);
        Class<? extends Object> term11322 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term11321 = ((Class) term11322).getDeclaredField((String) "LOCAL");
        ((Field) term11321).setAccessible(true);
        enum30 = ((Field) term11321).get((Object) null);
        Long term11287 = new Long(1597484336218508869L);
        term11274 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        setField(term11274, term11274.getClass(), "name", "XkIoWJRNwN");
        setField(term11274, term11274.getClass(), "size", term11287);
        setField(term11274, term11274.getClass(), "type", "aNWLJdrZMq");
        term11301 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11302 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11306 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term11302, term11302.getClass(), "year", 2028);
        setShortField(term11302, term11302.getClass(), "month", (short) 1);
        setShortField(term11302, term11302.getClass(), "day", (short) 18);
        setField(term11301, term11301.getClass(), "date", term11302);
        setByteField(term11306, term11306.getClass(), "hour", (byte) 12);
        setByteField(term11306, term11306.getClass(), "minute", (byte) 4);
        setByteField(term11306, term11306.getClass(), "second", (byte) 39);
        setIntField(term11306, term11306.getClass(), "nano", 651287093);
        setField(term11301, term11301.getClass(), "time", term11306);
        term11311 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11312 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11316 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term11312, term11312.getClass(), "year", 2027);
        setShortField(term11312, term11312.getClass(), "month", (short) 7);
        setShortField(term11312, term11312.getClass(), "day", (short) 23);
        setField(term11311, term11311.getClass(), "date", term11312);
        setByteField(term11316, term11316.getClass(), "hour", (byte) 12);
        setByteField(term11316, term11316.getClass(), "minute", (byte) 6);
        setByteField(term11316, term11316.getClass(), "second", (byte) 19);
        setIntField(term11316, term11316.getClass(), "nano", 8025683);
        setField(term11311, term11311.getClass(), "time", term11316);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.FileBO");
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
        args[0] = term11237;
        args[1] = term11239;
        args[2] = enum30;
        args[3] = "MwwjNtdOFT";
        args[4] = "VYkqXKVlAJ";
        args[5] = term11274;
        args[6] = term11301;
        args[7] = term11311;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



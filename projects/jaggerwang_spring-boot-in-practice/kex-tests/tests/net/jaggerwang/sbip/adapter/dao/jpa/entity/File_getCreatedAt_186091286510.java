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

public class File_getCreatedAt_186091286510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17239;

    public File_getCreatedAt_186091286510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17240 = new Long(5818741986224130131L);
        Long term17242 = new Long(370847120687610747L);
        Class<? extends Object> term17325 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term17324 = ((Class) term17325).getDeclaredField((String) "LOCAL");
        ((Field) term17324).setAccessible(true);
        Object enum44 = ((Field) term17324).get((Object) null);
        Long term17290 = new Long(-6399462725251497844L);
        term17239 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File"));
        Object term17277 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term17304 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17305 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17309 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17314 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17315 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17319 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term17239, term17239.getClass(), "id", term17240);
        setField(term17239, term17239.getClass(), "userId", term17242);
        setField(term17239, term17239.getClass(), "region", enum44);
        setField(term17239, term17239.getClass(), "bucket", "PapWxkhEWe");
        setField(term17239, term17239.getClass(), "path", "smnHEqRFRx");
        setField(term17277, term17277.getClass(), "name", "XYtryyobou");
        setField(term17277, term17277.getClass(), "size", term17290);
        setField(term17277, term17277.getClass(), "type", "OYbzXylRWW");
        setField(term17239, term17239.getClass(), "meta", term17277);
        setIntField(term17305, term17305.getClass(), "year", 2024);
        setShortField(term17305, term17305.getClass(), "month", (short) 9);
        setShortField(term17305, term17305.getClass(), "day", (short) 7);
        setField(term17304, term17304.getClass(), "date", term17305);
        setByteField(term17309, term17309.getClass(), "hour", (byte) 2);
        setByteField(term17309, term17309.getClass(), "minute", (byte) 37);
        setByteField(term17309, term17309.getClass(), "second", (byte) 4);
        setIntField(term17309, term17309.getClass(), "nano", 236043949);
        setField(term17304, term17304.getClass(), "time", term17309);
        setField(term17239, term17239.getClass(), "createdAt", term17304);
        setIntField(term17315, term17315.getClass(), "year", 2025);
        setShortField(term17315, term17315.getClass(), "month", (short) 7);
        setShortField(term17315, term17315.getClass(), "day", (short) 4);
        setField(term17314, term17314.getClass(), "date", term17315);
        setByteField(term17319, term17319.getClass(), "hour", (byte) 18);
        setByteField(term17319, term17319.getClass(), "minute", (byte) 13);
        setByteField(term17319, term17319.getClass(), "second", (byte) 37);
        setIntField(term17319, term17319.getClass(), "nano", 681447348);
        setField(term17314, term17314.getClass(), "time", term17319);
        setField(term17239, term17239.getClass(), "updatedAt", term17314);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term17239, args);
    }

};



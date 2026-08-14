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

public class File_FileBuilder_userId_3459077212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term359;
     Object term444;

    public File_FileBuilder_userId_3459077212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term360 = new Long(5270370404989704783L);
        Long term362 = new Long(7411271909051562686L);
        Class<? extends Object> term447 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term446 = ((Class) term447).getDeclaredField((String) "LOCAL");
        ((Field) term446).setAccessible(true);
        Object enum1 = ((Field) term446).get((Object) null);
        Long term410 = new Long(4872422362414183754L);
        term359 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File$FileBuilder"));
        Object term397 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term424 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term425 = newInstance(Class.forName("java.time.LocalDate"));
        Object term429 = newInstance(Class.forName("java.time.LocalTime"));
        Object term434 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term435 = newInstance(Class.forName("java.time.LocalDate"));
        Object term439 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term359, term359.getClass(), "id", term360);
        setField(term359, term359.getClass(), "userId", term362);
        setField(term359, term359.getClass(), "region", enum1);
        setField(term359, term359.getClass(), "bucket", "jJCZpVmanW");
        setField(term359, term359.getClass(), "path", "EGtDIRbSSb");
        setField(term397, term397.getClass(), "name", "SzjVpOQTyS");
        setField(term397, term397.getClass(), "size", term410);
        setField(term397, term397.getClass(), "type", "MjGYSRKTNF");
        setField(term359, term359.getClass(), "meta", term397);
        setIntField(term425, term425.getClass(), "year", 2015);
        setShortField(term425, term425.getClass(), "month", (short) 9);
        setShortField(term425, term425.getClass(), "day", (short) 19);
        setField(term424, term424.getClass(), "date", term425);
        setByteField(term429, term429.getClass(), "hour", (byte) 9);
        setByteField(term429, term429.getClass(), "minute", (byte) 4);
        setByteField(term429, term429.getClass(), "second", (byte) 10);
        setIntField(term429, term429.getClass(), "nano", 401765865);
        setField(term424, term424.getClass(), "time", term429);
        setField(term359, term359.getClass(), "createdAt", term424);
        setIntField(term435, term435.getClass(), "year", 2015);
        setShortField(term435, term435.getClass(), "month", (short) 4);
        setShortField(term435, term435.getClass(), "day", (short) 14);
        setField(term434, term434.getClass(), "date", term435);
        setByteField(term439, term439.getClass(), "hour", (byte) 18);
        setByteField(term439, term439.getClass(), "minute", (byte) 24);
        setByteField(term439, term439.getClass(), "second", (byte) 32);
        setIntField(term439, term439.getClass(), "nano", 369233818);
        setField(term434, term434.getClass(), "time", term439);
        setField(term359, term359.getClass(), "updatedAt", term434);
        term444 = new Long(6811161968424632369L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File$FileBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term444;
        callMethod(klass, "userId", argTypes, term359, args);
    }

};



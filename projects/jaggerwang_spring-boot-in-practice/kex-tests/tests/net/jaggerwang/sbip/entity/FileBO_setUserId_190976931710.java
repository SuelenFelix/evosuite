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

public class FileBO_setUserId_190976931710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7305;
     Object term7390;

    public FileBO_setUserId_190976931710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7306 = new Long(6682528376118987775L);
        Long term7308 = new Long(682356318767179819L);
        Class<? extends Object> term7393 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term7392 = ((Class) term7393).getDeclaredField((String) "LOCAL");
        ((Field) term7392).setAccessible(true);
        Object enum19 = ((Field) term7392).get((Object) null);
        Long term7356 = new Long(-7291743527973326814L);
        term7305 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO"));
        Object term7343 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term7370 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7371 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7375 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7380 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7381 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7385 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7305, term7305.getClass(), "id", term7306);
        setField(term7305, term7305.getClass(), "userId", term7308);
        setField(term7305, term7305.getClass(), "region", enum19);
        setField(term7305, term7305.getClass(), "bucket", "QXzGXbEXMu");
        setField(term7305, term7305.getClass(), "path", "qxSDVejjiY");
        setField(term7343, term7343.getClass(), "name", "xBsXSDjXYK");
        setField(term7343, term7343.getClass(), "size", term7356);
        setField(term7343, term7343.getClass(), "type", "sEnIVFtZuQ");
        setField(term7305, term7305.getClass(), "meta", term7343);
        setIntField(term7371, term7371.getClass(), "year", 2015);
        setShortField(term7371, term7371.getClass(), "month", (short) 12);
        setShortField(term7371, term7371.getClass(), "day", (short) 23);
        setField(term7370, term7370.getClass(), "date", term7371);
        setByteField(term7375, term7375.getClass(), "hour", (byte) 14);
        setByteField(term7375, term7375.getClass(), "minute", (byte) 17);
        setByteField(term7375, term7375.getClass(), "second", (byte) 50);
        setIntField(term7375, term7375.getClass(), "nano", 325544804);
        setField(term7370, term7370.getClass(), "time", term7375);
        setField(term7305, term7305.getClass(), "createdAt", term7370);
        setIntField(term7381, term7381.getClass(), "year", 2027);
        setShortField(term7381, term7381.getClass(), "month", (short) 11);
        setShortField(term7381, term7381.getClass(), "day", (short) 8);
        setField(term7380, term7380.getClass(), "date", term7381);
        setByteField(term7385, term7385.getClass(), "hour", (byte) 11);
        setByteField(term7385, term7385.getClass(), "minute", (byte) 59);
        setByteField(term7385, term7385.getClass(), "second", (byte) 14);
        setIntField(term7385, term7385.getClass(), "nano", 322375591);
        setField(term7380, term7380.getClass(), "time", term7385);
        setField(term7305, term7305.getClass(), "updatedAt", term7380);
        term7390 = new Long(-5963439350418910964L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.FileBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term7390;
        callMethod(klass, "setUserId", argTypes, term7305, args);
    }

};



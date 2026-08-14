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

public class File_getId_13535000444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15157;

    public File_getId_13535000444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15158 = new Long(1133267598258375793L);
        Long term15160 = new Long(2990264647913003810L);
        Class<? extends Object> term15243 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term15242 = ((Class) term15243).getDeclaredField((String) "LOCAL");
        ((Field) term15242).setAccessible(true);
        Object enum38 = ((Field) term15242).get((Object) null);
        Long term15208 = new Long(-2195794659127490022L);
        term15157 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File"));
        Object term15195 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term15222 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15223 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15227 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15232 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15233 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15237 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term15157, term15157.getClass(), "id", term15158);
        setField(term15157, term15157.getClass(), "userId", term15160);
        setField(term15157, term15157.getClass(), "region", enum38);
        setField(term15157, term15157.getClass(), "bucket", "yVMkkQhvmN");
        setField(term15157, term15157.getClass(), "path", "mvrkADEgpp");
        setField(term15195, term15195.getClass(), "name", "pXOkjyeIRb");
        setField(term15195, term15195.getClass(), "size", term15208);
        setField(term15195, term15195.getClass(), "type", "GgZWSjxjyE");
        setField(term15157, term15157.getClass(), "meta", term15195);
        setIntField(term15223, term15223.getClass(), "year", 2020);
        setShortField(term15223, term15223.getClass(), "month", (short) 1);
        setShortField(term15223, term15223.getClass(), "day", (short) 23);
        setField(term15222, term15222.getClass(), "date", term15223);
        setByteField(term15227, term15227.getClass(), "hour", (byte) 17);
        setByteField(term15227, term15227.getClass(), "minute", (byte) 24);
        setByteField(term15227, term15227.getClass(), "second", (byte) 54);
        setIntField(term15227, term15227.getClass(), "nano", 261767355);
        setField(term15222, term15222.getClass(), "time", term15227);
        setField(term15157, term15157.getClass(), "createdAt", term15222);
        setIntField(term15233, term15233.getClass(), "year", 2011);
        setShortField(term15233, term15233.getClass(), "month", (short) 1);
        setShortField(term15233, term15233.getClass(), "day", (short) 20);
        setField(term15232, term15232.getClass(), "date", term15233);
        setByteField(term15237, term15237.getClass(), "hour", (byte) 5);
        setByteField(term15237, term15237.getClass(), "minute", (byte) 23);
        setByteField(term15237, term15237.getClass(), "second", (byte) 54);
        setIntField(term15237, term15237.getClass(), "nano", 4207750);
        setField(term15232, term15232.getClass(), "time", term15237);
        setField(term15157, term15157.getClass(), "updatedAt", term15232);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term15157, args);
    }

};



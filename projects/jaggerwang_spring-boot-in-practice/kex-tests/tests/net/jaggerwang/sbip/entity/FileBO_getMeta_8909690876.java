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

public class FileBO_getMeta_8909690876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5915;

    public FileBO_getMeta_8909690876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5916 = new Long(5953383087795962419L);
        Long term5918 = new Long(7994303628307559416L);
        Class<? extends Object> term6001 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term6000 = ((Class) term6001).getDeclaredField((String) "LOCAL");
        ((Field) term6000).setAccessible(true);
        Object enum15 = ((Field) term6000).get((Object) null);
        Long term5966 = new Long(2443640364875054177L);
        term5915 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO"));
        Object term5953 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term5980 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5981 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5985 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5990 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5991 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5995 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5915, term5915.getClass(), "id", term5916);
        setField(term5915, term5915.getClass(), "userId", term5918);
        setField(term5915, term5915.getClass(), "region", enum15);
        setField(term5915, term5915.getClass(), "bucket", "PkWMRdJcBb");
        setField(term5915, term5915.getClass(), "path", "jSpAteRute");
        setField(term5953, term5953.getClass(), "name", "swZVeJAxjt");
        setField(term5953, term5953.getClass(), "size", term5966);
        setField(term5953, term5953.getClass(), "type", "xOcJIiQQDu");
        setField(term5915, term5915.getClass(), "meta", term5953);
        setIntField(term5981, term5981.getClass(), "year", 2012);
        setShortField(term5981, term5981.getClass(), "month", (short) 3);
        setShortField(term5981, term5981.getClass(), "day", (short) 27);
        setField(term5980, term5980.getClass(), "date", term5981);
        setByteField(term5985, term5985.getClass(), "hour", (byte) 17);
        setByteField(term5985, term5985.getClass(), "minute", (byte) 49);
        setByteField(term5985, term5985.getClass(), "second", (byte) 24);
        setIntField(term5985, term5985.getClass(), "nano", 530647398);
        setField(term5980, term5980.getClass(), "time", term5985);
        setField(term5915, term5915.getClass(), "createdAt", term5980);
        setIntField(term5991, term5991.getClass(), "year", 2010);
        setShortField(term5991, term5991.getClass(), "month", (short) 6);
        setShortField(term5991, term5991.getClass(), "day", (short) 14);
        setField(term5990, term5990.getClass(), "date", term5991);
        setByteField(term5995, term5995.getClass(), "hour", (byte) 6);
        setByteField(term5995, term5995.getClass(), "minute", (byte) 22);
        setByteField(term5995, term5995.getClass(), "second", (byte) 20);
        setIntField(term5995, term5995.getClass(), "nano", 25133051);
        setField(term5990, term5990.getClass(), "time", term5995);
        setField(term5915, term5915.getClass(), "updatedAt", term5990);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.FileBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMeta", argTypes, term5915, args);
    }

};



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

public class FileBO_getPath_15671686215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5568;

    public FileBO_getPath_15671686215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5569 = new Long(3825396310311739952L);
        Long term5571 = new Long(-3838084482494604218L);
        Class<? extends Object> term5654 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term5653 = ((Class) term5654).getDeclaredField((String) "LOCAL");
        ((Field) term5653).setAccessible(true);
        Object enum14 = ((Field) term5653).get((Object) null);
        Long term5619 = new Long(3892018155439224435L);
        term5568 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO"));
        Object term5606 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term5633 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5634 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5638 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5643 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5644 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5648 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5568, term5568.getClass(), "id", term5569);
        setField(term5568, term5568.getClass(), "userId", term5571);
        setField(term5568, term5568.getClass(), "region", enum14);
        setField(term5568, term5568.getClass(), "bucket", "cAPeiZHKGJ");
        setField(term5568, term5568.getClass(), "path", "LvJFtLBaxj");
        setField(term5606, term5606.getClass(), "name", "PHvxnGHptP");
        setField(term5606, term5606.getClass(), "size", term5619);
        setField(term5606, term5606.getClass(), "type", "TimdotUuNC");
        setField(term5568, term5568.getClass(), "meta", term5606);
        setIntField(term5634, term5634.getClass(), "year", 2016);
        setShortField(term5634, term5634.getClass(), "month", (short) 6);
        setShortField(term5634, term5634.getClass(), "day", (short) 15);
        setField(term5633, term5633.getClass(), "date", term5634);
        setByteField(term5638, term5638.getClass(), "hour", (byte) 21);
        setByteField(term5638, term5638.getClass(), "minute", (byte) 23);
        setByteField(term5638, term5638.getClass(), "second", (byte) 23);
        setIntField(term5638, term5638.getClass(), "nano", 433372070);
        setField(term5633, term5633.getClass(), "time", term5638);
        setField(term5568, term5568.getClass(), "createdAt", term5633);
        setIntField(term5644, term5644.getClass(), "year", 2012);
        setShortField(term5644, term5644.getClass(), "month", (short) 8);
        setShortField(term5644, term5644.getClass(), "day", (short) 25);
        setField(term5643, term5643.getClass(), "date", term5644);
        setByteField(term5648, term5648.getClass(), "hour", (byte) 19);
        setByteField(term5648, term5648.getClass(), "minute", (byte) 49);
        setByteField(term5648, term5648.getClass(), "second", (byte) 8);
        setIntField(term5648, term5648.getClass(), "nano", 912685024);
        setField(term5643, term5643.getClass(), "time", term5648);
        setField(term5568, term5568.getClass(), "updatedAt", term5643);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.FileBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPath", argTypes, term5568, args);
    }

};



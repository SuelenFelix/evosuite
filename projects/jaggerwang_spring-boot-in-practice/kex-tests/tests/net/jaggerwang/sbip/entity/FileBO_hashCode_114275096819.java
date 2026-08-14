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

public class FileBO_hashCode_114275096819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10543;

    public FileBO_hashCode_114275096819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10544 = new Long(-8033714905181142681L);
        Long term10546 = new Long(-9040825890007374809L);
        Class<? extends Object> term10629 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term10628 = ((Class) term10629).getDeclaredField((String) "LOCAL");
        ((Field) term10628).setAccessible(true);
        Object enum28 = ((Field) term10628).get((Object) null);
        Long term10594 = new Long(1368340889161782793L);
        term10543 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO"));
        Object term10581 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term10608 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10609 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10613 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10618 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10619 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10623 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term10543, term10543.getClass(), "id", term10544);
        setField(term10543, term10543.getClass(), "userId", term10546);
        setField(term10543, term10543.getClass(), "region", enum28);
        setField(term10543, term10543.getClass(), "bucket", "GgZWSjxjyE");
        setField(term10543, term10543.getClass(), "path", "EeBVbzjcCI");
        setField(term10581, term10581.getClass(), "name", "UfQtPRyWRC");
        setField(term10581, term10581.getClass(), "size", term10594);
        setField(term10581, term10581.getClass(), "type", "FPvxVzzSvD");
        setField(term10543, term10543.getClass(), "meta", term10581);
        setIntField(term10609, term10609.getClass(), "year", 2016);
        setShortField(term10609, term10609.getClass(), "month", (short) 2);
        setShortField(term10609, term10609.getClass(), "day", (short) 25);
        setField(term10608, term10608.getClass(), "date", term10609);
        setByteField(term10613, term10613.getClass(), "hour", (byte) 8);
        setByteField(term10613, term10613.getClass(), "minute", (byte) 54);
        setByteField(term10613, term10613.getClass(), "second", (byte) 40);
        setIntField(term10613, term10613.getClass(), "nano", 124525896);
        setField(term10608, term10608.getClass(), "time", term10613);
        setField(term10543, term10543.getClass(), "createdAt", term10608);
        setIntField(term10619, term10619.getClass(), "year", 2029);
        setShortField(term10619, term10619.getClass(), "month", (short) 1);
        setShortField(term10619, term10619.getClass(), "day", (short) 10);
        setField(term10618, term10618.getClass(), "date", term10619);
        setByteField(term10623, term10623.getClass(), "hour", (byte) 8);
        setByteField(term10623, term10623.getClass(), "minute", (byte) 46);
        setByteField(term10623, term10623.getClass(), "second", (byte) 35);
        setIntField(term10623, term10623.getClass(), "nano", 58807194);
        setField(term10618, term10618.getClass(), "time", term10623);
        setField(term10543, term10543.getClass(), "updatedAt", term10618);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.FileBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term10543, args);
    }

};



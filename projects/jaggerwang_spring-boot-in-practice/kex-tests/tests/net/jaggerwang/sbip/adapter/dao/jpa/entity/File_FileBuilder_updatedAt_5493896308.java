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

public class File_FileBuilder_updatedAt_5493896308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2544;
     Object term2629;

    public File_FileBuilder_updatedAt_5493896308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2545 = new Long(2486810210675247493L);
        Long term2547 = new Long(7009926388951271268L);
        Class<? extends Object> term2640 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term2639 = ((Class) term2640).getDeclaredField((String) "LOCAL");
        ((Field) term2639).setAccessible(true);
        Object enum7 = ((Field) term2639).get((Object) null);
        Long term2595 = new Long(-7672528020740371001L);
        term2544 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File$FileBuilder"));
        Object term2582 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term2609 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2610 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2614 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2619 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2620 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2624 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2544, term2544.getClass(), "id", term2545);
        setField(term2544, term2544.getClass(), "userId", term2547);
        setField(term2544, term2544.getClass(), "region", enum7);
        setField(term2544, term2544.getClass(), "bucket", "AijpHYOFuy");
        setField(term2544, term2544.getClass(), "path", "SbAoxhfrkn");
        setField(term2582, term2582.getClass(), "name", "kuTXqwMtDB");
        setField(term2582, term2582.getClass(), "size", term2595);
        setField(term2582, term2582.getClass(), "type", "Ghbwtircqb");
        setField(term2544, term2544.getClass(), "meta", term2582);
        setIntField(term2610, term2610.getClass(), "year", 2017);
        setShortField(term2610, term2610.getClass(), "month", (short) 6);
        setShortField(term2610, term2610.getClass(), "day", (short) 8);
        setField(term2609, term2609.getClass(), "date", term2610);
        setByteField(term2614, term2614.getClass(), "hour", (byte) 0);
        setByteField(term2614, term2614.getClass(), "minute", (byte) 18);
        setByteField(term2614, term2614.getClass(), "second", (byte) 55);
        setIntField(term2614, term2614.getClass(), "nano", 680586717);
        setField(term2609, term2609.getClass(), "time", term2614);
        setField(term2544, term2544.getClass(), "createdAt", term2609);
        setIntField(term2620, term2620.getClass(), "year", 2015);
        setShortField(term2620, term2620.getClass(), "month", (short) 9);
        setShortField(term2620, term2620.getClass(), "day", (short) 16);
        setField(term2619, term2619.getClass(), "date", term2620);
        setByteField(term2624, term2624.getClass(), "hour", (byte) 6);
        setByteField(term2624, term2624.getClass(), "minute", (byte) 19);
        setByteField(term2624, term2624.getClass(), "second", (byte) 42);
        setIntField(term2624, term2624.getClass(), "nano", 630084975);
        setField(term2619, term2619.getClass(), "time", term2624);
        setField(term2544, term2544.getClass(), "updatedAt", term2619);
        term2629 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2630 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2634 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term2630, term2630.getClass(), "year", 2029);
        setShortField(term2630, term2630.getClass(), "month", (short) 6);
        setShortField(term2630, term2630.getClass(), "day", (short) 23);
        setField(term2629, term2629.getClass(), "date", term2630);
        setByteField(term2634, term2634.getClass(), "hour", (byte) 21);
        setByteField(term2634, term2634.getClass(), "minute", (byte) 55);
        setByteField(term2634, term2634.getClass(), "second", (byte) 27);
        setIntField(term2634, term2634.getClass(), "nano", 66889274);
        setField(term2629, term2629.getClass(), "time", term2634);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File$FileBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term2629;
        callMethod(klass, "updatedAt", argTypes, term2544, args);
    }

};



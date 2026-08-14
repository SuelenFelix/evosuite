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

public class File_getUserId_10549255775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15504;

    public File_getUserId_10549255775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15505 = new Long(6142089107139955834L);
        Long term15507 = new Long(-7506365302323354325L);
        Class<? extends Object> term15590 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term15589 = ((Class) term15590).getDeclaredField((String) "LOCAL");
        ((Field) term15589).setAccessible(true);
        Object enum39 = ((Field) term15589).get((Object) null);
        Long term15555 = new Long(-4693900822622913579L);
        term15504 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File"));
        Object term15542 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term15569 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15570 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15574 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15579 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15580 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15584 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term15504, term15504.getClass(), "id", term15505);
        setField(term15504, term15504.getClass(), "userId", term15507);
        setField(term15504, term15504.getClass(), "region", enum39);
        setField(term15504, term15504.getClass(), "bucket", "EeBVbzjcCI");
        setField(term15504, term15504.getClass(), "path", "UfQtPRyWRC");
        setField(term15542, term15542.getClass(), "name", "FPvxVzzSvD");
        setField(term15542, term15542.getClass(), "size", term15555);
        setField(term15542, term15542.getClass(), "type", "WHcwFgsGFC");
        setField(term15504, term15504.getClass(), "meta", term15542);
        setIntField(term15570, term15570.getClass(), "year", 2028);
        setShortField(term15570, term15570.getClass(), "month", (short) 3);
        setShortField(term15570, term15570.getClass(), "day", (short) 20);
        setField(term15569, term15569.getClass(), "date", term15570);
        setByteField(term15574, term15574.getClass(), "hour", (byte) 15);
        setByteField(term15574, term15574.getClass(), "minute", (byte) 5);
        setByteField(term15574, term15574.getClass(), "second", (byte) 16);
        setIntField(term15574, term15574.getClass(), "nano", 223082659);
        setField(term15569, term15569.getClass(), "time", term15574);
        setField(term15504, term15504.getClass(), "createdAt", term15569);
        setIntField(term15580, term15580.getClass(), "year", 2019);
        setShortField(term15580, term15580.getClass(), "month", (short) 4);
        setShortField(term15580, term15580.getClass(), "day", (short) 1);
        setField(term15579, term15579.getClass(), "date", term15580);
        setByteField(term15584, term15584.getClass(), "hour", (byte) 8);
        setByteField(term15584, term15584.getClass(), "minute", (byte) 11);
        setByteField(term15584, term15584.getClass(), "second", (byte) 4);
        setIntField(term15584, term15584.getClass(), "nano", 648208624);
        setField(term15579, term15579.getClass(), "time", term15584);
        setField(term15504, term15504.getClass(), "updatedAt", term15579);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserId", argTypes, term15504, args);
    }

};



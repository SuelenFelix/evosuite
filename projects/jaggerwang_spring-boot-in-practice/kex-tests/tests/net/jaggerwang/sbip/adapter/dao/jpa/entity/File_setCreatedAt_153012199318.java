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

public class File_setCreatedAt_153012199318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20110;
     Object term20195;

    public File_setCreatedAt_153012199318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20111 = new Long(2018084438165711668L);
        Long term20113 = new Long(-8705953038984862378L);
        Class<? extends Object> term20206 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term20205 = ((Class) term20206).getDeclaredField((String) "LOCAL");
        ((Field) term20205).setAccessible(true);
        Object enum52 = ((Field) term20205).get((Object) null);
        Long term20161 = new Long(-7589547201844161961L);
        term20110 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File"));
        Object term20148 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term20175 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20176 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20180 = newInstance(Class.forName("java.time.LocalTime"));
        Object term20185 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20186 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20190 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term20110, term20110.getClass(), "id", term20111);
        setField(term20110, term20110.getClass(), "userId", term20113);
        setField(term20110, term20110.getClass(), "region", enum52);
        setField(term20110, term20110.getClass(), "bucket", "nhoHrZfnIN");
        setField(term20110, term20110.getClass(), "path", "ZkMALXpEAZ");
        setField(term20148, term20148.getClass(), "name", "tXfQjSqDzN");
        setField(term20148, term20148.getClass(), "size", term20161);
        setField(term20148, term20148.getClass(), "type", "BjugTaMcxJ");
        setField(term20110, term20110.getClass(), "meta", term20148);
        setIntField(term20176, term20176.getClass(), "year", 2013);
        setShortField(term20176, term20176.getClass(), "month", (short) 9);
        setShortField(term20176, term20176.getClass(), "day", (short) 27);
        setField(term20175, term20175.getClass(), "date", term20176);
        setByteField(term20180, term20180.getClass(), "hour", (byte) 9);
        setByteField(term20180, term20180.getClass(), "minute", (byte) 30);
        setByteField(term20180, term20180.getClass(), "second", (byte) 6);
        setIntField(term20180, term20180.getClass(), "nano", 647438502);
        setField(term20175, term20175.getClass(), "time", term20180);
        setField(term20110, term20110.getClass(), "createdAt", term20175);
        setIntField(term20186, term20186.getClass(), "year", 2021);
        setShortField(term20186, term20186.getClass(), "month", (short) 10);
        setShortField(term20186, term20186.getClass(), "day", (short) 16);
        setField(term20185, term20185.getClass(), "date", term20186);
        setByteField(term20190, term20190.getClass(), "hour", (byte) 5);
        setByteField(term20190, term20190.getClass(), "minute", (byte) 6);
        setByteField(term20190, term20190.getClass(), "second", (byte) 17);
        setIntField(term20190, term20190.getClass(), "nano", 631786532);
        setField(term20185, term20185.getClass(), "time", term20190);
        setField(term20110, term20110.getClass(), "updatedAt", term20185);
        term20195 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20196 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20200 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term20196, term20196.getClass(), "year", 2027);
        setShortField(term20196, term20196.getClass(), "month", (short) 11);
        setShortField(term20196, term20196.getClass(), "day", (short) 10);
        setField(term20195, term20195.getClass(), "date", term20196);
        setByteField(term20200, term20200.getClass(), "hour", (byte) 9);
        setByteField(term20200, term20200.getClass(), "minute", (byte) 27);
        setByteField(term20200, term20200.getClass(), "second", (byte) 5);
        setIntField(term20200, term20200.getClass(), "nano", 574938581);
        setField(term20195, term20195.getClass(), "time", term20200);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term20195;
        callMethod(klass, "setCreatedAt", argTypes, term20110, args);
    }

};



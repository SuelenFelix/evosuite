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

public class File_fromBO_3554279940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14116;

    public File_fromBO_3554279940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14117 = new Long(-1084263688306617320L);
        Long term14119 = new Long(1193381106528373019L);
        Class<? extends Object> term14202 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term14201 = ((Class) term14202).getDeclaredField((String) "LOCAL");
        ((Field) term14201).setAccessible(true);
        Object enum35 = ((Field) term14201).get((Object) null);
        Long term14167 = new Long(-1365372122034008688L);
        term14116 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO"));
        Object term14154 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term14181 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14182 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14186 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14191 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14192 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14196 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term14116, term14116.getClass(), "id", term14117);
        setField(term14116, term14116.getClass(), "userId", term14119);
        setField(term14116, term14116.getClass(), "region", enum35);
        setField(term14116, term14116.getClass(), "bucket", "SdCKLMIYnX");
        setField(term14116, term14116.getClass(), "path", "OJJtVNPyKZ");
        setField(term14154, term14154.getClass(), "name", "AKNapTAfmD");
        setField(term14154, term14154.getClass(), "size", term14167);
        setField(term14154, term14154.getClass(), "type", "xJgPlLxpgC");
        setField(term14116, term14116.getClass(), "meta", term14154);
        setIntField(term14182, term14182.getClass(), "year", 2011);
        setShortField(term14182, term14182.getClass(), "month", (short) 10);
        setShortField(term14182, term14182.getClass(), "day", (short) 10);
        setField(term14181, term14181.getClass(), "date", term14182);
        setByteField(term14186, term14186.getClass(), "hour", (byte) 5);
        setByteField(term14186, term14186.getClass(), "minute", (byte) 26);
        setByteField(term14186, term14186.getClass(), "second", (byte) 16);
        setIntField(term14186, term14186.getClass(), "nano", 858245653);
        setField(term14181, term14181.getClass(), "time", term14186);
        setField(term14116, term14116.getClass(), "createdAt", term14181);
        setIntField(term14192, term14192.getClass(), "year", 2011);
        setShortField(term14192, term14192.getClass(), "month", (short) 3);
        setShortField(term14192, term14192.getClass(), "day", (short) 25);
        setField(term14191, term14191.getClass(), "date", term14192);
        setByteField(term14196, term14196.getClass(), "hour", (byte) 20);
        setByteField(term14196, term14196.getClass(), "minute", (byte) 10);
        setByteField(term14196, term14196.getClass(), "second", (byte) 51);
        setIntField(term14196, term14196.getClass(), "nano", 162102574);
        setField(term14191, term14191.getClass(), "time", term14196);
        setField(term14116, term14116.getClass(), "updatedAt", term14191);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.FileBO");
        Object[] args = new Object[1];
        args[0] = term14116;
        callMethod(klass, "fromBO", argTypes, null, args);
    }

};



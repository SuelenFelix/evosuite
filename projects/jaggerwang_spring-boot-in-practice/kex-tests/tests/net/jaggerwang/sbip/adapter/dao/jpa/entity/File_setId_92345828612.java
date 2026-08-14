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

public class File_setId_92345828612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17933;
     Object term18018;

    public File_setId_92345828612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17934 = new Long(1950957495500453461L);
        Long term17936 = new Long(-6423955170741487890L);
        Class<? extends Object> term18021 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term18020 = ((Class) term18021).getDeclaredField((String) "LOCAL");
        ((Field) term18020).setAccessible(true);
        Object enum46 = ((Field) term18020).get((Object) null);
        Long term17984 = new Long(-4663904610228258188L);
        term17933 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File"));
        Object term17971 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term17998 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17999 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18003 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18008 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18009 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18013 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term17933, term17933.getClass(), "id", term17934);
        setField(term17933, term17933.getClass(), "userId", term17936);
        setField(term17933, term17933.getClass(), "region", enum46);
        setField(term17933, term17933.getClass(), "bucket", "vwbEQQNQrx");
        setField(term17933, term17933.getClass(), "path", "xtftXXMbem");
        setField(term17971, term17971.getClass(), "name", "cudZvLMQon");
        setField(term17971, term17971.getClass(), "size", term17984);
        setField(term17971, term17971.getClass(), "type", "lihXWlGDxk");
        setField(term17933, term17933.getClass(), "meta", term17971);
        setIntField(term17999, term17999.getClass(), "year", 2019);
        setShortField(term17999, term17999.getClass(), "month", (short) 9);
        setShortField(term17999, term17999.getClass(), "day", (short) 3);
        setField(term17998, term17998.getClass(), "date", term17999);
        setByteField(term18003, term18003.getClass(), "hour", (byte) 2);
        setByteField(term18003, term18003.getClass(), "minute", (byte) 32);
        setByteField(term18003, term18003.getClass(), "second", (byte) 30);
        setIntField(term18003, term18003.getClass(), "nano", 339846128);
        setField(term17998, term17998.getClass(), "time", term18003);
        setField(term17933, term17933.getClass(), "createdAt", term17998);
        setIntField(term18009, term18009.getClass(), "year", 2029);
        setShortField(term18009, term18009.getClass(), "month", (short) 11);
        setShortField(term18009, term18009.getClass(), "day", (short) 6);
        setField(term18008, term18008.getClass(), "date", term18009);
        setByteField(term18013, term18013.getClass(), "hour", (byte) 2);
        setByteField(term18013, term18013.getClass(), "minute", (byte) 55);
        setByteField(term18013, term18013.getClass(), "second", (byte) 43);
        setIntField(term18013, term18013.getClass(), "nano", 109400580);
        setField(term18008, term18008.getClass(), "time", term18013);
        setField(term17933, term17933.getClass(), "updatedAt", term18008);
        term18018 = new Long(3824691451696451167L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term18018;
        callMethod(klass, "setId", argTypes, term17933, args);
    }

};



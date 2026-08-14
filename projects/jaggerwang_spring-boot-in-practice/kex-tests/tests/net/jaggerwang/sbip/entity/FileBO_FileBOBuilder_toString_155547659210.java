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

public class FileBO_FileBOBuilder_toString_155547659210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3248;

    public FileBO_FileBOBuilder_toString_155547659210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3249 = new Long(6855071767938501807L);
        Long term3251 = new Long(-5892135042702373494L);
        Class<? extends Object> term3334 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term3333 = ((Class) term3334).getDeclaredField((String) "LOCAL");
        ((Field) term3333).setAccessible(true);
        Object enum9 = ((Field) term3333).get((Object) null);
        Long term3299 = new Long(5262507301787091109L);
        term3248 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$FileBOBuilder"));
        Object term3286 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term3313 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3314 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3318 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3323 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3324 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3328 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3248, term3248.getClass(), "id", term3249);
        setField(term3248, term3248.getClass(), "userId", term3251);
        setField(term3248, term3248.getClass(), "region", enum9);
        setField(term3248, term3248.getClass(), "bucket", "wSQxaModmm");
        setField(term3248, term3248.getClass(), "path", "UlajhuVLaP");
        setField(term3286, term3286.getClass(), "name", "gGSMzuGICf");
        setField(term3286, term3286.getClass(), "size", term3299);
        setField(term3286, term3286.getClass(), "type", "hxCBltsObl");
        setField(term3248, term3248.getClass(), "meta", term3286);
        setIntField(term3314, term3314.getClass(), "year", 2014);
        setShortField(term3314, term3314.getClass(), "month", (short) 7);
        setShortField(term3314, term3314.getClass(), "day", (short) 13);
        setField(term3313, term3313.getClass(), "date", term3314);
        setByteField(term3318, term3318.getClass(), "hour", (byte) 21);
        setByteField(term3318, term3318.getClass(), "minute", (byte) 46);
        setByteField(term3318, term3318.getClass(), "second", (byte) 0);
        setIntField(term3318, term3318.getClass(), "nano", 887884128);
        setField(term3313, term3313.getClass(), "time", term3318);
        setField(term3248, term3248.getClass(), "createdAt", term3313);
        setIntField(term3324, term3324.getClass(), "year", 2023);
        setShortField(term3324, term3324.getClass(), "month", (short) 3);
        setShortField(term3324, term3324.getClass(), "day", (short) 7);
        setField(term3323, term3323.getClass(), "date", term3324);
        setByteField(term3328, term3328.getClass(), "hour", (byte) 21);
        setByteField(term3328, term3328.getClass(), "minute", (byte) 15);
        setByteField(term3328, term3328.getClass(), "second", (byte) 43);
        setIntField(term3328, term3328.getClass(), "nano", 639721472);
        setField(term3323, term3323.getClass(), "time", term3328);
        setField(term3248, term3248.getClass(), "updatedAt", term3323);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.FileBO$FileBOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3248, args);
    }

};



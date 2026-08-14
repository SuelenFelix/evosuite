package net.jaggerwang.sbip.adapter.api.controller.dto;

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
import static net.jaggerwang.sbip.adapter.api.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;

public class FileDTO_setBucket_84336771616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23314;

    public FileDTO_setBucket_84336771616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23315 = new Long(-4058686252500969842L);
        Long term23317 = new Long(6077991958696417121L);
        Class<? extends Object> term23435 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term23434 = ((Class) term23435).getDeclaredField((String) "LOCAL");
        ((Field) term23434).setAccessible(true);
        Object enum45 = ((Field) term23434).get((Object) null);
        Long term23365 = new Long(-5004803270846838598L);
        HashMap term23411 = new HashMap();
        term23314 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term23352 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term23379 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23380 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23384 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23389 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23390 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23394 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term23314, term23314.getClass(), "id", term23315);
        setField(term23314, term23314.getClass(), "userId", term23317);
        setField(term23314, term23314.getClass(), "region", enum45);
        setField(term23314, term23314.getClass(), "bucket", "yevIIoVYHq");
        setField(term23314, term23314.getClass(), "path", "UuYWMTqWTV");
        setField(term23352, term23352.getClass(), "name", "DSFGlcaXUb");
        setField(term23352, term23352.getClass(), "size", term23365);
        setField(term23352, term23352.getClass(), "type", "sHMXNUzNeM");
        setField(term23314, term23314.getClass(), "meta", term23352);
        setIntField(term23380, term23380.getClass(), "year", 2025);
        setShortField(term23380, term23380.getClass(), "month", (short) 2);
        setShortField(term23380, term23380.getClass(), "day", (short) 23);
        setField(term23379, term23379.getClass(), "date", term23380);
        setByteField(term23384, term23384.getClass(), "hour", (byte) 16);
        setByteField(term23384, term23384.getClass(), "minute", (byte) 39);
        setByteField(term23384, term23384.getClass(), "second", (byte) 42);
        setIntField(term23384, term23384.getClass(), "nano", 342777686);
        setField(term23379, term23379.getClass(), "time", term23384);
        setField(term23314, term23314.getClass(), "createdAt", term23379);
        setIntField(term23390, term23390.getClass(), "year", 2029);
        setShortField(term23390, term23390.getClass(), "month", (short) 8);
        setShortField(term23390, term23390.getClass(), "day", (short) 14);
        setField(term23389, term23389.getClass(), "date", term23390);
        setByteField(term23394, term23394.getClass(), "hour", (byte) 10);
        setByteField(term23394, term23394.getClass(), "minute", (byte) 28);
        setByteField(term23394, term23394.getClass(), "second", (byte) 23);
        setIntField(term23394, term23394.getClass(), "nano", 676524979);
        setField(term23389, term23389.getClass(), "time", term23394);
        setField(term23314, term23314.getClass(), "updatedAt", term23389);
        setField(term23314, term23314.getClass(), "url", "gPzGDOEPPw");
        setField(term23314, term23314.getClass(), "thumbs", term23411);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VUkRVwROTl";
        callMethod(klass, "setBucket", argTypes, term23314, args);
    }

};



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

public class File_getPath_1567188058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16545;

    public File_getPath_1567188058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16546 = new Long(970120292495348028L);
        Long term16548 = new Long(77619432202128806L);
        Class<? extends Object> term16631 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term16630 = ((Class) term16631).getDeclaredField((String) "LOCAL");
        ((Field) term16630).setAccessible(true);
        Object enum42 = ((Field) term16630).get((Object) null);
        Long term16596 = new Long(-1647156882669215876L);
        term16545 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File"));
        Object term16583 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term16610 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16611 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16615 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16620 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16621 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16625 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term16545, term16545.getClass(), "id", term16546);
        setField(term16545, term16545.getClass(), "userId", term16548);
        setField(term16545, term16545.getClass(), "region", enum42);
        setField(term16545, term16545.getClass(), "bucket", "PtirvZmsGt");
        setField(term16545, term16545.getClass(), "path", "HWkpTmtlrc");
        setField(term16583, term16583.getClass(), "name", "hMmaoREuCK");
        setField(term16583, term16583.getClass(), "size", term16596);
        setField(term16583, term16583.getClass(), "type", "VeDtgDzGAN");
        setField(term16545, term16545.getClass(), "meta", term16583);
        setIntField(term16611, term16611.getClass(), "year", 2024);
        setShortField(term16611, term16611.getClass(), "month", (short) 12);
        setShortField(term16611, term16611.getClass(), "day", (short) 11);
        setField(term16610, term16610.getClass(), "date", term16611);
        setByteField(term16615, term16615.getClass(), "hour", (byte) 19);
        setByteField(term16615, term16615.getClass(), "minute", (byte) 38);
        setByteField(term16615, term16615.getClass(), "second", (byte) 23);
        setIntField(term16615, term16615.getClass(), "nano", 207336939);
        setField(term16610, term16610.getClass(), "time", term16615);
        setField(term16545, term16545.getClass(), "createdAt", term16610);
        setIntField(term16621, term16621.getClass(), "year", 2023);
        setShortField(term16621, term16621.getClass(), "month", (short) 3);
        setShortField(term16621, term16621.getClass(), "day", (short) 29);
        setField(term16620, term16620.getClass(), "date", term16621);
        setByteField(term16625, term16625.getClass(), "hour", (byte) 12);
        setByteField(term16625, term16625.getClass(), "minute", (byte) 11);
        setByteField(term16625, term16625.getClass(), "second", (byte) 3);
        setIntField(term16625, term16625.getClass(), "nano", 876063258);
        setField(term16620, term16620.getClass(), "time", term16625);
        setField(term16545, term16545.getClass(), "updatedAt", term16620);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPath", argTypes, term16545, args);
    }

};



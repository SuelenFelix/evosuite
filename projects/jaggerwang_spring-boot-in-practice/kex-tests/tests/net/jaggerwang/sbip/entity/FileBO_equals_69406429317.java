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

public class FileBO_equals_69406429317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9847;
     Object term9932;

    public FileBO_equals_69406429317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9848 = new Long(2135754395358000892L);
        Long term9850 = new Long(-8085190702504231560L);
        Class<? extends Object> term9934 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term9933 = ((Class) term9934).getDeclaredField((String) "LOCAL");
        ((Field) term9933).setAccessible(true);
        Object enum26 = ((Field) term9933).get((Object) null);
        Long term9898 = new Long(1672578078364590450L);
        term9847 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO"));
        Object term9885 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term9912 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9913 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9917 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9922 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9923 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9927 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term9847, term9847.getClass(), "id", term9848);
        setField(term9847, term9847.getClass(), "userId", term9850);
        setField(term9847, term9847.getClass(), "region", enum26);
        setField(term9847, term9847.getClass(), "bucket", "wfaXBpWAUH");
        setField(term9847, term9847.getClass(), "path", "VMeAzAHwZj");
        setField(term9885, term9885.getClass(), "name", "PznxWXsZME");
        setField(term9885, term9885.getClass(), "size", term9898);
        setField(term9885, term9885.getClass(), "type", "ZzIujlwVsw");
        setField(term9847, term9847.getClass(), "meta", term9885);
        setIntField(term9913, term9913.getClass(), "year", 2022);
        setShortField(term9913, term9913.getClass(), "month", (short) 6);
        setShortField(term9913, term9913.getClass(), "day", (short) 20);
        setField(term9912, term9912.getClass(), "date", term9913);
        setByteField(term9917, term9917.getClass(), "hour", (byte) 7);
        setByteField(term9917, term9917.getClass(), "minute", (byte) 57);
        setByteField(term9917, term9917.getClass(), "second", (byte) 37);
        setIntField(term9917, term9917.getClass(), "nano", 90374877);
        setField(term9912, term9912.getClass(), "time", term9917);
        setField(term9847, term9847.getClass(), "createdAt", term9912);
        setIntField(term9923, term9923.getClass(), "year", 2023);
        setShortField(term9923, term9923.getClass(), "month", (short) 2);
        setShortField(term9923, term9923.getClass(), "day", (short) 16);
        setField(term9922, term9922.getClass(), "date", term9923);
        setByteField(term9927, term9927.getClass(), "hour", (byte) 3);
        setByteField(term9927, term9927.getClass(), "minute", (byte) 18);
        setByteField(term9927, term9927.getClass(), "second", (byte) 56);
        setIntField(term9927, term9927.getClass(), "nano", 733017887);
        setField(term9922, term9922.getClass(), "time", term9927);
        setField(term9847, term9847.getClass(), "updatedAt", term9922);
        term9932 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.FileBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term9932;
        callMethod(klass, "equals", argTypes, term9847, args);
    }

};



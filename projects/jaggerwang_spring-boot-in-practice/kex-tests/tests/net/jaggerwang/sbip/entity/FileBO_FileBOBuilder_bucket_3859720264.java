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

public class FileBO_FileBOBuilder_bucket_3859720264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1055;

    public FileBO_FileBOBuilder_bucket_3859720264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1056 = new Long(-8885298608300233488L);
        Long term1058 = new Long(-4325723315152823407L);
        Class<? extends Object> term1153 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term1152 = ((Class) term1153).getDeclaredField((String) "LOCAL");
        ((Field) term1152).setAccessible(true);
        Object enum3 = ((Field) term1152).get((Object) null);
        Long term1106 = new Long(2535595959091595249L);
        term1055 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$FileBOBuilder"));
        Object term1093 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term1120 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1121 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1125 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1130 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1131 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1135 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1055, term1055.getClass(), "id", term1056);
        setField(term1055, term1055.getClass(), "userId", term1058);
        setField(term1055, term1055.getClass(), "region", enum3);
        setField(term1055, term1055.getClass(), "bucket", "MxlszYVzRf");
        setField(term1055, term1055.getClass(), "path", "LQFpaHEwXR");
        setField(term1093, term1093.getClass(), "name", "oVcInYnLWB");
        setField(term1093, term1093.getClass(), "size", term1106);
        setField(term1093, term1093.getClass(), "type", "aJlieCFVtF");
        setField(term1055, term1055.getClass(), "meta", term1093);
        setIntField(term1121, term1121.getClass(), "year", 2025);
        setShortField(term1121, term1121.getClass(), "month", (short) 4);
        setShortField(term1121, term1121.getClass(), "day", (short) 24);
        setField(term1120, term1120.getClass(), "date", term1121);
        setByteField(term1125, term1125.getClass(), "hour", (byte) 18);
        setByteField(term1125, term1125.getClass(), "minute", (byte) 11);
        setByteField(term1125, term1125.getClass(), "second", (byte) 40);
        setIntField(term1125, term1125.getClass(), "nano", 137454929);
        setField(term1120, term1120.getClass(), "time", term1125);
        setField(term1055, term1055.getClass(), "createdAt", term1120);
        setIntField(term1131, term1131.getClass(), "year", 2024);
        setShortField(term1131, term1131.getClass(), "month", (short) 1);
        setShortField(term1131, term1131.getClass(), "day", (short) 24);
        setField(term1130, term1130.getClass(), "date", term1131);
        setByteField(term1135, term1135.getClass(), "hour", (byte) 20);
        setByteField(term1135, term1135.getClass(), "minute", (byte) 28);
        setByteField(term1135, term1135.getClass(), "second", (byte) 39);
        setIntField(term1135, term1135.getClass(), "nano", 952728177);
        setField(term1130, term1130.getClass(), "time", term1135);
        setField(term1055, term1055.getClass(), "updatedAt", term1130);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.FileBO$FileBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZiaGIbnzTs";
        callMethod(klass, "bucket", argTypes, term1055, args);
    }

};



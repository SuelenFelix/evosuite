package net.jaggerwang.sbip.usecase;

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
import static net.jaggerwang.sbip.usecase.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class FileUsecase_upload_12863105971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1163;
     Object term1176;
     Object term1181;

    public FileUsecase_upload_12863105971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1163 = newInstance(Class.forName("net.jaggerwang.sbip.usecase.FileUsecase"));
        setField(term1163, term1163.getClass(), "fileDAO", null);
        setField(term1163, term1163.getClass(), "storageService", null);
        term1176 = (byte[]) newByteArray(4);
        setByteElement(term1176, 0, (byte) 47);
        setByteElement(term1176, 1, (byte) 48);
        setByteElement(term1176, 2, (byte) 89);
        setByteElement(term1176, 3, (byte) 75);
        Long term1182 = new Long(-5788180182343976541L);
        Long term1184 = new Long(2936323121573284007L);
        Class<? extends Object> term1290 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term1289 = ((Class) term1290).getDeclaredField((String) "LOCAL");
        ((Field) term1289).setAccessible(true);
        Object enum1 = ((Field) term1289).get((Object) null);
        Long term1232 = new Long(-1154553077993834885L);
        term1181 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO"));
        Object term1219 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term1246 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1247 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1251 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1256 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1257 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1261 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1181, term1181.getClass(), "id", term1182);
        setField(term1181, term1181.getClass(), "userId", term1184);
        setField(term1181, term1181.getClass(), "region", enum1);
        setField(term1181, term1181.getClass(), "bucket", "AijpHYOFuy");
        setField(term1181, term1181.getClass(), "path", "SbAoxhfrkn");
        setField(term1219, term1219.getClass(), "name", "kuTXqwMtDB");
        setField(term1219, term1219.getClass(), "size", term1232);
        setField(term1219, term1219.getClass(), "type", "Ghbwtircqb");
        setField(term1181, term1181.getClass(), "meta", term1219);
        setIntField(term1247, term1247.getClass(), "year", 2025);
        setShortField(term1247, term1247.getClass(), "month", (short) 4);
        setShortField(term1247, term1247.getClass(), "day", (short) 24);
        setField(term1246, term1246.getClass(), "date", term1247);
        setByteField(term1251, term1251.getClass(), "hour", (byte) 18);
        setByteField(term1251, term1251.getClass(), "minute", (byte) 11);
        setByteField(term1251, term1251.getClass(), "second", (byte) 40);
        setIntField(term1251, term1251.getClass(), "nano", 137454929);
        setField(term1246, term1246.getClass(), "time", term1251);
        setField(term1181, term1181.getClass(), "createdAt", term1246);
        setIntField(term1257, term1257.getClass(), "year", 2024);
        setShortField(term1257, term1257.getClass(), "month", (short) 1);
        setShortField(term1257, term1257.getClass(), "day", (short) 24);
        setField(term1256, term1256.getClass(), "date", term1257);
        setByteField(term1261, term1261.getClass(), "hour", (byte) 20);
        setByteField(term1261, term1261.getClass(), "minute", (byte) 28);
        setByteField(term1261, term1261.getClass(), "second", (byte) 39);
        setIntField(term1261, term1261.getClass(), "nano", 952728177);
        setField(term1256, term1256.getClass(), "time", term1261);
        setField(term1181, term1181.getClass(), "updatedAt", term1256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.usecase.FileUsecase");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = Class.forName("net.jaggerwang.sbip.entity.FileBO");
        Object[] args = new Object[3];
        args[0] = "dWRymuLBtr";
        args[1] = term1176;
        args[2] = term1181;
        callMethod(klass, "upload", argTypes, term1163, args);
    }

};



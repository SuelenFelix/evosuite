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

public class File_FileBuilder_id_758672521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term86;

    public File_FileBuilder_id_758672521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2 = new Long(2442117782898005296L);
        Long term4 = new Long(6375119433582206027L);
        Class<? extends Object> term98 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term97 = ((Class) term98).getDeclaredField((String) "LOCAL");
        ((Field) term97).setAccessible(true);
        Object enum0 = ((Field) term97).get((Object) null);
        Long term52 = new Long(-8257434502486459194L);
        term1 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File$FileBuilder"));
        Object term39 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term66 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67 = newInstance(Class.forName("java.time.LocalDate"));
        Object term71 = newInstance(Class.forName("java.time.LocalTime"));
        Object term76 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term77 = newInstance(Class.forName("java.time.LocalDate"));
        Object term81 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "userId", term4);
        setField(term1, term1.getClass(), "region", enum0);
        setField(term1, term1.getClass(), "bucket", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "path", "sjlJAEtRrb");
        setField(term39, term39.getClass(), "name", "MuLcgQHgqz");
        setField(term39, term39.getClass(), "size", term52);
        setField(term39, term39.getClass(), "type", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "meta", term39);
        setIntField(term67, term67.getClass(), "year", 2012);
        setShortField(term67, term67.getClass(), "month", (short) 8);
        setShortField(term67, term67.getClass(), "day", (short) 25);
        setField(term66, term66.getClass(), "date", term67);
        setByteField(term71, term71.getClass(), "hour", (byte) 5);
        setByteField(term71, term71.getClass(), "minute", (byte) 20);
        setByteField(term71, term71.getClass(), "second", (byte) 50);
        setIntField(term71, term71.getClass(), "nano", 345595912);
        setField(term66, term66.getClass(), "time", term71);
        setField(term1, term1.getClass(), "createdAt", term66);
        setIntField(term77, term77.getClass(), "year", 2021);
        setShortField(term77, term77.getClass(), "month", (short) 1);
        setShortField(term77, term77.getClass(), "day", (short) 18);
        setField(term76, term76.getClass(), "date", term77);
        setByteField(term81, term81.getClass(), "hour", (byte) 13);
        setByteField(term81, term81.getClass(), "minute", (byte) 38);
        setByteField(term81, term81.getClass(), "second", (byte) 26);
        setIntField(term81, term81.getClass(), "nano", 544608644);
        setField(term76, term76.getClass(), "time", term81);
        setField(term1, term1.getClass(), "updatedAt", term76);
        term86 = new Long(-8400487765614892086L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File$FileBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term86;
        callMethod(klass, "id", argTypes, term1, args);
    }

};



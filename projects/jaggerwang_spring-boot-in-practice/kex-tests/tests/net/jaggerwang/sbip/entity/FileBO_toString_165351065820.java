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

public class FileBO_toString_165351065820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10890;

    public FileBO_toString_165351065820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10891 = new Long(-5786861555969446503L);
        Long term10893 = new Long(2354625302846375590L);
        Class<? extends Object> term10976 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term10975 = ((Class) term10976).getDeclaredField((String) "LOCAL");
        ((Field) term10975).setAccessible(true);
        Object enum29 = ((Field) term10975).get((Object) null);
        Long term10941 = new Long(7276637106827860087L);
        term10890 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO"));
        Object term10928 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term10955 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10956 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10960 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10965 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10966 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10970 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term10890, term10890.getClass(), "id", term10891);
        setField(term10890, term10890.getClass(), "userId", term10893);
        setField(term10890, term10890.getClass(), "region", enum29);
        setField(term10890, term10890.getClass(), "bucket", "WHcwFgsGFC");
        setField(term10890, term10890.getClass(), "path", "HzqpegHiRq");
        setField(term10928, term10928.getClass(), "name", "jwsfVjMoJT");
        setField(term10928, term10928.getClass(), "size", term10941);
        setField(term10928, term10928.getClass(), "type", "ZfdXfCCFDf");
        setField(term10890, term10890.getClass(), "meta", term10928);
        setIntField(term10956, term10956.getClass(), "year", 2016);
        setShortField(term10956, term10956.getClass(), "month", (short) 10);
        setShortField(term10956, term10956.getClass(), "day", (short) 20);
        setField(term10955, term10955.getClass(), "date", term10956);
        setByteField(term10960, term10960.getClass(), "hour", (byte) 18);
        setByteField(term10960, term10960.getClass(), "minute", (byte) 39);
        setByteField(term10960, term10960.getClass(), "second", (byte) 1);
        setIntField(term10960, term10960.getClass(), "nano", 196253988);
        setField(term10955, term10955.getClass(), "time", term10960);
        setField(term10890, term10890.getClass(), "createdAt", term10955);
        setIntField(term10966, term10966.getClass(), "year", 2019);
        setShortField(term10966, term10966.getClass(), "month", (short) 1);
        setShortField(term10966, term10966.getClass(), "day", (short) 6);
        setField(term10965, term10965.getClass(), "date", term10966);
        setByteField(term10970, term10970.getClass(), "hour", (byte) 18);
        setByteField(term10970, term10970.getClass(), "minute", (byte) 8);
        setByteField(term10970, term10970.getClass(), "second", (byte) 46);
        setIntField(term10970, term10970.getClass(), "nano", 934136445);
        setField(term10965, term10965.getClass(), "time", term10970);
        setField(term10890, term10890.getClass(), "updatedAt", term10965);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.FileBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term10890, args);
    }

};



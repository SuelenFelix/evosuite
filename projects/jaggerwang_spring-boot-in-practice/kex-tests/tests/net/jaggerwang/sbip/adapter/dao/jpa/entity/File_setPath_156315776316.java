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

public class File_setPath_156315776316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19347;

    public File_setPath_156315776316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19348 = new Long(-4562564710769146498L);
        Long term19350 = new Long(-6254265799185295775L);
        Class<? extends Object> term19445 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term19444 = ((Class) term19445).getDeclaredField((String) "LOCAL");
        ((Field) term19444).setAccessible(true);
        Object enum50 = ((Field) term19444).get((Object) null);
        Long term19398 = new Long(3831994970480278159L);
        term19347 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File"));
        Object term19385 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term19412 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19413 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19417 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19422 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19423 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19427 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term19347, term19347.getClass(), "id", term19348);
        setField(term19347, term19347.getClass(), "userId", term19350);
        setField(term19347, term19347.getClass(), "region", enum50);
        setField(term19347, term19347.getClass(), "bucket", "lFRJFUMVbx");
        setField(term19347, term19347.getClass(), "path", "sZdUNdggUW");
        setField(term19385, term19385.getClass(), "name", "OqbwYQfvAe");
        setField(term19385, term19385.getClass(), "size", term19398);
        setField(term19385, term19385.getClass(), "type", "tRxZafjqIx");
        setField(term19347, term19347.getClass(), "meta", term19385);
        setIntField(term19413, term19413.getClass(), "year", 2020);
        setShortField(term19413, term19413.getClass(), "month", (short) 10);
        setShortField(term19413, term19413.getClass(), "day", (short) 2);
        setField(term19412, term19412.getClass(), "date", term19413);
        setByteField(term19417, term19417.getClass(), "hour", (byte) 1);
        setByteField(term19417, term19417.getClass(), "minute", (byte) 41);
        setByteField(term19417, term19417.getClass(), "second", (byte) 48);
        setIntField(term19417, term19417.getClass(), "nano", 834720747);
        setField(term19412, term19412.getClass(), "time", term19417);
        setField(term19347, term19347.getClass(), "createdAt", term19412);
        setIntField(term19423, term19423.getClass(), "year", 2022);
        setShortField(term19423, term19423.getClass(), "month", (short) 3);
        setShortField(term19423, term19423.getClass(), "day", (short) 31);
        setField(term19422, term19422.getClass(), "date", term19423);
        setByteField(term19427, term19427.getClass(), "hour", (byte) 3);
        setByteField(term19427, term19427.getClass(), "minute", (byte) 43);
        setByteField(term19427, term19427.getClass(), "second", (byte) 28);
        setIntField(term19427, term19427.getClass(), "nano", 772790770);
        setField(term19422, term19422.getClass(), "time", term19427);
        setField(term19347, term19347.getClass(), "updatedAt", term19422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DhjNLmRMCu";
        callMethod(klass, "setPath", argTypes, term19347, args);
    }

};



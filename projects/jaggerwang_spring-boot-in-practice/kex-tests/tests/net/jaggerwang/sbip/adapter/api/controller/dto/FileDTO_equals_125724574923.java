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

public class FileDTO_equals_125724574923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26161;
     Object term26269;

    public FileDTO_equals_125724574923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term26162 = new Long(2287449183416662404L);
        Long term26164 = new Long(-1223573843683081410L);
        Class<? extends Object> term26271 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term26270 = ((Class) term26271).getDeclaredField((String) "LOCAL");
        ((Field) term26270).setAccessible(true);
        Object enum52 = ((Field) term26270).get((Object) null);
        Long term26212 = new Long(3453457027014743006L);
        HashMap term26258 = new HashMap();
        term26161 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term26199 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term26226 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26227 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26231 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26236 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26237 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26241 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26161, term26161.getClass(), "id", term26162);
        setField(term26161, term26161.getClass(), "userId", term26164);
        setField(term26161, term26161.getClass(), "region", enum52);
        setField(term26161, term26161.getClass(), "bucket", "DAujxZPHJC");
        setField(term26161, term26161.getClass(), "path", "IlBhdrCvHq");
        setField(term26199, term26199.getClass(), "name", "OirVUQhauU");
        setField(term26199, term26199.getClass(), "size", term26212);
        setField(term26199, term26199.getClass(), "type", "GLbyDfbNZI");
        setField(term26161, term26161.getClass(), "meta", term26199);
        setIntField(term26227, term26227.getClass(), "year", 2010);
        setShortField(term26227, term26227.getClass(), "month", (short) 9);
        setShortField(term26227, term26227.getClass(), "day", (short) 26);
        setField(term26226, term26226.getClass(), "date", term26227);
        setByteField(term26231, term26231.getClass(), "hour", (byte) 17);
        setByteField(term26231, term26231.getClass(), "minute", (byte) 5);
        setByteField(term26231, term26231.getClass(), "second", (byte) 52);
        setIntField(term26231, term26231.getClass(), "nano", 138292575);
        setField(term26226, term26226.getClass(), "time", term26231);
        setField(term26161, term26161.getClass(), "createdAt", term26226);
        setIntField(term26237, term26237.getClass(), "year", 2022);
        setShortField(term26237, term26237.getClass(), "month", (short) 10);
        setShortField(term26237, term26237.getClass(), "day", (short) 14);
        setField(term26236, term26236.getClass(), "date", term26237);
        setByteField(term26241, term26241.getClass(), "hour", (byte) 10);
        setByteField(term26241, term26241.getClass(), "minute", (byte) 28);
        setByteField(term26241, term26241.getClass(), "second", (byte) 24);
        setIntField(term26241, term26241.getClass(), "nano", 117469048);
        setField(term26236, term26236.getClass(), "time", term26241);
        setField(term26161, term26161.getClass(), "updatedAt", term26236);
        setField(term26161, term26161.getClass(), "url", "oNLcCYDAsO");
        setField(term26161, term26161.getClass(), "thumbs", term26258);
        term26269 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term26269;
        callMethod(klass, "equals", argTypes, term26161, args);
    }

};



package com.piinalpin.queryrequest.domain.dao;

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
import static com.piinalpin.queryrequest.domain.dao.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;

public class OperatingSystem_OperatingSystemBuilder_version_9482756603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187;

    public OperatingSystem_OperatingSystemBuilder_version_9482756603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term188 = new Long(-8400487765614892086L);
        Integer term236 = new Integer(1484323161);
        term187 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem$OperatingSystemBuilder"));
        Object term226 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term227 = newInstance(Class.forName("java.time.LocalDate"));
        Object term231 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term187, term187.getClass(), "id", term188);
        setField(term187, term187.getClass(), "name", "MjGYSRKTNF");
        setField(term187, term187.getClass(), "version", "hRNSzYYIrc");
        setField(term187, term187.getClass(), "kernel", "RMFIsYGgne");
        setIntField(term227, term227.getClass(), "year", 2015);
        setShortField(term227, term227.getClass(), "month", (short) 9);
        setShortField(term227, term227.getClass(), "day", (short) 19);
        setField(term226, term226.getClass(), "date", term227);
        setByteField(term231, term231.getClass(), "hour", (byte) 9);
        setByteField(term231, term231.getClass(), "minute", (byte) 4);
        setByteField(term231, term231.getClass(), "second", (byte) 10);
        setIntField(term231, term231.getClass(), "nano", 401765865);
        setField(term226, term226.getClass(), "time", term231);
        setField(term187, term187.getClass(), "releaseDate", term226);
        setField(term187, term187.getClass(), "usages", term236);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem$OperatingSystemBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NRdvgJlhkX";
        callMethod(klass, "version", argTypes, term187, args);
    }

};



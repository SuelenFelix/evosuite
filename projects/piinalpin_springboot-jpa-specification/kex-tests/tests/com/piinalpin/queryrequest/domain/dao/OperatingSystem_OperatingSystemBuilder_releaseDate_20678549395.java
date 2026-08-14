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

public class OperatingSystem_OperatingSystemBuilder_releaseDate_20678549395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term393;
     Object term444;

    public OperatingSystem_OperatingSystemBuilder_releaseDate_20678549395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term394 = new Long(7411271909051562686L);
        Integer term442 = new Integer(-1922583790);
        term393 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem$OperatingSystemBuilder"));
        Object term432 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term433 = newInstance(Class.forName("java.time.LocalDate"));
        Object term437 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term393, term393.getClass(), "id", term394);
        setField(term393, term393.getClass(), "name", "aJlieCFVtF");
        setField(term393, term393.getClass(), "version", "ZiaGIbnzTs");
        setField(term393, term393.getClass(), "kernel", "tbcdzjIfER");
        setIntField(term433, term433.getClass(), "year", 2022);
        setShortField(term433, term433.getClass(), "month", (short) 2);
        setShortField(term433, term433.getClass(), "day", (short) 26);
        setField(term432, term432.getClass(), "date", term433);
        setByteField(term437, term437.getClass(), "hour", (byte) 11);
        setByteField(term437, term437.getClass(), "minute", (byte) 42);
        setByteField(term437, term437.getClass(), "second", (byte) 15);
        setIntField(term437, term437.getClass(), "nano", 377731937);
        setField(term432, term432.getClass(), "time", term437);
        setField(term393, term393.getClass(), "releaseDate", term432);
        setField(term393, term393.getClass(), "usages", term442);
        term444 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term445 = newInstance(Class.forName("java.time.LocalDate"));
        Object term449 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term445, term445.getClass(), "year", 2026);
        setShortField(term445, term445.getClass(), "month", (short) 12);
        setShortField(term445, term445.getClass(), "day", (short) 14);
        setField(term444, term444.getClass(), "date", term445);
        setByteField(term449, term449.getClass(), "hour", (byte) 16);
        setByteField(term449, term449.getClass(), "minute", (byte) 34);
        setByteField(term449, term449.getClass(), "second", (byte) 9);
        setIntField(term449, term449.getClass(), "nano", 518326996);
        setField(term444, term444.getClass(), "time", term449);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem$OperatingSystemBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term444;
        callMethod(klass, "releaseDate", argTypes, term393, args);
    }

};



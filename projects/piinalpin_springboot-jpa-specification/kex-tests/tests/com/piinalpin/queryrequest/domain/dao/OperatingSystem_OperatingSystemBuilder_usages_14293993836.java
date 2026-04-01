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

public class OperatingSystem_OperatingSystemBuilder_usages_14293993836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term484;
     Object term535;

    public OperatingSystem_OperatingSystemBuilder_usages_14293993836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term485 = new Long(4872422362414183754L);
        Integer term533 = new Integer(-616727354);
        term484 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem$OperatingSystemBuilder"));
        Object term523 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term524 = newInstance(Class.forName("java.time.LocalDate"));
        Object term528 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term484, term484.getClass(), "id", term485);
        setField(term484, term484.getClass(), "name", "HyxfbSQYBe");
        setField(term484, term484.getClass(), "version", "pCTimMblYc");
        setField(term484, term484.getClass(), "kernel", "hNxWaHcfhY");
        setIntField(term524, term524.getClass(), "year", 2025);
        setShortField(term524, term524.getClass(), "month", (short) 4);
        setShortField(term524, term524.getClass(), "day", (short) 24);
        setField(term523, term523.getClass(), "date", term524);
        setByteField(term528, term528.getClass(), "hour", (byte) 18);
        setByteField(term528, term528.getClass(), "minute", (byte) 11);
        setByteField(term528, term528.getClass(), "second", (byte) 40);
        setIntField(term528, term528.getClass(), "nano", 137454929);
        setField(term523, term523.getClass(), "time", term528);
        setField(term484, term484.getClass(), "releaseDate", term523);
        setField(term484, term484.getClass(), "usages", term533);
        term535 = new Integer(-1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem$OperatingSystemBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term535;
        callMethod(klass, "usages", argTypes, term484, args);
    }

};



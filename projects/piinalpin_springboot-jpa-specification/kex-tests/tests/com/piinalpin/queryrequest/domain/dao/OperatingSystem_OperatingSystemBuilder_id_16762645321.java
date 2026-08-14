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

public class OperatingSystem_OperatingSystemBuilder_id_16762645321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term52;

    public OperatingSystem_OperatingSystemBuilder_id_16762645321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2 = new Long(2442117782898005296L);
        Integer term50 = new Integer(568599855);
        term1 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem$OperatingSystemBuilder"));
        Object term40 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term41 = newInstance(Class.forName("java.time.LocalDate"));
        Object term45 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "name", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "version", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "kernel", "MuLcgQHgqz");
        setIntField(term41, term41.getClass(), "year", 2012);
        setShortField(term41, term41.getClass(), "month", (short) 8);
        setShortField(term41, term41.getClass(), "day", (short) 25);
        setField(term40, term40.getClass(), "date", term41);
        setByteField(term45, term45.getClass(), "hour", (byte) 5);
        setByteField(term45, term45.getClass(), "minute", (byte) 20);
        setByteField(term45, term45.getClass(), "second", (byte) 50);
        setIntField(term45, term45.getClass(), "nano", 345595912);
        setField(term40, term40.getClass(), "time", term45);
        setField(term1, term1.getClass(), "releaseDate", term40);
        setField(term1, term1.getClass(), "usages", term50);
        term52 = new Long(6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem$OperatingSystemBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term52;
        callMethod(klass, "id", argTypes, term1, args);
    }

};



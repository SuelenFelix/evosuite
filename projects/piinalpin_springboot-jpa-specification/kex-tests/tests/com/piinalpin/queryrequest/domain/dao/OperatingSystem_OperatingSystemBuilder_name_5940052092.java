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

public class OperatingSystem_OperatingSystemBuilder_name_5940052092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84;

    public OperatingSystem_OperatingSystemBuilder_name_5940052092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term85 = new Long(-8257434502486459194L);
        Integer term133 = new Integer(1162663216);
        term84 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem$OperatingSystemBuilder"));
        Object term123 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term124 = newInstance(Class.forName("java.time.LocalDate"));
        Object term128 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term84, term84.getClass(), "id", term85);
        setField(term84, term84.getClass(), "name", "xxtlPwDYFs");
        setField(term84, term84.getClass(), "version", "jJCZpVmanW");
        setField(term84, term84.getClass(), "kernel", "EGtDIRbSSb");
        setIntField(term124, term124.getClass(), "year", 2021);
        setShortField(term124, term124.getClass(), "month", (short) 1);
        setShortField(term124, term124.getClass(), "day", (short) 18);
        setField(term123, term123.getClass(), "date", term124);
        setByteField(term128, term128.getClass(), "hour", (byte) 13);
        setByteField(term128, term128.getClass(), "minute", (byte) 38);
        setByteField(term128, term128.getClass(), "second", (byte) 26);
        setIntField(term128, term128.getClass(), "nano", 544608644);
        setField(term123, term123.getClass(), "time", term128);
        setField(term84, term84.getClass(), "releaseDate", term123);
        setField(term84, term84.getClass(), "usages", term133);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem$OperatingSystemBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SzjVpOQTyS";
        callMethod(klass, "name", argTypes, term84, args);
    }

};



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

public class OperatingSystem_OperatingSystemBuilder_kernel_7729562494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290;

    public OperatingSystem_OperatingSystemBuilder_kernel_7729562494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term291 = new Long(5270370404989704783L);
        Integer term339 = new Integer(391863371);
        term290 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem$OperatingSystemBuilder"));
        Object term329 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term330 = newInstance(Class.forName("java.time.LocalDate"));
        Object term334 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term290, term290.getClass(), "id", term291);
        setField(term290, term290.getClass(), "name", "uuaPigETmJ");
        setField(term290, term290.getClass(), "version", "MxlszYVzRf");
        setField(term290, term290.getClass(), "kernel", "LQFpaHEwXR");
        setIntField(term330, term330.getClass(), "year", 2015);
        setShortField(term330, term330.getClass(), "month", (short) 4);
        setShortField(term330, term330.getClass(), "day", (short) 14);
        setField(term329, term329.getClass(), "date", term330);
        setByteField(term334, term334.getClass(), "hour", (byte) 18);
        setByteField(term334, term334.getClass(), "minute", (byte) 24);
        setByteField(term334, term334.getClass(), "second", (byte) 32);
        setIntField(term334, term334.getClass(), "nano", 369233818);
        setField(term329, term329.getClass(), "time", term334);
        setField(term290, term290.getClass(), "releaseDate", term329);
        setField(term290, term290.getClass(), "usages", term339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem$OperatingSystemBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oVcInYnLWB";
        callMethod(klass, "kernel", argTypes, term290, args);
    }

};



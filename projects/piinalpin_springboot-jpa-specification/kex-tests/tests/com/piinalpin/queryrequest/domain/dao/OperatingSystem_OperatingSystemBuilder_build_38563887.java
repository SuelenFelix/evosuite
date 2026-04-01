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

public class OperatingSystem_OperatingSystemBuilder_build_38563887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term567;

    public OperatingSystem_OperatingSystemBuilder_build_38563887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term568 = new Long(6811161968424632369L);
        Integer term616 = new Integer(-2038273078);
        term567 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem$OperatingSystemBuilder"));
        Object term606 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term607 = newInstance(Class.forName("java.time.LocalDate"));
        Object term611 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term567, term567.getClass(), "id", term568);
        setField(term567, term567.getClass(), "name", "RkybSrpybU");
        setField(term567, term567.getClass(), "version", "xOEqzGAmDU");
        setField(term567, term567.getClass(), "kernel", "eZFUvlxvGV");
        setIntField(term607, term607.getClass(), "year", 2024);
        setShortField(term607, term607.getClass(), "month", (short) 1);
        setShortField(term607, term607.getClass(), "day", (short) 24);
        setField(term606, term606.getClass(), "date", term607);
        setByteField(term611, term611.getClass(), "hour", (byte) 20);
        setByteField(term611, term611.getClass(), "minute", (byte) 28);
        setByteField(term611, term611.getClass(), "second", (byte) 39);
        setIntField(term611, term611.getClass(), "nano", 952728177);
        setField(term606, term606.getClass(), "time", term611);
        setField(term567, term567.getClass(), "releaseDate", term606);
        setField(term567, term567.getClass(), "usages", term616);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem$OperatingSystemBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term567, args);
    }

};



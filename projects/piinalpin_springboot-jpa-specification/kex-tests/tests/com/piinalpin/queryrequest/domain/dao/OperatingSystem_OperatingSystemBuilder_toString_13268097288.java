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

public class OperatingSystem_OperatingSystemBuilder_toString_13268097288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term648;

    public OperatingSystem_OperatingSystemBuilder_toString_13268097288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term649 = new Long(-7237588299778557629L);
        Integer term697 = new Integer(1227103734);
        term648 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem$OperatingSystemBuilder"));
        Object term687 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term688 = newInstance(Class.forName("java.time.LocalDate"));
        Object term692 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term648, term648.getClass(), "id", term649);
        setField(term648, term648.getClass(), "name", "BYqFIqCKAV");
        setField(term648, term648.getClass(), "version", "vrQLuWIDJX");
        setField(term648, term648.getClass(), "kernel", "flxyYxBRtu");
        setIntField(term688, term688.getClass(), "year", 2029);
        setShortField(term688, term688.getClass(), "month", (short) 8);
        setShortField(term688, term688.getClass(), "day", (short) 29);
        setField(term687, term687.getClass(), "date", term688);
        setByteField(term692, term692.getClass(), "hour", (byte) 15);
        setByteField(term692, term692.getClass(), "minute", (byte) 50);
        setByteField(term692, term692.getClass(), "second", (byte) 1);
        setIntField(term692, term692.getClass(), "nano", 277971904);
        setField(term687, term687.getClass(), "time", term692);
        setField(term648, term648.getClass(), "releaseDate", term687);
        setField(term648, term648.getClass(), "usages", term697);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem$OperatingSystemBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term648, args);
    }

};



package com.org.model.vo;

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
import static com.org.model.vo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Meeting2VO_getState_15851865634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4172;

    public Meeting2VO_getState_15851865634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4173 = new Integer(-1955890973);
        Integer term4197 = new Integer(-2038273078);
        term4172 = newInstance(Class.forName("com.org.model.vo.Meeting2VO"));
        Object term4187 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4188 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4192 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4172, term4172.getClass(), "id", term4173);
        setField(term4172, term4172.getClass(), "username", "NYSBqIpNlD");
        setIntField(term4188, term4188.getClass(), "year", 2015);
        setShortField(term4188, term4188.getClass(), "month", (short) 4);
        setShortField(term4188, term4188.getClass(), "day", (short) 14);
        setField(term4187, term4187.getClass(), "date", term4188);
        setByteField(term4192, term4192.getClass(), "hour", (byte) 18);
        setByteField(term4192, term4192.getClass(), "minute", (byte) 24);
        setByteField(term4192, term4192.getClass(), "second", (byte) 32);
        setIntField(term4192, term4192.getClass(), "nano", 369233818);
        setField(term4187, term4187.getClass(), "time", term4192);
        setField(term4172, term4172.getClass(), "startTime", term4187);
        setField(term4172, term4172.getClass(), "state", term4197);
        setField(term4172, term4172.getClass(), "faceUrl", "OWglDUWQYb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.Meeting2VO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getState", argTypes, term4172, args);
    }

};



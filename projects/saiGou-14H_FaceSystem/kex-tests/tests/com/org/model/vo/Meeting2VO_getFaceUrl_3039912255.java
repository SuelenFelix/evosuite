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

public class Meeting2VO_getFaceUrl_3039912255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4231;

    public Meeting2VO_getFaceUrl_3039912255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4232 = new Integer(1227103734);
        Integer term4256 = new Integer(-1339778481);
        term4231 = newInstance(Class.forName("com.org.model.vo.Meeting2VO"));
        Object term4246 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4247 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4251 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4231, term4231.getClass(), "id", term4232);
        setField(term4231, term4231.getClass(), "username", "FiqETbKjpv");
        setIntField(term4247, term4247.getClass(), "year", 2022);
        setShortField(term4247, term4247.getClass(), "month", (short) 2);
        setShortField(term4247, term4247.getClass(), "day", (short) 26);
        setField(term4246, term4246.getClass(), "date", term4247);
        setByteField(term4251, term4251.getClass(), "hour", (byte) 11);
        setByteField(term4251, term4251.getClass(), "minute", (byte) 42);
        setByteField(term4251, term4251.getClass(), "second", (byte) 15);
        setIntField(term4251, term4251.getClass(), "nano", 377731937);
        setField(term4246, term4246.getClass(), "time", term4251);
        setField(term4231, term4231.getClass(), "startTime", term4246);
        setField(term4231, term4231.getClass(), "state", term4256);
        setField(term4231, term4231.getClass(), "faceUrl", "FxXtdhhXyS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.Meeting2VO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFaceUrl", argTypes, term4231, args);
    }

};



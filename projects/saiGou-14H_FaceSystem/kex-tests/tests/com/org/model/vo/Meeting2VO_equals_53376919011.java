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

public class Meeting2VO_equals_53376919011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4643;
     Object term4682;

    public Meeting2VO_equals_53376919011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4644 = new Integer(-2068769794);
        Integer term4668 = new Integer(-117576464);
        term4643 = newInstance(Class.forName("com.org.model.vo.Meeting2VO"));
        Object term4658 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4659 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4663 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4643, term4643.getClass(), "id", term4644);
        setField(term4643, term4643.getClass(), "username", "TqiCjeuoWE");
        setIntField(term4659, term4659.getClass(), "year", 2018);
        setShortField(term4659, term4659.getClass(), "month", (short) 9);
        setShortField(term4659, term4659.getClass(), "day", (short) 28);
        setField(term4658, term4658.getClass(), "date", term4659);
        setByteField(term4663, term4663.getClass(), "hour", (byte) 3);
        setByteField(term4663, term4663.getClass(), "minute", (byte) 37);
        setByteField(term4663, term4663.getClass(), "second", (byte) 46);
        setIntField(term4663, term4663.getClass(), "nano", 763326845);
        setField(term4658, term4658.getClass(), "time", term4663);
        setField(term4643, term4643.getClass(), "startTime", term4658);
        setField(term4643, term4643.getClass(), "state", term4668);
        setField(term4643, term4643.getClass(), "faceUrl", "GWWfkXOYLP");
        term4682 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.Meeting2VO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4682;
        callMethod(klass, "equals", argTypes, term4643, args);
    }

};



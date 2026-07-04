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

public class Meeting2VO_hashCode_8508251513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4763;

    public Meeting2VO_hashCode_8508251513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4764 = new Integer(590364439);
        Integer term4788 = new Integer(865208305);
        term4763 = newInstance(Class.forName("com.org.model.vo.Meeting2VO"));
        Object term4778 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4779 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4783 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4763, term4763.getClass(), "id", term4764);
        setField(term4763, term4763.getClass(), "username", "GlxnEJvYeC");
        setIntField(term4779, term4779.getClass(), "year", 2021);
        setShortField(term4779, term4779.getClass(), "month", (short) 9);
        setShortField(term4779, term4779.getClass(), "day", (short) 7);
        setField(term4778, term4778.getClass(), "date", term4779);
        setByteField(term4783, term4783.getClass(), "hour", (byte) 5);
        setByteField(term4783, term4783.getClass(), "minute", (byte) 25);
        setByteField(term4783, term4783.getClass(), "second", (byte) 7);
        setIntField(term4783, term4783.getClass(), "nano", 755924076);
        setField(term4778, term4778.getClass(), "time", term4783);
        setField(term4763, term4763.getClass(), "startTime", term4778);
        setField(term4763, term4763.getClass(), "state", term4788);
        setField(term4763, term4763.getClass(), "faceUrl", "SLdOGaqmNv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.Meeting2VO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term4763, args);
    }

};



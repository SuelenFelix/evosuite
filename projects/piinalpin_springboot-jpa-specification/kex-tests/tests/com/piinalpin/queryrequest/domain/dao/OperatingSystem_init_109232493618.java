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

public class OperatingSystem_init_109232493618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2115;
     Object term2153;
     Object term2163;

    public OperatingSystem_init_109232493618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2115 = new Long(-7672528020740371001L);
        term2153 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2154 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2158 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term2154, term2154.getClass(), "year", 2028);
        setShortField(term2154, term2154.getClass(), "month", (short) 10);
        setShortField(term2154, term2154.getClass(), "day", (short) 1);
        setField(term2153, term2153.getClass(), "date", term2154);
        setByteField(term2158, term2158.getClass(), "hour", (byte) 17);
        setByteField(term2158, term2158.getClass(), "minute", (byte) 29);
        setByteField(term2158, term2158.getClass(), "second", (byte) 30);
        setIntField(term2158, term2158.getClass(), "nano", 845472306);
        setField(term2153, term2153.getClass(), "time", term2158);
        term2163 = new Integer(590364439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.time.LocalDateTime");
        argTypes[5] = Class.forName("java.lang.Integer");
        Object[] args = new Object[6];
        args[0] = term2115;
        args[1] = "OWKQODBLzb";
        args[2] = "wGmYcqUkgE";
        args[3] = "idgaQsnJpQ";
        args[4] = term2153;
        args[5] = term2163;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



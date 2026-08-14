package com.skyg0d.spring.jwt.model;

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
import static com.skyg0d.spring.jwt.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Role_getName_3442224835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term869;

    public Role_getName_3442224835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term907 = Class.forName((String) "com.skyg0d.spring.jwt.model.ERole");
        Field term906 = ((Class) term907).getDeclaredField((String) "ROLE_USER");
        ((Field) term906).setAccessible(true);
        Object enum2 = ((Field) term906).get((Object) null);
        term869 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.Role"));
        Object term883 = newInstance(Class.forName("java.util.UUID"));
        Object term886 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term887 = newInstance(Class.forName("java.time.LocalDate"));
        Object term891 = newInstance(Class.forName("java.time.LocalTime"));
        Object term896 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term897 = newInstance(Class.forName("java.time.LocalDate"));
        Object term901 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term869, term869.getClass(), "name", enum2);
        setLongField(term883, term883.getClass(), "mostSigBits", -484994522244390100L);
        setLongField(term883, term883.getClass(), "leastSigBits", 1233889271256172047L);
        setField(term869, term869.getClass(), "id", term883);
        setIntField(term887, term887.getClass(), "year", 2010);
        setShortField(term887, term887.getClass(), "month", (short) 5);
        setShortField(term887, term887.getClass(), "day", (short) 2);
        setField(term886, term886.getClass(), "date", term887);
        setByteField(term891, term891.getClass(), "hour", (byte) 2);
        setByteField(term891, term891.getClass(), "minute", (byte) 22);
        setByteField(term891, term891.getClass(), "second", (byte) 33);
        setIntField(term891, term891.getClass(), "nano", 530835039);
        setField(term886, term886.getClass(), "time", term891);
        setField(term869, term869.getClass(), "createdAt", term886);
        setIntField(term897, term897.getClass(), "year", 2024);
        setShortField(term897, term897.getClass(), "month", (short) 4);
        setShortField(term897, term897.getClass(), "day", (short) 24);
        setField(term896, term896.getClass(), "date", term897);
        setByteField(term901, term901.getClass(), "hour", (byte) 7);
        setByteField(term901, term901.getClass(), "minute", (byte) 2);
        setByteField(term901, term901.getClass(), "second", (byte) 51);
        setIntField(term901, term901.getClass(), "nano", 635502964);
        setField(term896, term896.getClass(), "time", term901);
        setField(term869, term869.getClass(), "updatedAt", term896);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.Role");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term869, args);
    }

};



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

public class Role_toString_4512290394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term629;

    public Role_toString_4512290394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term668 = Class.forName((String) "com.skyg0d.spring.jwt.model.ERole");
        Field term667 = ((Class) term668).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term667).setAccessible(true);
        Object enum1 = ((Field) term667).get((Object) null);
        term629 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.Role"));
        Object term644 = newInstance(Class.forName("java.util.UUID"));
        Object term647 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term648 = newInstance(Class.forName("java.time.LocalDate"));
        Object term652 = newInstance(Class.forName("java.time.LocalTime"));
        Object term657 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term658 = newInstance(Class.forName("java.time.LocalDate"));
        Object term662 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term629, term629.getClass(), "name", enum1);
        setLongField(term644, term644.getClass(), "mostSigBits", 5262507301787091109L);
        setLongField(term644, term644.getClass(), "leastSigBits", -6823727938421990489L);
        setField(term629, term629.getClass(), "id", term644);
        setIntField(term648, term648.getClass(), "year", 2012);
        setShortField(term648, term648.getClass(), "month", (short) 3);
        setShortField(term648, term648.getClass(), "day", (short) 27);
        setField(term647, term647.getClass(), "date", term648);
        setByteField(term652, term652.getClass(), "hour", (byte) 17);
        setByteField(term652, term652.getClass(), "minute", (byte) 49);
        setByteField(term652, term652.getClass(), "second", (byte) 24);
        setIntField(term652, term652.getClass(), "nano", 530647398);
        setField(term647, term647.getClass(), "time", term652);
        setField(term629, term629.getClass(), "createdAt", term647);
        setIntField(term658, term658.getClass(), "year", 2010);
        setShortField(term658, term658.getClass(), "month", (short) 6);
        setShortField(term658, term658.getClass(), "day", (short) 14);
        setField(term657, term657.getClass(), "date", term658);
        setByteField(term662, term662.getClass(), "hour", (byte) 6);
        setByteField(term662, term662.getClass(), "minute", (byte) 22);
        setByteField(term662, term662.getClass(), "second", (byte) 20);
        setIntField(term662, term662.getClass(), "nano", 25133051);
        setField(term657, term657.getClass(), "time", term662);
        setField(term629, term629.getClass(), "updatedAt", term657);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.Role");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term629, args);
    }

};



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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class User_getUsername_1736197806 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1586;

    public User_getUsername_1736197806() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1624 = new HashMap();
        Set<Object> term1682 =  ((Map) term1624).keySet();
        HashSet term1623 = new HashSet((Collection<? extends Object>) term1682);
        term1586 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.User"));
        Object term1629 = newInstance(Class.forName("java.util.UUID"));
        Object term1632 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1633 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1637 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1642 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1643 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1647 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1586, term1586.getClass(), "username", "MxlszYVzRf");
        setField(term1586, term1586.getClass(), "email", "LQFpaHEwXR");
        setField(term1586, term1586.getClass(), "password", "oVcInYnLWB");
        setField(term1586, term1586.getClass(), "roles", term1623);
        setLongField(term1629, term1629.getClass(), "mostSigBits", -6292278961887936280L);
        setLongField(term1629, term1629.getClass(), "leastSigBits", -6645965768855543712L);
        setField(term1586, term1586.getClass(), "id", term1629);
        setIntField(term1633, term1633.getClass(), "year", 2020);
        setShortField(term1633, term1633.getClass(), "month", (short) 8);
        setShortField(term1633, term1633.getClass(), "day", (short) 15);
        setField(term1632, term1632.getClass(), "date", term1633);
        setByteField(term1637, term1637.getClass(), "hour", (byte) 2);
        setByteField(term1637, term1637.getClass(), "minute", (byte) 0);
        setByteField(term1637, term1637.getClass(), "second", (byte) 38);
        setIntField(term1637, term1637.getClass(), "nano", 146431486);
        setField(term1632, term1632.getClass(), "time", term1637);
        setField(term1586, term1586.getClass(), "createdAt", term1632);
        setIntField(term1643, term1643.getClass(), "year", 2014);
        setShortField(term1643, term1643.getClass(), "month", (short) 11);
        setShortField(term1643, term1643.getClass(), "day", (short) 8);
        setField(term1642, term1642.getClass(), "date", term1643);
        setByteField(term1647, term1647.getClass(), "hour", (byte) 8);
        setByteField(term1647, term1647.getClass(), "minute", (byte) 43);
        setByteField(term1647, term1647.getClass(), "second", (byte) 32);
        setIntField(term1647, term1647.getClass(), "nano", 154434838);
        setField(term1642, term1642.getClass(), "time", term1647);
        setField(term1586, term1586.getClass(), "updatedAt", term1642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term1586, args);
    }

};



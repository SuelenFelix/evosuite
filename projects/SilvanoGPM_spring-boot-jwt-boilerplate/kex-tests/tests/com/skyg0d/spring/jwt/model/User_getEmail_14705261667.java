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

public class User_getEmail_14705261667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1683;

    public User_getEmail_14705261667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1721 = new HashMap();
        Set<Object> term1779 =  ((Map) term1721).keySet();
        HashSet term1720 = new HashSet((Collection<? extends Object>) term1779);
        term1683 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.User"));
        Object term1726 = newInstance(Class.forName("java.util.UUID"));
        Object term1729 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1730 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1734 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1739 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1740 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1744 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1683, term1683.getClass(), "username", "aJlieCFVtF");
        setField(term1683, term1683.getClass(), "email", "ZiaGIbnzTs");
        setField(term1683, term1683.getClass(), "password", "tbcdzjIfER");
        setField(term1683, term1683.getClass(), "roles", term1720);
        setLongField(term1726, term1726.getClass(), "mostSigBits", 4784595517102746672L);
        setLongField(term1726, term1726.getClass(), "leastSigBits", -7612550318181586304L);
        setField(term1683, term1683.getClass(), "id", term1726);
        setIntField(term1730, term1730.getClass(), "year", 2020);
        setShortField(term1730, term1730.getClass(), "month", (short) 5);
        setShortField(term1730, term1730.getClass(), "day", (short) 18);
        setField(term1729, term1729.getClass(), "date", term1730);
        setByteField(term1734, term1734.getClass(), "hour", (byte) 5);
        setByteField(term1734, term1734.getClass(), "minute", (byte) 46);
        setByteField(term1734, term1734.getClass(), "second", (byte) 13);
        setIntField(term1734, term1734.getClass(), "nano", 45893173);
        setField(term1729, term1729.getClass(), "time", term1734);
        setField(term1683, term1683.getClass(), "createdAt", term1729);
        setIntField(term1740, term1740.getClass(), "year", 2017);
        setShortField(term1740, term1740.getClass(), "month", (short) 4);
        setShortField(term1740, term1740.getClass(), "day", (short) 3);
        setField(term1739, term1739.getClass(), "date", term1740);
        setByteField(term1744, term1744.getClass(), "hour", (byte) 6);
        setByteField(term1744, term1744.getClass(), "minute", (byte) 51);
        setByteField(term1744, term1744.getClass(), "second", (byte) 10);
        setIntField(term1744, term1744.getClass(), "nano", 316377166);
        setField(term1739, term1739.getClass(), "time", term1744);
        setField(term1683, term1683.getClass(), "updatedAt", term1739);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term1683, args);
    }

};



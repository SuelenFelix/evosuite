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

public class User_getPassword_12288260478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1780;

    public User_getPassword_12288260478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1818 = new HashMap();
        Set<Object> term1876 =  ((Map) term1818).keySet();
        HashSet term1817 = new HashSet((Collection<? extends Object>) term1876);
        term1780 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.User"));
        Object term1823 = newInstance(Class.forName("java.util.UUID"));
        Object term1826 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1827 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1831 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1836 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1837 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1841 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1780, term1780.getClass(), "username", "HyxfbSQYBe");
        setField(term1780, term1780.getClass(), "email", "pCTimMblYc");
        setField(term1780, term1780.getClass(), "password", "hNxWaHcfhY");
        setField(term1780, term1780.getClass(), "roles", term1817);
        setLongField(term1823, term1823.getClass(), "mostSigBits", -2170847986967241072L);
        setLongField(term1823, term1823.getClass(), "leastSigBits", 4044358158040652353L);
        setField(term1780, term1780.getClass(), "id", term1823);
        setIntField(term1827, term1827.getClass(), "year", 2027);
        setShortField(term1827, term1827.getClass(), "month", (short) 8);
        setShortField(term1827, term1827.getClass(), "day", (short) 23);
        setField(term1826, term1826.getClass(), "date", term1827);
        setByteField(term1831, term1831.getClass(), "hour", (byte) 15);
        setByteField(term1831, term1831.getClass(), "minute", (byte) 12);
        setByteField(term1831, term1831.getClass(), "second", (byte) 6);
        setIntField(term1831, term1831.getClass(), "nano", 541218258);
        setField(term1826, term1826.getClass(), "time", term1831);
        setField(term1780, term1780.getClass(), "createdAt", term1826);
        setIntField(term1837, term1837.getClass(), "year", 2013);
        setShortField(term1837, term1837.getClass(), "month", (short) 5);
        setShortField(term1837, term1837.getClass(), "day", (short) 26);
        setField(term1836, term1836.getClass(), "date", term1837);
        setByteField(term1841, term1841.getClass(), "hour", (byte) 4);
        setByteField(term1841, term1841.getClass(), "minute", (byte) 39);
        setByteField(term1841, term1841.getClass(), "second", (byte) 5);
        setIntField(term1841, term1841.getClass(), "nano", 392869354);
        setField(term1836, term1836.getClass(), "time", term1841);
        setField(term1780, term1780.getClass(), "updatedAt", term1836);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term1780, args);
    }

};



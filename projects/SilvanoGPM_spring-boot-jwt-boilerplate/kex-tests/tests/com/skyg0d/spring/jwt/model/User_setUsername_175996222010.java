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

public class User_setUsername_175996222010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1974;

    public User_setUsername_175996222010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2012 = new HashMap();
        Set<Object> term2082 =  ((Map) term2012).keySet();
        HashSet term2011 = new HashSet((Collection<? extends Object>) term2082);
        term1974 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.User"));
        Object term2017 = newInstance(Class.forName("java.util.UUID"));
        Object term2020 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2021 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2025 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2030 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2031 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2035 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1974, term1974.getClass(), "username", "BYqFIqCKAV");
        setField(term1974, term1974.getClass(), "email", "vrQLuWIDJX");
        setField(term1974, term1974.getClass(), "password", "flxyYxBRtu");
        setField(term1974, term1974.getClass(), "roles", term2011);
        setLongField(term2017, term2017.getClass(), "mostSigBits", -5788180182343976541L);
        setLongField(term2017, term2017.getClass(), "leastSigBits", 2936323121573284007L);
        setField(term1974, term1974.getClass(), "id", term2017);
        setIntField(term2021, term2021.getClass(), "year", 2024);
        setShortField(term2021, term2021.getClass(), "month", (short) 5);
        setShortField(term2021, term2021.getClass(), "day", (short) 6);
        setField(term2020, term2020.getClass(), "date", term2021);
        setByteField(term2025, term2025.getClass(), "hour", (byte) 20);
        setByteField(term2025, term2025.getClass(), "minute", (byte) 14);
        setByteField(term2025, term2025.getClass(), "second", (byte) 27);
        setIntField(term2025, term2025.getClass(), "nano", 900636101);
        setField(term2020, term2020.getClass(), "time", term2025);
        setField(term1974, term1974.getClass(), "createdAt", term2020);
        setIntField(term2031, term2031.getClass(), "year", 2021);
        setShortField(term2031, term2031.getClass(), "month", (short) 4);
        setShortField(term2031, term2031.getClass(), "day", (short) 17);
        setField(term2030, term2030.getClass(), "date", term2031);
        setByteField(term2035, term2035.getClass(), "hour", (byte) 4);
        setByteField(term2035, term2035.getClass(), "minute", (byte) 11);
        setByteField(term2035, term2035.getClass(), "second", (byte) 16);
        setIntField(term2035, term2035.getClass(), "nano", 509895858);
        setField(term2030, term2030.getClass(), "time", term2035);
        setField(term1974, term1974.getClass(), "updatedAt", term2030);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OclPbYPkcH";
        callMethod(klass, "setUsername", argTypes, term1974, args);
    }

};



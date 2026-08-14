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

public class User_setPassword_147979880912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2212;

    public User_setPassword_147979880912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2250 = new HashMap();
        Set<Object> term2320 =  ((Map) term2250).keySet();
        HashSet term2249 = new HashSet((Collection<? extends Object>) term2320);
        term2212 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.User"));
        Object term2255 = newInstance(Class.forName("java.util.UUID"));
        Object term2258 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2259 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2263 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2268 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2269 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2273 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2212, term2212.getClass(), "username", "AijpHYOFuy");
        setField(term2212, term2212.getClass(), "email", "SbAoxhfrkn");
        setField(term2212, term2212.getClass(), "password", "kuTXqwMtDB");
        setField(term2212, term2212.getClass(), "roles", term2249);
        setLongField(term2255, term2255.getClass(), "mostSigBits", -2644215923136513282L);
        setLongField(term2255, term2255.getClass(), "leastSigBits", -1468719814009985452L);
        setField(term2212, term2212.getClass(), "id", term2255);
        setIntField(term2259, term2259.getClass(), "year", 2025);
        setShortField(term2259, term2259.getClass(), "month", (short) 9);
        setShortField(term2259, term2259.getClass(), "day", (short) 25);
        setField(term2258, term2258.getClass(), "date", term2259);
        setByteField(term2263, term2263.getClass(), "hour", (byte) 20);
        setByteField(term2263, term2263.getClass(), "minute", (byte) 0);
        setByteField(term2263, term2263.getClass(), "second", (byte) 25);
        setIntField(term2263, term2263.getClass(), "nano", 65871584);
        setField(term2258, term2258.getClass(), "time", term2263);
        setField(term2212, term2212.getClass(), "createdAt", term2258);
        setIntField(term2269, term2269.getClass(), "year", 2011);
        setShortField(term2269, term2269.getClass(), "month", (short) 9);
        setShortField(term2269, term2269.getClass(), "day", (short) 25);
        setField(term2268, term2268.getClass(), "date", term2269);
        setByteField(term2273, term2273.getClass(), "hour", (byte) 16);
        setByteField(term2273, term2273.getClass(), "minute", (byte) 45);
        setByteField(term2273, term2273.getClass(), "second", (byte) 19);
        setIntField(term2273, term2273.getClass(), "nano", 962864785);
        setField(term2268, term2268.getClass(), "time", term2273);
        setField(term2212, term2212.getClass(), "updatedAt", term2268);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "Ghbwtircqb";
        callMethod(klass, "setPassword", argTypes, term2212, args);
    }

};



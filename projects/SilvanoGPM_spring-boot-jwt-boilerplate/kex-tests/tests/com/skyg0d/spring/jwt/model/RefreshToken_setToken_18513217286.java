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
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class RefreshToken_setToken_18513217286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5180;

    public RefreshToken_setToken_18513217286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5219 = new HashMap();
        Set<Object> term5363 =  ((Map) term5219).keySet();
        HashSet term5218 = new HashSet((Collection<? extends Object>) term5363);
        term5180 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.RefreshToken"));
        Object term5181 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.User"));
        Object term5224 = newInstance(Class.forName("java.util.UUID"));
        Object term5227 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5228 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5232 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5237 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5238 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5242 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5259 = newInstance(Class.forName("java.time.Instant"));
        Object term5298 = newInstance(Class.forName("java.util.UUID"));
        Object term5301 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5302 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5306 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5311 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5312 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5316 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5181, term5181.getClass(), "username", "xOcJIiQQDu");
        setField(term5181, term5181.getClass(), "email", "GVizqqzXpy");
        setField(term5181, term5181.getClass(), "password", "JqXGgAhZPl");
        setField(term5181, term5181.getClass(), "roles", term5218);
        setLongField(term5224, term5224.getClass(), "mostSigBits", 1672578078364590450L);
        setLongField(term5224, term5224.getClass(), "leastSigBits", 4949335493504695457L);
        setField(term5181, term5181.getClass(), "id", term5224);
        setIntField(term5228, term5228.getClass(), "year", 2019);
        setShortField(term5228, term5228.getClass(), "month", (short) 8);
        setShortField(term5228, term5228.getClass(), "day", (short) 12);
        setField(term5227, term5227.getClass(), "date", term5228);
        setByteField(term5232, term5232.getClass(), "hour", (byte) 14);
        setByteField(term5232, term5232.getClass(), "minute", (byte) 1);
        setByteField(term5232, term5232.getClass(), "second", (byte) 51);
        setIntField(term5232, term5232.getClass(), "nano", 499021786);
        setField(term5227, term5227.getClass(), "time", term5232);
        setField(term5181, term5181.getClass(), "createdAt", term5227);
        setIntField(term5238, term5238.getClass(), "year", 2014);
        setShortField(term5238, term5238.getClass(), "month", (short) 7);
        setShortField(term5238, term5238.getClass(), "day", (short) 22);
        setField(term5237, term5237.getClass(), "date", term5238);
        setByteField(term5242, term5242.getClass(), "hour", (byte) 9);
        setByteField(term5242, term5242.getClass(), "minute", (byte) 40);
        setByteField(term5242, term5242.getClass(), "second", (byte) 34);
        setIntField(term5242, term5242.getClass(), "nano", 463008257);
        setField(term5237, term5237.getClass(), "time", term5242);
        setField(term5181, term5181.getClass(), "updatedAt", term5237);
        setField(term5180, term5180.getClass(), "user", term5181);
        setField(term5180, term5180.getClass(), "token", "jiKYgYHqIS");
        setLongField(term5259, term5259.getClass(), "seconds", 1429023851L);
        setIntField(term5259, term5259.getClass(), "nanos", 389000000);
        setField(term5180, term5180.getClass(), "expiryDate", term5259);
        setField(term5180, term5180.getClass(), "browser", "DfISiziTgG");
        setField(term5180, term5180.getClass(), "operatingSystem", "XqgfKFvPSD");
        setField(term5180, term5180.getClass(), "ipAddress", "JiVRgTZvKc");
        setLongField(term5298, term5298.getClass(), "mostSigBits", -5216789073301458893L);
        setLongField(term5298, term5298.getClass(), "leastSigBits", -1832940336320585644L);
        setField(term5180, term5180.getClass(), "id", term5298);
        setIntField(term5302, term5302.getClass(), "year", 2027);
        setShortField(term5302, term5302.getClass(), "month", (short) 6);
        setShortField(term5302, term5302.getClass(), "day", (short) 20);
        setField(term5301, term5301.getClass(), "date", term5302);
        setByteField(term5306, term5306.getClass(), "hour", (byte) 23);
        setByteField(term5306, term5306.getClass(), "minute", (byte) 21);
        setByteField(term5306, term5306.getClass(), "second", (byte) 6);
        setIntField(term5306, term5306.getClass(), "nano", 897776059);
        setField(term5301, term5301.getClass(), "time", term5306);
        setField(term5180, term5180.getClass(), "createdAt", term5301);
        setIntField(term5312, term5312.getClass(), "year", 2016);
        setShortField(term5312, term5312.getClass(), "month", (short) 3);
        setShortField(term5312, term5312.getClass(), "day", (short) 20);
        setField(term5311, term5311.getClass(), "date", term5312);
        setByteField(term5316, term5316.getClass(), "hour", (byte) 0);
        setByteField(term5316, term5316.getClass(), "minute", (byte) 54);
        setByteField(term5316, term5316.getClass(), "second", (byte) 6);
        setIntField(term5316, term5316.getClass(), "nano", 183302469);
        setField(term5311, term5311.getClass(), "time", term5316);
        setField(term5180, term5180.getClass(), "updatedAt", term5311);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.RefreshToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XPKmummaqg";
        callMethod(klass, "setToken", argTypes, term5180, args);
    }

};



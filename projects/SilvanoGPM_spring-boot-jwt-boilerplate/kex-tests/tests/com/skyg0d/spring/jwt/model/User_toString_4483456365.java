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

public class User_toString_4483456365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1489;

    public User_toString_4483456365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1527 = new HashMap();
        Set<Object> term1585 =  ((Map) term1527).keySet();
        HashSet term1526 = new HashSet((Collection<? extends Object>) term1585);
        term1489 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.User"));
        Object term1532 = newInstance(Class.forName("java.util.UUID"));
        Object term1535 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1536 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1540 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1545 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1546 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1550 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1489, term1489.getClass(), "username", "RMFIsYGgne");
        setField(term1489, term1489.getClass(), "email", "NRdvgJlhkX");
        setField(term1489, term1489.getClass(), "password", "uuaPigETmJ");
        setField(term1489, term1489.getClass(), "roles", term1526);
        setLongField(term1532, term1532.getClass(), "mostSigBits", 4178434741742309755L);
        setLongField(term1532, term1532.getClass(), "leastSigBits", -2068172595987555756L);
        setField(term1489, term1489.getClass(), "id", term1532);
        setIntField(term1536, term1536.getClass(), "year", 2015);
        setShortField(term1536, term1536.getClass(), "month", (short) 12);
        setShortField(term1536, term1536.getClass(), "day", (short) 23);
        setField(term1535, term1535.getClass(), "date", term1536);
        setByteField(term1540, term1540.getClass(), "hour", (byte) 14);
        setByteField(term1540, term1540.getClass(), "minute", (byte) 17);
        setByteField(term1540, term1540.getClass(), "second", (byte) 50);
        setIntField(term1540, term1540.getClass(), "nano", 325544804);
        setField(term1535, term1535.getClass(), "time", term1540);
        setField(term1489, term1489.getClass(), "createdAt", term1535);
        setIntField(term1546, term1546.getClass(), "year", 2027);
        setShortField(term1546, term1546.getClass(), "month", (short) 11);
        setShortField(term1546, term1546.getClass(), "day", (short) 8);
        setField(term1545, term1545.getClass(), "date", term1546);
        setByteField(term1550, term1550.getClass(), "hour", (byte) 11);
        setByteField(term1550, term1550.getClass(), "minute", (byte) 59);
        setByteField(term1550, term1550.getClass(), "second", (byte) 14);
        setIntField(term1550, term1550.getClass(), "nano", 322375591);
        setField(term1545, term1545.getClass(), "time", term1550);
        setField(term1489, term1489.getClass(), "updatedAt", term1545);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1489, args);
    }

};



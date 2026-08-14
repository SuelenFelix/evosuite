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

public class RefreshToken_setIpAddress_84446446810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6097;

    public RefreshToken_setIpAddress_84446446810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6136 = new HashMap();
        Set<Object> term6280 =  ((Map) term6136).keySet();
        HashSet term6135 = new HashSet((Collection<? extends Object>) term6280);
        term6097 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.RefreshToken"));
        Object term6098 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.User"));
        Object term6141 = newInstance(Class.forName("java.util.UUID"));
        Object term6144 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6145 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6149 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6154 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6155 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6159 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6176 = newInstance(Class.forName("java.time.Instant"));
        Object term6215 = newInstance(Class.forName("java.util.UUID"));
        Object term6218 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6219 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6223 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6228 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6229 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6233 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6098, term6098.getClass(), "username", "WzMEhMXkKx");
        setField(term6098, term6098.getClass(), "email", "XOiDvlDhdc");
        setField(term6098, term6098.getClass(), "password", "AdxvLJhNLe");
        setField(term6098, term6098.getClass(), "roles", term6135);
        setLongField(term6141, term6141.getClass(), "mostSigBits", -6342139649364011743L);
        setLongField(term6141, term6141.getClass(), "leastSigBits", -4924950707540628022L);
        setField(term6098, term6098.getClass(), "id", term6141);
        setIntField(term6145, term6145.getClass(), "year", 2026);
        setShortField(term6145, term6145.getClass(), "month", (short) 10);
        setShortField(term6145, term6145.getClass(), "day", (short) 19);
        setField(term6144, term6144.getClass(), "date", term6145);
        setByteField(term6149, term6149.getClass(), "hour", (byte) 7);
        setByteField(term6149, term6149.getClass(), "minute", (byte) 22);
        setByteField(term6149, term6149.getClass(), "second", (byte) 11);
        setIntField(term6149, term6149.getClass(), "nano", 17846677);
        setField(term6144, term6144.getClass(), "time", term6149);
        setField(term6098, term6098.getClass(), "createdAt", term6144);
        setIntField(term6155, term6155.getClass(), "year", 2018);
        setShortField(term6155, term6155.getClass(), "month", (short) 10);
        setShortField(term6155, term6155.getClass(), "day", (short) 17);
        setField(term6154, term6154.getClass(), "date", term6155);
        setByteField(term6159, term6159.getClass(), "hour", (byte) 5);
        setByteField(term6159, term6159.getClass(), "minute", (byte) 10);
        setByteField(term6159, term6159.getClass(), "second", (byte) 23);
        setIntField(term6159, term6159.getClass(), "nano", 571520422);
        setField(term6154, term6154.getClass(), "time", term6159);
        setField(term6098, term6098.getClass(), "updatedAt", term6154);
        setField(term6097, term6097.getClass(), "user", term6098);
        setField(term6097, term6097.getClass(), "token", "lHfTrWKMPk");
        setLongField(term6176, term6176.getClass(), "seconds", 1589457921L);
        setIntField(term6176, term6176.getClass(), "nanos", 30000000);
        setField(term6097, term6097.getClass(), "expiryDate", term6176);
        setField(term6097, term6097.getClass(), "browser", "JDaAnsVTGV");
        setField(term6097, term6097.getClass(), "operatingSystem", "mLUZFTfjle");
        setField(term6097, term6097.getClass(), "ipAddress", "xIeFjkHkOe");
        setLongField(term6215, term6215.getClass(), "mostSigBits", -4393710401270724527L);
        setLongField(term6215, term6215.getClass(), "leastSigBits", -4822736661741380518L);
        setField(term6097, term6097.getClass(), "id", term6215);
        setIntField(term6219, term6219.getClass(), "year", 2022);
        setShortField(term6219, term6219.getClass(), "month", (short) 11);
        setShortField(term6219, term6219.getClass(), "day", (short) 5);
        setField(term6218, term6218.getClass(), "date", term6219);
        setByteField(term6223, term6223.getClass(), "hour", (byte) 0);
        setByteField(term6223, term6223.getClass(), "minute", (byte) 51);
        setByteField(term6223, term6223.getClass(), "second", (byte) 23);
        setIntField(term6223, term6223.getClass(), "nano", 1140962);
        setField(term6218, term6218.getClass(), "time", term6223);
        setField(term6097, term6097.getClass(), "createdAt", term6218);
        setIntField(term6229, term6229.getClass(), "year", 2020);
        setShortField(term6229, term6229.getClass(), "month", (short) 5);
        setShortField(term6229, term6229.getClass(), "day", (short) 24);
        setField(term6228, term6228.getClass(), "date", term6229);
        setByteField(term6233, term6233.getClass(), "hour", (byte) 2);
        setByteField(term6233, term6233.getClass(), "minute", (byte) 9);
        setByteField(term6233, term6233.getClass(), "second", (byte) 52);
        setIntField(term6233, term6233.getClass(), "nano", 653329393);
        setField(term6228, term6228.getClass(), "time", term6233);
        setField(term6097, term6097.getClass(), "updatedAt", term6228);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.RefreshToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SdCKLMIYnX";
        callMethod(klass, "setIpAddress", argTypes, term6097, args);
    }

};



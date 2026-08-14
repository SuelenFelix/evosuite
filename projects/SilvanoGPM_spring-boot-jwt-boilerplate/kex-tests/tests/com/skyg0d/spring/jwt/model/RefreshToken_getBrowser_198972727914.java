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

public class RefreshToken_getBrowser_198972727914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6967;

    public RefreshToken_getBrowser_198972727914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7006 = new HashMap();
        Set<Object> term7138 =  ((Map) term7006).keySet();
        HashSet term7005 = new HashSet((Collection<? extends Object>) term7138);
        term6967 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.RefreshToken"));
        Object term6968 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.User"));
        Object term7011 = newInstance(Class.forName("java.util.UUID"));
        Object term7014 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7015 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7019 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7024 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7025 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7029 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7046 = newInstance(Class.forName("java.time.Instant"));
        Object term7085 = newInstance(Class.forName("java.util.UUID"));
        Object term7088 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7089 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7093 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7098 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7099 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7103 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6968, term6968.getClass(), "username", "ZfdXfCCFDf");
        setField(term6968, term6968.getClass(), "email", "MwwjNtdOFT");
        setField(term6968, term6968.getClass(), "password", "VYkqXKVlAJ");
        setField(term6968, term6968.getClass(), "roles", term7005);
        setLongField(term7011, term7011.getClass(), "mostSigBits", -2255965562447970862L);
        setLongField(term7011, term7011.getClass(), "leastSigBits", 148047808219672941L);
        setField(term6968, term6968.getClass(), "id", term7011);
        setIntField(term7015, term7015.getClass(), "year", 2019);
        setShortField(term7015, term7015.getClass(), "month", (short) 6);
        setShortField(term7015, term7015.getClass(), "day", (short) 12);
        setField(term7014, term7014.getClass(), "date", term7015);
        setByteField(term7019, term7019.getClass(), "hour", (byte) 5);
        setByteField(term7019, term7019.getClass(), "minute", (byte) 13);
        setByteField(term7019, term7019.getClass(), "second", (byte) 8);
        setIntField(term7019, term7019.getClass(), "nano", 838117658);
        setField(term7014, term7014.getClass(), "time", term7019);
        setField(term6968, term6968.getClass(), "createdAt", term7014);
        setIntField(term7025, term7025.getClass(), "year", 2014);
        setShortField(term7025, term7025.getClass(), "month", (short) 8);
        setShortField(term7025, term7025.getClass(), "day", (short) 13);
        setField(term7024, term7024.getClass(), "date", term7025);
        setByteField(term7029, term7029.getClass(), "hour", (byte) 13);
        setByteField(term7029, term7029.getClass(), "minute", (byte) 15);
        setByteField(term7029, term7029.getClass(), "second", (byte) 51);
        setIntField(term7029, term7029.getClass(), "nano", 433726678);
        setField(term7024, term7024.getClass(), "time", term7029);
        setField(term6968, term6968.getClass(), "updatedAt", term7024);
        setField(term6967, term6967.getClass(), "user", term6968);
        setField(term6967, term6967.getClass(), "token", "XkIoWJRNwN");
        setLongField(term7046, term7046.getClass(), "seconds", 1863631094L);
        setIntField(term7046, term7046.getClass(), "nanos", 992000000);
        setField(term6967, term6967.getClass(), "expiryDate", term7046);
        setField(term6967, term6967.getClass(), "browser", "aNWLJdrZMq");
        setField(term6967, term6967.getClass(), "operatingSystem", "HHmNoYxIGj");
        setField(term6967, term6967.getClass(), "ipAddress", "PtirvZmsGt");
        setLongField(term7085, term7085.getClass(), "mostSigBits", 7489064039921396098L);
        setLongField(term7085, term7085.getClass(), "leastSigBits", 6843866297465638866L);
        setField(term6967, term6967.getClass(), "id", term7085);
        setIntField(term7089, term7089.getClass(), "year", 2012);
        setShortField(term7089, term7089.getClass(), "month", (short) 5);
        setShortField(term7089, term7089.getClass(), "day", (short) 25);
        setField(term7088, term7088.getClass(), "date", term7089);
        setByteField(term7093, term7093.getClass(), "hour", (byte) 5);
        setByteField(term7093, term7093.getClass(), "minute", (byte) 8);
        setByteField(term7093, term7093.getClass(), "second", (byte) 47);
        setIntField(term7093, term7093.getClass(), "nano", 455554221);
        setField(term7088, term7088.getClass(), "time", term7093);
        setField(term6967, term6967.getClass(), "createdAt", term7088);
        setIntField(term7099, term7099.getClass(), "year", 2029);
        setShortField(term7099, term7099.getClass(), "month", (short) 11);
        setShortField(term7099, term7099.getClass(), "day", (short) 18);
        setField(term7098, term7098.getClass(), "date", term7099);
        setByteField(term7103, term7103.getClass(), "hour", (byte) 5);
        setByteField(term7103, term7103.getClass(), "minute", (byte) 36);
        setByteField(term7103, term7103.getClass(), "second", (byte) 57);
        setIntField(term7103, term7103.getClass(), "nano", 394167804);
        setField(term7098, term7098.getClass(), "time", term7103);
        setField(term6967, term6967.getClass(), "updatedAt", term7098);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.RefreshToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBrowser", argTypes, term6967, args);
    }

};



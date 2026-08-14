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

public class RefreshToken_setOperatingSystem_1989693679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5863;

    public RefreshToken_setOperatingSystem_1989693679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5902 = new HashMap();
        Set<Object> term6046 =  ((Map) term5902).keySet();
        HashSet term5901 = new HashSet((Collection<? extends Object>) term6046);
        term5863 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.RefreshToken"));
        Object term5864 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.User"));
        Object term5907 = newInstance(Class.forName("java.util.UUID"));
        Object term5910 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5911 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5915 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5920 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5921 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5925 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5942 = newInstance(Class.forName("java.time.Instant"));
        Object term5981 = newInstance(Class.forName("java.util.UUID"));
        Object term5984 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5985 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5989 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5994 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5995 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5999 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5864, term5864.getClass(), "username", "yGtHPyvYiQ");
        setField(term5864, term5864.getClass(), "email", "MvRIxilFMJ");
        setField(term5864, term5864.getClass(), "password", "iNwOJRBEjp");
        setField(term5864, term5864.getClass(), "roles", term5901);
        setLongField(term5907, term5907.getClass(), "mostSigBits", 1597484336218508869L);
        setLongField(term5907, term5907.getClass(), "leastSigBits", -685023850445639859L);
        setField(term5864, term5864.getClass(), "id", term5907);
        setIntField(term5911, term5911.getClass(), "year", 2029);
        setShortField(term5911, term5911.getClass(), "month", (short) 7);
        setShortField(term5911, term5911.getClass(), "day", (short) 19);
        setField(term5910, term5910.getClass(), "date", term5911);
        setByteField(term5915, term5915.getClass(), "hour", (byte) 17);
        setByteField(term5915, term5915.getClass(), "minute", (byte) 37);
        setByteField(term5915, term5915.getClass(), "second", (byte) 21);
        setIntField(term5915, term5915.getClass(), "nano", 320093277);
        setField(term5910, term5910.getClass(), "time", term5915);
        setField(term5864, term5864.getClass(), "createdAt", term5910);
        setIntField(term5921, term5921.getClass(), "year", 2028);
        setShortField(term5921, term5921.getClass(), "month", (short) 1);
        setShortField(term5921, term5921.getClass(), "day", (short) 11);
        setField(term5920, term5920.getClass(), "date", term5921);
        setByteField(term5925, term5925.getClass(), "hour", (byte) 22);
        setByteField(term5925, term5925.getClass(), "minute", (byte) 3);
        setByteField(term5925, term5925.getClass(), "second", (byte) 39);
        setIntField(term5925, term5925.getClass(), "nano", 175567313);
        setField(term5920, term5920.getClass(), "time", term5925);
        setField(term5864, term5864.getClass(), "updatedAt", term5920);
        setField(term5863, term5863.getClass(), "user", term5864);
        setField(term5863, term5863.getClass(), "token", "XylxrMBraH");
        setLongField(term5942, term5942.getClass(), "seconds", 1797203628L);
        setIntField(term5942, term5942.getClass(), "nanos", 25000000);
        setField(term5863, term5863.getClass(), "expiryDate", term5942);
        setField(term5863, term5863.getClass(), "browser", "pORebkoRdD");
        setField(term5863, term5863.getClass(), "operatingSystem", "mXGCWJDOqA");
        setField(term5863, term5863.getClass(), "ipAddress", "dpNsDgfPso");
        setLongField(term5981, term5981.getClass(), "mostSigBits", -6950146046121430355L);
        setLongField(term5981, term5981.getClass(), "leastSigBits", 1667122142089513324L);
        setField(term5863, term5863.getClass(), "id", term5981);
        setIntField(term5985, term5985.getClass(), "year", 2028);
        setShortField(term5985, term5985.getClass(), "month", (short) 4);
        setShortField(term5985, term5985.getClass(), "day", (short) 11);
        setField(term5984, term5984.getClass(), "date", term5985);
        setByteField(term5989, term5989.getClass(), "hour", (byte) 4);
        setByteField(term5989, term5989.getClass(), "minute", (byte) 45);
        setByteField(term5989, term5989.getClass(), "second", (byte) 2);
        setIntField(term5989, term5989.getClass(), "nano", 374177968);
        setField(term5984, term5984.getClass(), "time", term5989);
        setField(term5863, term5863.getClass(), "createdAt", term5984);
        setIntField(term5995, term5995.getClass(), "year", 2021);
        setShortField(term5995, term5995.getClass(), "month", (short) 4);
        setShortField(term5995, term5995.getClass(), "day", (short) 22);
        setField(term5994, term5994.getClass(), "date", term5995);
        setByteField(term5999, term5999.getClass(), "hour", (byte) 17);
        setByteField(term5999, term5999.getClass(), "minute", (byte) 6);
        setByteField(term5999, term5999.getClass(), "second", (byte) 33);
        setIntField(term5999, term5999.getClass(), "nano", 21410850);
        setField(term5994, term5994.getClass(), "time", term5999);
        setField(term5863, term5863.getClass(), "updatedAt", term5994);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.RefreshToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hCWPJQKpdc";
        callMethod(klass, "setOperatingSystem", argTypes, term5863, args);
    }

};



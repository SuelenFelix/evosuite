package com.skyg0d.spring.jwt.payload.response;

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
import static com.skyg0d.spring.jwt.payload.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UserTokenResponse_init_3681430130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6070;

    public UserTokenResponse_init_3681430130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6109 = new HashMap();
        Set<Object> term6241 =  ((Map) term6109).keySet();
        HashSet term6108 = new HashSet((Collection<? extends Object>) term6241);
        term6070 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.RefreshToken"));
        Object term6071 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.User"));
        Object term6114 = newInstance(Class.forName("java.util.UUID"));
        Object term6117 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6118 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6122 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6127 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6128 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6132 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6149 = newInstance(Class.forName("java.time.Instant"));
        Object term6188 = newInstance(Class.forName("java.util.UUID"));
        Object term6191 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6192 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6196 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6201 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6202 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6206 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6071, term6071.getClass(), "username", "qYzsiuXOgS");
        setField(term6071, term6071.getClass(), "email", "bxrCBbrrct");
        setField(term6071, term6071.getClass(), "password", "CKWpJaaaxX");
        setField(term6071, term6071.getClass(), "roles", term6108);
        setLongField(term6114, term6114.getClass(), "mostSigBits", 2442117782898005296L);
        setLongField(term6114, term6114.getClass(), "leastSigBits", 6375119433582206027L);
        setField(term6071, term6071.getClass(), "id", term6114);
        setIntField(term6118, term6118.getClass(), "year", 2015);
        setShortField(term6118, term6118.getClass(), "month", (short) 3);
        setShortField(term6118, term6118.getClass(), "day", (short) 10);
        setField(term6117, term6117.getClass(), "date", term6118);
        setByteField(term6122, term6122.getClass(), "hour", (byte) 23);
        setByteField(term6122, term6122.getClass(), "minute", (byte) 34);
        setByteField(term6122, term6122.getClass(), "second", (byte) 44);
        setIntField(term6122, term6122.getClass(), "nano", 587322824);
        setField(term6117, term6117.getClass(), "time", term6122);
        setField(term6071, term6071.getClass(), "createdAt", term6117);
        setIntField(term6128, term6128.getClass(), "year", 2027);
        setShortField(term6128, term6128.getClass(), "month", (short) 8);
        setShortField(term6128, term6128.getClass(), "day", (short) 26);
        setField(term6127, term6127.getClass(), "date", term6128);
        setByteField(term6132, term6132.getClass(), "hour", (byte) 5);
        setByteField(term6132, term6132.getClass(), "minute", (byte) 11);
        setByteField(term6132, term6132.getClass(), "second", (byte) 9);
        setIntField(term6132, term6132.getClass(), "nano", 219245092);
        setField(term6127, term6127.getClass(), "time", term6132);
        setField(term6071, term6071.getClass(), "updatedAt", term6127);
        setField(term6070, term6070.getClass(), "user", term6071);
        setField(term6070, term6070.getClass(), "token", "UBRmXJmfrt");
        setLongField(term6149, term6149.getClass(), "seconds", 1589457921L);
        setIntField(term6149, term6149.getClass(), "nanos", 30000000);
        setField(term6070, term6070.getClass(), "expiryDate", term6149);
        setField(term6070, term6070.getClass(), "browser", "WZzvmIHhzZ");
        setField(term6070, term6070.getClass(), "operatingSystem", "doQLHkjpNm");
        setField(term6070, term6070.getClass(), "ipAddress", "lCyLIcSuom");
        setLongField(term6188, term6188.getClass(), "mostSigBits", -8257434502486459194L);
        setLongField(term6188, term6188.getClass(), "leastSigBits", -8400487765614892086L);
        setField(term6070, term6070.getClass(), "id", term6188);
        setIntField(term6192, term6192.getClass(), "year", 2025);
        setShortField(term6192, term6192.getClass(), "month", (short) 3);
        setShortField(term6192, term6192.getClass(), "day", (short) 9);
        setField(term6191, term6191.getClass(), "date", term6192);
        setByteField(term6196, term6196.getClass(), "hour", (byte) 5);
        setByteField(term6196, term6196.getClass(), "minute", (byte) 49);
        setByteField(term6196, term6196.getClass(), "second", (byte) 12);
        setIntField(term6196, term6196.getClass(), "nano", 791695028);
        setField(term6191, term6191.getClass(), "time", term6196);
        setField(term6070, term6070.getClass(), "createdAt", term6191);
        setIntField(term6202, term6202.getClass(), "year", 2023);
        setShortField(term6202, term6202.getClass(), "month", (short) 9);
        setShortField(term6202, term6202.getClass(), "day", (short) 23);
        setField(term6201, term6201.getClass(), "date", term6202);
        setByteField(term6206, term6206.getClass(), "hour", (byte) 12);
        setByteField(term6206, term6206.getClass(), "minute", (byte) 55);
        setByteField(term6206, term6206.getClass(), "second", (byte) 58);
        setIntField(term6206, term6206.getClass(), "nano", 159178396);
        setField(term6201, term6201.getClass(), "time", term6206);
        setField(term6070, term6070.getClass(), "updatedAt", term6201);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.skyg0d.spring.jwt.model.RefreshToken");
        Object[] args = new Object[1];
        args[0] = term6070;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



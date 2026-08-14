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

public class RefreshToken_getToken_142765331212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6543;

    public RefreshToken_getToken_142765331212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6582 = new HashMap();
        Set<Object> term6714 =  ((Map) term6582).keySet();
        HashSet term6581 = new HashSet((Collection<? extends Object>) term6714);
        term6543 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.RefreshToken"));
        Object term6544 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.User"));
        Object term6587 = newInstance(Class.forName("java.util.UUID"));
        Object term6590 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6591 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6595 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6600 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6601 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6605 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6622 = newInstance(Class.forName("java.time.Instant"));
        Object term6661 = newInstance(Class.forName("java.util.UUID"));
        Object term6664 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6665 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6669 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6674 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6675 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6679 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6544, term6544.getClass(), "username", "VMeAzAHwZj");
        setField(term6544, term6544.getClass(), "email", "PznxWXsZME");
        setField(term6544, term6544.getClass(), "password", "ZzIujlwVsw");
        setField(term6544, term6544.getClass(), "roles", term6581);
        setLongField(term6587, term6587.getClass(), "mostSigBits", -900457279156388404L);
        setLongField(term6587, term6587.getClass(), "leastSigBits", 1084801489398441516L);
        setField(term6544, term6544.getClass(), "id", term6587);
        setIntField(term6591, term6591.getClass(), "year", 2014);
        setShortField(term6591, term6591.getClass(), "month", (short) 1);
        setShortField(term6591, term6591.getClass(), "day", (short) 26);
        setField(term6590, term6590.getClass(), "date", term6591);
        setByteField(term6595, term6595.getClass(), "hour", (byte) 3);
        setByteField(term6595, term6595.getClass(), "minute", (byte) 31);
        setByteField(term6595, term6595.getClass(), "second", (byte) 56);
        setIntField(term6595, term6595.getClass(), "nano", 100873602);
        setField(term6590, term6590.getClass(), "time", term6595);
        setField(term6544, term6544.getClass(), "createdAt", term6590);
        setIntField(term6601, term6601.getClass(), "year", 2021);
        setShortField(term6601, term6601.getClass(), "month", (short) 12);
        setShortField(term6601, term6601.getClass(), "day", (short) 1);
        setField(term6600, term6600.getClass(), "date", term6601);
        setByteField(term6605, term6605.getClass(), "hour", (byte) 15);
        setByteField(term6605, term6605.getClass(), "minute", (byte) 30);
        setByteField(term6605, term6605.getClass(), "second", (byte) 5);
        setIntField(term6605, term6605.getClass(), "nano", 996341606);
        setField(term6600, term6600.getClass(), "time", term6605);
        setField(term6544, term6544.getClass(), "updatedAt", term6600);
        setField(term6543, term6543.getClass(), "user", term6544);
        setField(term6543, term6543.getClass(), "token", "LWyEaeIyAo");
        setLongField(term6622, term6622.getClass(), "seconds", 1349069753L);
        setIntField(term6622, term6622.getClass(), "nanos", 960000000);
        setField(term6543, term6543.getClass(), "expiryDate", term6622);
        setField(term6543, term6543.getClass(), "browser", "yVMkkQhvmN");
        setField(term6543, term6543.getClass(), "operatingSystem", "mvrkADEgpp");
        setField(term6543, term6543.getClass(), "ipAddress", "pXOkjyeIRb");
        setLongField(term6661, term6661.getClass(), "mostSigBits", 6273754186658578034L);
        setLongField(term6661, term6661.getClass(), "leastSigBits", 3620247240684476031L);
        setField(term6543, term6543.getClass(), "id", term6661);
        setIntField(term6665, term6665.getClass(), "year", 2016);
        setShortField(term6665, term6665.getClass(), "month", (short) 4);
        setShortField(term6665, term6665.getClass(), "day", (short) 18);
        setField(term6664, term6664.getClass(), "date", term6665);
        setByteField(term6669, term6669.getClass(), "hour", (byte) 15);
        setByteField(term6669, term6669.getClass(), "minute", (byte) 56);
        setByteField(term6669, term6669.getClass(), "second", (byte) 45);
        setIntField(term6669, term6669.getClass(), "nano", 248103350);
        setField(term6664, term6664.getClass(), "time", term6669);
        setField(term6543, term6543.getClass(), "createdAt", term6664);
        setIntField(term6675, term6675.getClass(), "year", 2028);
        setShortField(term6675, term6675.getClass(), "month", (short) 3);
        setShortField(term6675, term6675.getClass(), "day", (short) 25);
        setField(term6674, term6674.getClass(), "date", term6675);
        setByteField(term6679, term6679.getClass(), "hour", (byte) 6);
        setByteField(term6679, term6679.getClass(), "minute", (byte) 9);
        setByteField(term6679, term6679.getClass(), "second", (byte) 35);
        setIntField(term6679, term6679.getClass(), "nano", 744453524);
        setField(term6674, term6674.getClass(), "time", term6679);
        setField(term6543, term6543.getClass(), "updatedAt", term6674);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.RefreshToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getToken", argTypes, term6543, args);
    }

};



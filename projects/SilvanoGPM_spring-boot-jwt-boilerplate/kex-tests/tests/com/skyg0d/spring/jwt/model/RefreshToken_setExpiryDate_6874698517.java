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

public class RefreshToken_setExpiryDate_6874698517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5414;
     Object term5555;

    public RefreshToken_setExpiryDate_6874698517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5453 = new HashMap();
        Set<Object> term5588 =  ((Map) term5453).keySet();
        HashSet term5452 = new HashSet((Collection<? extends Object>) term5588);
        term5414 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.RefreshToken"));
        Object term5415 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.User"));
        Object term5458 = newInstance(Class.forName("java.util.UUID"));
        Object term5461 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5462 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5466 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5471 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5472 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5476 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5493 = newInstance(Class.forName("java.time.Instant"));
        Object term5532 = newInstance(Class.forName("java.util.UUID"));
        Object term5535 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5536 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5540 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5545 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5546 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5550 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5415, term5415.getClass(), "username", "BKLfkLiZTH");
        setField(term5415, term5415.getClass(), "email", "SPpkrGcPRr");
        setField(term5415, term5415.getClass(), "password", "sEccwbJKYE");
        setField(term5415, term5415.getClass(), "roles", term5452);
        setLongField(term5458, term5458.getClass(), "mostSigBits", -8033714905181142681L);
        setLongField(term5458, term5458.getClass(), "leastSigBits", -9040825890007374809L);
        setField(term5415, term5415.getClass(), "id", term5458);
        setIntField(term5462, term5462.getClass(), "year", 2013);
        setShortField(term5462, term5462.getClass(), "month", (short) 11);
        setShortField(term5462, term5462.getClass(), "day", (short) 19);
        setField(term5461, term5461.getClass(), "date", term5462);
        setByteField(term5466, term5466.getClass(), "hour", (byte) 6);
        setByteField(term5466, term5466.getClass(), "minute", (byte) 45);
        setByteField(term5466, term5466.getClass(), "second", (byte) 10);
        setIntField(term5466, term5466.getClass(), "nano", 288981190);
        setField(term5461, term5461.getClass(), "time", term5466);
        setField(term5415, term5415.getClass(), "createdAt", term5461);
        setIntField(term5472, term5472.getClass(), "year", 2025);
        setShortField(term5472, term5472.getClass(), "month", (short) 9);
        setShortField(term5472, term5472.getClass(), "day", (short) 18);
        setField(term5471, term5471.getClass(), "date", term5472);
        setByteField(term5476, term5476.getClass(), "hour", (byte) 16);
        setByteField(term5476, term5476.getClass(), "minute", (byte) 1);
        setByteField(term5476, term5476.getClass(), "second", (byte) 23);
        setIntField(term5476, term5476.getClass(), "nano", 178285726);
        setField(term5471, term5471.getClass(), "time", term5476);
        setField(term5415, term5415.getClass(), "updatedAt", term5471);
        setField(term5414, term5414.getClass(), "user", term5415);
        setField(term5414, term5414.getClass(), "token", "AWRooQKkdW");
        setLongField(term5493, term5493.getClass(), "seconds", 1495357463L);
        setIntField(term5493, term5493.getClass(), "nanos", 288000000);
        setField(term5414, term5414.getClass(), "expiryDate", term5493);
        setField(term5414, term5414.getClass(), "browser", "vjxIhXHxGR");
        setField(term5414, term5414.getClass(), "operatingSystem", "QXzGXbEXMu");
        setField(term5414, term5414.getClass(), "ipAddress", "qxSDVejjiY");
        setLongField(term5532, term5532.getClass(), "mostSigBits", 1368340889161782793L);
        setLongField(term5532, term5532.getClass(), "leastSigBits", -5786861555969446503L);
        setField(term5414, term5414.getClass(), "id", term5532);
        setIntField(term5536, term5536.getClass(), "year", 2013);
        setShortField(term5536, term5536.getClass(), "month", (short) 7);
        setShortField(term5536, term5536.getClass(), "day", (short) 26);
        setField(term5535, term5535.getClass(), "date", term5536);
        setByteField(term5540, term5540.getClass(), "hour", (byte) 14);
        setByteField(term5540, term5540.getClass(), "minute", (byte) 45);
        setByteField(term5540, term5540.getClass(), "second", (byte) 33);
        setIntField(term5540, term5540.getClass(), "nano", 547995853);
        setField(term5535, term5535.getClass(), "time", term5540);
        setField(term5414, term5414.getClass(), "createdAt", term5535);
        setIntField(term5546, term5546.getClass(), "year", 2016);
        setShortField(term5546, term5546.getClass(), "month", (short) 12);
        setShortField(term5546, term5546.getClass(), "day", (short) 20);
        setField(term5545, term5545.getClass(), "date", term5546);
        setByteField(term5550, term5550.getClass(), "hour", (byte) 8);
        setByteField(term5550, term5550.getClass(), "minute", (byte) 46);
        setByteField(term5550, term5550.getClass(), "second", (byte) 16);
        setIntField(term5550, term5550.getClass(), "nano", 10071864);
        setField(term5545, term5545.getClass(), "time", term5550);
        setField(term5414, term5414.getClass(), "updatedAt", term5545);
        term5555 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term5555, term5555.getClass(), "seconds", 1645834034L);
        setIntField(term5555, term5555.getClass(), "nanos", 896000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.RefreshToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = term5555;
        callMethod(klass, "setExpiryDate", argTypes, term5414, args);
    }

};



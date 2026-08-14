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

public class RefreshToken_init_6514674762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4471;
     Object term4549;

    public RefreshToken_init_6514674762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4509 = new HashMap();
        Set<Object> term4618 =  ((Map) term4509).keySet();
        HashSet term4508 = new HashSet((Collection<? extends Object>) term4618);
        term4471 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.User"));
        Object term4514 = newInstance(Class.forName("java.util.UUID"));
        Object term4517 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4518 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4522 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4527 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4528 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4532 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4471, term4471.getClass(), "username", "TJmVBGfTML");
        setField(term4471, term4471.getClass(), "email", "tPlsykYBqO");
        setField(term4471, term4471.getClass(), "password", "bLPjGVBhlX");
        setField(term4471, term4471.getClass(), "roles", term4508);
        setLongField(term4514, term4514.getClass(), "mostSigBits", 4474998035090263139L);
        setLongField(term4514, term4514.getClass(), "leastSigBits", 2848819812340321742L);
        setField(term4471, term4471.getClass(), "id", term4514);
        setIntField(term4518, term4518.getClass(), "year", 2025);
        setShortField(term4518, term4518.getClass(), "month", (short) 12);
        setShortField(term4518, term4518.getClass(), "day", (short) 16);
        setField(term4517, term4517.getClass(), "date", term4518);
        setByteField(term4522, term4522.getClass(), "hour", (byte) 7);
        setByteField(term4522, term4522.getClass(), "minute", (byte) 53);
        setByteField(term4522, term4522.getClass(), "second", (byte) 23);
        setIntField(term4522, term4522.getClass(), "nano", 532991944);
        setField(term4517, term4517.getClass(), "time", term4522);
        setField(term4471, term4471.getClass(), "createdAt", term4517);
        setIntField(term4528, term4528.getClass(), "year", 2024);
        setShortField(term4528, term4528.getClass(), "month", (short) 2);
        setShortField(term4528, term4528.getClass(), "day", (short) 5);
        setField(term4527, term4527.getClass(), "date", term4528);
        setByteField(term4532, term4532.getClass(), "hour", (byte) 12);
        setByteField(term4532, term4532.getClass(), "minute", (byte) 28);
        setByteField(term4532, term4532.getClass(), "second", (byte) 37);
        setIntField(term4532, term4532.getClass(), "nano", 689695229);
        setField(term4527, term4527.getClass(), "time", term4532);
        setField(term4471, term4471.getClass(), "updatedAt", term4527);
        term4549 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term4549, term4549.getClass(), "seconds", 1606045635L);
        setIntField(term4549, term4549.getClass(), "nanos", 837000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.RefreshToken");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.skyg0d.spring.jwt.model.User");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.time.Instant");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        Object[] args = new Object[6];
        args[0] = term4471;
        args[1] = "whBvTVIIlC";
        args[2] = term4549;
        args[3] = "IgRJUzaCwW";
        args[4] = "JUmudUmaaV";
        args[5] = "KoyGrUJeJW";
        Object instance = callConstructor(klass, argTypes, args);
    }

};



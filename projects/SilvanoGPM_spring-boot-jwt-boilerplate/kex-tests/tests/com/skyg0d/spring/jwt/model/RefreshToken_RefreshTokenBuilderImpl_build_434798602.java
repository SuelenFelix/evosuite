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

public class RefreshToken_RefreshTokenBuilderImpl_build_434798602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3151;

    public RefreshToken_RefreshTokenBuilderImpl_build_434798602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3190 = new HashMap();
        Set<Object> term3322 =  ((Map) term3190).keySet();
        HashSet term3189 = new HashSet((Collection<? extends Object>) term3322);
        term3151 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.RefreshToken$RefreshTokenBuilderImpl"));
        Object term3152 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.User"));
        Object term3195 = newInstance(Class.forName("java.util.UUID"));
        Object term3198 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3199 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3203 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3208 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3209 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3213 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3230 = newInstance(Class.forName("java.time.Instant"));
        Object term3269 = newInstance(Class.forName("java.util.UUID"));
        Object term3272 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3273 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3277 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3282 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3283 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3287 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3152, term3152.getClass(), "username", "tShwQLRGNe");
        setField(term3152, term3152.getClass(), "email", "LvtrsXUliU");
        setField(term3152, term3152.getClass(), "password", "xLbjWUgOIL");
        setField(term3152, term3152.getClass(), "roles", term3189);
        setLongField(term3195, term3195.getClass(), "mostSigBits", 414749984815662075L);
        setLongField(term3195, term3195.getClass(), "leastSigBits", 463622836963501975L);
        setField(term3152, term3152.getClass(), "id", term3195);
        setIntField(term3199, term3199.getClass(), "year", 2018);
        setShortField(term3199, term3199.getClass(), "month", (short) 2);
        setShortField(term3199, term3199.getClass(), "day", (short) 14);
        setField(term3198, term3198.getClass(), "date", term3199);
        setByteField(term3203, term3203.getClass(), "hour", (byte) 2);
        setByteField(term3203, term3203.getClass(), "minute", (byte) 40);
        setByteField(term3203, term3203.getClass(), "second", (byte) 48);
        setIntField(term3203, term3203.getClass(), "nano", 371006728);
        setField(term3198, term3198.getClass(), "time", term3203);
        setField(term3152, term3152.getClass(), "createdAt", term3198);
        setIntField(term3209, term3209.getClass(), "year", 2025);
        setShortField(term3209, term3209.getClass(), "month", (short) 8);
        setShortField(term3209, term3209.getClass(), "day", (short) 22);
        setField(term3208, term3208.getClass(), "date", term3209);
        setByteField(term3213, term3213.getClass(), "hour", (byte) 6);
        setByteField(term3213, term3213.getClass(), "minute", (byte) 48);
        setByteField(term3213, term3213.getClass(), "second", (byte) 49);
        setIntField(term3213, term3213.getClass(), "nano", 46400229);
        setField(term3208, term3208.getClass(), "time", term3213);
        setField(term3152, term3152.getClass(), "updatedAt", term3208);
        setField(term3151, term3151.getClass(), "user", term3152);
        setField(term3151, term3151.getClass(), "token", "jDtqGUpnZN");
        setLongField(term3230, term3230.getClass(), "seconds", 1480438351L);
        setIntField(term3230, term3230.getClass(), "nanos", 369000000);
        setField(term3151, term3151.getClass(), "expiryDate", term3230);
        setField(term3151, term3151.getClass(), "browser", "nGKItKLYNC");
        setField(term3151, term3151.getClass(), "operatingSystem", "UiUYnPrcCi");
        setField(term3151, term3151.getClass(), "ipAddress", "UoYtihxVaS");
        setLongField(term3269, term3269.getClass(), "mostSigBits", 305759998609888272L);
        setLongField(term3269, term3269.getClass(), "leastSigBits", -8654565919063661957L);
        setField(term3151, term3151.getClass(), "id", term3269);
        setIntField(term3273, term3273.getClass(), "year", 2028);
        setShortField(term3273, term3273.getClass(), "month", (short) 4);
        setShortField(term3273, term3273.getClass(), "day", (short) 1);
        setField(term3272, term3272.getClass(), "date", term3273);
        setByteField(term3277, term3277.getClass(), "hour", (byte) 16);
        setByteField(term3277, term3277.getClass(), "minute", (byte) 22);
        setByteField(term3277, term3277.getClass(), "second", (byte) 32);
        setIntField(term3277, term3277.getClass(), "nano", 406353763);
        setField(term3272, term3272.getClass(), "time", term3277);
        setField(term3151, term3151.getClass(), "createdAt", term3272);
        setIntField(term3283, term3283.getClass(), "year", 2019);
        setShortField(term3283, term3283.getClass(), "month", (short) 7);
        setShortField(term3283, term3283.getClass(), "day", (short) 19);
        setField(term3282, term3282.getClass(), "date", term3283);
        setByteField(term3287, term3287.getClass(), "hour", (byte) 10);
        setByteField(term3287, term3287.getClass(), "minute", (byte) 54);
        setByteField(term3287, term3287.getClass(), "second", (byte) 55);
        setIntField(term3287, term3287.getClass(), "nano", 244650454);
        setField(term3282, term3282.getClass(), "time", term3287);
        setField(term3151, term3151.getClass(), "updatedAt", term3282);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.RefreshToken$RefreshTokenBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term3151, args);
    }

};



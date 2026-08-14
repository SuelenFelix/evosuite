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

public class RefreshToken_RefreshTokenBuilderImpl_self_6672507951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2939;

    public RefreshToken_RefreshTokenBuilderImpl_self_6672507951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2978 = new HashMap();
        Set<Object> term3110 =  ((Map) term2978).keySet();
        HashSet term2977 = new HashSet((Collection<? extends Object>) term3110);
        term2939 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.RefreshToken$RefreshTokenBuilderImpl"));
        Object term2940 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.User"));
        Object term2983 = newInstance(Class.forName("java.util.UUID"));
        Object term2986 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2987 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2991 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2996 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2997 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3001 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3018 = newInstance(Class.forName("java.time.Instant"));
        Object term3057 = newInstance(Class.forName("java.util.UUID"));
        Object term3060 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3061 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3065 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3070 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3071 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3075 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2940, term2940.getClass(), "username", "aKnKipADSo");
        setField(term2940, term2940.getClass(), "email", "wSQxaModmm");
        setField(term2940, term2940.getClass(), "password", "UlajhuVLaP");
        setField(term2940, term2940.getClass(), "roles", term2977);
        setLongField(term2983, term2983.getClass(), "mostSigBits", 2443640364875054177L);
        setLongField(term2983, term2983.getClass(), "leastSigBits", -1610676979013636850L);
        setField(term2940, term2940.getClass(), "id", term2983);
        setIntField(term2987, term2987.getClass(), "year", 2016);
        setShortField(term2987, term2987.getClass(), "month", (short) 10);
        setShortField(term2987, term2987.getClass(), "day", (short) 20);
        setField(term2986, term2986.getClass(), "date", term2987);
        setByteField(term2991, term2991.getClass(), "hour", (byte) 18);
        setByteField(term2991, term2991.getClass(), "minute", (byte) 39);
        setByteField(term2991, term2991.getClass(), "second", (byte) 1);
        setIntField(term2991, term2991.getClass(), "nano", 196253988);
        setField(term2986, term2986.getClass(), "time", term2991);
        setField(term2940, term2940.getClass(), "createdAt", term2986);
        setIntField(term2997, term2997.getClass(), "year", 2019);
        setShortField(term2997, term2997.getClass(), "month", (short) 1);
        setShortField(term2997, term2997.getClass(), "day", (short) 6);
        setField(term2996, term2996.getClass(), "date", term2997);
        setByteField(term3001, term3001.getClass(), "hour", (byte) 18);
        setByteField(term3001, term3001.getClass(), "minute", (byte) 8);
        setByteField(term3001, term3001.getClass(), "second", (byte) 46);
        setIntField(term3001, term3001.getClass(), "nano", 934136445);
        setField(term2996, term2996.getClass(), "time", term3001);
        setField(term2940, term2940.getClass(), "updatedAt", term2996);
        setField(term2939, term2939.getClass(), "user", term2940);
        setField(term2939, term2939.getClass(), "token", "gGSMzuGICf");
        setLongField(term3018, term3018.getClass(), "seconds", 1345871412L);
        setIntField(term3018, term3018.getClass(), "nanos", 244000000);
        setField(term2939, term2939.getClass(), "expiryDate", term3018);
        setField(term2939, term2939.getClass(), "browser", "hxCBltsObl");
        setField(term2939, term2939.getClass(), "operatingSystem", "BndsHwAFMv");
        setField(term2939, term2939.getClass(), "ipAddress", "GzFkzHGYFt");
        setLongField(term3057, term3057.getClass(), "mostSigBits", 2062173786000223358L);
        setLongField(term3057, term3057.getClass(), "leastSigBits", -8658027316505137504L);
        setField(term2939, term2939.getClass(), "id", term3057);
        setIntField(term3061, term3061.getClass(), "year", 2028);
        setShortField(term3061, term3061.getClass(), "month", (short) 1);
        setShortField(term3061, term3061.getClass(), "day", (short) 18);
        setField(term3060, term3060.getClass(), "date", term3061);
        setByteField(term3065, term3065.getClass(), "hour", (byte) 12);
        setByteField(term3065, term3065.getClass(), "minute", (byte) 4);
        setByteField(term3065, term3065.getClass(), "second", (byte) 39);
        setIntField(term3065, term3065.getClass(), "nano", 651287093);
        setField(term3060, term3060.getClass(), "time", term3065);
        setField(term2939, term2939.getClass(), "createdAt", term3060);
        setIntField(term3071, term3071.getClass(), "year", 2027);
        setShortField(term3071, term3071.getClass(), "month", (short) 7);
        setShortField(term3071, term3071.getClass(), "day", (short) 23);
        setField(term3070, term3070.getClass(), "date", term3071);
        setByteField(term3075, term3075.getClass(), "hour", (byte) 12);
        setByteField(term3075, term3075.getClass(), "minute", (byte) 6);
        setByteField(term3075, term3075.getClass(), "second", (byte) 19);
        setIntField(term3075, term3075.getClass(), "nano", 8025683);
        setField(term3070, term3070.getClass(), "time", term3075);
        setField(term2939, term2939.getClass(), "updatedAt", term3070);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.RefreshToken$RefreshTokenBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "self", argTypes, term2939, args);
    }

};



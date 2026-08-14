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

public class RefreshToken_setUser_12714248395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4871;
     Object term5012;

    public RefreshToken_setUser_12714248395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4910 = new HashMap();
        Set<Object> term5108 =  ((Map) term4910).keySet();
        HashSet term4909 = new HashSet((Collection<? extends Object>) term5108);
        term4871 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.RefreshToken"));
        Object term4872 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.User"));
        Object term4915 = newInstance(Class.forName("java.util.UUID"));
        Object term4918 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4919 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4923 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4928 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4929 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4933 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4950 = newInstance(Class.forName("java.time.Instant"));
        Object term4989 = newInstance(Class.forName("java.util.UUID"));
        Object term4992 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4993 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4997 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5002 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5003 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5007 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4872, term4872.getClass(), "username", "VgZnGoIFwQ");
        setField(term4872, term4872.getClass(), "email", "jUbSRrkrYZ");
        setField(term4872, term4872.getClass(), "password", "bWWfajKbEX");
        setField(term4872, term4872.getClass(), "roles", term4909);
        setLongField(term4915, term4915.getClass(), "mostSigBits", -2177368829816872572L);
        setLongField(term4915, term4915.getClass(), "leastSigBits", -8463029266761149071L);
        setField(term4872, term4872.getClass(), "id", term4915);
        setIntField(term4919, term4919.getClass(), "year", 2021);
        setShortField(term4919, term4919.getClass(), "month", (short) 4);
        setShortField(term4919, term4919.getClass(), "day", (short) 26);
        setField(term4918, term4918.getClass(), "date", term4919);
        setByteField(term4923, term4923.getClass(), "hour", (byte) 11);
        setByteField(term4923, term4923.getClass(), "minute", (byte) 34);
        setByteField(term4923, term4923.getClass(), "second", (byte) 15);
        setIntField(term4923, term4923.getClass(), "nano", 638206023);
        setField(term4918, term4918.getClass(), "time", term4923);
        setField(term4872, term4872.getClass(), "createdAt", term4918);
        setIntField(term4929, term4929.getClass(), "year", 2013);
        setShortField(term4929, term4929.getClass(), "month", (short) 9);
        setShortField(term4929, term4929.getClass(), "day", (short) 13);
        setField(term4928, term4928.getClass(), "date", term4929);
        setByteField(term4933, term4933.getClass(), "hour", (byte) 14);
        setByteField(term4933, term4933.getClass(), "minute", (byte) 36);
        setByteField(term4933, term4933.getClass(), "second", (byte) 59);
        setIntField(term4933, term4933.getClass(), "nano", 363124001);
        setField(term4928, term4928.getClass(), "time", term4933);
        setField(term4872, term4872.getClass(), "updatedAt", term4928);
        setField(term4871, term4871.getClass(), "user", term4872);
        setField(term4871, term4871.getClass(), "token", "cAPeiZHKGJ");
        setLongField(term4950, term4950.getClass(), "seconds", 1515890130L);
        setIntField(term4950, term4950.getClass(), "nanos", 18000000);
        setField(term4871, term4871.getClass(), "expiryDate", term4950);
        setField(term4871, term4871.getClass(), "browser", "LvJFtLBaxj");
        setField(term4871, term4871.getClass(), "operatingSystem", "PHvxnGHptP");
        setField(term4871, term4871.getClass(), "ipAddress", "TimdotUuNC");
        setLongField(term4989, term4989.getClass(), "mostSigBits", 3133860696238261492L);
        setLongField(term4989, term4989.getClass(), "leastSigBits", 7247160664318067468L);
        setField(term4871, term4871.getClass(), "id", term4989);
        setIntField(term4993, term4993.getClass(), "year", 2020);
        setShortField(term4993, term4993.getClass(), "month", (short) 12);
        setShortField(term4993, term4993.getClass(), "day", (short) 21);
        setField(term4992, term4992.getClass(), "date", term4993);
        setByteField(term4997, term4997.getClass(), "hour", (byte) 20);
        setByteField(term4997, term4997.getClass(), "minute", (byte) 16);
        setByteField(term4997, term4997.getClass(), "second", (byte) 59);
        setIntField(term4997, term4997.getClass(), "nano", 976524801);
        setField(term4992, term4992.getClass(), "time", term4997);
        setField(term4871, term4871.getClass(), "createdAt", term4992);
        setIntField(term5003, term5003.getClass(), "year", 2028);
        setShortField(term5003, term5003.getClass(), "month", (short) 5);
        setShortField(term5003, term5003.getClass(), "day", (short) 15);
        setField(term5002, term5002.getClass(), "date", term5003);
        setByteField(term5007, term5007.getClass(), "hour", (byte) 20);
        setByteField(term5007, term5007.getClass(), "minute", (byte) 31);
        setByteField(term5007, term5007.getClass(), "second", (byte) 49);
        setIntField(term5007, term5007.getClass(), "nano", 945744862);
        setField(term5002, term5002.getClass(), "time", term5007);
        setField(term4871, term4871.getClass(), "updatedAt", term5002);
        HashMap term5050 = new HashMap();
        Set<Object> term5179 =  ((Map) term5050).keySet();
        HashSet term5049 = new HashSet((Collection<? extends Object>) term5179);
        term5012 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.User"));
        Object term5055 = newInstance(Class.forName("java.util.UUID"));
        Object term5058 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5059 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5063 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5068 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5069 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5073 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5012, term5012.getClass(), "username", "PkWMRdJcBb");
        setField(term5012, term5012.getClass(), "email", "jSpAteRute");
        setField(term5012, term5012.getClass(), "password", "swZVeJAxjt");
        setField(term5012, term5012.getClass(), "roles", term5049);
        setLongField(term5055, term5055.getClass(), "mostSigBits", 2135754395358000892L);
        setLongField(term5055, term5055.getClass(), "leastSigBits", -8085190702504231560L);
        setField(term5012, term5012.getClass(), "id", term5055);
        setIntField(term5059, term5059.getClass(), "year", 2016);
        setShortField(term5059, term5059.getClass(), "month", (short) 6);
        setShortField(term5059, term5059.getClass(), "day", (short) 23);
        setField(term5058, term5058.getClass(), "date", term5059);
        setByteField(term5063, term5063.getClass(), "hour", (byte) 20);
        setByteField(term5063, term5063.getClass(), "minute", (byte) 51);
        setByteField(term5063, term5063.getClass(), "second", (byte) 43);
        setIntField(term5063, term5063.getClass(), "nano", 284389409);
        setField(term5058, term5058.getClass(), "time", term5063);
        setField(term5012, term5012.getClass(), "createdAt", term5058);
        setIntField(term5069, term5069.getClass(), "year", 2014);
        setShortField(term5069, term5069.getClass(), "month", (short) 10);
        setShortField(term5069, term5069.getClass(), "day", (short) 7);
        setField(term5068, term5068.getClass(), "date", term5069);
        setByteField(term5073, term5073.getClass(), "hour", (byte) 12);
        setByteField(term5073, term5073.getClass(), "minute", (byte) 59);
        setByteField(term5073, term5073.getClass(), "second", (byte) 39);
        setIntField(term5073, term5073.getClass(), "nano", 603709306);
        setField(term5068, term5068.getClass(), "time", term5073);
        setField(term5012, term5012.getClass(), "updatedAt", term5068);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.RefreshToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.skyg0d.spring.jwt.model.User");
        Object[] args = new Object[1];
        args[0] = term5012;
        callMethod(klass, "setUser", argTypes, term4871, args);
    }

};



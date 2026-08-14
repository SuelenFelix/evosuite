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

public class RefreshToken_getExpiryDate_193300473113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6755;

    public RefreshToken_getExpiryDate_193300473113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6794 = new HashMap();
        Set<Object> term6926 =  ((Map) term6794).keySet();
        HashSet term6793 = new HashSet((Collection<? extends Object>) term6926);
        term6755 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.RefreshToken"));
        Object term6756 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.User"));
        Object term6799 = newInstance(Class.forName("java.util.UUID"));
        Object term6802 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6803 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6807 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6812 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6813 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6817 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6834 = newInstance(Class.forName("java.time.Instant"));
        Object term6873 = newInstance(Class.forName("java.util.UUID"));
        Object term6876 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6877 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6881 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6886 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6887 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6891 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6756, term6756.getClass(), "username", "GgZWSjxjyE");
        setField(term6756, term6756.getClass(), "email", "EeBVbzjcCI");
        setField(term6756, term6756.getClass(), "password", "UfQtPRyWRC");
        setField(term6756, term6756.getClass(), "roles", term6793);
        setLongField(term6799, term6799.getClass(), "mostSigBits", 8313800941204938919L);
        setLongField(term6799, term6799.getClass(), "leastSigBits", -1214968196781083707L);
        setField(term6756, term6756.getClass(), "id", term6799);
        setIntField(term6803, term6803.getClass(), "year", 2017);
        setShortField(term6803, term6803.getClass(), "month", (short) 6);
        setShortField(term6803, term6803.getClass(), "day", (short) 28);
        setField(term6802, term6802.getClass(), "date", term6803);
        setByteField(term6807, term6807.getClass(), "hour", (byte) 8);
        setByteField(term6807, term6807.getClass(), "minute", (byte) 1);
        setByteField(term6807, term6807.getClass(), "second", (byte) 14);
        setIntField(term6807, term6807.getClass(), "nano", 501033715);
        setField(term6802, term6802.getClass(), "time", term6807);
        setField(term6756, term6756.getClass(), "createdAt", term6802);
        setIntField(term6813, term6813.getClass(), "year", 2016);
        setShortField(term6813, term6813.getClass(), "month", (short) 10);
        setShortField(term6813, term6813.getClass(), "day", (short) 10);
        setField(term6812, term6812.getClass(), "date", term6813);
        setByteField(term6817, term6817.getClass(), "hour", (byte) 16);
        setByteField(term6817, term6817.getClass(), "minute", (byte) 7);
        setByteField(term6817, term6817.getClass(), "second", (byte) 16);
        setIntField(term6817, term6817.getClass(), "nano", 995200309);
        setField(term6812, term6812.getClass(), "time", term6817);
        setField(term6756, term6756.getClass(), "updatedAt", term6812);
        setField(term6755, term6755.getClass(), "user", term6756);
        setField(term6755, term6755.getClass(), "token", "FPvxVzzSvD");
        setLongField(term6834, term6834.getClass(), "seconds", 1706078172L);
        setIntField(term6834, term6834.getClass(), "nanos", 457000000);
        setField(term6755, term6755.getClass(), "expiryDate", term6834);
        setField(term6755, term6755.getClass(), "browser", "WHcwFgsGFC");
        setField(term6755, term6755.getClass(), "operatingSystem", "HzqpegHiRq");
        setField(term6755, term6755.getClass(), "ipAddress", "jwsfVjMoJT");
        setLongField(term6873, term6873.getClass(), "mostSigBits", -1804015692891701666L);
        setLongField(term6873, term6873.getClass(), "leastSigBits", -6432617521836576658L);
        setField(term6755, term6755.getClass(), "id", term6873);
        setIntField(term6877, term6877.getClass(), "year", 2014);
        setShortField(term6877, term6877.getClass(), "month", (short) 5);
        setShortField(term6877, term6877.getClass(), "day", (short) 31);
        setField(term6876, term6876.getClass(), "date", term6877);
        setByteField(term6881, term6881.getClass(), "hour", (byte) 16);
        setByteField(term6881, term6881.getClass(), "minute", (byte) 3);
        setByteField(term6881, term6881.getClass(), "second", (byte) 14);
        setIntField(term6881, term6881.getClass(), "nano", 281059649);
        setField(term6876, term6876.getClass(), "time", term6881);
        setField(term6755, term6755.getClass(), "createdAt", term6876);
        setIntField(term6887, term6887.getClass(), "year", 2010);
        setShortField(term6887, term6887.getClass(), "month", (short) 12);
        setShortField(term6887, term6887.getClass(), "day", (short) 30);
        setField(term6886, term6886.getClass(), "date", term6887);
        setByteField(term6891, term6891.getClass(), "hour", (byte) 17);
        setByteField(term6891, term6891.getClass(), "minute", (byte) 44);
        setByteField(term6891, term6891.getClass(), "second", (byte) 59);
        setIntField(term6891, term6891.getClass(), "nano", 881407895);
        setField(term6886, term6886.getClass(), "time", term6891);
        setField(term6755, term6755.getClass(), "updatedAt", term6886);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.RefreshToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExpiryDate", argTypes, term6755, args);
    }

};



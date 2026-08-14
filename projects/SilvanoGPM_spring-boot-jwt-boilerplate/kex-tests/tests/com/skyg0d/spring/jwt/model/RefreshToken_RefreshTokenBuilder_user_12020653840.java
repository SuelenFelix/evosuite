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

public class RefreshToken_RefreshTokenBuilder_user_12020653840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3600;

    public RefreshToken_RefreshTokenBuilder_user_12020653840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3638 = new HashMap();
        Set<Object> term3696 =  ((Map) term3638).keySet();
        HashSet term3637 = new HashSet((Collection<? extends Object>) term3696);
        term3600 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.User"));
        Object term3643 = newInstance(Class.forName("java.util.UUID"));
        Object term3646 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3647 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3651 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3656 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3657 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3661 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3600, term3600.getClass(), "username", "JDswTTCZHV");
        setField(term3600, term3600.getClass(), "email", "onpbIeEKoi");
        setField(term3600, term3600.getClass(), "password", "YRHGsAkhxb");
        setField(term3600, term3600.getClass(), "roles", term3637);
        setLongField(term3643, term3643.getClass(), "mostSigBits", 41775768178052008L);
        setLongField(term3643, term3643.getClass(), "leastSigBits", 6682528376118987775L);
        setField(term3600, term3600.getClass(), "id", term3643);
        setIntField(term3647, term3647.getClass(), "year", 2022);
        setShortField(term3647, term3647.getClass(), "month", (short) 11);
        setShortField(term3647, term3647.getClass(), "day", (short) 10);
        setField(term3646, term3646.getClass(), "date", term3647);
        setByteField(term3651, term3651.getClass(), "hour", (byte) 20);
        setByteField(term3651, term3651.getClass(), "minute", (byte) 8);
        setByteField(term3651, term3651.getClass(), "second", (byte) 35);
        setIntField(term3651, term3651.getClass(), "nano", 658416570);
        setField(term3646, term3646.getClass(), "time", term3651);
        setField(term3600, term3600.getClass(), "createdAt", term3646);
        setIntField(term3657, term3657.getClass(), "year", 2018);
        setShortField(term3657, term3657.getClass(), "month", (short) 11);
        setShortField(term3657, term3657.getClass(), "day", (short) 9);
        setField(term3656, term3656.getClass(), "date", term3657);
        setByteField(term3661, term3661.getClass(), "hour", (byte) 6);
        setByteField(term3661, term3661.getClass(), "minute", (byte) 8);
        setByteField(term3661, term3661.getClass(), "second", (byte) 32);
        setIntField(term3661, term3661.getClass(), "nano", 750733310);
        setField(term3656, term3656.getClass(), "time", term3661);
        setField(term3600, term3600.getClass(), "updatedAt", term3656);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.RefreshToken$RefreshTokenBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.skyg0d.spring.jwt.model.User");
        Object[] args = new Object[1];
        args[0] = term3600;
        callMethod(klass, "user", argTypes, null, args);
    }

};



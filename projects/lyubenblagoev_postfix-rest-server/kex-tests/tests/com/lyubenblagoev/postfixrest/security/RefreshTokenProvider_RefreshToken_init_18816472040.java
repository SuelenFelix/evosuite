package com.lyubenblagoev.postfixrest.security;

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
import static com.lyubenblagoev.postfixrest.security.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class RefreshTokenProvider_RefreshToken_init_18816472040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4;
     Object term19;

    public RefreshTokenProvider_RefreshToken_init_18816472040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5 = new Integer(30);
        term4 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.security.RefreshTokenProvider"));
        setField(term4, term4.getClass(), "refreshTokenValidityInDays", term5);
        term19 = newInstance(Class.forName("java.util.Date"));
        setLongField(term19, term19.getClass(), "fastTime", 1345871412244L);
        setField(term19, term19.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.security.RefreshTokenProvider$RefreshToken");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.lyubenblagoev.postfixrest.security.RefreshTokenProvider");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.Date");
        Object[] args = new Object[3];
        args[0] = term4;
        args[1] = "PAEBtnZtTD";
        args[2] = term19;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



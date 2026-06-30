package com.innoq.cookiebasedsessionapp;

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
import static com.innoq.cookiebasedsessionapp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SignedUserInfoCookie_Payload_toString_5806489343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205;

    public SignedUserInfoCookie_Payload_toString_5806489343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term205 = newInstance(Class.forName("com.innoq.cookiebasedsessionapp.SignedUserInfoCookie$Payload"));
        setField(term205, term205.getClass(), "username", null);
        setField(term205, term205.getClass(), "roles", null);
        setField(term205, term205.getClass(), "colour", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innoq.cookiebasedsessionapp.SignedUserInfoCookie$Payload");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term205, args);
    }

};



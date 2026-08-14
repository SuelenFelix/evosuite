package com.example.demo.jwt;

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
import static com.example.demo.jwt.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UsernameAndPasswordAuthenticationRequest_canEqual_8612322345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271;
     Object term296;

    public UsernameAndPasswordAuthenticationRequest_canEqual_8612322345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term271 = newInstance(Class.forName("com.example.demo.jwt.UsernameAndPasswordAuthenticationRequest"));
        setField(term271, term271.getClass(), "username", "MxlszYVzRf");
        setField(term271, term271.getClass(), "password", "LQFpaHEwXR");
        term296 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.demo.jwt.UsernameAndPasswordAuthenticationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term296;
        callMethod(klass, "canEqual", argTypes, term271, args);
    }

};



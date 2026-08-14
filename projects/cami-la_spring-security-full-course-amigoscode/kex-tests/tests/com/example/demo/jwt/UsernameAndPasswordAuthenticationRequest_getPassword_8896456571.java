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

public class UsernameAndPasswordAuthenticationRequest_getPassword_8896456571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46;

    public UsernameAndPasswordAuthenticationRequest_getPassword_8896456571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46 = newInstance(Class.forName("com.example.demo.jwt.UsernameAndPasswordAuthenticationRequest"));
        setField(term46, term46.getClass(), "username", "MuLcgQHgqz");
        setField(term46, term46.getClass(), "password", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.demo.jwt.UsernameAndPasswordAuthenticationRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term46, args);
    }

};



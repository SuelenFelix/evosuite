package org.zerhusen.security.rest.dto;

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
import static org.zerhusen.security.rest.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class LoginDto_toString_42709405015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term382;

    public LoginDto_toString_42709405015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term382 = newInstance(Class.forName("org.zerhusen.security.rest.dto.LoginDto"));
        setField(term382, term382.getClass(), "username", null);
        setField(term382, term382.getClass(), "password", null);
        setField(term382, term382.getClass(), "rememberMe", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.zerhusen.security.rest.dto.LoginDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term382, args);
    }

};



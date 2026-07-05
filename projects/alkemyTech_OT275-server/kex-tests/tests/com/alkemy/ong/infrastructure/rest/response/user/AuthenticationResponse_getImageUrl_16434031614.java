package com.alkemy.ong.infrastructure.rest.response.user;

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
import static com.alkemy.ong.infrastructure.rest.response.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AuthenticationResponse_getImageUrl_16434031614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1814;

    public AuthenticationResponse_getImageUrl_16434031614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1814 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.user.AuthenticationResponse"));
        setField(term1814, term1814.getClass(), "firstName", "idgaQsnJpQ");
        setField(term1814, term1814.getClass(), "lastName", "VgZnGoIFwQ");
        setField(term1814, term1814.getClass(), "email", "jUbSRrkrYZ");
        setField(term1814, term1814.getClass(), "imageUrl", "bWWfajKbEX");
        setField(term1814, term1814.getClass(), "token", "cAPeiZHKGJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.user.AuthenticationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term1814, args);
    }

};



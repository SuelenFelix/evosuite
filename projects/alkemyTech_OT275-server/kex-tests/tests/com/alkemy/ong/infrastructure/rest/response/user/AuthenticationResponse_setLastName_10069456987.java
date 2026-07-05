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

public class AuthenticationResponse_setLastName_10069456987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2169;

    public AuthenticationResponse_setLastName_10069456987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2169 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.user.AuthenticationResponse"));
        setField(term2169, term2169.getClass(), "firstName", "XqgfKFvPSD");
        setField(term2169, term2169.getClass(), "lastName", "JiVRgTZvKc");
        setField(term2169, term2169.getClass(), "email", "XPKmummaqg");
        setField(term2169, term2169.getClass(), "imageUrl", "BKLfkLiZTH");
        setField(term2169, term2169.getClass(), "token", "SPpkrGcPRr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.user.AuthenticationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sEccwbJKYE";
        callMethod(klass, "setLastName", argTypes, term2169, args);
    }

};



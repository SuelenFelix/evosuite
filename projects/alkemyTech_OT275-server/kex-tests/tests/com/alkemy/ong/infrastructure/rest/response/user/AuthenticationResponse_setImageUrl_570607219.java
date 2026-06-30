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

public class AuthenticationResponse_setImageUrl_570607219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2435;

    public AuthenticationResponse_setImageUrl_570607219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2435 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.user.AuthenticationResponse"));
        setField(term2435, term2435.getClass(), "firstName", "ZVecLZMLHF");
        setField(term2435, term2435.getClass(), "lastName", "fztQhjqwdP");
        setField(term2435, term2435.getClass(), "email", "eVpkWxjuki");
        setField(term2435, term2435.getClass(), "imageUrl", "SJiQaLvSKv");
        setField(term2435, term2435.getClass(), "token", "OEXDRUKcFl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.user.AuthenticationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RYdKCNNMBR";
        callMethod(klass, "setImageUrl", argTypes, term2435, args);
    }

};



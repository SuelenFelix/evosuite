package com.skyg0d.spring.jwt.payload.response;

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
import static com.skyg0d.spring.jwt.payload.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class JwtResponse_setEmail_210786100415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5570;

    public JwtResponse_setEmail_210786100415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5639 = new ArrayList();
        ((ArrayList) term5639).add("XfRABIFVEp");
        ((ArrayList) term5639).add("MHGKyEnwKc");
        term5570 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse"));
        setField(term5570, term5570.getClass(), "token", "aSkmSwTnEw");
        setField(term5570, term5570.getClass(), "type", "Bearer");
        setField(term5570, term5570.getClass(), "refreshToken", "xvkbvaEGYd");
        setField(term5570, term5570.getClass(), "id", "HBGNxdNURv");
        setField(term5570, term5570.getClass(), "username", "mfCpTPPQQm");
        setField(term5570, term5570.getClass(), "email", "OcJCIDNIXA");
        setField(term5570, term5570.getClass(), "roles", term5639);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ShIELyuULw";
        callMethod(klass, "setEmail", argTypes, term5570, args);
    }

};



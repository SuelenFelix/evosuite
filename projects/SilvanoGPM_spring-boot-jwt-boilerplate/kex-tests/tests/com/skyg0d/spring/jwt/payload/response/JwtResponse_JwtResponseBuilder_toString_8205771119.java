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

public class JwtResponse_JwtResponseBuilder_toString_8205771119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10556;

    public JwtResponse_JwtResponseBuilder_toString_8205771119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10629 = new ArrayList();
        ((ArrayList) term10629).add("JisaWUxcNb");
        ((ArrayList) term10629).add("NxgmYPzWCI");
        ((ArrayList) term10629).add("SqjyKmayBx");
        ((ArrayList) term10629).add("XjDhvToxJy");
        ((ArrayList) term10629).add("nxSTJflLQy");
        term10556 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse$JwtResponseBuilder"));
        setField(term10556, term10556.getClass(), "token", "YkZtEtthvz");
        setField(term10556, term10556.getClass(), "type", "dwlZSxlXOo");
        setField(term10556, term10556.getClass(), "refreshToken", "lKrEAkypza");
        setField(term10556, term10556.getClass(), "id", "KtuuNAqGCQ");
        setField(term10556, term10556.getClass(), "username", "OGQsfjmReM");
        setField(term10556, term10556.getClass(), "email", "YsUtbngnRO");
        setField(term10556, term10556.getClass(), "roles", term10629);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse$JwtResponseBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term10556, args);
    }

};



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
import java.util.LinkedList;

public class JwtResponse_JwtResponseBuilder_roles_21214738247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10169;
     Object term10270;

    public JwtResponse_JwtResponseBuilder_roles_21214738247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10242 = new ArrayList();
        ((ArrayList) term10242).add("vhKzFyKPOT");
        ((ArrayList) term10242).add("nQhIgWXdRc");
        term10169 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse$JwtResponseBuilder"));
        setField(term10169, term10169.getClass(), "token", "uXYcXVYJZM");
        setField(term10169, term10169.getClass(), "type", "BJhjdJUhkz");
        setField(term10169, term10169.getClass(), "refreshToken", "cdHYQDgUZR");
        setField(term10169, term10169.getClass(), "id", "KAORSSPSeV");
        setField(term10169, term10169.getClass(), "username", "UimMMORkzd");
        setField(term10169, term10169.getClass(), "email", "huVIXUWLtI");
        setField(term10169, term10169.getClass(), "roles", term10242);
        term10270 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.JwtResponse$JwtResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term10270;
        callMethod(klass, "roles", argTypes, term10169, args);
    }

};



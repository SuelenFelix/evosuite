package com.example.JwtAuthentication.entities;

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
import static com.example.JwtAuthentication.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class JwtResponse_getJwtToken_13789950231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142;

    public JwtResponse_getJwtToken_13789950231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term205 = new HashMap();
        Set<Object> term272 =  ((Map) term205).keySet();
        HashSet term204 = new HashSet((Collection<? extends Object>) term272);
        term142 = newInstance(Class.forName("com.example.JwtAuthentication.entities.JwtResponse"));
        Object term143 = newInstance(Class.forName("com.example.JwtAuthentication.entities.User"));
        setField(term143, term143.getClass(), "userName", "SzjVpOQTyS");
        setField(term143, term143.getClass(), "userFirstName", "MjGYSRKTNF");
        setField(term143, term143.getClass(), "userLastName", "hRNSzYYIrc");
        setField(term143, term143.getClass(), "userPassword", "RMFIsYGgne");
        setField(term143, term143.getClass(), "confirmPassword", "NRdvgJlhkX");
        setField(term143, term143.getClass(), "roles", term204);
        setField(term142, term142.getClass(), "user", term143);
        setField(term142, term142.getClass(), "jwtToken", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.entities.JwtResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJwtToken", argTypes, term142, args);
    }

};



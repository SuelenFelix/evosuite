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

public class JwtResponse_canEqual_2085664115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term847;
     Object term927;

    public JwtResponse_canEqual_2085664115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term910 = new HashMap();
        Set<Object> term978 =  ((Map) term910).keySet();
        HashSet term909 = new HashSet((Collection<? extends Object>) term978);
        term847 = newInstance(Class.forName("com.example.JwtAuthentication.entities.JwtResponse"));
        Object term848 = newInstance(Class.forName("com.example.JwtAuthentication.entities.User"));
        setField(term848, term848.getClass(), "userName", "xrwlQZdwCp");
        setField(term848, term848.getClass(), "userFirstName", "IDCWpPLRkE");
        setField(term848, term848.getClass(), "userLastName", "nyiiPDVjAc");
        setField(term848, term848.getClass(), "userPassword", "aKnKipADSo");
        setField(term848, term848.getClass(), "confirmPassword", "wSQxaModmm");
        setField(term848, term848.getClass(), "roles", term909);
        setField(term847, term847.getClass(), "user", term848);
        setField(term847, term847.getClass(), "jwtToken", "UlajhuVLaP");
        term927 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.entities.JwtResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term927;
        callMethod(klass, "canEqual", argTypes, term847, args);
    }

};



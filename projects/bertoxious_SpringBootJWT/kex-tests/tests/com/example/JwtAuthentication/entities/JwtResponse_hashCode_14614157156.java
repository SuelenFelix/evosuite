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

public class JwtResponse_hashCode_14614157156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term989;

    public JwtResponse_hashCode_14614157156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1052 = new HashMap();
        Set<Object> term1119 =  ((Map) term1052).keySet();
        HashSet term1051 = new HashSet((Collection<? extends Object>) term1119);
        term989 = newInstance(Class.forName("com.example.JwtAuthentication.entities.JwtResponse"));
        Object term990 = newInstance(Class.forName("com.example.JwtAuthentication.entities.User"));
        setField(term990, term990.getClass(), "userName", "gGSMzuGICf");
        setField(term990, term990.getClass(), "userFirstName", "hxCBltsObl");
        setField(term990, term990.getClass(), "userLastName", "BndsHwAFMv");
        setField(term990, term990.getClass(), "userPassword", "GzFkzHGYFt");
        setField(term990, term990.getClass(), "confirmPassword", "tShwQLRGNe");
        setField(term990, term990.getClass(), "roles", term1051);
        setField(term989, term989.getClass(), "user", term990);
        setField(term989, term989.getClass(), "jwtToken", "LvtrsXUliU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.entities.JwtResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term989, args);
    }

};



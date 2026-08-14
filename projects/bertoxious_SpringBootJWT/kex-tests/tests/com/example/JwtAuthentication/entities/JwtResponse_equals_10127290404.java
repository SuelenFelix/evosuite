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

public class JwtResponse_equals_10127290404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term705;
     Object term785;

    public JwtResponse_equals_10127290404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term768 = new HashMap();
        Set<Object> term836 =  ((Map) term768).keySet();
        HashSet term767 = new HashSet((Collection<? extends Object>) term836);
        term705 = newInstance(Class.forName("com.example.JwtAuthentication.entities.JwtResponse"));
        Object term706 = newInstance(Class.forName("com.example.JwtAuthentication.entities.User"));
        setField(term706, term706.getClass(), "userName", "OWDIEULEFu");
        setField(term706, term706.getClass(), "userFirstName", "dWRymuLBtr");
        setField(term706, term706.getClass(), "userLastName", "AijpHYOFuy");
        setField(term706, term706.getClass(), "userPassword", "SbAoxhfrkn");
        setField(term706, term706.getClass(), "confirmPassword", "kuTXqwMtDB");
        setField(term706, term706.getClass(), "roles", term767);
        setField(term705, term705.getClass(), "user", term706);
        setField(term705, term705.getClass(), "jwtToken", "Ghbwtircqb");
        term785 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.entities.JwtResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term785;
        callMethod(klass, "equals", argTypes, term705, args);
    }

};



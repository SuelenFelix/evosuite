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

public class JwtResponse_getUser_12102140410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public JwtResponse_getUser_12102140410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term64 = new HashMap();
        Set<Object> term131 =  ((Map) term64).keySet();
        HashSet term63 = new HashSet((Collection<? extends Object>) term131);
        term1 = newInstance(Class.forName("com.example.JwtAuthentication.entities.JwtResponse"));
        Object term2 = newInstance(Class.forName("com.example.JwtAuthentication.entities.User"));
        setField(term2, term2.getClass(), "userName", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "userFirstName", "sjlJAEtRrb");
        setField(term2, term2.getClass(), "userLastName", "MuLcgQHgqz");
        setField(term2, term2.getClass(), "userPassword", "xxtlPwDYFs");
        setField(term2, term2.getClass(), "confirmPassword", "jJCZpVmanW");
        setField(term2, term2.getClass(), "roles", term63);
        setField(term1, term1.getClass(), "user", term2);
        setField(term1, term1.getClass(), "jwtToken", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.entities.JwtResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term1, args);
    }

};



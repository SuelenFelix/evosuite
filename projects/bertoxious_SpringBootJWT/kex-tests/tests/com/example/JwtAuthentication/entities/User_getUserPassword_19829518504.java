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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class User_getUserPassword_19829518504 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1773;

    public User_getUserPassword_19829518504() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1835 = new HashMap();
        Set<Object> term1890 =  ((Map) term1835).keySet();
        HashSet term1834 = new HashSet((Collection<? extends Object>) term1890);
        term1773 = newInstance(Class.forName("com.example.JwtAuthentication.entities.User"));
        setField(term1773, term1773.getClass(), "userName", "MAcUBcBckh");
        setField(term1773, term1773.getClass(), "userFirstName", "oVgzLbrsFr");
        setField(term1773, term1773.getClass(), "userLastName", "vQVyKLdtaz");
        setField(term1773, term1773.getClass(), "userPassword", "OWKQODBLzb");
        setField(term1773, term1773.getClass(), "confirmPassword", "wGmYcqUkgE");
        setField(term1773, term1773.getClass(), "roles", term1834);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.entities.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserPassword", argTypes, term1773, args);
    }

};



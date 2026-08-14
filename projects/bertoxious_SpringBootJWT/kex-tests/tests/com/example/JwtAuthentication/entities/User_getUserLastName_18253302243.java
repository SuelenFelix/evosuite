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

public class User_getUserLastName_18253302243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1655;

    public User_getUserLastName_18253302243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1717 = new HashMap();
        Set<Object> term1772 =  ((Map) term1717).keySet();
        HashSet term1716 = new HashSet((Collection<? extends Object>) term1772);
        term1655 = newInstance(Class.forName("com.example.JwtAuthentication.entities.User"));
        setField(term1655, term1655.getClass(), "userName", "whBvTVIIlC");
        setField(term1655, term1655.getClass(), "userFirstName", "IgRJUzaCwW");
        setField(term1655, term1655.getClass(), "userLastName", "JUmudUmaaV");
        setField(term1655, term1655.getClass(), "userPassword", "KoyGrUJeJW");
        setField(term1655, term1655.getClass(), "confirmPassword", "HqBOwkVqjD");
        setField(term1655, term1655.getClass(), "roles", term1716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.entities.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserLastName", argTypes, term1655, args);
    }

};



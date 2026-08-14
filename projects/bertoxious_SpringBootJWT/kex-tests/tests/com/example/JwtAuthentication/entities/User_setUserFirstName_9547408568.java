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

public class User_setUserFirstName_9547408568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2267;

    public User_setUserFirstName_9547408568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2329 = new HashMap();
        Set<Object> term2396 =  ((Map) term2329).keySet();
        HashSet term2328 = new HashSet((Collection<? extends Object>) term2396);
        term2267 = newInstance(Class.forName("com.example.JwtAuthentication.entities.User"));
        setField(term2267, term2267.getClass(), "userName", "XqgfKFvPSD");
        setField(term2267, term2267.getClass(), "userFirstName", "JiVRgTZvKc");
        setField(term2267, term2267.getClass(), "userLastName", "XPKmummaqg");
        setField(term2267, term2267.getClass(), "userPassword", "BKLfkLiZTH");
        setField(term2267, term2267.getClass(), "confirmPassword", "SPpkrGcPRr");
        setField(term2267, term2267.getClass(), "roles", term2328);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.entities.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sEccwbJKYE";
        callMethod(klass, "setUserFirstName", argTypes, term2267, args);
    }

};



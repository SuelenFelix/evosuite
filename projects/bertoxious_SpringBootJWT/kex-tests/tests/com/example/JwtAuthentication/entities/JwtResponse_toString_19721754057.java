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

public class JwtResponse_toString_19721754057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1130;

    public JwtResponse_toString_19721754057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1193 = new HashMap();
        Set<Object> term1260 =  ((Map) term1193).keySet();
        HashSet term1192 = new HashSet((Collection<? extends Object>) term1260);
        term1130 = newInstance(Class.forName("com.example.JwtAuthentication.entities.JwtResponse"));
        Object term1131 = newInstance(Class.forName("com.example.JwtAuthentication.entities.User"));
        setField(term1131, term1131.getClass(), "userName", "xLbjWUgOIL");
        setField(term1131, term1131.getClass(), "userFirstName", "jDtqGUpnZN");
        setField(term1131, term1131.getClass(), "userLastName", "nGKItKLYNC");
        setField(term1131, term1131.getClass(), "userPassword", "UiUYnPrcCi");
        setField(term1131, term1131.getClass(), "confirmPassword", "UoYtihxVaS");
        setField(term1131, term1131.getClass(), "roles", term1192);
        setField(term1130, term1130.getClass(), "user", term1131);
        setField(term1130, term1130.getClass(), "jwtToken", "JDswTTCZHV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.entities.JwtResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1130, args);
    }

};



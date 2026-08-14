package com.example.JwtAuthentication.services;

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
import static com.example.JwtAuthentication.services.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UserService_addUser_6754090711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47;

    public UserService_addUser_6754090711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term109 = new HashMap();
        Set<Object> term164 =  ((Map) term109).keySet();
        HashSet term108 = new HashSet((Collection<? extends Object>) term164);
        term47 = newInstance(Class.forName("com.example.JwtAuthentication.entities.User"));
        setField(term47, term47.getClass(), "userName", "MuLcgQHgqz");
        setField(term47, term47.getClass(), "userFirstName", "xxtlPwDYFs");
        setField(term47, term47.getClass(), "userLastName", "jJCZpVmanW");
        setField(term47, term47.getClass(), "userPassword", "EGtDIRbSSb");
        setField(term47, term47.getClass(), "confirmPassword", "SzjVpOQTyS");
        setField(term47, term47.getClass(), "roles", term108);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.services.UserService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.JwtAuthentication.entities.User");
        Object[] args = new Object[1];
        args[0] = term47;
        callMethod(klass, "addUser", argTypes, null, args);
    }

};



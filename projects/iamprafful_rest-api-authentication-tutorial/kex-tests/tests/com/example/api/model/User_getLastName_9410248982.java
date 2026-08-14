package com.example.api.model;

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
import static com.example.api.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class User_getLastName_9410248982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267;

    public User_getLastName_9410248982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term267 = newInstance(Class.forName("com.example.api.model.User"));
        setField(term267, term267.getClass(), "userName", "MxlszYVzRf");
        setField(term267, term267.getClass(), "firstName", "LQFpaHEwXR");
        setField(term267, term267.getClass(), "lastName", "oVcInYnLWB");
        setField(term267, term267.getClass(), "email", "aJlieCFVtF");
        setField(term267, term267.getClass(), "password", "ZiaGIbnzTs");
        setField(term267, term267.getClass(), "role", "tbcdzjIfER");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.api.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term267, args);
    }

};



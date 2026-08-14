package com.example.JwtAuthentication.dto;

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
import static com.example.JwtAuthentication.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AssignRole_canEqual_9672542666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271;
     Object term296;

    public AssignRole_canEqual_9672542666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term271 = newInstance(Class.forName("com.example.JwtAuthentication.dto.AssignRole"));
        setField(term271, term271.getClass(), "username", "MxlszYVzRf");
        setField(term271, term271.getClass(), "role", "LQFpaHEwXR");
        term296 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.JwtAuthentication.dto.AssignRole");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term296;
        callMethod(klass, "canEqual", argTypes, term271, args);
    }

};



package com.devsuperior.aula.services;

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
import static com.devsuperior.aula.services.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserService_insert_4254919573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1280;

    public UserService_insert_4254919573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1280 = newInstance(Class.forName("com.devsuperior.aula.dto.UserInsertDTO"));
        setField(term1280, term1280.getClass(), "name", "YRHGsAkhxb");
        setField(term1280, term1280.getClass(), "email", "ffYhPOzlUs");
        setField(term1280, term1280.getClass(), "password", "MLqYREekMl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.devsuperior.aula.services.UserService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.devsuperior.aula.dto.UserInsertDTO");
        Object[] args = new Object[1];
        args[0] = term1280;
        callMethod(klass, "insert", argTypes, null, args);
    }

};



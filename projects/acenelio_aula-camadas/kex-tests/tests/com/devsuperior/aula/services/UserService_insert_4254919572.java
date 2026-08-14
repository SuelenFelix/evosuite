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

public class UserService_insert_4254919572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;

    public UserService_insert_4254919572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("com.devsuperior.aula.dto.UserInsertDTO"));
        setField(term23, term23.getClass(), "name", "sjlJAEtRrb");
        setField(term23, term23.getClass(), "email", "MuLcgQHgqz");
        setField(term23, term23.getClass(), "password", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.devsuperior.aula.services.UserService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.devsuperior.aula.dto.UserInsertDTO");
        Object[] args = new Object[1];
        args[0] = term23;
        callMethod(klass, "insert", argTypes, null, args);
    }

};



package com.devsuperior.aula.dto;

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
import static com.devsuperior.aula.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserInsertDTO_getEmail_188367342614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1055;

    public UserInsertDTO_getEmail_188367342614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1055 = newInstance(Class.forName("com.devsuperior.aula.dto.UserInsertDTO"));
        setField(term1055, term1055.getClass(), "name", null);
        setField(term1055, term1055.getClass(), "email", null);
        setField(term1055, term1055.getClass(), "password", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.devsuperior.aula.dto.UserInsertDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term1055, args);
    }

};



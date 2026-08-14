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
import java.lang.Long;

public class UserInsertDTO_init_11946889932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term516;

    public UserInsertDTO_init_11946889932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term517 = new Long(6967924379644551255L);
        term516 = newInstance(Class.forName("com.devsuperior.aula.entities.User"));
        setField(term516, term516.getClass(), "id", term517);
        setField(term516, term516.getClass(), "name", "xOEqzGAmDU");
        setField(term516, term516.getClass(), "email", "eZFUvlxvGV");
        setField(term516, term516.getClass(), "password", "BYqFIqCKAV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.devsuperior.aula.dto.UserInsertDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.devsuperior.aula.entities.User");
        Object[] args = new Object[1];
        args[0] = term516;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



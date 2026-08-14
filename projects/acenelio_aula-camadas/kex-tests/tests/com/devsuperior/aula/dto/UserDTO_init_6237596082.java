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

public class UserDTO_init_6237596082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47;

    public UserDTO_init_6237596082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term48 = new Long(6375119433582206027L);
        term47 = newInstance(Class.forName("com.devsuperior.aula.entities.User"));
        setField(term47, term47.getClass(), "id", term48);
        setField(term47, term47.getClass(), "name", "MuLcgQHgqz");
        setField(term47, term47.getClass(), "email", "xxtlPwDYFs");
        setField(term47, term47.getClass(), "password", "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.devsuperior.aula.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.devsuperior.aula.entities.User");
        Object[] args = new Object[1];
        args[0] = term47;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



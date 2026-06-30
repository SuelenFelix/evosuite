package br.com.training.model;

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
import static br.com.training.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class User_setId_156458618517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term953;

    public User_setId_156458618517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term953 = newInstance(Class.forName("br.com.training.model.User"));
        setField(term953, term953.getClass(), "id", null);
        setField(term953, term953.getClass(), "name", null);
        setField(term953, term953.getClass(), "email", null);
        setField(term953, term953.getClass(), "cpf", null);
        setField(term953, term953.getClass(), "birthDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.training.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term953, args);
    }

};



package com.devsuperior.aula.entities;

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
import static com.devsuperior.aula.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class User_getEmail_14365570566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369;

    public User_getEmail_14365570566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term370 = new Long(4872422362414183754L);
        term369 = newInstance(Class.forName("com.devsuperior.aula.entities.User"));
        setField(term369, term369.getClass(), "id", term370);
        setField(term369, term369.getClass(), "name", "ZiaGIbnzTs");
        setField(term369, term369.getClass(), "email", "tbcdzjIfER");
        setField(term369, term369.getClass(), "password", "HyxfbSQYBe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.devsuperior.aula.entities.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term369, args);
    }

};



package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class User_getPassword_18259086825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20363;

    public User_getPassword_18259086825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20364 = new Long(-2097210721190032076L);
        Long term20427 = new Long(-3022442322233520981L);
        term20363 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term20426 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term20363, term20363.getClass(), "id", term20364);
        setField(term20363, term20363.getClass(), "firstName", "fDVzkGiHev");
        setField(term20363, term20363.getClass(), "lastName", "CanAbWJNgt");
        setField(term20363, term20363.getClass(), "email", "tFRLUuSeUt");
        setField(term20363, term20363.getClass(), "password", "KcKxvbBAHa");
        setField(term20363, term20363.getClass(), "imageUrl", "NbFVXCPmxn");
        setField(term20426, term20426.getClass(), "id", term20427);
        setField(term20426, term20426.getClass(), "name", "ovYlGvhKKO");
        setField(term20426, term20426.getClass(), "description", "JvoSiMCDAb");
        setField(term20363, term20363.getClass(), "role", term20426);
        setField(term20363, term20363.getClass(), "token", "JANJXHGMsv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term20363, args);
    }

};



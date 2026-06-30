package com.alkemy.ong.infrastructure.database.repository;

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
import static com.alkemy.ong.infrastructure.database.repository.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class UserRepository_update_12730113756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1592;

    public UserRepository_update_12730113756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1593 = new Long(3825396310311739952L);
        Long term1656 = new Long(-3838084482494604218L);
        term1592 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term1655 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term1592, term1592.getClass(), "id", term1593);
        setField(term1592, term1592.getClass(), "firstName", "iljANwuEjk");
        setField(term1592, term1592.getClass(), "lastName", "kNqaJKIATy");
        setField(term1592, term1592.getClass(), "email", "vKQukfbJUd");
        setField(term1592, term1592.getClass(), "password", "lFRJFUMVbx");
        setField(term1592, term1592.getClass(), "imageUrl", "sZdUNdggUW");
        setField(term1655, term1655.getClass(), "id", term1656);
        setField(term1655, term1655.getClass(), "name", "OqbwYQfvAe");
        setField(term1655, term1655.getClass(), "description", "tRxZafjqIx");
        setField(term1592, term1592.getClass(), "role", term1655);
        setField(term1592, term1592.getClass(), "token", "DhjNLmRMCu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.repository.UserRepository");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.User");
        Object[] args = new Object[1];
        args[0] = term1592;
        callMethod(klass, "update", argTypes, null, args);
    }

};



package com.cg.freelanceapp.entities;

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
import static com.cg.freelanceapp.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Skill_setId_2351556796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18966;
     Object term18993;

    public Skill_setId_2351556796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18967 = new Long(-399567772073942896L);
        term18966 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        setField(term18966, term18966.getClass(), "id", term18967);
        setField(term18966, term18966.getClass(), "name", "WNUzKkDpZX");
        setField(term18966, term18966.getClass(), "description", "aduqofSIXN");
        term18993 = new Long(-5288897655304765945L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Skill");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term18993;
        callMethod(klass, "setId", argTypes, term18966, args);
    }

};



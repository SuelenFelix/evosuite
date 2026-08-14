package de.rieckpil.courses;

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
import static de.rieckpil.courses.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JpaUserRepository_save_14544872234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1704;

    public JpaUserRepository_save_14544872234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1704 = newInstance(Class.forName("de.rieckpil.courses.JpaUserRepository"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.rieckpil.courses.JpaUserRepository");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("de.rieckpil.courses.User");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "save", argTypes, term1704, args);
    }

};



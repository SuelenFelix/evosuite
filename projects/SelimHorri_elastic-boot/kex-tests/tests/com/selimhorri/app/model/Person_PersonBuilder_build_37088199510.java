package com.selimhorri.app.model;

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
import static com.selimhorri.app.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Person_PersonBuilder_build_37088199510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1151;

    public Person_PersonBuilder_build_37088199510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1151 = newInstance(Class.forName("com.selimhorri.app.model.Person$PersonBuilder"));
        setField(term1151, term1151.getClass(), "personId", null);
        setField(term1151, term1151.getClass(), "fname", null);
        setField(term1151, term1151.getClass(), "lname", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.model.Person$PersonBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term1151, args);
    }

};



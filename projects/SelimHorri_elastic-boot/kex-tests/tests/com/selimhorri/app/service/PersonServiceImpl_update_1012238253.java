package com.selimhorri.app.service;

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
import static com.selimhorri.app.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PersonServiceImpl_update_1012238253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90;

    public PersonServiceImpl_update_1012238253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90 = newInstance(Class.forName("com.selimhorri.app.model.Person"));
        setField(term90, term90.getClass(), "personId", "jJCZpVmanW");
        setField(term90, term90.getClass(), "fname", "EGtDIRbSSb");
        setField(term90, term90.getClass(), "lname", "SzjVpOQTyS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.service.PersonServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.selimhorri.app.model.Person");
        Object[] args = new Object[1];
        args[0] = term90;
        callMethod(klass, "update", argTypes, null, args);
    }

};



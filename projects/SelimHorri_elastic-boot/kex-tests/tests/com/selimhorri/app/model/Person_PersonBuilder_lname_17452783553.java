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

public class Person_PersonBuilder_lname_17452783553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term925;

    public Person_PersonBuilder_lname_17452783553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term925 = newInstance(Class.forName("com.selimhorri.app.model.Person$PersonBuilder"));
        setField(term925, term925.getClass(), "personId", "UlajhuVLaP");
        setField(term925, term925.getClass(), "fname", "gGSMzuGICf");
        setField(term925, term925.getClass(), "lname", "hxCBltsObl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.model.Person$PersonBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BndsHwAFMv";
        callMethod(klass, "lname", argTypes, term925, args);
    }

};



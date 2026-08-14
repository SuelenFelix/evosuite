package com.demo.bootcamp.bll;

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
import static com.demo.bootcamp.bll.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PersonService_getPersonEntity_1188104597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86;

    public PersonService_getPersonEntity_1188104597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86 = newInstance(Class.forName("com.demo.bootcamp.bll.PersonService"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.demo.bootcamp.bll.PersonService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.demo.bootcamp.model.Person");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getPersonEntity", argTypes, term86, args);
    }

};



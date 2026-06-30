package com.datajpa.relationship.model;

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
import static com.datajpa.relationship.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;

public class Author_toString_97449319614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4033;

    public Author_toString_97449319614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4034 = new Long(4502292577098212311L);
        Long term4049 = new Long(-3730936709704460408L);
        Long term4064 = new Long(-8614778293741404325L);
        ArrayList term4078 = new ArrayList();
        term4033 = newInstance(Class.forName("com.datajpa.relationship.model.Author"));
        Object term4048 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        Object term4063 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term4033, term4033.getClass(), "id", term4034);
        setField(term4033, term4033.getClass(), "name", "lihXWlGDxk");
        setField(term4048, term4048.getClass(), "id", term4049);
        setField(term4048, term4048.getClass(), "name", "JmcmxoGhIK");
        setField(term4063, term4063.getClass(), "id", term4064);
        setField(term4063, term4063.getClass(), "name", "jXzmYyrnnT");
        setField(term4048, term4048.getClass(), "city", term4063);
        setField(term4033, term4033.getClass(), "zipcode", term4048);
        setField(term4033, term4033.getClass(), "books", term4078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Author");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4033, args);
    }

};



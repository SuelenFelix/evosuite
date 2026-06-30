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

public class Author_equals_1504683111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3794;
     Object term3843;

    public Author_equals_1504683111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3795 = new Long(4266570509071948633L);
        Long term3810 = new Long(-7291742736502427077L);
        Long term3825 = new Long(-8121849829073967555L);
        ArrayList term3839 = new ArrayList();
        term3794 = newInstance(Class.forName("com.datajpa.relationship.model.Author"));
        Object term3809 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        Object term3824 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term3794, term3794.getClass(), "id", term3795);
        setField(term3794, term3794.getClass(), "name", "XYtryyobou");
        setField(term3809, term3809.getClass(), "id", term3810);
        setField(term3809, term3809.getClass(), "name", "OYbzXylRWW");
        setField(term3824, term3824.getClass(), "id", term3825);
        setField(term3824, term3824.getClass(), "name", "DSNsTGYXDF");
        setField(term3809, term3809.getClass(), "city", term3824);
        setField(term3794, term3794.getClass(), "zipcode", term3809);
        setField(term3794, term3794.getClass(), "books", term3839);
        term3843 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Author");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3843;
        callMethod(klass, "equals", argTypes, term3794, args);
    }

};



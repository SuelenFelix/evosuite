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

public class Author_getZipcode_5754455125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3243;

    public Author_getZipcode_5754455125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3244 = new Long(8034714140377562739L);
        Long term3259 = new Long(-2924531382671518368L);
        Long term3274 = new Long(-3948863953565024517L);
        ArrayList term3288 = new ArrayList();
        term3243 = newInstance(Class.forName("com.datajpa.relationship.model.Author"));
        Object term3258 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        Object term3273 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term3243, term3243.getClass(), "id", term3244);
        setField(term3243, term3243.getClass(), "name", "UfQtPRyWRC");
        setField(term3258, term3258.getClass(), "id", term3259);
        setField(term3258, term3258.getClass(), "name", "FPvxVzzSvD");
        setField(term3273, term3273.getClass(), "id", term3274);
        setField(term3273, term3273.getClass(), "name", "WHcwFgsGFC");
        setField(term3258, term3258.getClass(), "city", term3273);
        setField(term3243, term3243.getClass(), "zipcode", term3258);
        setField(term3243, term3243.getClass(), "books", term3288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Author");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZipcode", argTypes, term3243, args);
    }

};



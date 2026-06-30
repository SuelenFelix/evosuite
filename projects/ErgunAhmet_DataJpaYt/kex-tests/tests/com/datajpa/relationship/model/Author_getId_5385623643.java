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

public class Author_getId_5385623643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3085;

    public Author_getId_5385623643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3086 = new Long(855932984568615096L);
        Long term3101 = new Long(-1616722610139554082L);
        Long term3116 = new Long(7495904023107549024L);
        ArrayList term3130 = new ArrayList();
        term3085 = newInstance(Class.forName("com.datajpa.relationship.model.Author"));
        Object term3100 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        Object term3115 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term3085, term3085.getClass(), "id", term3086);
        setField(term3085, term3085.getClass(), "name", "LWyEaeIyAo");
        setField(term3100, term3100.getClass(), "id", term3101);
        setField(term3100, term3100.getClass(), "name", "yVMkkQhvmN");
        setField(term3115, term3115.getClass(), "id", term3116);
        setField(term3115, term3115.getClass(), "name", "mvrkADEgpp");
        setField(term3100, term3100.getClass(), "city", term3115);
        setField(term3085, term3085.getClass(), "zipcode", term3100);
        setField(term3085, term3085.getClass(), "books", term3130);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Author");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term3085, args);
    }

};



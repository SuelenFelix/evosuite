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
import java.util.ArrayList;
import java.lang.Object;

public class Category_addBook_14583853861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2194;
     Object term2213;

    public Category_addBook_14583853861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2195 = new Long(1368340889161782793L);
        ArrayList term2209 = new ArrayList();
        term2194 = newInstance(Class.forName("com.datajpa.relationship.model.Category"));
        setField(term2194, term2194.getClass(), "id", term2195);
        setField(term2194, term2194.getClass(), "name", "ZVecLZMLHF");
        setField(term2194, term2194.getClass(), "books", term2209);
        Long term2214 = new Long(-5786861555969446503L);
        ArrayList term2228 = new ArrayList();
        Long term2233 = new Long(2354625302846375590L);
        ArrayList term2247 = new ArrayList();
        term2213 = newInstance(Class.forName("com.datajpa.relationship.model.Book"));
        Object term2232 = newInstance(Class.forName("com.datajpa.relationship.model.Category"));
        setField(term2213, term2213.getClass(), "id", term2214);
        setField(term2213, term2213.getClass(), "name", "fztQhjqwdP");
        setField(term2213, term2213.getClass(), "authors", term2228);
        setField(term2232, term2232.getClass(), "id", term2233);
        setField(term2232, term2232.getClass(), "name", "eVpkWxjuki");
        setField(term2232, term2232.getClass(), "books", term2247);
        setField(term2213, term2213.getClass(), "category", term2232);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Category");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.datajpa.relationship.model.Book");
        Object[] args = new Object[1];
        args[0] = term2213;
        callMethod(klass, "addBook", argTypes, term2194, args);
    }

};



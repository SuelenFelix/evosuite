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

public class Author_addBook_18414543591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2811;
     Object term2860;

    public Author_addBook_18414543591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2812 = new Long(3620247240684476031L);
        Long term2827 = new Long(8313800941204938919L);
        Long term2842 = new Long(-1214968196781083707L);
        ArrayList term2856 = new ArrayList();
        term2811 = newInstance(Class.forName("com.datajpa.relationship.model.Author"));
        Object term2826 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        Object term2841 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term2811, term2811.getClass(), "id", term2812);
        setField(term2811, term2811.getClass(), "name", "OJJtVNPyKZ");
        setField(term2826, term2826.getClass(), "id", term2827);
        setField(term2826, term2826.getClass(), "name", "AKNapTAfmD");
        setField(term2841, term2841.getClass(), "id", term2842);
        setField(term2841, term2841.getClass(), "name", "xJgPlLxpgC");
        setField(term2826, term2826.getClass(), "city", term2841);
        setField(term2811, term2811.getClass(), "zipcode", term2826);
        setField(term2811, term2811.getClass(), "books", term2856);
        Long term2861 = new Long(-1804015692891701666L);
        ArrayList term2875 = new ArrayList();
        Long term2880 = new Long(-6432617521836576658L);
        ArrayList term2894 = new ArrayList();
        term2860 = newInstance(Class.forName("com.datajpa.relationship.model.Book"));
        Object term2879 = newInstance(Class.forName("com.datajpa.relationship.model.Category"));
        setField(term2860, term2860.getClass(), "id", term2861);
        setField(term2860, term2860.getClass(), "name", "EYtfuJaxiM");
        setField(term2860, term2860.getClass(), "authors", term2875);
        setField(term2879, term2879.getClass(), "id", term2880);
        setField(term2879, term2879.getClass(), "name", "gCWtLVKVVe");
        setField(term2879, term2879.getClass(), "books", term2894);
        setField(term2860, term2860.getClass(), "category", term2879);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Author");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.datajpa.relationship.model.Book");
        Object[] args = new Object[1];
        args[0] = term2860;
        callMethod(klass, "addBook", argTypes, term2811, args);
    }

};



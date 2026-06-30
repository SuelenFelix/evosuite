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

public class Author_removeBook_15992372602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2948;
     Object term2997;

    public Author_removeBook_15992372602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2949 = new Long(-2255965562447970862L);
        Long term2964 = new Long(148047808219672941L);
        Long term2979 = new Long(7489064039921396098L);
        ArrayList term2993 = new ArrayList();
        term2948 = newInstance(Class.forName("com.datajpa.relationship.model.Author"));
        Object term2963 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        Object term2978 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term2948, term2948.getClass(), "id", term2949);
        setField(term2948, term2948.getClass(), "name", "fWKJoSoCwE");
        setField(term2963, term2963.getClass(), "id", term2964);
        setField(term2963, term2963.getClass(), "name", "wfaXBpWAUH");
        setField(term2978, term2978.getClass(), "id", term2979);
        setField(term2978, term2978.getClass(), "name", "VMeAzAHwZj");
        setField(term2963, term2963.getClass(), "city", term2978);
        setField(term2948, term2948.getClass(), "zipcode", term2963);
        setField(term2948, term2948.getClass(), "books", term2993);
        Long term2998 = new Long(6843866297465638866L);
        ArrayList term3012 = new ArrayList();
        Long term3017 = new Long(-4023935540989049732L);
        ArrayList term3031 = new ArrayList();
        term2997 = newInstance(Class.forName("com.datajpa.relationship.model.Book"));
        Object term3016 = newInstance(Class.forName("com.datajpa.relationship.model.Category"));
        setField(term2997, term2997.getClass(), "id", term2998);
        setField(term2997, term2997.getClass(), "name", "PznxWXsZME");
        setField(term2997, term2997.getClass(), "authors", term3012);
        setField(term3016, term3016.getClass(), "id", term3017);
        setField(term3016, term3016.getClass(), "name", "ZzIujlwVsw");
        setField(term3016, term3016.getClass(), "books", term3031);
        setField(term2997, term2997.getClass(), "category", term3016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Author");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.datajpa.relationship.model.Book");
        Object[] args = new Object[1];
        args[0] = term2997;
        callMethod(klass, "removeBook", argTypes, term2948, args);
    }

};



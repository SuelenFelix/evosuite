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

public class Author_getName_21062509354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3164;

    public Author_getName_21062509354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3165 = new Long(8802866251294305945L);
        Long term3180 = new Long(4513004407927379358L);
        Long term3195 = new Long(-7115418542247301000L);
        ArrayList term3209 = new ArrayList();
        term3164 = newInstance(Class.forName("com.datajpa.relationship.model.Author"));
        Object term3179 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        Object term3194 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term3164, term3164.getClass(), "id", term3165);
        setField(term3164, term3164.getClass(), "name", "pXOkjyeIRb");
        setField(term3179, term3179.getClass(), "id", term3180);
        setField(term3179, term3179.getClass(), "name", "GgZWSjxjyE");
        setField(term3194, term3194.getClass(), "id", term3195);
        setField(term3194, term3194.getClass(), "name", "EeBVbzjcCI");
        setField(term3179, term3179.getClass(), "city", term3194);
        setField(term3164, term3164.getClass(), "zipcode", term3179);
        setField(term3164, term3164.getClass(), "books", term3209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Author");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term3164, args);
    }

};



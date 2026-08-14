package com.karankumar.booksapi.model;

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
import static com.karankumar.booksapi.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Author_setAbout_1474198512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18620;

    public Author_setAbout_1474198512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18621 = new Long(918397384129253729L);
        HashMap term18636 = new HashMap();
        Set<Object> term18675 =  ((Map) term18636).keySet();
        HashSet term18635 = new HashSet((Collection<? extends Object>) term18675);
        term18620 = newInstance(Class.forName("com.karankumar.booksapi.model.Author"));
        setField(term18620, term18620.getClass(), "id", term18621);
        setField(term18620, term18620.getClass(), "fullName", "oNLcCYDAsO");
        setField(term18620, term18620.getClass(), "books", term18635);
        setField(term18620, term18620.getClass(), "about", "CNqMxLvtcJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Author");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ktbqerIaKW";
        callMethod(klass, "setAbout", argTypes, term18620, args);
    }

};



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

public class Author_setBooks_129681571311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18559;
     Object term18592;

    public Author_setBooks_129681571311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18560 = new Long(-67485388932970712L);
        HashMap term18575 = new HashMap();
        Set<Object> term18608 =  ((Map) term18575).keySet();
        HashSet term18574 = new HashSet((Collection<? extends Object>) term18608);
        term18559 = newInstance(Class.forName("com.karankumar.booksapi.model.Author"));
        setField(term18559, term18559.getClass(), "id", term18560);
        setField(term18559, term18559.getClass(), "fullName", "goAoCMhKBu");
        setField(term18559, term18559.getClass(), "books", term18574);
        setField(term18559, term18559.getClass(), "about", "BWxJSgKHRT");
        HashMap term18593 = new HashMap();
        Set<Object> term18619 =  ((Map) term18593).keySet();
        term18592 = new HashSet((Collection<? extends Object>) term18619);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Author");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term18592;
        callMethod(klass, "setBooks", argTypes, term18559, args);
    }

};



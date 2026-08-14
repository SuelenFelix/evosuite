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

public class Publisher_hashCode_17350850753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17152;

    public Publisher_hashCode_17350850753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17153 = new Long(9205327385733285058L);
        HashMap term17168 = new HashMap();
        Set<Object> term17183 =  ((Map) term17168).keySet();
        HashSet term17167 = new HashSet((Collection<? extends Object>) term17183);
        term17152 = newInstance(Class.forName("com.karankumar.booksapi.model.Publisher"));
        setField(term17152, term17152.getClass(), "id", term17153);
        setField(term17152, term17152.getClass(), "name", "IkpjUOuWQU");
        setField(term17152, term17152.getClass(), "books", term17167);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Publisher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term17152, args);
    }

};



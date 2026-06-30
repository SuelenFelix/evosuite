package com.syqu.shop.domain;

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
import static com.syqu.shop.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Category_equals_12345566660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1986;
     Object term2006;

    public Category_equals_12345566660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2001 = new HashMap();
        Set<Object> term2017 =  ((Map) term2001).keySet();
        HashSet term2000 = new HashSet((Collection<? extends Object>) term2017);
        term1986 = newInstance(Class.forName("com.syqu.shop.domain.Category"));
        setLongField(term1986, term1986.getClass(), "id", 5262507301787091109L);
        setField(term1986, term1986.getClass(), "categoryName", "fhkbdRViHi");
        setField(term1986, term1986.getClass(), "books", term2000);
        term2006 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.Category");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2006;
        callMethod(klass, "equals", argTypes, term1986, args);
    }

};



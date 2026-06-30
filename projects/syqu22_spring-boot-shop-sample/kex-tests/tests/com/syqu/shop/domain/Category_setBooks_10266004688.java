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

public class Category_setBooks_10266004688 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2228;
     Object term2248;

    public Category_setBooks_10266004688() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2243 = new HashMap();
        Set<Object> term2286 =  ((Map) term2243).keySet();
        HashSet term2242 = new HashSet((Collection<? extends Object>) term2286);
        term2228 = newInstance(Class.forName("com.syqu.shop.domain.Category"));
        setLongField(term2228, term2228.getClass(), "id", 4178434741742309755L);
        setField(term2228, term2228.getClass(), "categoryName", "JUmudUmaaV");
        setField(term2228, term2228.getClass(), "books", term2242);
        HashMap term2249 = new HashMap();
        Set<Object> term2287 =  ((Map) term2249).keySet();
        term2248 = new HashSet((Collection<? extends Object>) term2287);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.Category");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term2248;
        callMethod(klass, "setBooks", argTypes, term2228, args);
    }

};



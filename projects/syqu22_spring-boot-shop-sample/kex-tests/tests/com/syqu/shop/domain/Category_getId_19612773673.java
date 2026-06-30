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

public class Category_getId_19612773673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2049;

    public Category_getId_19612773673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2064 = new HashMap();
        Set<Object> term2079 =  ((Map) term2064).keySet();
        HashSet term2063 = new HashSet((Collection<? extends Object>) term2079);
        term2049 = newInstance(Class.forName("com.syqu.shop.domain.Category"));
        setLongField(term2049, term2049.getClass(), "id", -484994522244390100L);
        setField(term2049, term2049.getClass(), "categoryName", "kBdSllIBVz");
        setField(term2049, term2049.getClass(), "books", term2063);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.Category");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term2049, args);
    }

};



package com.example.web_shop.entity;

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
import static com.example.web_shop.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Category_setBooks_11650893569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294;
     Object term314;

    public Category_setBooks_11650893569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term309 = new HashMap();
        Set<Object> term354 =  ((Map) term309).keySet();
        HashSet term308 = new HashSet((Collection<? extends Object>) term354);
        term294 = newInstance(Class.forName("com.example.web_shop.entity.Category"));
        setLongField(term294, term294.getClass(), "id", -6573104506744284592L);
        setField(term294, term294.getClass(), "categoryName", "TEParAifyi");
        setField(term294, term294.getClass(), "books", term308);
        HashMap term315 = new HashMap();
        Set<Object> term355 =  ((Map) term315).keySet();
        term314 = new HashSet((Collection<? extends Object>) term355);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.Category");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term314;
        callMethod(klass, "setBooks", argTypes, term294, args);
    }

};



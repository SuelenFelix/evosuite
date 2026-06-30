package com.blog.coffee_shop.model;

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
import static com.blog.coffee_shop.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.LinkedList;
import java.lang.Object;

public class MenuItem_init_12853592171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term15;

    public MenuItem_init_12853592171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Integer(568599855);
        term15 = new LinkedList();
        ((LinkedList) term15).add("sjlJAEtRrb");
        ((LinkedList) term15).add("MuLcgQHgqz");
        ((LinkedList) term15).add("");
        ((LinkedList) term15).add((Object)null);
        ((LinkedList) term15).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.blog.coffee_shop.model.MenuItem");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = term1;
        args[1] = "PAEBtnZtTD";
        args[2] = term15;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



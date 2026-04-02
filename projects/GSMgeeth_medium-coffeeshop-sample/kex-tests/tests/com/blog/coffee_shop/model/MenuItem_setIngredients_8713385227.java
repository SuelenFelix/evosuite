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
import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.Object;

public class MenuItem_setIngredients_8713385227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254;
     Object term272;

    public MenuItem_setIngredients_8713385227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term268 = new ArrayList();
        term254 = newInstance(Class.forName("com.blog.coffee_shop.model.MenuItem"));
        setIntField(term254, term254.getClass(), "id", -2038273078);
        setField(term254, term254.getClass(), "name", "MxlszYVzRf");
        setField(term254, term254.getClass(), "ingredients", term268);
        term272 = new LinkedList();
        ((LinkedList) term272).add("LQFpaHEwXR");
        ((LinkedList) term272).add("oVcInYnLWB");
        ((LinkedList) term272).add("");
        ((LinkedList) term272).add((Object)null);
        ((LinkedList) term272).add((Object)null);
        ((LinkedList) term272).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.blog.coffee_shop.model.MenuItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term272;
        callMethod(klass, "setIngredients", argTypes, term254, args);
    }

};



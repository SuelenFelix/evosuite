package com.blog.coffee_shop.dto;

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
import static com.blog.coffee_shop.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.Object;

public class MenuItemAddDTO_setIngredients_18086593144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104;
     Object term121;

    public MenuItemAddDTO_setIngredients_18086593144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term117 = new ArrayList();
        term104 = newInstance(Class.forName("com.blog.coffee_shop.dto.MenuItemAddDTO"));
        setField(term104, term104.getClass(), "name", "jJCZpVmanW");
        setField(term104, term104.getClass(), "ingredients", term117);
        term121 = new LinkedList();
        ((LinkedList) term121).add("EGtDIRbSSb");
        ((LinkedList) term121).add("SzjVpOQTyS");
        ((LinkedList) term121).add("");
        ((LinkedList) term121).add((Object)null);
        ((LinkedList) term121).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.blog.coffee_shop.dto.MenuItemAddDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term121;
        callMethod(klass, "setIngredients", argTypes, term104, args);
    }

};



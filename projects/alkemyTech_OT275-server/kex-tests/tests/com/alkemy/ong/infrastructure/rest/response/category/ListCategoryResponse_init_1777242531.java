package com.alkemy.ong.infrastructure.rest.response.category;

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
import static com.alkemy.ong.infrastructure.rest.response.category.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Long;

public class ListCategoryResponse_init_1777242531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ListCategoryResponse_init_1777242531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5 = new Long(2442117782898005296L);
        Object term4 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.category.GetCategoryResponse"));
        setField(term4, term4.getClass(), "id", term5);
        setField(term4, term4.getClass(), "description", "PAEBtnZtTD");
        setField(term4, term4.getClass(), "imageUrl", "sjlJAEtRrb");
        setField(term4, term4.getClass(), "name", "MuLcgQHgqz");
        Long term45 = new Long(6375119433582206027L);
        Object term44 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.category.GetCategoryResponse"));
        setField(term44, term44.getClass(), "id", term45);
        setField(term44, term44.getClass(), "description", "");
        setField(term44, term44.getClass(), "imageUrl", "");
        setField(term44, term44.getClass(), "name", "");
        Long term52 = new Long(-8257434502486459194L);
        Object term51 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.category.GetCategoryResponse"));
        setField(term51, term51.getClass(), "id", term52);
        setField(term51, term51.getClass(), "description", null);
        setField(term51, term51.getClass(), "imageUrl", null);
        setField(term51, term51.getClass(), "name", null);
        term1 = new LinkedList();
        ((LinkedList) term1).add(term4);
        ((LinkedList) term1).add(term44);
        ((LinkedList) term1).add(term51);
        ((LinkedList) term1).add((Object)null);
        ((LinkedList) term1).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.category.ListCategoryResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



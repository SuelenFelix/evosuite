package com.mozen.springboothibernatesearch.controller;

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
import static com.mozen.springboothibernatesearch.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class PlantController_searchPlants_7125128031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public PlantController_searchPlants_7125128031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.mozen.springboothibernatesearch.controller.PlantController"));
        setField(term1, term1.getClass(), "plantService", null);
        ArrayList term15 = new ArrayList();
        term2 = newInstance(Class.forName("com.mozen.springboothibernatesearch.model.SearchRequestDTO"));
        setField(term2, term2.getClass(), "text", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "fields", term15);
        setIntField(term2, term2.getClass(), "limit", 568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springboothibernatesearch.controller.PlantController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.mozen.springboothibernatesearch.model.SearchRequestDTO");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "searchPlants", argTypes, term1, args);
    }

};



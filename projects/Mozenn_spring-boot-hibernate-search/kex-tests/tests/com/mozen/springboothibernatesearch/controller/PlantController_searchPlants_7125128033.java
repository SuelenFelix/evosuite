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

public class PlantController_searchPlants_7125128033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30;

    public PlantController_searchPlants_7125128033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30 = newInstance(Class.forName("com.mozen.springboothibernatesearch.controller.PlantController"));
        setField(term30, term30.getClass(), "plantService", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springboothibernatesearch.controller.PlantController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.mozen.springboothibernatesearch.model.SearchRequestDTO");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "searchPlants", argTypes, term30, args);
    }

};



package com.mozen.springbootpaginationandsorting.controller;

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
import static com.mozen.springbootpaginationandsorting.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PlantController_getPlantPage_4371895961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2;
     Object term4;

    public PlantController_getPlantPage_4371895961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2 = newInstance(Class.forName("com.mozen.springbootpaginationandsorting.controller.PlantController"));
        Object term3 = newInstance(Class.forName("com.mozen.springbootpaginationandsorting.mapper.PageToPageDTOMapper"));
        setField(term2, term2.getClass(), "plantService", null);
        setField(term2, term2.getClass(), "pageToPageDTOMapper", term3);
        term4 = newInstance(Class.forName("com.mozen.springbootpaginationandsorting.model.PageSettings"));
        setIntField(term4, term4.getClass(), "page", 568599855);
        setIntField(term4, term4.getClass(), "elementPerPage", 2);
        setField(term4, term4.getClass(), "direction", "dsc");
        setField(term4, term4.getClass(), "key", "PAEBtnZtTD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springbootpaginationandsorting.controller.PlantController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.mozen.springbootpaginationandsorting.model.PageSettings");
        Object[] args = new Object[1];
        args[0] = term4;
        callMethod(klass, "getPlantPage", argTypes, term2, args);
    }

};



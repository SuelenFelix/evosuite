package com.alkemy.ong.infrastructure.rest.request.category;

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
import static com.alkemy.ong.infrastructure.rest.request.category.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CreateCategoryRequest_setDescription_5692807686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357;

    public CreateCategoryRequest_setDescription_5692807686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term357 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.category.CreateCategoryRequest"));
        setField(term357, term357.getClass(), "name", "ZiaGIbnzTs");
        setField(term357, term357.getClass(), "description", "tbcdzjIfER");
        setField(term357, term357.getClass(), "image", "HyxfbSQYBe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.category.CreateCategoryRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pCTimMblYc";
        callMethod(klass, "setDescription", argTypes, term357, args);
    }

};



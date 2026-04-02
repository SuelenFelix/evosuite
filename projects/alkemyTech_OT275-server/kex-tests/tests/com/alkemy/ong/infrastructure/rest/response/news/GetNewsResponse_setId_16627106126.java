package com.alkemy.ong.infrastructure.rest.response.news;

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
import static com.alkemy.ong.infrastructure.rest.response.news.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class GetNewsResponse_setId_16627106126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1138;
     Object term1216;

    public GetNewsResponse_setId_16627106126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1139 = new Long(-8708192233349544946L);
        Long term1178 = new Long(5907001541142728739L);
        term1138 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.news.GetNewsResponse"));
        Object term1177 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.category.GetCategoryResponse"));
        setField(term1138, term1138.getClass(), "id", term1139);
        setField(term1138, term1138.getClass(), "name", "ZzIujlwVsw");
        setField(term1138, term1138.getClass(), "content", "LWyEaeIyAo");
        setField(term1138, term1138.getClass(), "imageUrl", "yVMkkQhvmN");
        setField(term1177, term1177.getClass(), "id", term1178);
        setField(term1177, term1177.getClass(), "description", "mvrkADEgpp");
        setField(term1177, term1177.getClass(), "imageUrl", "pXOkjyeIRb");
        setField(term1177, term1177.getClass(), "name", "GgZWSjxjyE");
        setField(term1138, term1138.getClass(), "category", term1177);
        term1216 = new Long(4178434741742309755L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.news.GetNewsResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1216;
        callMethod(klass, "setId", argTypes, term1138, args);
    }

};



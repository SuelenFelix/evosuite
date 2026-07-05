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

public class GetNewsResponse_getCategory_20172366955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1000;

    public GetNewsResponse_getCategory_20172366955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1001 = new Long(6617340557564669657L);
        Long term1040 = new Long(1439298019805881866L);
        term1000 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.news.GetNewsResponse"));
        Object term1039 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.category.GetCategoryResponse"));
        setField(term1000, term1000.getClass(), "id", term1001);
        setField(term1000, term1000.getClass(), "name", "EYtfuJaxiM");
        setField(term1000, term1000.getClass(), "content", "gCWtLVKVVe");
        setField(term1000, term1000.getClass(), "imageUrl", "fWKJoSoCwE");
        setField(term1039, term1039.getClass(), "id", term1040);
        setField(term1039, term1039.getClass(), "description", "wfaXBpWAUH");
        setField(term1039, term1039.getClass(), "imageUrl", "VMeAzAHwZj");
        setField(term1039, term1039.getClass(), "name", "PznxWXsZME");
        setField(term1000, term1000.getClass(), "category", term1039);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.news.GetNewsResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategory", argTypes, term1000, args);
    }

};



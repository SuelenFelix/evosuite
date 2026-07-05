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

public class GetNewsResponse_setContent_3767672798 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1438;

    public GetNewsResponse_setContent_3767672798() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1439 = new Long(-6645965768855543712L);
        Long term1478 = new Long(4784595517102746672L);
        term1438 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.news.GetNewsResponse"));
        Object term1477 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.category.GetCategoryResponse"));
        setField(term1438, term1438.getClass(), "id", term1439);
        setField(term1438, term1438.getClass(), "name", "MwwjNtdOFT");
        setField(term1438, term1438.getClass(), "content", "VYkqXKVlAJ");
        setField(term1438, term1438.getClass(), "imageUrl", "XkIoWJRNwN");
        setField(term1477, term1477.getClass(), "id", term1478);
        setField(term1477, term1477.getClass(), "description", "aNWLJdrZMq");
        setField(term1477, term1477.getClass(), "imageUrl", "HHmNoYxIGj");
        setField(term1477, term1477.getClass(), "name", "PtirvZmsGt");
        setField(term1438, term1438.getClass(), "category", term1477);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.news.GetNewsResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HWkpTmtlrc";
        callMethod(klass, "setContent", argTypes, term1438, args);
    }

};



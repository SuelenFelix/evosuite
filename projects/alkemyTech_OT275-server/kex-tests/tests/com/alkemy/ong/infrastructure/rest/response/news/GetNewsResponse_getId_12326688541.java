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

public class GetNewsResponse_getId_12326688541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term448;

    public GetNewsResponse_getId_12326688541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term449 = new Long(1967728129628047933L);
        Long term488 = new Long(2120084523938730454L);
        term448 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.news.GetNewsResponse"));
        Object term487 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.category.GetCategoryResponse"));
        setField(term448, term448.getClass(), "id", term449);
        setField(term448, term448.getClass(), "name", "fztQhjqwdP");
        setField(term448, term448.getClass(), "content", "eVpkWxjuki");
        setField(term448, term448.getClass(), "imageUrl", "SJiQaLvSKv");
        setField(term487, term487.getClass(), "id", term488);
        setField(term487, term487.getClass(), "description", "OEXDRUKcFl");
        setField(term487, term487.getClass(), "imageUrl", "RYdKCNNMBR");
        setField(term487, term487.getClass(), "name", "yGtHPyvYiQ");
        setField(term448, term448.getClass(), "category", term487);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.news.GetNewsResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term448, args);
    }

};



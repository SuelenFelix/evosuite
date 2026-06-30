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
import java.util.ArrayList;

public class ListNewsResponse_getNews_15709700160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200;

    public ListNewsResponse_getNews_15709700160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term201 = new ArrayList();
        term200 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.news.ListNewsResponse"));
        setField(term200, term200.getClass(), "news", term201);
        setIntField(term200, term200.getClass(), "page", 568599855);
        setIntField(term200, term200.getClass(), "size", 1162663216);
        setIntField(term200, term200.getClass(), "totalPages", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.news.ListNewsResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNews", argTypes, term200, args);
    }

};



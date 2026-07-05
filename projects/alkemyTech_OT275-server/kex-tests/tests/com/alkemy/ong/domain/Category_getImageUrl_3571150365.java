package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Category_getImageUrl_3571150365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15402;

    public Category_getImageUrl_3571150365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15403 = new Long(4096288569907305445L);
        term15402 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        setField(term15402, term15402.getClass(), "id", term15403);
        setField(term15402, term15402.getClass(), "name", "eCxWMOpomA");
        setField(term15402, term15402.getClass(), "description", "pkQawlBtEF");
        setField(term15402, term15402.getClass(), "imageUrl", "rdKTcvHHnV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Category");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term15402, args);
    }

};



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

public class Category_setId_4072071206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15471;
     Object term15510;

    public Category_setId_4072071206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15472 = new Long(6940486570215409900L);
        term15471 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        setField(term15471, term15471.getClass(), "id", term15472);
        setField(term15471, term15471.getClass(), "name", "ELfUfLbXZf");
        setField(term15471, term15471.getClass(), "description", "SAglaHkagn");
        setField(term15471, term15471.getClass(), "imageUrl", "eZGxUfdoFn");
        term15510 = new Long(-7370364068296402536L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Category");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term15510;
        callMethod(klass, "setId", argTypes, term15471, args);
    }

};



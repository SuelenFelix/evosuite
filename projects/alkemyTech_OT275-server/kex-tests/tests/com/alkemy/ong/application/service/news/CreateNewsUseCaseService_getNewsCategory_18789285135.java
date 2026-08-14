package com.alkemy.ong.application.service.news;

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
import static com.alkemy.ong.application.service.news.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CreateNewsUseCaseService_getNewsCategory_18789285135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5879;

    public CreateNewsUseCaseService_getNewsCategory_18789285135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5879 = newInstance(Class.forName("com.alkemy.ong.application.service.news.CreateNewsUseCaseService"));
        setField(term5879, term5879.getClass(), "newsRepository", null);
        setField(term5879, term5879.getClass(), "categoryRepository", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.news.CreateNewsUseCaseService");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNewsCategory", argTypes, term5879, args);
    }

};



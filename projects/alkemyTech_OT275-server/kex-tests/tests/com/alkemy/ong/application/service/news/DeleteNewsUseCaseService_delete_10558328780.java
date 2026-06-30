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

public class DeleteNewsUseCaseService_delete_10558328780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200;

    public DeleteNewsUseCaseService_delete_10558328780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200 = newInstance(Class.forName("com.alkemy.ong.application.service.news.DeleteNewsUseCaseService"));
        setField(term200, term200.getClass(), "newsRepository", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.news.DeleteNewsUseCaseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Identifiable");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "delete", argTypes, term200, args);
    }

};



package com.alkemy.ong.infrastructure.rest.request.news;

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
import static com.alkemy.ong.infrastructure.rest.request.news.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UpdateNewsRequest_getContent_10008000862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68;

    public UpdateNewsRequest_getContent_10008000862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.news.UpdateNewsRequest"));
        setField(term68, term68.getClass(), "name", "xxtlPwDYFs");
        setField(term68, term68.getClass(), "content", "jJCZpVmanW");
        setField(term68, term68.getClass(), "image", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.news.UpdateNewsRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContent", argTypes, term68, args);
    }

};



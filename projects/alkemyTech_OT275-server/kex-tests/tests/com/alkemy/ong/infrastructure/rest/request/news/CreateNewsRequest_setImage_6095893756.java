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

public class CreateNewsRequest_setImage_6095893756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854;

    public CreateNewsRequest_setImage_6095893756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.news.CreateNewsRequest"));
        setField(term854, term854.getClass(), "name", "nyiiPDVjAc");
        setField(term854, term854.getClass(), "text", "aKnKipADSo");
        setField(term854, term854.getClass(), "image", "wSQxaModmm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.news.CreateNewsRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UlajhuVLaP";
        callMethod(klass, "setImage", argTypes, term854, args);
    }

};



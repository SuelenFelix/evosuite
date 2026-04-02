package com.alkemy.ong.infrastructure.rest.request.activity;

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
import static com.alkemy.ong.infrastructure.rest.request.activity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CreateActivityRequest_getImageUrl_2254337003 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135;

    public CreateActivityRequest_getImageUrl_2254337003() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.activity.CreateActivityRequest"));
        setField(term135, term135.getClass(), "name", "SzjVpOQTyS");
        setField(term135, term135.getClass(), "content", "MjGYSRKTNF");
        setField(term135, term135.getClass(), "imageUrl", "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.activity.CreateActivityRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term135, args);
    }

};



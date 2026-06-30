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

public class UpdateActivityRequest_setImageUrl_5949061215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term765;

    public UpdateActivityRequest_setImageUrl_5949061215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term765 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.activity.UpdateActivityRequest"));
        setField(term765, term765.getClass(), "content", "kuTXqwMtDB");
        setField(term765, term765.getClass(), "imageUrl", "Ghbwtircqb");
        setField(term765, term765.getClass(), "name", "xrwlQZdwCp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.activity.UpdateActivityRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IDCWpPLRkE";
        callMethod(klass, "setImageUrl", argTypes, term765, args);
    }

};



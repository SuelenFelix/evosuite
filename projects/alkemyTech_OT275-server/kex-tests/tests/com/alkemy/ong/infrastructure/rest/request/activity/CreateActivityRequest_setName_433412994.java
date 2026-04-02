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

public class CreateActivityRequest_setName_433412994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202;

    public CreateActivityRequest_setName_433412994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.activity.CreateActivityRequest"));
        setField(term202, term202.getClass(), "name", "RMFIsYGgne");
        setField(term202, term202.getClass(), "content", "NRdvgJlhkX");
        setField(term202, term202.getClass(), "imageUrl", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.activity.CreateActivityRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MxlszYVzRf";
        callMethod(klass, "setName", argTypes, term202, args);
    }

};



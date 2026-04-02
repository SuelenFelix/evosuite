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

public class UpdateNewsRequest_setContent_18122811105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291;

    public UpdateNewsRequest_setContent_18122811105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.news.UpdateNewsRequest"));
        setField(term291, term291.getClass(), "name", "LQFpaHEwXR");
        setField(term291, term291.getClass(), "content", "oVcInYnLWB");
        setField(term291, term291.getClass(), "image", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.news.UpdateNewsRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZiaGIbnzTs";
        callMethod(klass, "setContent", argTypes, term291, args);
    }

};



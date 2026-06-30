package com.alkemy.ong.infrastructure.rest.request.slide;

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
import static com.alkemy.ong.infrastructure.rest.request.slide.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CreateSlideRequest_getOrder_70811430711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term622;

    public CreateSlideRequest_getOrder_70811430711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term622 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.slide.CreateSlideRequest"));
        setField(term622, term622.getClass(), "text", null);
        setField(term622, term622.getClass(), "order", null);
        setField(term622, term622.getClass(), "base64FileEncoded", null);
        setField(term622, term622.getClass(), "contentType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.slide.CreateSlideRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrder", argTypes, term622, args);
    }

};



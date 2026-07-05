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
import java.lang.Integer;

public class UpdateSlideRequest_setOrder_686409804 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term726;
     Object term741;

    public UpdateSlideRequest_setOrder_686409804() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term739 = new Integer(1134449235);
        term726 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.slide.UpdateSlideRequest"));
        setField(term726, term726.getClass(), "text", "dWRymuLBtr");
        setField(term726, term726.getClass(), "order", term739);
        term741 = new Integer(-883034806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.slide.UpdateSlideRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term741;
        callMethod(klass, "setOrder", argTypes, term726, args);
    }

};



package com.alkemy.ong.application.service.slide;

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
import static com.alkemy.ong.application.service.slide.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DeleteSlideUseCaseService_delete_17799377600 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public DeleteSlideUseCaseService_delete_17799377600() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.alkemy.ong.application.service.slide.DeleteSlideUseCaseService"));
        setField(term1, term1.getClass(), "slideRepository", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.slide.DeleteSlideUseCaseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Identifiable");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "delete", argTypes, term1, args);
    }

};



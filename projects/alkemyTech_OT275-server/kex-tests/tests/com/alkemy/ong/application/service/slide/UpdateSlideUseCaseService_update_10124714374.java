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

public class UpdateSlideUseCaseService_update_10124714374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term384;

    public UpdateSlideUseCaseService_update_10124714374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term384 = newInstance(Class.forName("com.alkemy.ong.application.service.slide.UpdateSlideUseCaseService"));
        setField(term384, term384.getClass(), "slideRepository", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.slide.UpdateSlideUseCaseService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Slide");
        argTypes[1] = Class.forName("com.alkemy.ong.domain.Slide");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "update", argTypes, term384, args);
    }

};



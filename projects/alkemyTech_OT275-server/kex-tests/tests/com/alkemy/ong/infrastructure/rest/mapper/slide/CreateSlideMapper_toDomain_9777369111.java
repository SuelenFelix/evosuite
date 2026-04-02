package com.alkemy.ong.infrastructure.rest.mapper.slide;

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
import static com.alkemy.ong.infrastructure.rest.mapper.slide.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class CreateSlideMapper_toDomain_9777369111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term543;
     Object term544;

    public CreateSlideMapper_toDomain_9777369111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term543 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.slide.CreateSlideMapper"));
        Integer term557 = new Integer(-883034806);
        term544 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.slide.CreateSlideRequest"));
        setField(term544, term544.getClass(), "text", "UoYtihxVaS");
        setField(term544, term544.getClass(), "order", term557);
        setField(term544, term544.getClass(), "base64FileEncoded", "JDswTTCZHV");
        setField(term544, term544.getClass(), "contentType", "onpbIeEKoi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.slide.CreateSlideMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.infrastructure.rest.request.slide.CreateSlideRequest");
        Object[] args = new Object[1];
        args[0] = term544;
        callMethod(klass, "toDomain", argTypes, term543, args);
    }

};



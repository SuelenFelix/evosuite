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
import java.lang.Long;
import java.lang.Integer;

public class SlideMapper_toResponse_9058385602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term712;
     Object term713;

    public SlideMapper_toResponse_9058385602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term712 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.slide.SlideMapper"));
        Long term714 = new Long(-5476826692763582090L);
        Integer term728 = new Integer(597278769);
        term713 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term713, term713.getClass(), "id", term714);
        setField(term713, term713.getClass(), "imageUrl", "nHXjMycHlU");
        setField(term713, term713.getClass(), "order", term728);
        setField(term713, term713.getClass(), "text", "ieCtQFdkii");
        setField(term713, term713.getClass(), "base64FileEncoded", "dEnhdmILtU");
        setField(term713, term713.getClass(), "contentType", "hoicvmsovO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.slide.SlideMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Slide");
        Object[] args = new Object[1];
        args[0] = term713;
        callMethod(klass, "toResponse", argTypes, term712, args);
    }

};



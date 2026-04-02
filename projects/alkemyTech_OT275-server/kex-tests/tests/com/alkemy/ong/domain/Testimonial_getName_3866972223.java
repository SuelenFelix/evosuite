package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Testimonial_getName_3866972223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15960;

    public Testimonial_getName_3866972223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15961 = new Long(-6837989212848250735L);
        term15960 = newInstance(Class.forName("com.alkemy.ong.domain.Testimonial"));
        setField(term15960, term15960.getClass(), "id", term15961);
        setField(term15960, term15960.getClass(), "name", "XMArCaVAEc");
        setField(term15960, term15960.getClass(), "content", "URWnZtbrQH");
        setField(term15960, term15960.getClass(), "imageUrl", "hpTAdtnQku");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Testimonial");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term15960, args);
    }

};



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

public class SocialMedia_getFacebookUrl_14647662608 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17053;

    public SocialMedia_getFacebookUrl_14647662608() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17053 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term17053, term17053.getClass(), "facebookUrl", null);
        setField(term17053, term17053.getClass(), "linkedInUrl", null);
        setField(term17053, term17053.getClass(), "instagramUrl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.SocialMedia");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFacebookUrl", argTypes, term17053, args);
    }

};



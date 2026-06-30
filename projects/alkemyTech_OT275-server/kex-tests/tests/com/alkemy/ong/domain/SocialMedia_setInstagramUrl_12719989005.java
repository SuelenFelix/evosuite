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

public class SocialMedia_setInstagramUrl_12719989005 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16898;

    public SocialMedia_setInstagramUrl_12719989005() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16898 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term16898, term16898.getClass(), "facebookUrl", "bZrrPiMnsr");
        setField(term16898, term16898.getClass(), "linkedInUrl", "IeromvfDmz");
        setField(term16898, term16898.getClass(), "instagramUrl", "xJLHPTRSqe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.SocialMedia");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OIFZYdbUZz";
        callMethod(klass, "setInstagramUrl", argTypes, term16898, args);
    }

};



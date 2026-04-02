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

public class SocialMedia_setFacebookUrl_15678170763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16720;

    public SocialMedia_setFacebookUrl_15678170763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16720 = newInstance(Class.forName("com.alkemy.ong.domain.SocialMedia"));
        setField(term16720, term16720.getClass(), "facebookUrl", "SXMdNSGPog");
        setField(term16720, term16720.getClass(), "linkedInUrl", "vsqwOLpDjj");
        setField(term16720, term16720.getClass(), "instagramUrl", "rJgXQRsPCl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.SocialMedia");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RgqpoBknjN";
        callMethod(klass, "setFacebookUrl", argTypes, term16720, args);
    }

};



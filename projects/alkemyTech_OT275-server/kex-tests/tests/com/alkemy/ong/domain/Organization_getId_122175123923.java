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

public class Organization_getId_122175123923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6008;

    public Organization_getId_122175123923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6008 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        setField(term6008, term6008.getClass(), "id", null);
        setField(term6008, term6008.getClass(), "name", null);
        setField(term6008, term6008.getClass(), "image", null);
        setField(term6008, term6008.getClass(), "phone", null);
        setField(term6008, term6008.getClass(), "address", null);
        setField(term6008, term6008.getClass(), "email", null);
        setField(term6008, term6008.getClass(), "socialMedia", null);
        setField(term6008, term6008.getClass(), "aboutUsText", null);
        setField(term6008, term6008.getClass(), "welcomeText", null);
        setField(term6008, term6008.getClass(), "slides", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Organization");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term6008, args);
    }

};



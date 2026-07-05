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

public class Organization_getAddress_172728325927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6012;

    public Organization_getAddress_172728325927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6012 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        setField(term6012, term6012.getClass(), "id", null);
        setField(term6012, term6012.getClass(), "name", null);
        setField(term6012, term6012.getClass(), "image", null);
        setField(term6012, term6012.getClass(), "phone", null);
        setField(term6012, term6012.getClass(), "address", null);
        setField(term6012, term6012.getClass(), "email", null);
        setField(term6012, term6012.getClass(), "socialMedia", null);
        setField(term6012, term6012.getClass(), "aboutUsText", null);
        setField(term6012, term6012.getClass(), "welcomeText", null);
        setField(term6012, term6012.getClass(), "slides", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Organization");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAddress", argTypes, term6012, args);
    }

};



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

public class Organization_setSlides_35700689242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6027;

    public Organization_setSlides_35700689242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6027 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        setField(term6027, term6027.getClass(), "id", null);
        setField(term6027, term6027.getClass(), "name", null);
        setField(term6027, term6027.getClass(), "image", null);
        setField(term6027, term6027.getClass(), "phone", null);
        setField(term6027, term6027.getClass(), "address", null);
        setField(term6027, term6027.getClass(), "email", null);
        setField(term6027, term6027.getClass(), "socialMedia", null);
        setField(term6027, term6027.getClass(), "aboutUsText", null);
        setField(term6027, term6027.getClass(), "welcomeText", null);
        setField(term6027, term6027.getClass(), "slides", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Organization");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSlides", argTypes, term6027, args);
    }

};



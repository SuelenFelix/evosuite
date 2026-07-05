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

public class Organization_setWelcomeText_54179800641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6026;

    public Organization_setWelcomeText_54179800641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6026 = newInstance(Class.forName("com.alkemy.ong.domain.Organization"));
        setField(term6026, term6026.getClass(), "id", null);
        setField(term6026, term6026.getClass(), "name", null);
        setField(term6026, term6026.getClass(), "image", null);
        setField(term6026, term6026.getClass(), "phone", null);
        setField(term6026, term6026.getClass(), "address", null);
        setField(term6026, term6026.getClass(), "email", null);
        setField(term6026, term6026.getClass(), "socialMedia", null);
        setField(term6026, term6026.getClass(), "aboutUsText", null);
        setField(term6026, term6026.getClass(), "welcomeText", null);
        setField(term6026, term6026.getClass(), "slides", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Organization");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setWelcomeText", argTypes, term6026, args);
    }

};



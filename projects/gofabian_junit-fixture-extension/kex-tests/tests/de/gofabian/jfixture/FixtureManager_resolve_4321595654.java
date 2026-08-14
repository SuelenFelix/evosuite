package de.gofabian.jfixture;

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
import static de.gofabian.jfixture.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;

public class FixtureManager_resolve_4321595654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1012;
     Object term1028;

    public FixtureManager_resolve_4321595654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1014 = new HashMap();
        ArrayList term1019 = new ArrayList();
        ArrayList term1024 = new ArrayList();
        term1012 = newInstance(Class.forName("de.gofabian.jfixture.FixtureManager"));
        Object term1013 = newInstance(Class.forName("de.gofabian.jfixture.FixtureSession"));
        Object term1023 = newInstance(Class.forName("de.gofabian.jfixture.FixtureDefinitionQueries"));
        setField(term1013, term1013.getClass(), "definitionLifecycleMap", term1014);
        setField(term1013, term1013.getClass(), "orderedLifecycles", term1019);
        setField(term1012, term1012.getClass(), "session", term1013);
        setField(term1023, term1023.getClass(), "definitions", term1024);
        setField(term1012, term1012.getClass(), "definitions", term1023);
        term1028 = newInstance(Class.forName("de.gofabian.jfixture.api.FixtureId"));
        setField(term1028, term1028.getClass(), "type", null);
        setField(term1028, term1028.getClass(), "name", "LQFpaHEwXR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.gofabian.jfixture.FixtureManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("de.gofabian.jfixture.api.FixtureId");
        Object[] args = new Object[1];
        args[0] = term1028;
        callMethod(klass, "resolve", argTypes, term1012, args);
    }

};



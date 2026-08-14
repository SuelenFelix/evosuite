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

public class FixtureManager_setUp_11548320155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1051;

    public FixtureManager_setUp_11548320155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1053 = new HashMap();
        ArrayList term1058 = new ArrayList();
        ArrayList term1063 = new ArrayList();
        ((ArrayList) term1063).add((Object)null);
        ((ArrayList) term1063).add((Object)null);
        ((ArrayList) term1063).add((Object)null);
        ((ArrayList) term1063).add((Object)null);
        ((ArrayList) term1063).add((Object)null);
        ((ArrayList) term1063).add((Object)null);
        ((ArrayList) term1063).add((Object)null);
        ((ArrayList) term1063).add((Object)null);
        term1051 = newInstance(Class.forName("de.gofabian.jfixture.FixtureManager"));
        Object term1052 = newInstance(Class.forName("de.gofabian.jfixture.FixtureSession"));
        Object term1062 = newInstance(Class.forName("de.gofabian.jfixture.FixtureDefinitionQueries"));
        setField(term1052, term1052.getClass(), "definitionLifecycleMap", term1053);
        setField(term1052, term1052.getClass(), "orderedLifecycles", term1058);
        setField(term1051, term1051.getClass(), "session", term1052);
        setField(term1062, term1062.getClass(), "definitions", term1063);
        setField(term1051, term1051.getClass(), "definitions", term1062);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.gofabian.jfixture.FixtureManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("de.gofabian.jfixture.FixtureDefinition");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUp", argTypes, term1051, args);
    }

};



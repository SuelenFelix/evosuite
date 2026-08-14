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

public class FixtureManager_getFixtureLifecycle_15084767357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1106;

    public FixtureManager_getFixtureLifecycle_15084767357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1108 = new HashMap();
        ArrayList term1113 = new ArrayList();
        ArrayList term1118 = new ArrayList();
        term1106 = newInstance(Class.forName("de.gofabian.jfixture.FixtureManager"));
        Object term1107 = newInstance(Class.forName("de.gofabian.jfixture.FixtureSession"));
        Object term1117 = newInstance(Class.forName("de.gofabian.jfixture.FixtureDefinitionQueries"));
        setField(term1107, term1107.getClass(), "definitionLifecycleMap", term1108);
        setField(term1107, term1107.getClass(), "orderedLifecycles", term1113);
        setField(term1106, term1106.getClass(), "session", term1107);
        setField(term1117, term1117.getClass(), "definitions", term1118);
        setField(term1106, term1106.getClass(), "definitions", term1117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.gofabian.jfixture.FixtureManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("de.gofabian.jfixture.FixtureDefinition");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getFixtureLifecycle", argTypes, term1106, args);
    }

};



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

public class FixtureManager_getFixtureDefinition_16646271266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1067;
     Object term1083;

    public FixtureManager_getFixtureDefinition_16646271266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1069 = new HashMap();
        ArrayList term1074 = new ArrayList();
        ArrayList term1079 = new ArrayList();
        term1067 = newInstance(Class.forName("de.gofabian.jfixture.FixtureManager"));
        Object term1068 = newInstance(Class.forName("de.gofabian.jfixture.FixtureSession"));
        Object term1078 = newInstance(Class.forName("de.gofabian.jfixture.FixtureDefinitionQueries"));
        setField(term1068, term1068.getClass(), "definitionLifecycleMap", term1069);
        setField(term1068, term1068.getClass(), "orderedLifecycles", term1074);
        setField(term1067, term1067.getClass(), "session", term1068);
        setField(term1078, term1078.getClass(), "definitions", term1079);
        setField(term1067, term1067.getClass(), "definitions", term1078);
        term1083 = newInstance(Class.forName("de.gofabian.jfixture.api.FixtureId"));
        setField(term1083, term1083.getClass(), "type", null);
        setField(term1083, term1083.getClass(), "name", "oVcInYnLWB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.gofabian.jfixture.FixtureManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("de.gofabian.jfixture.api.FixtureId");
        Object[] args = new Object[1];
        args[0] = term1083;
        callMethod(klass, "getFixtureDefinition", argTypes, term1067, args);
    }

};



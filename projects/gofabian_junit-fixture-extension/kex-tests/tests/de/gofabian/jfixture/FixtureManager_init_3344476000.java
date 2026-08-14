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
import java.util.HashMap;
import java.util.ArrayList;
import java.util.LinkedList;

public class FixtureManager_init_3344476000 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558;
     Object term568;

    public FixtureManager_init_3344476000() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term559 = new HashMap();
        ArrayList term564 = new ArrayList();
        term558 = newInstance(Class.forName("de.gofabian.jfixture.FixtureSession"));
        setField(term558, term558.getClass(), "definitionLifecycleMap", term559);
        setField(term558, term558.getClass(), "orderedLifecycles", term564);
        term568 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.gofabian.jfixture.FixtureManager");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("de.gofabian.jfixture.FixtureSession");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term558;
        args[1] = term568;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



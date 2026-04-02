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
import java.lang.String;

public class FixtureManager_leave_16864615242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term799;
     Object enum1;

    public FixtureManager_leave_16864615242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term801 = new HashMap();
        ArrayList term806 = new ArrayList();
        ArrayList term811 = new ArrayList();
        ((ArrayList) term811).add((Object)null);
        ((ArrayList) term811).add((Object)null);
        term799 = newInstance(Class.forName("de.gofabian.jfixture.FixtureManager"));
        Object term800 = newInstance(Class.forName("de.gofabian.jfixture.FixtureSession"));
        Object term810 = newInstance(Class.forName("de.gofabian.jfixture.FixtureDefinitionQueries"));
        setField(term800, term800.getClass(), "definitionLifecycleMap", term801);
        setField(term800, term800.getClass(), "orderedLifecycles", term806);
        setField(term799, term799.getClass(), "session", term800);
        setField(term810, term810.getClass(), "definitions", term811);
        setField(term799, term799.getClass(), "definitions", term810);
        Class<? extends Object> term825 = Class.forName((String) "de.gofabian.jfixture.Scope");
        Field term824 = ((Class) term825).getDeclaredField((String) "FILE");
        ((Field) term824).setAccessible(true);
        enum1 = ((Field) term824).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.gofabian.jfixture.FixtureManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("de.gofabian.jfixture.Scope");
        Object[] args = new Object[1];
        args[0] = enum1;
        callMethod(klass, "leave", argTypes, term799, args);
    }

};



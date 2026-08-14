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

public class FixtureManager_enter_436183571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term571;
     Object enum0;

    public FixtureManager_enter_436183571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term573 = new HashMap();
        ArrayList term578 = new ArrayList();
        ArrayList term583 = new ArrayList();
        ((ArrayList) term583).add((Object)null);
        ((ArrayList) term583).add((Object)null);
        term571 = newInstance(Class.forName("de.gofabian.jfixture.FixtureManager"));
        Object term572 = newInstance(Class.forName("de.gofabian.jfixture.FixtureSession"));
        Object term582 = newInstance(Class.forName("de.gofabian.jfixture.FixtureDefinitionQueries"));
        setField(term572, term572.getClass(), "definitionLifecycleMap", term573);
        setField(term572, term572.getClass(), "orderedLifecycles", term578);
        setField(term571, term571.getClass(), "session", term572);
        setField(term582, term582.getClass(), "definitions", term583);
        setField(term571, term571.getClass(), "definitions", term582);
        Class<? extends Object> term642 = Class.forName((String) "de.gofabian.jfixture.Scope");
        Field term641 = ((Class) term642).getDeclaredField((String) "SESSION");
        ((Field) term641).setAccessible(true);
        enum0 = ((Field) term641).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.gofabian.jfixture.FixtureManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("de.gofabian.jfixture.Scope");
        Object[] args = new Object[1];
        args[0] = enum0;
        callMethod(klass, "enter", argTypes, term571, args);
    }

};



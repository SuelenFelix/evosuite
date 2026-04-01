package org.openRealmOfStars.gui.util;

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
import static org.openRealmOfStars.gui.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ProceduralRenderer_start_119271785110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2099;

    public ProceduralRenderer_start_119271785110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2099 = newInstance(Class.forName("org.openRealmOfStars.gui.util.ProceduralRenderer"));
        setBooleanField(term2099, term2099.getClass(), "started", false);
        setBooleanField(term2099, term2099.getClass(), "running", false);
        setField(term2099, term2099.getClass(), "stars", null);
        setField(term2099, term2099.getClass(), "name", null);
        setIntField(term2099, term2099.getClass(), "priority", 0);
        setBooleanField(term2099, term2099.getClass(), "daemon", false);
        setBooleanField(term2099, term2099.getClass(), "stillborn", false);
        setLongField(term2099, term2099.getClass(), "eetop", 0L);
        setField(term2099, term2099.getClass(), "target", null);
        setField(term2099, term2099.getClass(), "group", null);
        setField(term2099, term2099.getClass(), "contextClassLoader", null);
        setField(term2099, term2099.getClass(), "inheritedAccessControlContext", null);
        setField(term2099, term2099.getClass(), "threadLocals", null);
        setField(term2099, term2099.getClass(), "inheritableThreadLocals", null);
        setLongField(term2099, term2099.getClass(), "stackSize", 0L);
        setLongField(term2099, term2099.getClass(), "tid", 0L);
        setIntField(term2099, term2099.getClass(), "threadStatus", 0);
        setField(term2099, term2099.getClass(), "parkBlocker", null);
        setField(term2099, term2099.getClass(), "blocker", null);
        setField(term2099, term2099.getClass(), "blockerLock", null);
        setField(term2099, term2099.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term2099, term2099.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term2099, term2099.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term2099, term2099.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.util.ProceduralRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "start", argTypes, term2099, args);
    }

};



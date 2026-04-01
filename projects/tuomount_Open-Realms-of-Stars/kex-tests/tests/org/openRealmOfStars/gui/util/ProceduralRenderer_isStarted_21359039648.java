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

public class ProceduralRenderer_isStarted_21359039648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2073;

    public ProceduralRenderer_isStarted_21359039648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2073 = newInstance(Class.forName("org.openRealmOfStars.gui.util.ProceduralRenderer"));
        setBooleanField(term2073, term2073.getClass(), "started", false);
        setBooleanField(term2073, term2073.getClass(), "running", false);
        setField(term2073, term2073.getClass(), "stars", null);
        setField(term2073, term2073.getClass(), "name", null);
        setIntField(term2073, term2073.getClass(), "priority", 0);
        setBooleanField(term2073, term2073.getClass(), "daemon", false);
        setBooleanField(term2073, term2073.getClass(), "stillborn", false);
        setLongField(term2073, term2073.getClass(), "eetop", 0L);
        setField(term2073, term2073.getClass(), "target", null);
        setField(term2073, term2073.getClass(), "group", null);
        setField(term2073, term2073.getClass(), "contextClassLoader", null);
        setField(term2073, term2073.getClass(), "inheritedAccessControlContext", null);
        setField(term2073, term2073.getClass(), "threadLocals", null);
        setField(term2073, term2073.getClass(), "inheritableThreadLocals", null);
        setLongField(term2073, term2073.getClass(), "stackSize", 0L);
        setLongField(term2073, term2073.getClass(), "tid", 0L);
        setIntField(term2073, term2073.getClass(), "threadStatus", 0);
        setField(term2073, term2073.getClass(), "parkBlocker", null);
        setField(term2073, term2073.getClass(), "blocker", null);
        setField(term2073, term2073.getClass(), "blockerLock", null);
        setField(term2073, term2073.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term2073, term2073.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term2073, term2073.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term2073, term2073.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.util.ProceduralRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isStarted", argTypes, term2073, args);
    }

};



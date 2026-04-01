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

public class ProceduralRenderer_getStars_128074469813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2144;

    public ProceduralRenderer_getStars_128074469813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2144 = newInstance(Class.forName("org.openRealmOfStars.gui.util.ProceduralRenderer"));
        setBooleanField(term2144, term2144.getClass(), "started", false);
        setBooleanField(term2144, term2144.getClass(), "running", false);
        setField(term2144, term2144.getClass(), "stars", null);
        setField(term2144, term2144.getClass(), "name", null);
        setIntField(term2144, term2144.getClass(), "priority", 0);
        setBooleanField(term2144, term2144.getClass(), "daemon", false);
        setBooleanField(term2144, term2144.getClass(), "stillborn", false);
        setLongField(term2144, term2144.getClass(), "eetop", 0L);
        setField(term2144, term2144.getClass(), "target", null);
        setField(term2144, term2144.getClass(), "group", null);
        setField(term2144, term2144.getClass(), "contextClassLoader", null);
        setField(term2144, term2144.getClass(), "inheritedAccessControlContext", null);
        setField(term2144, term2144.getClass(), "threadLocals", null);
        setField(term2144, term2144.getClass(), "inheritableThreadLocals", null);
        setLongField(term2144, term2144.getClass(), "stackSize", 0L);
        setLongField(term2144, term2144.getClass(), "tid", 0L);
        setIntField(term2144, term2144.getClass(), "threadStatus", 0);
        setField(term2144, term2144.getClass(), "parkBlocker", null);
        setField(term2144, term2144.getClass(), "blocker", null);
        setField(term2144, term2144.getClass(), "blockerLock", null);
        setField(term2144, term2144.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term2144, term2144.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term2144, term2144.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term2144, term2144.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.util.ProceduralRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStars", argTypes, term2144, args);
    }

};



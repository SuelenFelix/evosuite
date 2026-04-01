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

public class ProceduralRenderer_run_109618841212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2131;

    public ProceduralRenderer_run_109618841212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2131 = newInstance(Class.forName("org.openRealmOfStars.gui.util.ProceduralRenderer"));
        setBooleanField(term2131, term2131.getClass(), "started", false);
        setBooleanField(term2131, term2131.getClass(), "running", false);
        setField(term2131, term2131.getClass(), "stars", null);
        setField(term2131, term2131.getClass(), "name", null);
        setIntField(term2131, term2131.getClass(), "priority", 0);
        setBooleanField(term2131, term2131.getClass(), "daemon", false);
        setBooleanField(term2131, term2131.getClass(), "stillborn", false);
        setLongField(term2131, term2131.getClass(), "eetop", 0L);
        setField(term2131, term2131.getClass(), "target", null);
        setField(term2131, term2131.getClass(), "group", null);
        setField(term2131, term2131.getClass(), "contextClassLoader", null);
        setField(term2131, term2131.getClass(), "inheritedAccessControlContext", null);
        setField(term2131, term2131.getClass(), "threadLocals", null);
        setField(term2131, term2131.getClass(), "inheritableThreadLocals", null);
        setLongField(term2131, term2131.getClass(), "stackSize", 0L);
        setLongField(term2131, term2131.getClass(), "tid", 0L);
        setIntField(term2131, term2131.getClass(), "threadStatus", 0);
        setField(term2131, term2131.getClass(), "parkBlocker", null);
        setField(term2131, term2131.getClass(), "blocker", null);
        setField(term2131, term2131.getClass(), "blockerLock", null);
        setField(term2131, term2131.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term2131, term2131.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term2131, term2131.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term2131, term2131.getClass(), "threadLocalRandomSecondarySeed", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.util.ProceduralRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "run", argTypes, term2131, args);
    }

};



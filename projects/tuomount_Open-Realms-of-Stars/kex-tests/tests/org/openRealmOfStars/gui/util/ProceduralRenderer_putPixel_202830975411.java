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
import java.lang.Integer;

public class ProceduralRenderer_putPixel_202830975411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2112;
     Object term2125;
     Object term2127;
     Object term2129;

    public ProceduralRenderer_putPixel_202830975411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2112 = newInstance(Class.forName("org.openRealmOfStars.gui.util.ProceduralRenderer"));
        setBooleanField(term2112, term2112.getClass(), "started", false);
        setBooleanField(term2112, term2112.getClass(), "running", false);
        setField(term2112, term2112.getClass(), "stars", null);
        setField(term2112, term2112.getClass(), "name", null);
        setIntField(term2112, term2112.getClass(), "priority", 0);
        setBooleanField(term2112, term2112.getClass(), "daemon", false);
        setBooleanField(term2112, term2112.getClass(), "stillborn", false);
        setLongField(term2112, term2112.getClass(), "eetop", 0L);
        setField(term2112, term2112.getClass(), "target", null);
        setField(term2112, term2112.getClass(), "group", null);
        setField(term2112, term2112.getClass(), "contextClassLoader", null);
        setField(term2112, term2112.getClass(), "inheritedAccessControlContext", null);
        setField(term2112, term2112.getClass(), "threadLocals", null);
        setField(term2112, term2112.getClass(), "inheritableThreadLocals", null);
        setLongField(term2112, term2112.getClass(), "stackSize", 0L);
        setLongField(term2112, term2112.getClass(), "tid", 0L);
        setIntField(term2112, term2112.getClass(), "threadStatus", 0);
        setField(term2112, term2112.getClass(), "parkBlocker", null);
        setField(term2112, term2112.getClass(), "blocker", null);
        setField(term2112, term2112.getClass(), "blockerLock", null);
        setField(term2112, term2112.getClass(), "uncaughtExceptionHandler", null);
        setLongField(term2112, term2112.getClass(), "threadLocalRandomSeed", 0L);
        setIntField(term2112, term2112.getClass(), "threadLocalRandomProbe", 0);
        setIntField(term2112, term2112.getClass(), "threadLocalRandomSecondarySeed", 0);
        term2125 = new Integer(0);
        term2127 = new Integer(0);
        term2129 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.util.ProceduralRenderer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term2125;
        args[2] = term2127;
        args[3] = term2129;
        callMethod(klass, "putPixel", argTypes, term2112, args);
    }

};



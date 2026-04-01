package org.openRealmOfStars.gui.icons;

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
import static org.openRealmOfStars.gui.icons.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class AnimatedImage_getFrame_19957876948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term910;
     Object term914;

    public AnimatedImage_getFrame_19957876948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term910 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.AnimatedImage"));
        setField(term910, term910.getClass(), "animations", null);
        setIntField(term910, term910.getClass(), "frame", 0);
        setIntField(term910, term910.getClass(), "sizeX", 0);
        setIntField(term910, term910.getClass(), "sizeY", 0);
        term914 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.icons.AnimatedImage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term914;
        callMethod(klass, "getFrame", argTypes, term910, args);
    }

};



package org.openRealmOfStars.gui.borders;

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
import static org.openRealmOfStars.gui.borders.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SimpleBorder_getBorderInsets_2051952993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80;
     Object term81;

    public SimpleBorder_getBorderInsets_2051952993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80 = newInstance(Class.forName("org.openRealmOfStars.gui.borders.SimpleBorder"));
        term81 = newInstance(Class.forName("java.awt.Insets"));
        setIntField(term81, term81.getClass(), "top", 1134449235);
        setIntField(term81, term81.getClass(), "left", -883034806);
        setIntField(term81, term81.getClass(), "bottom", 1585847225);
        setIntField(term81, term81.getClass(), "right", 597278769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.borders.SimpleBorder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.awt.Component");
        argTypes[1] = Class.forName("java.awt.Insets");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term81;
        callMethod(klass, "getBorderInsets", argTypes, term80, args);
    }

};



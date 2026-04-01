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

public class ScifiBorder_getBorderInsets_6890973997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55;

    public ScifiBorder_getBorderInsets_6890973997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55 = newInstance(Class.forName("java.awt.Insets"));
        setIntField(term55, term55.getClass(), "top", -1922583790);
        setIntField(term55, term55.getClass(), "left", -616727354);
        setIntField(term55, term55.getClass(), "bottom", -1955890973);
        setIntField(term55, term55.getClass(), "right", -2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.borders.ScifiBorder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.awt.Component");
        argTypes[1] = Class.forName("java.awt.Insets");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term55;
        callMethod(klass, "getBorderInsets", argTypes, null, args);
    }

};



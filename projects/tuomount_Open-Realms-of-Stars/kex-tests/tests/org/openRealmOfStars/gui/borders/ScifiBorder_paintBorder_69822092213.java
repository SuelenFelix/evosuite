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
import java.lang.Integer;

public class ScifiBorder_paintBorder_69822092213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62;
     Object term64;
     Object term66;
     Object term68;

    public ScifiBorder_paintBorder_69822092213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62 = new Integer(0);
        term64 = new Integer(0);
        term66 = new Integer(0);
        term68 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.borders.ScifiBorder");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.awt.Component");
        argTypes[1] = Class.forName("java.awt.Graphics");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = term62;
        args[3] = term64;
        args[4] = term66;
        args[5] = term68;
        callMethod(klass, "paintBorder", argTypes, null, args);
    }

};



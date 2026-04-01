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

public class GraphRoutines_drawTiling_44181800011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2856;
     Object term2857;
     Object term2859;
     Object term2861;
     Object term2863;

    public GraphRoutines_drawTiling_44181800011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2856 = newInstance(Class.forName("org.openRealmOfStars.gui.util.GraphRoutines"));
        term2857 = new Integer(0);
        term2859 = new Integer(0);
        term2861 = new Integer(0);
        term2863 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.util.GraphRoutines");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("java.awt.image.BufferedImage");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = term2857;
        args[3] = term2859;
        args[4] = term2861;
        args[5] = term2863;
        callMethod(klass, "drawTiling", argTypes, term2856, args);
    }

};



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
import java.lang.Float;

public class GuiFonts_buildFontId_92151574211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2249;

    public GuiFonts_buildFontId_92151574211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2249 = new Float(0.5446086F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.util.GuiFonts");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = float.class;
        Object[] args = new Object[2];
        args[0] = "SzjVpOQTyS";
        args[1] = term2249;
        callMethod(klass, "buildFontId", argTypes, null, args);
    }

};



package com.snksynthesis.voxelgame.gfx;

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
import static com.snksynthesis.voxelgame.gfx.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Window_setTitle_25527995619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term392;

    public Window_setTitle_25527995619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term392 = newInstance(Class.forName("com.snksynthesis.voxelgame.gfx.Window"));
        setLongField(term392, term392.getClass(), "window", 0L);
        setField(term392, term392.getClass(), "title", null);
        setIntField(term392, term392.getClass(), "width", 0);
        setIntField(term392, term392.getClass(), "height", 0);
        setBooleanField(term392, term392.getClass(), "resized", false);
        setFloatField(term392, term392.getClass(), "deltaTime", 0.0F);
        setFloatField(term392, term392.getClass(), "lastFrame", 0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.snksynthesis.voxelgame.gfx.Window");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTitle", argTypes, term392, args);
    }

};



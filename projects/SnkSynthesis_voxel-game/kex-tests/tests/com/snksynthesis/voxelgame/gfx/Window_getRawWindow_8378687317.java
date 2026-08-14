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

public class Window_getRawWindow_8378687317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term378;

    public Window_getRawWindow_8378687317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term378 = newInstance(Class.forName("com.snksynthesis.voxelgame.gfx.Window"));
        setLongField(term378, term378.getClass(), "window", 0L);
        setField(term378, term378.getClass(), "title", null);
        setIntField(term378, term378.getClass(), "width", 0);
        setIntField(term378, term378.getClass(), "height", 0);
        setBooleanField(term378, term378.getClass(), "resized", false);
        setFloatField(term378, term378.getClass(), "deltaTime", 0.0F);
        setFloatField(term378, term378.getClass(), "lastFrame", 0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.snksynthesis.voxelgame.gfx.Window");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRawWindow", argTypes, term378, args);
    }

};



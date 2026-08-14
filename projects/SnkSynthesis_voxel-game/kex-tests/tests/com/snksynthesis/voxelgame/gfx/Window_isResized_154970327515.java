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

public class Window_isResized_154970327515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term364;

    public Window_isResized_154970327515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term364 = newInstance(Class.forName("com.snksynthesis.voxelgame.gfx.Window"));
        setLongField(term364, term364.getClass(), "window", 0L);
        setField(term364, term364.getClass(), "title", null);
        setIntField(term364, term364.getClass(), "width", 0);
        setIntField(term364, term364.getClass(), "height", 0);
        setBooleanField(term364, term364.getClass(), "resized", false);
        setFloatField(term364, term364.getClass(), "deltaTime", 0.0F);
        setFloatField(term364, term364.getClass(), "lastFrame", 0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.snksynthesis.voxelgame.gfx.Window");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isResized", argTypes, term364, args);
    }

};



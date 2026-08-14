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

public class Window_create_509736531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27;

    public Window_create_509736531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27 = newInstance(Class.forName("com.snksynthesis.voxelgame.gfx.Window"));
        setLongField(term27, term27.getClass(), "window", 2442117782898005296L);
        setField(term27, term27.getClass(), "title", "sjlJAEtRrb");
        setIntField(term27, term27.getClass(), "width", 1484323161);
        setIntField(term27, term27.getClass(), "height", 391863371);
        setBooleanField(term27, term27.getClass(), "resized", false);
        setFloatField(term27, term27.getClass(), "deltaTime", 0.13238746F);
        setFloatField(term27, term27.getClass(), "lastFrame", 0.2707036F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.snksynthesis.voxelgame.gfx.Window");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "create", argTypes, term27, args);
    }

};



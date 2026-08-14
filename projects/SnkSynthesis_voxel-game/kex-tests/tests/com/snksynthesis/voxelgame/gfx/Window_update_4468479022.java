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

public class Window_update_4468479022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56;

    public Window_update_4468479022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56 = newInstance(Class.forName("com.snksynthesis.voxelgame.gfx.Window"));
        setLongField(term56, term56.getClass(), "window", 6375119433582206027L);
        setField(term56, term56.getClass(), "title", "MuLcgQHgqz");
        setIntField(term56, term56.getClass(), "width", -1922583790);
        setIntField(term56, term56.getClass(), "height", -616727354);
        setBooleanField(term56, term56.getClass(), "resized", false);
        setFloatField(term56, term56.getClass(), "deltaTime", 0.3455959F);
        setFloatField(term56, term56.getClass(), "lastFrame", 0.09123778F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.snksynthesis.voxelgame.gfx.Window");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "update", argTypes, term56, args);
    }

};



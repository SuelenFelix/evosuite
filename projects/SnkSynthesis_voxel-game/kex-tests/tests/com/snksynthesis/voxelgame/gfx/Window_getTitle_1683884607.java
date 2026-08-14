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

public class Window_getTitle_1683884607 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201;

    public Window_getTitle_1683884607() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term201 = newInstance(Class.forName("com.snksynthesis.voxelgame.gfx.Window"));
        setLongField(term201, term201.getClass(), "window", 4872422362414183754L);
        setField(term201, term201.getClass(), "title", "MjGYSRKTNF");
        setIntField(term201, term201.getClass(), "width", 1585847225);
        setIntField(term201, term201.getClass(), "height", 597278769);
        setBooleanField(term201, term201.getClass(), "resized", true);
        setFloatField(term201, term201.getClass(), "deltaTime", 0.26413453F);
        setFloatField(term201, term201.getClass(), "lastFrame", 0.7944024F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.snksynthesis.voxelgame.gfx.Window");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term201, args);
    }

};



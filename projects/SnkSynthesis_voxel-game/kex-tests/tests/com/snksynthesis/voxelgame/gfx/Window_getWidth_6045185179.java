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

public class Window_getWidth_6045185179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281;

    public Window_getWidth_6045185179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281 = newInstance(Class.forName("com.snksynthesis.voxelgame.gfx.Window"));
        setLongField(term281, term281.getClass(), "window", -7237588299778557629L);
        setField(term281, term281.getClass(), "title", "NRdvgJlhkX");
        setIntField(term281, term281.getClass(), "width", 1622346318);
        setIntField(term281, term281.getClass(), "height", 1048535127);
        setBooleanField(term281, term281.getClass(), "resized", false);
        setFloatField(term281, term281.getClass(), "deltaTime", 0.6076495F);
        setFloatField(term281, term281.getClass(), "lastFrame", 0.6608425F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.snksynthesis.voxelgame.gfx.Window");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWidth", argTypes, term281, args);
    }

};



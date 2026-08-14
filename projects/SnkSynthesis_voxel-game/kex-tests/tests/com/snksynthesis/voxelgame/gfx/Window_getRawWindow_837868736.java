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

public class Window_getRawWindow_837868736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172;

    public Window_getRawWindow_837868736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172 = newInstance(Class.forName("com.snksynthesis.voxelgame.gfx.Window"));
        setLongField(term172, term172.getClass(), "window", 7411271909051562686L);
        setField(term172, term172.getClass(), "title", "SzjVpOQTyS");
        setIntField(term172, term172.getClass(), "width", 1134449235);
        setIntField(term172, term172.getClass(), "height", -883034806);
        setBooleanField(term172, term172.getClass(), "resized", true);
        setFloatField(term172, term172.getClass(), "deltaTime", 0.40176582F);
        setFloatField(term172, term172.getClass(), "lastFrame", 0.8783184F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.snksynthesis.voxelgame.gfx.Window");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRawWindow", argTypes, term172, args);
    }

};



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

public class Window_getHeight_57853305410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term310;

    public Window_getHeight_57853305410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term310 = newInstance(Class.forName("com.snksynthesis.voxelgame.gfx.Window"));
        setLongField(term310, term310.getClass(), "window", 6967924379644551255L);
        setField(term310, term310.getClass(), "title", "uuaPigETmJ");
        setIntField(term310, term310.getClass(), "width", -655067527);
        setIntField(term310, term310.getClass(), "height", -6029667);
        setBooleanField(term310, term310.getClass(), "resized", true);
        setFloatField(term310, term310.getClass(), "deltaTime", 0.37773192F);
        setFloatField(term310, term310.getClass(), "lastFrame", 0.24413109F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.snksynthesis.voxelgame.gfx.Window");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeight", argTypes, term310, args);
    }

};



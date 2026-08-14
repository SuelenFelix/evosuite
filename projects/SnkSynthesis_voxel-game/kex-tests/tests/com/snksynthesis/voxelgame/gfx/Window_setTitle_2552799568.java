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

public class Window_setTitle_2552799568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230;

    public Window_setTitle_2552799568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230 = newInstance(Class.forName("com.snksynthesis.voxelgame.gfx.Window"));
        setLongField(term230, term230.getClass(), "window", 6811161968424632369L);
        setField(term230, term230.getClass(), "title", "hRNSzYYIrc");
        setIntField(term230, term230.getClass(), "width", -1685132342);
        setIntField(term230, term230.getClass(), "height", -1456670397);
        setBooleanField(term230, term230.getClass(), "resized", true);
        setFloatField(term230, term230.getClass(), "deltaTime", 0.3692338F);
        setFloatField(term230, term230.getClass(), "lastFrame", 0.13906479F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.snksynthesis.voxelgame.gfx.Window");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RMFIsYGgne";
        callMethod(klass, "setTitle", argTypes, term230, args);
    }

};



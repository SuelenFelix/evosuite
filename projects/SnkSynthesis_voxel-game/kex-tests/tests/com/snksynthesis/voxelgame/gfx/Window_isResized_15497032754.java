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

public class Window_isResized_15497032754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114;

    public Window_isResized_15497032754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114 = newInstance(Class.forName("com.snksynthesis.voxelgame.gfx.Window"));
        setLongField(term114, term114.getClass(), "window", -8400487765614892086L);
        setField(term114, term114.getClass(), "title", "jJCZpVmanW");
        setIntField(term114, term114.getClass(), "width", 1227103734);
        setIntField(term114, term114.getClass(), "height", -1339778481);
        setBooleanField(term114, term114.getClass(), "resized", false);
        setFloatField(term114, term114.getClass(), "deltaTime", 0.5446086F);
        setFloatField(term114, term114.getClass(), "lastFrame", 0.5254275F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.snksynthesis.voxelgame.gfx.Window");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isResized", argTypes, term114, args);
    }

};



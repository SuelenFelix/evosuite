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

public class Window_getDeltaTime_10693106725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143;

    public Window_getDeltaTime_10693106725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143 = newInstance(Class.forName("com.snksynthesis.voxelgame.gfx.Window"));
        setLongField(term143, term143.getClass(), "window", 5270370404989704783L);
        setField(term143, term143.getClass(), "title", "EGtDIRbSSb");
        setIntField(term143, term143.getClass(), "width", 1725571209);
        setIntField(term143, term143.getClass(), "height", -522618178);
        setBooleanField(term143, term143.getClass(), "resized", true);
        setFloatField(term143, term143.getClass(), "deltaTime", 0.2857073F);
        setFloatField(term143, term143.getClass(), "lastFrame", 0.6880585F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.snksynthesis.voxelgame.gfx.Window");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeltaTime", argTypes, term143, args);
    }

};



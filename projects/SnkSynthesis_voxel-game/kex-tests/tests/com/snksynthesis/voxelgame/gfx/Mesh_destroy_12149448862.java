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

public class Mesh_destroy_12149448862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term438;

    public Mesh_destroy_12149448862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term438 = newInstance(Class.forName("com.snksynthesis.voxelgame.gfx.Mesh"));
        float[] term441 = (float[]) newFloatArray(3);
        setIntField(term438, term438.getClass(), "vaoId", 1135664017);
        setIntField(term438, term438.getClass(), "vboId", 590364439);
        setFloatElement(term441, 0, 0.9431611F);
        setFloatElement(term441, 1, 0.95272815F);
        setFloatElement(term441, 2, 0.7254646F);
        setField(term438, term438.getClass(), "vertices", term441);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.snksynthesis.voxelgame.gfx.Mesh");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "destroy", argTypes, term438, args);
    }

};



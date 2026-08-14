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

public class Mesh_getSumInBytes_4361636434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term460;
     Object term465;

    public Mesh_getSumInBytes_4361636434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term460 = newInstance(Class.forName("com.snksynthesis.voxelgame.gfx.Mesh"));
        float[] term463 = (float[]) newFloatArray(1);
        setIntField(term460, term460.getClass(), "vaoId", -244121226);
        setIntField(term460, term460.getClass(), "vboId", -203030934);
        setFloatElement(term463, 0, 0.6436713F);
        setField(term460, term460.getClass(), "vertices", term463);
        term465 = (int[]) newIntArray(6);
        setIntElement(term465, 0, -1179120542);
        setIntElement(term465, 1, -73683645);
        setIntElement(term465, 2, -226514366);
        setIntElement(term465, 3, 1193880199);
        setIntElement(term465, 4, -1087774327);
        setIntElement(term465, 5, -1530420153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.snksynthesis.voxelgame.gfx.Mesh");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term465;
        callMethod(klass, "getSumInBytes", argTypes, term460, args);
    }

};



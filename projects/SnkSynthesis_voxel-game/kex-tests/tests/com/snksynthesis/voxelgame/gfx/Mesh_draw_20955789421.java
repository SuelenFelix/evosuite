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
import java.lang.Integer;

public class Mesh_draw_20955789421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term424;
     Object term432;

    public Mesh_draw_20955789421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term424 = newInstance(Class.forName("com.snksynthesis.voxelgame.gfx.Mesh"));
        float[] term427 = (float[]) newFloatArray(4);
        setIntField(term424, term424.getClass(), "vaoId", -2068769794);
        setIntField(term424, term424.getClass(), "vboId", -117576464);
        setFloatElement(term427, 0, 0.26441735F);
        setFloatElement(term427, 1, 0.13745493F);
        setFloatElement(term427, 2, 0.20144695F);
        setFloatElement(term427, 3, 0.7031006F);
        setField(term424, term424.getClass(), "vertices", term427);
        term432 = new Integer(-1007160944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.snksynthesis.voxelgame.gfx.Mesh");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term432;
        callMethod(klass, "draw", argTypes, term424, args);
    }

};



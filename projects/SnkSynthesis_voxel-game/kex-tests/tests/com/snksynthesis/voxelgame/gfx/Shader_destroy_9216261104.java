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

public class Shader_destroy_9216261104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term552;

    public Shader_destroy_9216261104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term552 = newInstance(Class.forName("com.snksynthesis.voxelgame.gfx.Shader"));
        setIntField(term552, term552.getClass(), "programId", -1016503459);
        setIntField(term552, term552.getClass(), "vertexId", -1968847291);
        setIntField(term552, term552.getClass(), "fragId", 579005622);
        setField(term552, term552.getClass(), "vertexPath", null);
        setField(term552, term552.getClass(), "fragPath", null);
        setBooleanField(term552, term552.getClass(), "linked", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.snksynthesis.voxelgame.gfx.Shader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "destroy", argTypes, term552, args);
    }

};



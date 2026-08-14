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

public class Shader_destroy_9216261105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term557;

    public Shader_destroy_9216261105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term557 = newInstance(Class.forName("com.snksynthesis.voxelgame.gfx.Shader"));
        setIntField(term557, term557.getClass(), "programId", 0);
        setIntField(term557, term557.getClass(), "vertexId", 0);
        setIntField(term557, term557.getClass(), "fragId", 0);
        setField(term557, term557.getClass(), "vertexPath", null);
        setField(term557, term557.getClass(), "fragPath", null);
        setBooleanField(term557, term557.getClass(), "linked", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.snksynthesis.voxelgame.gfx.Shader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "destroy", argTypes, term557, args);
    }

};



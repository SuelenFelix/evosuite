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

public class Shader_readFile_46794467716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term633;

    public Shader_readFile_46794467716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term633 = newInstance(Class.forName("com.snksynthesis.voxelgame.gfx.Shader"));
        setIntField(term633, term633.getClass(), "programId", 0);
        setIntField(term633, term633.getClass(), "vertexId", 0);
        setIntField(term633, term633.getClass(), "fragId", 0);
        setField(term633, term633.getClass(), "vertexPath", null);
        setField(term633, term633.getClass(), "fragPath", null);
        setBooleanField(term633, term633.getClass(), "linked", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.snksynthesis.voxelgame.gfx.Shader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "readFile", argTypes, term633, args);
    }

};



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

public class Shader_createShader_20057110095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1590;
     Object term1595;

    public Shader_createShader_20057110095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1590 = newInstance(Class.forName("com.snksynthesis.voxelgame.gfx.Shader"));
        setIntField(term1590, term1590.getClass(), "programId", 1876565163);
        setIntField(term1590, term1590.getClass(), "vertexId", -817164822);
        setIntField(term1590, term1590.getClass(), "fragId", -1016503459);
        setField(term1590, term1590.getClass(), "vertexPath", null);
        setField(term1590, term1590.getClass(), "fragPath", null);
        setBooleanField(term1590, term1590.getClass(), "linked", false);
        term1595 = new Integer(-1968847291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.snksynthesis.voxelgame.gfx.Shader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1595;
        callMethod(klass, "createShader", argTypes, term1590, args);
    }

};



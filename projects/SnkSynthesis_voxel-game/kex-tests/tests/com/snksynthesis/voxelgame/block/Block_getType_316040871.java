package com.snksynthesis.voxelgame.block;

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
import static com.snksynthesis.voxelgame.block.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Block_getType_316040871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1809;

    public Block_getType_316040871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1819 = Class.forName((String) "com.snksynthesis.voxelgame.block.BlockType");
        Field term1818 = ((Class) term1819).getDeclaredField((String) "SAND");
        ((Field) term1818).setAccessible(true);
        Object enum7 = ((Field) term1818).get((Object) null);
        term1809 = newInstance(Class.forName("com.snksynthesis.voxelgame.block.Block"));
        setField(term1809, term1809.getClass(), "type", enum7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.snksynthesis.voxelgame.block.Block");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term1809, args);
    }

};



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

public class Block_init_10583014390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum6;

    public Block_init_10583014390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1578 = Class.forName((String) "com.snksynthesis.voxelgame.block.BlockType");
        Field term1577 = ((Class) term1578).getDeclaredField((String) "STONE");
        ((Field) term1577).setAccessible(true);
        enum6 = ((Field) term1577).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.snksynthesis.voxelgame.block.Block");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.snksynthesis.voxelgame.block.BlockType");
        Object[] args = new Object[1];
        args[0] = enum6;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



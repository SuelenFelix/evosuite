package com.snksynthesis.voxelgame;

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
import static com.snksynthesis.voxelgame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Float;

public class Noise_getNoiseHeight_13057131844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2795;
     Object term2796;
     Object term2798;

    public Noise_getNoiseHeight_13057131844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2795 = newInstance(Class.forName("com.snksynthesis.voxelgame.Noise"));
        term2796 = new Float(0.0F);
        term2798 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.snksynthesis.voxelgame.Noise");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = float.class;
        argTypes[1] = float.class;
        Object[] args = new Object[2];
        args[0] = term2796;
        args[1] = term2798;
        callMethod(klass, "getNoiseHeight", argTypes, term2795, args);
    }

};



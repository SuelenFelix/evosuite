package com.chip8.emulator;

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
import static com.chip8.emulator.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DecodeDetails_drawingPlane_58669741748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4717106;

    public DecodeDetails_drawingPlane_58669741748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4717106 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4717106, term4717106.getClass(), "opcode", (short) -6923);
        setField(term4717106, term4717106.getClass(), "x", "jLgzxtuvVo");
        setField(term4717106, term4717106.getClass(), "y", "wmmxjOkPnH");
        setField(term4717106, term4717106.getClass(), "nnn", "jgRohUQWxJ");
        setField(term4717106, term4717106.getClass(), "nn", "CJlAiZDIQO");
        setField(term4717106, term4717106.getClass(), "n", "osgWaTBVoE");
        setField(term4717106, term4717106.getClass(), "iBefore", "mvkMYcgAod");
        setField(term4717106, term4717106.getClass(), "i", "esbhDGQDgF");
        setField(term4717106, term4717106.getClass(), "pc", "tKlyiBloWu");
        setBooleanField(term4717106, term4717106.getClass(), "state", false);
        setBooleanField(term4717106, term4717106.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "drawingPlane", argTypes, term4717106, args);
    }

};



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

public class DecodeDetails_getIBefore_210177751556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4718366;

    public DecodeDetails_getIBefore_210177751556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4718366 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4718366, term4718366.getClass(), "opcode", (short) -23925);
        setField(term4718366, term4718366.getClass(), "x", "wNndrIQDbr");
        setField(term4718366, term4718366.getClass(), "y", "JiSIFtJnYv");
        setField(term4718366, term4718366.getClass(), "nnn", "wxAHQRVgKc");
        setField(term4718366, term4718366.getClass(), "nn", "bYsZEHeoeV");
        setField(term4718366, term4718366.getClass(), "n", "IwvwrQylib");
        setField(term4718366, term4718366.getClass(), "iBefore", "ZWJgSttNjg");
        setField(term4718366, term4718366.getClass(), "i", "LQTIjJLkXH");
        setField(term4718366, term4718366.getClass(), "pc", "RvkBwedFKx");
        setBooleanField(term4718366, term4718366.getClass(), "state", true);
        setBooleanField(term4718366, term4718366.getClass(), "resolutionMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIBefore", argTypes, term4718366, args);
    }

};



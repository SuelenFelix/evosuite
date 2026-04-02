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

public class DecodeDetails_detailGetKey_98083630135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4714764;

    public DecodeDetails_detailGetKey_98083630135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4714764 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4714764, term4714764.getClass(), "opcode", (short) 13907);
        setField(term4714764, term4714764.getClass(), "x", "pWCYcLhoms");
        setField(term4714764, term4714764.getClass(), "y", "IWNJVfvTuw");
        setField(term4714764, term4714764.getClass(), "nnn", "DLpKfwPpvr");
        setField(term4714764, term4714764.getClass(), "nn", "DLFXidLbuT");
        setField(term4714764, term4714764.getClass(), "n", "FjkxfTXGIH");
        setField(term4714764, term4714764.getClass(), "iBefore", "KJkWSFFnmR");
        setField(term4714764, term4714764.getClass(), "i", "FBYRIDZvmW");
        setField(term4714764, term4714764.getClass(), "pc", "IyjLfrDZrV");
        setBooleanField(term4714764, term4714764.getClass(), "state", false);
        setBooleanField(term4714764, term4714764.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "detailGetKey", argTypes, term4714764, args);
    }

};



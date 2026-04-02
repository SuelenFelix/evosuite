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

public class DecodeDetails_detailSetSoundToVx_143473201237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4715124;

    public DecodeDetails_detailSetSoundToVx_143473201237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4715124 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4715124, term4715124.getClass(), "opcode", (short) -21915);
        setField(term4715124, term4715124.getClass(), "x", "hFnFlgThhp");
        setField(term4715124, term4715124.getClass(), "y", "aEZAnHuGSR");
        setField(term4715124, term4715124.getClass(), "nnn", "uMzGGnJFYF");
        setField(term4715124, term4715124.getClass(), "nn", "iAIRLRjFkP");
        setField(term4715124, term4715124.getClass(), "n", "cdXvvxXVTz");
        setField(term4715124, term4715124.getClass(), "iBefore", "tXsfWIqIPn");
        setField(term4715124, term4715124.getClass(), "i", "tDmfqEyHaN");
        setField(term4715124, term4715124.getClass(), "pc", "mTSMXFkWRr");
        setBooleanField(term4715124, term4715124.getClass(), "state", false);
        setBooleanField(term4715124, term4715124.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "detailSetSoundToVx", argTypes, term4715124, args);
    }

};



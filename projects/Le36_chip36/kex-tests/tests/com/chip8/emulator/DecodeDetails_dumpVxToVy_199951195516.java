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

public class DecodeDetails_dumpVxToVy_199951195516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4711190;

    public DecodeDetails_dumpVxToVy_199951195516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4711190 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4711190, term4711190.getClass(), "opcode", (short) 32193);
        setField(term4711190, term4711190.getClass(), "x", "IaEqlVwmNS");
        setField(term4711190, term4711190.getClass(), "y", "ljNOgdPWrL");
        setField(term4711190, term4711190.getClass(), "nnn", "oBlIZiyRMS");
        setField(term4711190, term4711190.getClass(), "nn", "QUYAkhtCNh");
        setField(term4711190, term4711190.getClass(), "n", "kOaAQOLyqd");
        setField(term4711190, term4711190.getClass(), "iBefore", "ICBWiKaeHC");
        setField(term4711190, term4711190.getClass(), "i", "WAljagiCzu");
        setField(term4711190, term4711190.getClass(), "pc", "XKMXfDZajw");
        setBooleanField(term4711190, term4711190.getClass(), "state", false);
        setBooleanField(term4711190, term4711190.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "dumpVxToVy", argTypes, term4711190, args);
    }

};



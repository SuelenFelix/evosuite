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

public class DecodeDetails_hires_19849645845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4709200;

    public DecodeDetails_hires_19849645845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4709200 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4709200, term4709200.getClass(), "opcode", (short) 28936);
        setField(term4709200, term4709200.getClass(), "x", "QxiiHtQAzN");
        setField(term4709200, term4709200.getClass(), "y", "gQgTBlRIvX");
        setField(term4709200, term4709200.getClass(), "nnn", "ulKaKnANzj");
        setField(term4709200, term4709200.getClass(), "nn", "ABwhdjjeJi");
        setField(term4709200, term4709200.getClass(), "n", "KKEcpYXNZV");
        setField(term4709200, term4709200.getClass(), "iBefore", "shLHFznysy");
        setField(term4709200, term4709200.getClass(), "i", "YCKIloBHLj");
        setField(term4709200, term4709200.getClass(), "pc", "qUWDhAeFJY");
        setBooleanField(term4709200, term4709200.getClass(), "state", true);
        setBooleanField(term4709200, term4709200.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hires", argTypes, term4709200, args);
    }

};



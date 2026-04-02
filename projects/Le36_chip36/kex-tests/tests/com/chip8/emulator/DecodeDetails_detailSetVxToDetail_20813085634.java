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

public class DecodeDetails_detailSetVxToDetail_20813085634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4714584;

    public DecodeDetails_detailSetVxToDetail_20813085634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4714584 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4714584, term4714584.getClass(), "opcode", (short) 18041);
        setField(term4714584, term4714584.getClass(), "x", "oCBbVNwMnb");
        setField(term4714584, term4714584.getClass(), "y", "miJxAzOVJy");
        setField(term4714584, term4714584.getClass(), "nnn", "kjqlBVaviD");
        setField(term4714584, term4714584.getClass(), "nn", "iVRXRDCrcM");
        setField(term4714584, term4714584.getClass(), "n", "WAZFhrxcSM");
        setField(term4714584, term4714584.getClass(), "iBefore", "gCRUlTuVMX");
        setField(term4714584, term4714584.getClass(), "i", "tYBgGQtkhi");
        setField(term4714584, term4714584.getClass(), "pc", "PhGPFLIMKH");
        setBooleanField(term4714584, term4714584.getClass(), "state", false);
        setBooleanField(term4714584, term4714584.getClass(), "resolutionMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "detailSetVxToDetail", argTypes, term4714584, args);
    }

};



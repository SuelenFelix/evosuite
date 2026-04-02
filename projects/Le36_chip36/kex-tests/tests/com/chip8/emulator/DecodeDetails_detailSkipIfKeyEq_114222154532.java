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

public class DecodeDetails_detailSkipIfKeyEq_114222154532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4714224;

    public DecodeDetails_detailSkipIfKeyEq_114222154532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4714224 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4714224, term4714224.getClass(), "opcode", (short) -24481);
        setField(term4714224, term4714224.getClass(), "x", "fwtOJhjXbW");
        setField(term4714224, term4714224.getClass(), "y", "ltWBKZaXwJ");
        setField(term4714224, term4714224.getClass(), "nnn", "FSQpgxQnsH");
        setField(term4714224, term4714224.getClass(), "nn", "LBPwnVMEpP");
        setField(term4714224, term4714224.getClass(), "n", "cwALzyQVjH");
        setField(term4714224, term4714224.getClass(), "iBefore", "jlYNjpdkoz");
        setField(term4714224, term4714224.getClass(), "i", "DZAGnhJkeU");
        setField(term4714224, term4714224.getClass(), "pc", "xQuVexkiVz");
        setBooleanField(term4714224, term4714224.getClass(), "state", false);
        setBooleanField(term4714224, term4714224.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "detailSkipIfKeyEq", argTypes, term4714224, args);
    }

};



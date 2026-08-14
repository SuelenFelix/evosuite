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

public class DecodeDetails_detailRegisterFill_183505208043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4716206;

    public DecodeDetails_detailRegisterFill_183505208043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4716206 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4716206, term4716206.getClass(), "opcode", (short) 24151);
        setField(term4716206, term4716206.getClass(), "x", "NpjPDfnDRd");
        setField(term4716206, term4716206.getClass(), "y", "SWMYovqYdk");
        setField(term4716206, term4716206.getClass(), "nnn", "TQuvAoQcBe");
        setField(term4716206, term4716206.getClass(), "nn", "nGYLfZrtWO");
        setField(term4716206, term4716206.getClass(), "n", "DBufEhhBCQ");
        setField(term4716206, term4716206.getClass(), "iBefore", "GiNZRBZjgO");
        setField(term4716206, term4716206.getClass(), "i", "ceGAKcClsG");
        setField(term4716206, term4716206.getClass(), "pc", "SEldZGJyvX");
        setBooleanField(term4716206, term4716206.getClass(), "state", true);
        setBooleanField(term4716206, term4716206.getClass(), "resolutionMode", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "detailRegisterFill", argTypes, term4716206, args);
    }

};



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

public class DecodeDetails_fillVxToVy_147859737217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4711370;

    public DecodeDetails_fillVxToVy_147859737217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4711370 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4711370, term4711370.getClass(), "opcode", (short) 31156);
        setField(term4711370, term4711370.getClass(), "x", "avZoBQSrBy");
        setField(term4711370, term4711370.getClass(), "y", "KIXGeHXdwi");
        setField(term4711370, term4711370.getClass(), "nnn", "tTfdvLMwEE");
        setField(term4711370, term4711370.getClass(), "nn", "DiSkERzqOE");
        setField(term4711370, term4711370.getClass(), "n", "hPSZZeYqHQ");
        setField(term4711370, term4711370.getClass(), "iBefore", "scReMUKyGq");
        setField(term4711370, term4711370.getClass(), "i", "FmIpnxjRxA");
        setField(term4711370, term4711370.getClass(), "pc", "FTjxxGvyun");
        setBooleanField(term4711370, term4711370.getClass(), "state", false);
        setBooleanField(term4711370, term4711370.getClass(), "resolutionMode", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "fillVxToVy", argTypes, term4711370, args);
    }

};



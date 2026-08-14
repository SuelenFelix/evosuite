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

public class DecodeDetails_canEqual_62801840773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4721609;
     Object term4721709;

    public DecodeDetails_canEqual_62801840773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4721609 = newInstance(Class.forName("com.chip8.emulator.DecodeDetails"));
        setShortField(term4721609, term4721609.getClass(), "opcode", (short) -26972);
        setField(term4721609, term4721609.getClass(), "x", "VPkEFShMUB");
        setField(term4721609, term4721609.getClass(), "y", "ZIgHysIFcL");
        setField(term4721609, term4721609.getClass(), "nnn", "ofSfQtWBjp");
        setField(term4721609, term4721609.getClass(), "nn", "vkbIpZOlcY");
        setField(term4721609, term4721609.getClass(), "n", "XbAeosZekH");
        setField(term4721609, term4721609.getClass(), "iBefore", "EvGPvjswTz");
        setField(term4721609, term4721609.getClass(), "i", "lbnnCkEZgE");
        setField(term4721609, term4721609.getClass(), "pc", "YaWdTQZkTw");
        setBooleanField(term4721609, term4721609.getClass(), "state", false);
        setBooleanField(term4721609, term4721609.getClass(), "resolutionMode", false);
        term4721709 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.DecodeDetails");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4721709;
        callMethod(klass, "canEqual", argTypes, term4721609, args);
    }

};



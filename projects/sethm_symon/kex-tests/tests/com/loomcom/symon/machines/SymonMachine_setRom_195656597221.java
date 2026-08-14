package com.loomcom.symon.machines;

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
import static com.loomcom.symon.machines.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SymonMachine_setRom_195656597221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21892;

    public SymonMachine_setRom_195656597221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21892 = newInstance(Class.forName("com.loomcom.symon.machines.SymonMachine"));
        setField(term21892, term21892.getClass(), "bus", null);
        setField(term21892, term21892.getClass(), "cpu", null);
        setField(term21892, term21892.getClass(), "acia", null);
        setField(term21892, term21892.getClass(), "pia", null);
        setField(term21892, term21892.getClass(), "crtc", null);
        setField(term21892, term21892.getClass(), "ram", null);
        setField(term21892, term21892.getClass(), "rom", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.machines.SymonMachine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.loomcom.symon.devices.Memory");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRom", argTypes, term21892, args);
    }

};



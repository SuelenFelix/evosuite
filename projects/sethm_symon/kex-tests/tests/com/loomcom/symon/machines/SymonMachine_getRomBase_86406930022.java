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

public class SymonMachine_getRomBase_86406930022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21893;

    public SymonMachine_getRomBase_86406930022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21893 = newInstance(Class.forName("com.loomcom.symon.machines.SymonMachine"));
        setField(term21893, term21893.getClass(), "bus", null);
        setField(term21893, term21893.getClass(), "cpu", null);
        setField(term21893, term21893.getClass(), "acia", null);
        setField(term21893, term21893.getClass(), "pia", null);
        setField(term21893, term21893.getClass(), "crtc", null);
        setField(term21893, term21893.getClass(), "ram", null);
        setField(term21893, term21893.getClass(), "rom", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.machines.SymonMachine");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRomBase", argTypes, term21893, args);
    }

};



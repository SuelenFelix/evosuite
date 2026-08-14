package com.loomcom.symon.jterminal.vt100;

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
import static com.loomcom.symon.jterminal.vt100.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AnsiControlSequence_getCommand_2437081881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1680;

    public AnsiControlSequence_getCommand_2437081881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1680 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.AnsiControlSequence"));
        Object[] term1682 = (Object[]) newArray("java.lang.String", 2);
        setCharField(term1680, term1680.getClass(), "command", 'B');
        setElement(term1682, 0, "LQFpaHEwXR");
        setElement(term1682, 1, "oVcInYnLWB");
        setField(term1680, term1680.getClass(), "parameters", term1682);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.vt100.AnsiControlSequence");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCommand", argTypes, term1680, args);
    }

};



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

public class AnsiControlSequence_getParameters_7282201722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1727;

    public AnsiControlSequence_getParameters_7282201722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1727 = newInstance(Class.forName("com.loomcom.symon.jterminal.vt100.AnsiControlSequence"));
        Object[] term1729 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term1727, term1727.getClass(), "command", 't');
        setElement(term1729, 0, "aJlieCFVtF");
        setElement(term1729, 1, "ZiaGIbnzTs");
        setElement(term1729, 2, "tbcdzjIfER");
        setElement(term1729, 3, "HyxfbSQYBe");
        setElement(term1729, 4, "pCTimMblYc");
        setElement(term1729, 5, "hNxWaHcfhY");
        setField(term1727, term1727.getClass(), "parameters", term1729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.vt100.AnsiControlSequence");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParameters", argTypes, term1727, args);
    }

};



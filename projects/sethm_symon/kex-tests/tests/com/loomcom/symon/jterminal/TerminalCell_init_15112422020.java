package com.loomcom.symon.jterminal;

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
import static com.loomcom.symon.jterminal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Character;

public class TerminalCell_init_15112422020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11226;
     Object term11228;
     Object term11235;

    public TerminalCell_init_15112422020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11226 = new Character('n');
        term11228 = newInstance(Class.forName("java.awt.Color"));
        float[] term11230 = (float[]) newFloatArray(0);
        float[] term11231 = (float[]) newFloatArray(2);
        setIntField(term11228, term11228.getClass(), "value", -426764678);
        setField(term11228, term11228.getClass(), "frgbvalue", term11230);
        setFloatElement(term11231, 0, 0.8598297F);
        setFloatElement(term11231, 1, 0.96323884F);
        setField(term11228, term11228.getClass(), "fvalue", term11231);
        setFloatField(term11228, term11228.getClass(), "falpha", 0.43692183F);
        setField(term11228, term11228.getClass(), "cs", null);
        term11235 = newInstance(Class.forName("java.awt.Color"));
        float[] term11237 = (float[]) newFloatArray(8);
        float[] term11246 = (float[]) newFloatArray(6);
        setIntField(term11235, term11235.getClass(), "value", -1222614956);
        setFloatElement(term11237, 0, 0.80973893F);
        setFloatElement(term11237, 1, 0.7633268F);
        setFloatElement(term11237, 2, 0.541592F);
        setFloatElement(term11237, 3, 0.13481021F);
        setFloatElement(term11237, 4, 0.996533F);
        setFloatElement(term11237, 5, 0.38000882F);
        setFloatElement(term11237, 6, 0.10577053F);
        setFloatElement(term11237, 7, 0.5840714F);
        setField(term11235, term11235.getClass(), "frgbvalue", term11237);
        setFloatElement(term11246, 0, 0.478669F);
        setFloatElement(term11246, 1, 0.75592405F);
        setFloatElement(term11246, 2, 0.068145275F);
        setFloatElement(term11246, 3, 0.10667074F);
        setFloatElement(term11246, 4, 0.9571234F);
        setFloatElement(term11246, 5, 0.114929974F);
        setField(term11235, term11235.getClass(), "fvalue", term11246);
        setFloatField(term11235, term11235.getClass(), "falpha", 0.30926234F);
        setField(term11235, term11235.getClass(), "cs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.TerminalCell");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = char.class;
        argTypes[1] = Class.forName("java.awt.Color");
        argTypes[2] = Class.forName("java.awt.Color");
        Object[] args = new Object[3];
        args[0] = term11226;
        args[1] = term11228;
        args[2] = term11235;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



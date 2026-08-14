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
import java.lang.Object;

public class TerminalCell_getCharacter_21275984051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11270;

    public TerminalCell_getCharacter_21275984051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11270 = newInstance(Class.forName("com.loomcom.symon.jterminal.TerminalCell"));
        Object term11272 = newInstance(Class.forName("java.awt.Color"));
        float[] term11274 = (float[]) newFloatArray(2);
        float[] term11277 = (float[]) newFloatArray(1);
        Object term11280 = newInstance(Class.forName("java.awt.Color"));
        float[] term11282 = (float[]) newFloatArray(9);
        float[] term11292 = (float[]) newFloatArray(3);
        setCharField(term11270, term11270.getClass(), "character", 'Z');
        setIntField(term11272, term11272.getClass(), "value", -1870495012);
        setFloatElement(term11274, 0, 0.37161416F);
        setFloatElement(term11274, 1, 0.022591352F);
        setField(term11272, term11272.getClass(), "frgbvalue", term11274);
        setFloatElement(term11277, 0, 0.6805867F);
        setField(term11272, term11272.getClass(), "fvalue", term11277);
        setFloatField(term11272, term11272.getClass(), "falpha", 0.51208574F);
        setField(term11272, term11272.getClass(), "cs", null);
        setField(term11270, term11270.getClass(), "backgroundColor", term11272);
        setIntField(term11280, term11280.getClass(), "value", -1310015129);
        setFloatElement(term11282, 0, 0.28528106F);
        setFloatElement(term11282, 1, 0.30827713F);
        setFloatElement(term11282, 2, 0.63008493F);
        setFloatElement(term11282, 3, 0.97831506F);
        setFloatElement(term11282, 4, 0.9737084F);
        setFloatElement(term11282, 5, 0.21723765F);
        setFloatElement(term11282, 6, 0.06688923F);
        setFloatElement(term11282, 7, 0.22417867F);
        setFloatElement(term11282, 8, 0.35872674F);
        setField(term11280, term11280.getClass(), "frgbvalue", term11282);
        setFloatElement(term11292, 0, 0.2946385F);
        setFloatElement(term11292, 1, 0.07802445F);
        setFloatElement(term11292, 2, 0.36114347F);
        setField(term11280, term11280.getClass(), "fvalue", term11292);
        setFloatField(term11280, term11280.getClass(), "falpha", 0.52792794F);
        setField(term11280, term11280.getClass(), "cs", null);
        setField(term11270, term11270.getClass(), "foregroundColor", term11280);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.TerminalCell");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharacter", argTypes, term11270, args);
    }

};



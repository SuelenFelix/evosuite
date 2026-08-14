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

public class TerminalCell_getBackgroundColor_19304472862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11312;

    public TerminalCell_getBackgroundColor_19304472862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11312 = newInstance(Class.forName("com.loomcom.symon.jterminal.TerminalCell"));
        Object term11314 = newInstance(Class.forName("java.awt.Color"));
        float[] term11316 = (float[]) newFloatArray(5);
        float[] term11322 = (float[]) newFloatArray(6);
        Object term11330 = newInstance(Class.forName("java.awt.Color"));
        float[] term11332 = (float[]) newFloatArray(5);
        float[] term11338 = (float[]) newFloatArray(3);
        setCharField(term11312, term11312.getClass(), "character", 't');
        setIntField(term11314, term11314.getClass(), "value", -2104981311);
        setFloatElement(term11316, 0, 0.24759698F);
        setFloatElement(term11316, 1, 0.32021916F);
        setFloatElement(term11316, 2, 0.8886614F);
        setFloatElement(term11316, 3, 0.22651339F);
        setFloatElement(term11316, 4, 0.38555247F);
        setField(term11314, term11314.getClass(), "frgbvalue", term11316);
        setFloatElement(term11322, 0, 0.8878841F);
        setFloatElement(term11322, 1, 0.2889229F);
        setFloatElement(term11322, 2, 0.65889484F);
        setFloatElement(term11322, 3, 0.25392914F);
        setFloatElement(term11322, 4, 0.63972145F);
        setFloatElement(term11322, 5, 0.3357792F);
        setField(term11314, term11314.getClass(), "fvalue", term11322);
        setFloatField(term11314, term11314.getClass(), "falpha", 0.25937343F);
        setField(term11314, term11314.getClass(), "cs", null);
        setField(term11312, term11312.getClass(), "backgroundColor", term11314);
        setIntField(term11330, term11330.getClass(), "value", -571169753);
        setFloatElement(term11332, 0, 0.8704517F);
        setFloatElement(term11332, 1, 0.5873228F);
        setFloatElement(term11332, 2, 0.5703112F);
        setFloatElement(term11332, 3, 0.8823181F);
        setFloatElement(term11332, 4, 0.91971004F);
        setField(term11330, term11330.getClass(), "frgbvalue", term11332);
        setFloatElement(term11338, 0, 0.21924508F);
        setFloatElement(term11338, 1, 0.10338366F);
        setFloatElement(term11338, 2, 0.75913525F);
        setField(term11330, term11330.getClass(), "fvalue", term11338);
        setFloatField(term11330, term11330.getClass(), "falpha", 0.7059082F);
        setField(term11330, term11330.getClass(), "cs", null);
        setField(term11312, term11312.getClass(), "foregroundColor", term11330);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.TerminalCell");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBackgroundColor", argTypes, term11312, args);
    }

};



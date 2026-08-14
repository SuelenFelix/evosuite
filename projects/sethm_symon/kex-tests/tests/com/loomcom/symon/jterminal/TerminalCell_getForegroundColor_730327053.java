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

public class TerminalCell_getForegroundColor_730327053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11362;

    public TerminalCell_getForegroundColor_730327053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11362 = newInstance(Class.forName("com.loomcom.symon.jterminal.TerminalCell"));
        Object term11364 = newInstance(Class.forName("java.awt.Color"));
        float[] term11366 = (float[]) newFloatArray(7);
        float[] term11374 = (float[]) newFloatArray(2);
        Object term11378 = newInstance(Class.forName("java.awt.Color"));
        float[] term11380 = (float[]) newFloatArray(6);
        float[] term11387 = (float[]) newFloatArray(6);
        setCharField(term11362, term11362.getClass(), "character", 'T');
        setIntField(term11364, term11364.getClass(), "value", 318591690);
        setFloatElement(term11366, 0, 0.791695F);
        setFloatElement(term11366, 1, 0.07096106F);
        setFloatElement(term11366, 2, 0.6862221F);
        setFloatElement(term11366, 3, 0.5602794F);
        setFloatElement(term11366, 4, 0.15917838F);
        setFloatElement(term11366, 5, 0.37164736F);
        setFloatElement(term11366, 6, 0.93741155F);
        setField(term11364, term11364.getClass(), "frgbvalue", term11366);
        setFloatElement(term11374, 0, 0.71813905F);
        setFloatElement(term11374, 1, 0.8454723F);
        setField(term11364, term11364.getClass(), "fvalue", term11374);
        setFloatField(term11364, term11364.getClass(), "falpha", 0.079128504F);
        setField(term11364, term11364.getClass(), "cs", null);
        setField(term11362, term11362.getClass(), "backgroundColor", term11364);
        setIntField(term11378, term11378.getClass(), "value", -165587447);
        setFloatElement(term11380, 0, 0.85665673F);
        setFloatElement(term11380, 1, 0.6563145F);
        setFloatElement(term11380, 2, 0.92038053F);
        setFloatElement(term11380, 3, 0.35686338F);
        setFloatElement(term11380, 4, 0.5804949F);
        setFloatElement(term11380, 5, 0.26573372F);
        setField(term11378, term11378.getClass(), "frgbvalue", term11380);
        setFloatElement(term11387, 0, 0.20737511F);
        setFloatElement(term11387, 1, 0.1610204F);
        setFloatElement(term11387, 2, 0.791937F);
        setFloatElement(term11387, 3, 0.54285216F);
        setFloatElement(term11387, 4, 0.21098667F);
        setFloatElement(term11387, 5, 0.24346101F);
        setField(term11378, term11378.getClass(), "fvalue", term11387);
        setFloatField(term11378, term11378.getClass(), "falpha", 0.32273352F);
        setField(term11378, term11378.getClass(), "cs", null);
        setField(term11362, term11362.getClass(), "foregroundColor", term11378);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.TerminalCell");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getForegroundColor", argTypes, term11362, args);
    }

};



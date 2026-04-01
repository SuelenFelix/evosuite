package org.openRealmOfStars.gui.panels;

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
import static org.openRealmOfStars.gui.panels.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class BigSpherePanel_drawBoldText_13244511771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11374;
     Object term11384;
     Object term11390;
     Object term11392;

    public BigSpherePanel_drawBoldText_13244511771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11374 = newInstance(Class.forName("java.awt.Color"));
        float[] term11376 = (float[]) newFloatArray(2);
        float[] term11379 = (float[]) newFloatArray(3);
        setIntField(term11374, term11374.getClass(), "value", -1553893255);
        setFloatElement(term11376, 0, 0.7031006F);
        setFloatElement(term11376, 1, 0.9431611F);
        setField(term11374, term11374.getClass(), "frgbvalue", term11376);
        setFloatElement(term11379, 0, 0.95272815F);
        setFloatElement(term11379, 1, 0.7254646F);
        setFloatElement(term11379, 2, 0.9828442F);
        setField(term11374, term11374.getClass(), "fvalue", term11379);
        setFloatField(term11374, term11374.getClass(), "falpha", 0.9472605F);
        setField(term11374, term11374.getClass(), "cs", null);
        term11384 = newInstance(Class.forName("java.awt.Color"));
        float[] term11386 = (float[]) newFloatArray(1);
        float[] term11388 = (float[]) newFloatArray(0);
        setIntField(term11384, term11384.getClass(), "value", 1303442927);
        setFloatElement(term11386, 0, 0.27797186F);
        setField(term11384, term11384.getClass(), "frgbvalue", term11386);
        setField(term11384, term11384.getClass(), "fvalue", term11388);
        setFloatField(term11384, term11384.getClass(), "falpha", 0.7467328F);
        setField(term11384, term11384.getClass(), "cs", null);
        term11390 = new Integer(794568325);
        term11392 = new Integer(-434468428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.awt.Graphics");
        argTypes[1] = Class.forName("java.awt.Color");
        argTypes[2] = Class.forName("java.awt.Color");
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = Class.forName("java.lang.String");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = term11374;
        args[2] = term11384;
        args[3] = term11390;
        args[4] = term11392;
        args[5] = "GzFkzHGYFt";
        callMethod(klass, "drawBoldText", argTypes, null, args);
    }

};



package org.openRealmOfStars.gui.infopanel;

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
import static org.openRealmOfStars.gui.infopanel.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class IntelligencePanel_init_12084240150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60667;
     Object term60681;

    public IntelligencePanel_init_12084240150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60667 = new Integer(-1074402599);
        term60681 = newInstance(Class.forName("java.awt.Color"));
        float[] term60683 = (float[]) newFloatArray(7);
        float[] term60691 = (float[]) newFloatArray(7);
        setIntField(term60681, term60681.getClass(), "value", -1867539151);
        setFloatElement(term60683, 0, 0.0027298927F);
        setFloatElement(term60683, 1, 0.45478272F);
        setFloatElement(term60683, 2, 0.29874015F);
        setFloatElement(term60683, 3, 0.8780084F);
        setFloatElement(term60683, 4, 0.32554477F);
        setFloatElement(term60683, 5, 0.053365767F);
        setFloatElement(term60683, 6, 0.8924855F);
        setField(term60681, term60681.getClass(), "frgbvalue", term60683);
        setFloatElement(term60691, 0, 0.94332385F);
        setFloatElement(term60691, 1, 0.32237554F);
        setFloatElement(term60691, 2, 0.7666174F);
        setFloatElement(term60691, 3, 0.53094494F);
        setFloatElement(term60691, 4, 0.301957F);
        setFloatElement(term60691, 5, 0.14643145F);
        setFloatElement(term60691, 6, 0.7032675F);
        setField(term60681, term60681.getClass(), "fvalue", term60691);
        setFloatField(term60681, term60681.getClass(), "falpha", 0.24259013F);
        setField(term60681, term60681.getClass(), "cs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.IntelligencePanel");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.awt.Color");
        argTypes[5] = Class.forName("java.awt.event.ActionListener");
        Object[] args = new Object[6];
        args[0] = "fSLHLeuNoa";
        args[1] = "IwgPFurObw";
        args[2] = term60667;
        args[3] = "WLaHlrYQyz";
        args[4] = term60681;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};



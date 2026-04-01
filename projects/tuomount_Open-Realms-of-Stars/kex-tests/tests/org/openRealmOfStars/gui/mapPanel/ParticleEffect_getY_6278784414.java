package org.openRealmOfStars.gui.mapPanel;

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
import static org.openRealmOfStars.gui.mapPanel.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ParticleEffect_getY_6278784414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1668;

    public ParticleEffect_getY_6278784414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1707 = Class.forName((String) "org.openRealmOfStars.gui.mapPanel.ParticleEffectType");
        Field term1706 = ((Class) term1707).getDeclaredField((String) "PLASMA_PARTICLE");
        ((Field) term1706).setAccessible(true);
        Object enum4 = ((Field) term1706).get((Object) null);
        term1668 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect"));
        Object term1693 = newInstance(Class.forName("java.awt.Color"));
        float[] term1695 = (float[]) newFloatArray(2);
        float[] term1698 = (float[]) newFloatArray(6);
        setDoubleField(term1668, term1668.getClass(), "x", 0.7031006357544823);
        setDoubleField(term1668, term1668.getClass(), "y", 0.9527281779865117);
        setDoubleField(term1668, term1668.getClass(), "mx", 0.9828442029246764);
        setDoubleField(term1668, term1668.getClass(), "my", 0.2779719046761513);
        setIntField(term1668, term1668.getClass(), "ttl", 1227103734);
        setField(term1668, term1668.getClass(), "type", enum4);
        setIntField(term1693, term1693.getClass(), "value", -1339778481);
        setFloatElement(term1695, 0, 0.13745493F);
        setFloatElement(term1695, 1, 0.20144695F);
        setField(term1693, term1693.getClass(), "frgbvalue", term1695);
        setFloatElement(term1698, 0, 0.7031006F);
        setFloatElement(term1698, 1, 0.9431611F);
        setFloatElement(term1698, 2, 0.95272815F);
        setFloatElement(term1698, 3, 0.7254646F);
        setFloatElement(term1698, 4, 0.9828442F);
        setFloatElement(term1698, 5, 0.9472605F);
        setField(term1693, term1693.getClass(), "fvalue", term1698);
        setFloatField(term1693, term1693.getClass(), "falpha", 0.27797186F);
        setField(term1693, term1693.getClass(), "cs", null);
        setField(term1668, term1668.getClass(), "color", term1693);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getY", argTypes, term1668, args);
    }

};



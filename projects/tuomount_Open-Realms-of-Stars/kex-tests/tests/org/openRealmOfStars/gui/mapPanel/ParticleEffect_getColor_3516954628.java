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

public class ParticleEffect_getColor_3516954628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3094;

    public ParticleEffect_getColor_3516954628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3135 = Class.forName((String) "org.openRealmOfStars.gui.mapPanel.ParticleEffectType");
        Field term3134 = ((Class) term3135).getDeclaredField((String) "PHOTON_TORP_PARTICILE");
        ((Field) term3134).setAccessible(true);
        Object enum8 = ((Field) term3134).get((Object) null);
        term3094 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect"));
        Object term3125 = newInstance(Class.forName("java.awt.Color"));
        float[] term3127 = (float[]) newFloatArray(3);
        float[] term3131 = (float[]) newFloatArray(1);
        setDoubleField(term3094, term3094.getClass(), "x", 0.37161417339133307);
        setDoubleField(term3094, term3094.getClass(), "y", 0.6805867182029153);
        setDoubleField(term3094, term3094.getClass(), "mx", 0.2852810965221698);
        setDoubleField(term3094, term3094.getClass(), "my", 0.6300849762307866);
        setIntField(term3094, term3094.getClass(), "ttl", -1456670397);
        setField(term3094, term3094.getClass(), "type", enum8);
        setIntField(term3125, term3125.getClass(), "value", 1622346318);
        setFloatElement(term3127, 0, 0.28528106F);
        setFloatElement(term3127, 1, 0.30827713F);
        setFloatElement(term3127, 2, 0.63008493F);
        setField(term3125, term3125.getClass(), "frgbvalue", term3127);
        setFloatElement(term3131, 0, 0.97831506F);
        setField(term3125, term3125.getClass(), "fvalue", term3131);
        setFloatField(term3125, term3125.getClass(), "falpha", 0.9737084F);
        setField(term3125, term3125.getClass(), "cs", null);
        setField(term3094, term3094.getClass(), "color", term3125);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColor", argTypes, term3094, args);
    }

};



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
import java.lang.Integer;

public class ParticleEffect_setTtl_20304976526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2372;
     Object term2413;

    public ParticleEffect_setTtl_20304976526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2416 = Class.forName((String) "org.openRealmOfStars.gui.mapPanel.ParticleEffectType");
        Field term2415 = ((Class) term2416).getDeclaredField((String) "PHASOR_PARTICLE");
        ((Field) term2415).setAccessible(true);
        Object enum6 = ((Field) term2415).get((Object) null);
        term2372 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect"));
        Object term2397 = newInstance(Class.forName("java.awt.Color"));
        float[] term2399 = (float[]) newFloatArray(6);
        float[] term2406 = (float[]) newFloatArray(5);
        setDoubleField(term2372, term2372.getClass(), "x", 0.43692187681405226);
        setDoubleField(term2372, term2372.getClass(), "y", 0.7633268466829064);
        setDoubleField(term2372, term2372.getClass(), "mx", 0.13481025392611334);
        setDoubleField(term2372, term2372.getClass(), "my", 0.3800088629986428);
        setIntField(term2372, term2372.getClass(), "ttl", 1134449235);
        setField(term2372, term2372.getClass(), "type", enum6);
        setIntField(term2397, term2397.getClass(), "value", -883034806);
        setFloatElement(term2399, 0, 0.43692183F);
        setFloatElement(term2399, 1, 0.80973893F);
        setFloatElement(term2399, 2, 0.7633268F);
        setFloatElement(term2399, 3, 0.541592F);
        setFloatElement(term2399, 4, 0.13481021F);
        setFloatElement(term2399, 5, 0.996533F);
        setField(term2397, term2397.getClass(), "frgbvalue", term2399);
        setFloatElement(term2406, 0, 0.38000882F);
        setFloatElement(term2406, 1, 0.10577053F);
        setFloatElement(term2406, 2, 0.5840714F);
        setFloatElement(term2406, 3, 0.478669F);
        setFloatElement(term2406, 4, 0.75592405F);
        setField(term2397, term2397.getClass(), "fvalue", term2406);
        setFloatField(term2397, term2397.getClass(), "falpha", 0.068145275F);
        setField(term2397, term2397.getClass(), "cs", null);
        setField(term2372, term2372.getClass(), "color", term2397);
        term2413 = new Integer(1585847225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2413;
        callMethod(klass, "setTtl", argTypes, term2372, args);
    }

};



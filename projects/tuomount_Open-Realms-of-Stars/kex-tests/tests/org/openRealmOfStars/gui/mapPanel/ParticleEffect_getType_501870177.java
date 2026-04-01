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

public class ParticleEffect_getType_501870177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2738;

    public ParticleEffect_getType_501870177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2776 = Class.forName((String) "org.openRealmOfStars.gui.mapPanel.ParticleEffectType");
        Field term2775 = ((Class) term2776).getDeclaredField((String) "PLASMA_PARTICLE");
        ((Field) term2775).setAccessible(true);
        Object enum7 = ((Field) term2775).get((Object) null);
        term2738 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect"));
        Object term2763 = newInstance(Class.forName("java.awt.Color"));
        float[] term2765 = (float[]) newFloatArray(5);
        float[] term2771 = (float[]) newFloatArray(2);
        setDoubleField(term2738, term2738.getClass(), "x", 0.5840714198152577);
        setDoubleField(term2738, term2738.getClass(), "y", 0.7559240768573477);
        setDoubleField(term2738, term2738.getClass(), "mx", 0.10667076642995188);
        setDoubleField(term2738, term2738.getClass(), "my", 0.11493000848982304);
        setIntField(term2738, term2738.getClass(), "ttl", 597278769);
        setField(term2738, term2738.getClass(), "type", enum7);
        setIntField(term2763, term2763.getClass(), "value", -1685132342);
        setFloatElement(term2765, 0, 0.10667074F);
        setFloatElement(term2765, 1, 0.9571234F);
        setFloatElement(term2765, 2, 0.114929974F);
        setFloatElement(term2765, 3, 0.30926234F);
        setFloatElement(term2765, 4, 0.37161416F);
        setField(term2763, term2763.getClass(), "frgbvalue", term2765);
        setFloatElement(term2771, 0, 0.022591352F);
        setFloatElement(term2771, 1, 0.6805867F);
        setField(term2763, term2763.getClass(), "fvalue", term2771);
        setFloatField(term2763, term2763.getClass(), "falpha", 0.51208574F);
        setField(term2763, term2763.getClass(), "cs", null);
        setField(term2738, term2738.getClass(), "color", term2763);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term2738, args);
    }

};



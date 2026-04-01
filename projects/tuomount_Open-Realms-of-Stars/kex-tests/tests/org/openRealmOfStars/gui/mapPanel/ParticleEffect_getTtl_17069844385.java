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

public class ParticleEffect_getTtl_17069844385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2026;

    public ParticleEffect_getTtl_17069844385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2062 = Class.forName((String) "org.openRealmOfStars.gui.mapPanel.ParticleEffectType");
        Field term2061 = ((Class) term2062).getDeclaredField((String) "ION_PARTICLE");
        ((Field) term2061).setAccessible(true);
        Object enum5 = ((Field) term2061).get((Object) null);
        term2026 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect"));
        Object term2048 = newInstance(Class.forName("java.awt.Color"));
        float[] term2050 = (float[]) newFloatArray(7);
        float[] term2058 = (float[]) newFloatArray(1);
        setDoubleField(term2026, term2026.getClass(), "x", 0.6436713023569729);
        setDoubleField(term2026, term2026.getClass(), "y", 0.7332741045694002);
        setDoubleField(term2026, term2026.getClass(), "mx", 0.4569171842750229);
        setDoubleField(term2026, term2026.getClass(), "my", 0.8598297828918529);
        setIntField(term2026, term2026.getClass(), "ttl", 1725571209);
        setField(term2026, term2026.getClass(), "type", enum5);
        setIntField(term2048, term2048.getClass(), "value", -522618178);
        setFloatElement(term2050, 0, 0.7467328F);
        setFloatElement(term2050, 1, 0.6436713F);
        setFloatElement(term2050, 2, 0.89057696F);
        setFloatElement(term2050, 3, 0.7332741F);
        setFloatElement(term2050, 4, 0.15826964F);
        setFloatElement(term2050, 5, 0.45691717F);
        setFloatElement(term2050, 6, 0.17877543F);
        setField(term2048, term2048.getClass(), "frgbvalue", term2050);
        setFloatElement(term2058, 0, 0.8598297F);
        setField(term2048, term2048.getClass(), "fvalue", term2058);
        setFloatField(term2048, term2048.getClass(), "falpha", 0.96323884F);
        setField(term2048, term2048.getClass(), "cs", null);
        setField(term2026, term2026.getClass(), "color", term2048);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTtl", argTypes, term2026, args);
    }

};



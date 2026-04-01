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

public class ParticleEffect_getX_6278794023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1312;

    public ParticleEffect_getX_6278794023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1350 = Class.forName((String) "org.openRealmOfStars.gui.mapPanel.ParticleEffectType");
        Field term1349 = ((Class) term1350).getDeclaredField((String) "PHASOR_PARTICLE");
        ((Field) term1349).setAccessible(true);
        Object enum3 = ((Field) term1349).get((Object) null);
        term1312 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect"));
        Object term1337 = newInstance(Class.forName("java.awt.Color"));
        float[] term1339 = (float[]) newFloatArray(1);
        float[] term1341 = (float[]) newFloatArray(6);
        setDoubleField(term1312, term1312.getClass(), "x", 0.8474802076607362);
        setDoubleField(term1312, term1312.getClass(), "y", 0.5183269973490326);
        setDoubleField(term1312, term1312.getClass(), "mx", 0.7655020693602768);
        setDoubleField(term1312, term1312.getClass(), "my", 0.1374549299694151);
        setIntField(term1312, term1312.getClass(), "ttl", -1955890973);
        setField(term1312, term1312.getClass(), "type", enum3);
        setIntField(term1337, term1337.getClass(), "value", -2038273078);
        setFloatElement(term1339, 0, 0.37773192F);
        setField(term1337, term1337.getClass(), "frgbvalue", term1339);
        setFloatElement(term1341, 0, 0.24413109F);
        setFloatElement(term1341, 1, 0.8474802F);
        setFloatElement(term1341, 2, 0.9985961F);
        setFloatElement(term1341, 3, 0.51832694F);
        setFloatElement(term1341, 4, 0.97262454F);
        setFloatElement(term1341, 5, 0.76550204F);
        setField(term1337, term1337.getClass(), "fvalue", term1341);
        setFloatField(term1337, term1337.getClass(), "falpha", 0.26441735F);
        setField(term1337, term1337.getClass(), "cs", null);
        setField(term1312, term1312.getClass(), "color", term1337);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getX", argTypes, term1312, args);
    }

};



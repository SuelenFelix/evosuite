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

public class ParticleEffect_handleParticle_21037185062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term964;

    public ParticleEffect_handleParticle_21037185062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1000 = Class.forName((String) "org.openRealmOfStars.gui.mapPanel.ParticleEffectType");
        Field term999 = ((Class) term1000).getDeclaredField((String) "RAILGUN_TRAIL");
        ((Field) term999).setAccessible(true);
        Object enum2 = ((Field) term999).get((Object) null);
        term964 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect"));
        Object term987 = newInstance(Class.forName("java.awt.Color"));
        float[] term989 = (float[]) newFloatArray(3);
        float[] term993 = (float[]) newFloatArray(4);
        setDoubleField(term964, term964.getClass(), "x", 0.2641345529914265);
        setDoubleField(term964, term964.getClass(), "y", 0.36923381893433327);
        setDoubleField(term964, term964.getClass(), "mx", 0.6076495596892013);
        setDoubleField(term964, term964.getClass(), "my", 0.37773193782763337);
        setIntField(term964, term964.getClass(), "ttl", -1922583790);
        setField(term964, term964.getClass(), "type", enum2);
        setIntField(term987, term987.getClass(), "value", -616727354);
        setFloatElement(term989, 0, 0.40176582F);
        setFloatElement(term989, 1, 0.8783184F);
        setFloatElement(term989, 2, 0.26413453F);
        setField(term987, term987.getClass(), "frgbvalue", term989);
        setFloatElement(term993, 0, 0.7944024F);
        setFloatElement(term993, 1, 0.3692338F);
        setFloatElement(term993, 2, 0.13906479F);
        setFloatElement(term993, 3, 0.6076495F);
        setField(term987, term987.getClass(), "fvalue", term993);
        setFloatField(term987, term987.getClass(), "falpha", 0.6608425F);
        setField(term987, term987.getClass(), "cs", null);
        setField(term964, term964.getClass(), "color", term987);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "handleParticle", argTypes, term964, args);
    }

};



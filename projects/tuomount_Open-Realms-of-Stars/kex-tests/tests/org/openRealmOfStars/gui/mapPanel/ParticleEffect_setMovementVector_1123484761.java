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
import java.lang.Double;

public class ParticleEffect_setMovementVector_1123484761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term568;
     Object term615;
     Object term617;

    public ParticleEffect_setMovementVector_1123484761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term620 = Class.forName((String) "org.openRealmOfStars.gui.mapPanel.ParticleEffectType");
        Field term619 = ((Class) term620).getDeclaredField((String) "ION_PARTICLE_LOW_ACTIVE");
        ((Field) term619).setAccessible(true);
        Object enum1 = ((Field) term619).get((Object) null);
        term568 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect"));
        Object term601 = newInstance(Class.forName("java.awt.Color"));
        float[] term603 = (float[]) newFloatArray(5);
        float[] term609 = (float[]) newFloatArray(4);
        setDoubleField(term568, term568.getClass(), "x", 0.13238746331190498);
        setDoubleField(term568, term568.getClass(), "y", 0.3455959125047594);
        setDoubleField(term568, term568.getClass(), "mx", 0.5523635872663106);
        setDoubleField(term568, term568.getClass(), "my", 0.544608645520025);
        setIntField(term568, term568.getClass(), "ttl", 1484323161);
        setField(term568, term568.getClass(), "type", enum1);
        setIntField(term601, term601.getClass(), "value", 391863371);
        setFloatElement(term603, 0, 0.13238746F);
        setFloatElement(term603, 1, 0.2707036F);
        setFloatElement(term603, 2, 0.3455959F);
        setFloatElement(term603, 3, 0.09123778F);
        setFloatElement(term603, 4, 0.5523636F);
        setField(term601, term601.getClass(), "frgbvalue", term603);
        setFloatElement(term609, 0, 0.8564069F);
        setFloatElement(term609, 1, 0.5446086F);
        setFloatElement(term609, 2, 0.5254275F);
        setFloatElement(term609, 3, 0.2857073F);
        setField(term601, term601.getClass(), "fvalue", term609);
        setFloatField(term601, term601.getClass(), "falpha", 0.6880585F);
        setField(term601, term601.getClass(), "cs", null);
        setField(term568, term568.getClass(), "color", term601);
        term615 = new Double(0.28570734989730284);
        term617 = new Double(0.40176586625454525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term615;
        args[1] = term617;
        callMethod(klass, "setMovementVector", argTypes, term568, args);
    }

};



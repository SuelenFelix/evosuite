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
import java.lang.Double;

public class ParticleEffect_setMovementVector_11234847610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3472;
     Object term3478;
     Object term3480;

    public ParticleEffect_setMovementVector_11234847610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3472 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect"));
        setDoubleField(term3472, term3472.getClass(), "x", 0.0);
        setDoubleField(term3472, term3472.getClass(), "y", 0.0);
        setDoubleField(term3472, term3472.getClass(), "mx", 0.0);
        setDoubleField(term3472, term3472.getClass(), "my", 0.0);
        setIntField(term3472, term3472.getClass(), "ttl", 0);
        setField(term3472, term3472.getClass(), "type", null);
        setField(term3472, term3472.getClass(), "color", null);
        term3478 = new Double(0.0);
        term3480 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term3478;
        args[1] = term3480;
        callMethod(klass, "setMovementVector", argTypes, term3472, args);
    }

};



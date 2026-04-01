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
import java.lang.Integer;

public class ParticleEffect_setTtl_203049765215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3506;
     Object term3512;

    public ParticleEffect_setTtl_203049765215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3506 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect"));
        setDoubleField(term3506, term3506.getClass(), "x", 0.0);
        setDoubleField(term3506, term3506.getClass(), "y", 0.0);
        setDoubleField(term3506, term3506.getClass(), "mx", 0.0);
        setDoubleField(term3506, term3506.getClass(), "my", 0.0);
        setIntField(term3506, term3506.getClass(), "ttl", 0);
        setField(term3506, term3506.getClass(), "type", null);
        setField(term3506, term3506.getClass(), "color", null);
        term3512 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3512;
        callMethod(klass, "setTtl", argTypes, term3506, args);
    }

};



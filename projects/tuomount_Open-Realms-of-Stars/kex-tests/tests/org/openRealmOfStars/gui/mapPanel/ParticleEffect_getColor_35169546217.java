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

public class ParticleEffect_getColor_35169546217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3520;

    public ParticleEffect_getColor_35169546217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3520 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect"));
        setDoubleField(term3520, term3520.getClass(), "x", 0.0);
        setDoubleField(term3520, term3520.getClass(), "y", 0.0);
        setDoubleField(term3520, term3520.getClass(), "mx", 0.0);
        setDoubleField(term3520, term3520.getClass(), "my", 0.0);
        setIntField(term3520, term3520.getClass(), "ttl", 0);
        setField(term3520, term3520.getClass(), "type", null);
        setField(term3520, term3520.getClass(), "color", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColor", argTypes, term3520, args);
    }

};



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

public class ParticleEffect_handleParticle_210371850611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3482;

    public ParticleEffect_handleParticle_210371850611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3482 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect"));
        setDoubleField(term3482, term3482.getClass(), "x", 0.0);
        setDoubleField(term3482, term3482.getClass(), "y", 0.0);
        setDoubleField(term3482, term3482.getClass(), "mx", 0.0);
        setDoubleField(term3482, term3482.getClass(), "my", 0.0);
        setIntField(term3482, term3482.getClass(), "ttl", 0);
        setField(term3482, term3482.getClass(), "type", null);
        setField(term3482, term3482.getClass(), "color", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "handleParticle", argTypes, term3482, args);
    }

};



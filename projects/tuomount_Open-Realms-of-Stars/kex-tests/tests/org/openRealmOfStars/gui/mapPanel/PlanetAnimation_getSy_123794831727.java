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

public class PlanetAnimation_getSy_123794831727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24907;

    public PlanetAnimation_getSy_123794831727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24907 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.PlanetAnimation"));
        setDoubleField(term24907, term24907.getClass(), "sx", 0.0);
        setDoubleField(term24907, term24907.getClass(), "sy", 0.0);
        setDoubleField(term24907, term24907.getClass(), "ex", 0.0);
        setDoubleField(term24907, term24907.getClass(), "ey", 0.0);
        setDoubleField(term24907, term24907.getClass(), "mx", 0.0);
        setDoubleField(term24907, term24907.getClass(), "my", 0.0);
        setIntField(term24907, term24907.getClass(), "count", 0);
        setIntField(term24907, term24907.getClass(), "animFrame", 0);
        setBooleanField(term24907, term24907.getClass(), "showAnim", false);
        setField(term24907, term24907.getClass(), "particles", null);
        setIntField(term24907, term24907.getClass(), "distance", 0);
        setField(term24907, term24907.getClass(), "explosionAnim", null);
        setIntField(term24907, term24907.getClass(), "animationType", 0);
        setIntField(term24907, term24907.getClass(), "shipIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.PlanetAnimation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSy", argTypes, term24907, args);
    }

};



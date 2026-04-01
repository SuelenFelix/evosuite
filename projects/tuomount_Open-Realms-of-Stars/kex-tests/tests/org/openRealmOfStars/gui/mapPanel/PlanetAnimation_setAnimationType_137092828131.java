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

public class PlanetAnimation_setAnimationType_137092828131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24959;
     Object term24972;

    public PlanetAnimation_setAnimationType_137092828131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24959 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.PlanetAnimation"));
        setDoubleField(term24959, term24959.getClass(), "sx", 0.0);
        setDoubleField(term24959, term24959.getClass(), "sy", 0.0);
        setDoubleField(term24959, term24959.getClass(), "ex", 0.0);
        setDoubleField(term24959, term24959.getClass(), "ey", 0.0);
        setDoubleField(term24959, term24959.getClass(), "mx", 0.0);
        setDoubleField(term24959, term24959.getClass(), "my", 0.0);
        setIntField(term24959, term24959.getClass(), "count", 0);
        setIntField(term24959, term24959.getClass(), "animFrame", 0);
        setBooleanField(term24959, term24959.getClass(), "showAnim", false);
        setField(term24959, term24959.getClass(), "particles", null);
        setIntField(term24959, term24959.getClass(), "distance", 0);
        setField(term24959, term24959.getClass(), "explosionAnim", null);
        setIntField(term24959, term24959.getClass(), "animationType", 0);
        setIntField(term24959, term24959.getClass(), "shipIndex", 0);
        term24972 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.PlanetAnimation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term24972;
        callMethod(klass, "setAnimationType", argTypes, term24959, args);
    }

};



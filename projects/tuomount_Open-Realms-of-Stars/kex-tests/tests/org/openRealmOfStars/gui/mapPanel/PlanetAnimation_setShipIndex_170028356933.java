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

public class PlanetAnimation_setShipIndex_170028356933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24987;
     Object term25000;

    public PlanetAnimation_setShipIndex_170028356933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24987 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.PlanetAnimation"));
        setDoubleField(term24987, term24987.getClass(), "sx", 0.0);
        setDoubleField(term24987, term24987.getClass(), "sy", 0.0);
        setDoubleField(term24987, term24987.getClass(), "ex", 0.0);
        setDoubleField(term24987, term24987.getClass(), "ey", 0.0);
        setDoubleField(term24987, term24987.getClass(), "mx", 0.0);
        setDoubleField(term24987, term24987.getClass(), "my", 0.0);
        setIntField(term24987, term24987.getClass(), "count", 0);
        setIntField(term24987, term24987.getClass(), "animFrame", 0);
        setBooleanField(term24987, term24987.getClass(), "showAnim", false);
        setField(term24987, term24987.getClass(), "particles", null);
        setIntField(term24987, term24987.getClass(), "distance", 0);
        setField(term24987, term24987.getClass(), "explosionAnim", null);
        setIntField(term24987, term24987.getClass(), "animationType", 0);
        setIntField(term24987, term24987.getClass(), "shipIndex", 0);
        term25000 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.PlanetAnimation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term25000;
        callMethod(klass, "setShipIndex", argTypes, term24987, args);
    }

};



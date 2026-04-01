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

public class PlanetAnimation_setCoords_34873551518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24782;
     Object term24795;
     Object term24797;
     Object term24799;
     Object term24801;

    public PlanetAnimation_setCoords_34873551518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24782 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.PlanetAnimation"));
        setDoubleField(term24782, term24782.getClass(), "sx", 0.0);
        setDoubleField(term24782, term24782.getClass(), "sy", 0.0);
        setDoubleField(term24782, term24782.getClass(), "ex", 0.0);
        setDoubleField(term24782, term24782.getClass(), "ey", 0.0);
        setDoubleField(term24782, term24782.getClass(), "mx", 0.0);
        setDoubleField(term24782, term24782.getClass(), "my", 0.0);
        setIntField(term24782, term24782.getClass(), "count", 0);
        setIntField(term24782, term24782.getClass(), "animFrame", 0);
        setBooleanField(term24782, term24782.getClass(), "showAnim", false);
        setField(term24782, term24782.getClass(), "particles", null);
        setIntField(term24782, term24782.getClass(), "distance", 0);
        setField(term24782, term24782.getClass(), "explosionAnim", null);
        setIntField(term24782, term24782.getClass(), "animationType", 0);
        setIntField(term24782, term24782.getClass(), "shipIndex", 0);
        term24795 = new Integer(0);
        term24797 = new Integer(0);
        term24799 = new Integer(0);
        term24801 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.PlanetAnimation");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term24795;
        args[1] = term24797;
        args[2] = term24799;
        args[3] = term24801;
        callMethod(klass, "setCoords", argTypes, term24782, args);
    }

};



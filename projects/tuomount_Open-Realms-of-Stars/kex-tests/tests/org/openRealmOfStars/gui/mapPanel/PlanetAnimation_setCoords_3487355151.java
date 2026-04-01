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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class PlanetAnimation_setCoords_3487355151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3536;
     Object term3567;
     Object term3569;
     Object term3571;
     Object term3573;

    public PlanetAnimation_setCoords_3487355151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3546 = new ArrayList();
        Object term3554 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term3554, term3554.getClass(), "imageType", 865208305);
        setField(term3554, term3554.getClass(), "colorModel", null);
        setField(term3554, term3554.getClass(), "raster", null);
        setField(term3554, term3554.getClass(), "osis", null);
        setField(term3554, term3554.getClass(), "properties", null);
        setFloatField(term3554, term3554.getClass(), "accelerationPriority", 0.21723765F);
        setField(term3554, term3554.getClass(), "surfaceManager", null);
        Object term3557 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term3557, term3557.getClass(), "imageType", -817164822);
        setField(term3557, term3557.getClass(), "colorModel", null);
        setField(term3557, term3557.getClass(), "raster", null);
        setField(term3557, term3557.getClass(), "osis", null);
        setField(term3557, term3557.getClass(), "properties", null);
        setFloatField(term3557, term3557.getClass(), "accelerationPriority", 0.0F);
        setField(term3557, term3557.getClass(), "surfaceManager", null);
        ArrayList term3552 = new ArrayList();
        ((ArrayList) term3552).add(term3554);
        ((ArrayList) term3552).add(term3557);
        term3536 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.PlanetAnimation"));
        Object term3551 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.AnimatedImage"));
        setDoubleField(term3536, term3536.getClass(), "sx", 0.9737083944266686);
        setDoubleField(term3536, term3536.getClass(), "sy", 0.0668892744806211);
        setDoubleField(term3536, term3536.getClass(), "ex", 0.3587267442738795);
        setDoubleField(term3536, term3536.getClass(), "ey", 0.07802449704920456);
        setDoubleField(term3536, term3536.getClass(), "mx", 0.5279279537140873);
        setDoubleField(term3536, term3536.getClass(), "my", 0.3202192021706908);
        setIntField(term3536, term3536.getClass(), "count", -1007160944);
        setIntField(term3536, term3536.getClass(), "animFrame", 1135664017);
        setBooleanField(term3536, term3536.getClass(), "showAnim", false);
        setField(term3536, term3536.getClass(), "particles", term3546);
        setIntField(term3536, term3536.getClass(), "distance", 590364439);
        setField(term3551, term3551.getClass(), "animations", term3552);
        setIntField(term3551, term3551.getClass(), "frame", -1968847291);
        setIntField(term3551, term3551.getClass(), "sizeX", 579005622);
        setIntField(term3551, term3551.getClass(), "sizeY", -14890619);
        setField(term3536, term3536.getClass(), "explosionAnim", term3551);
        setIntField(term3536, term3536.getClass(), "animationType", 454281060);
        setIntField(term3536, term3536.getClass(), "shipIndex", -1786399638);
        term3567 = new Integer(2055867847);
        term3569 = new Integer(-1048298087);
        term3571 = new Integer(292681826);
        term3573 = new Integer(458147407);
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
        args[0] = term3567;
        args[1] = term3569;
        args[2] = term3571;
        args[3] = term3573;
        callMethod(klass, "setCoords", argTypes, term3536, args);
    }

};



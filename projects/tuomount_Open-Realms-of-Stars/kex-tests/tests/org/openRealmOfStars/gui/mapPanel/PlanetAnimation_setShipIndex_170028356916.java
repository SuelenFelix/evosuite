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

public class PlanetAnimation_setShipIndex_170028356916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24733;
     Object term24770;

    public PlanetAnimation_setShipIndex_170028356916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term24743 = new ArrayList();
        Object term24751 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term24751, term24751.getClass(), "imageType", 1988605357);
        setField(term24751, term24751.getClass(), "colorModel", null);
        setField(term24751, term24751.getClass(), "raster", null);
        setField(term24751, term24751.getClass(), "osis", null);
        setField(term24751, term24751.getClass(), "properties", null);
        setFloatField(term24751, term24751.getClass(), "accelerationPriority", 0.56460565F);
        setField(term24751, term24751.getClass(), "surfaceManager", null);
        Object term24754 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term24754, term24754.getClass(), "imageType", 765766290);
        setField(term24754, term24754.getClass(), "colorModel", null);
        setField(term24754, term24754.getClass(), "raster", null);
        setField(term24754, term24754.getClass(), "osis", null);
        setField(term24754, term24754.getClass(), "properties", null);
        setFloatField(term24754, term24754.getClass(), "accelerationPriority", 0.0F);
        setField(term24754, term24754.getClass(), "surfaceManager", null);
        Object term24757 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term24757, term24757.getClass(), "imageType", 0);
        setField(term24757, term24757.getClass(), "colorModel", null);
        setField(term24757, term24757.getClass(), "raster", null);
        setField(term24757, term24757.getClass(), "osis", null);
        setField(term24757, term24757.getClass(), "properties", null);
        setFloatField(term24757, term24757.getClass(), "accelerationPriority", 0.0F);
        setField(term24757, term24757.getClass(), "surfaceManager", null);
        Object term24760 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term24760, term24760.getClass(), "imageType", 0);
        setField(term24760, term24760.getClass(), "colorModel", null);
        setField(term24760, term24760.getClass(), "raster", null);
        setField(term24760, term24760.getClass(), "osis", null);
        setField(term24760, term24760.getClass(), "properties", null);
        setFloatField(term24760, term24760.getClass(), "accelerationPriority", 0.0F);
        setField(term24760, term24760.getClass(), "surfaceManager", null);
        ArrayList term24749 = new ArrayList();
        ((ArrayList) term24749).add(term24751);
        ((ArrayList) term24749).add(term24754);
        ((ArrayList) term24749).add(term24757);
        ((ArrayList) term24749).add(term24760);
        term24733 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.PlanetAnimation"));
        Object term24748 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.AnimatedImage"));
        setDoubleField(term24733, term24733.getClass(), "sx", 0.3154346482211354);
        setDoubleField(term24733, term24733.getClass(), "sy", 0.020103660328398276);
        setDoubleField(term24733, term24733.getClass(), "ex", 0.6530844366661772);
        setDoubleField(term24733, term24733.getClass(), "ey", 0.7368078667856154);
        setDoubleField(term24733, term24733.getClass(), "mx", 0.6799679189320558);
        setDoubleField(term24733, term24733.getClass(), "my", 0.8342190257129791);
        setIntField(term24733, term24733.getClass(), "count", 1137624258);
        setIntField(term24733, term24733.getClass(), "animFrame", 977862393);
        setBooleanField(term24733, term24733.getClass(), "showAnim", false);
        setField(term24733, term24733.getClass(), "particles", term24743);
        setIntField(term24733, term24733.getClass(), "distance", 301401782);
        setField(term24748, term24748.getClass(), "animations", term24749);
        setIntField(term24748, term24748.getClass(), "frame", -1941343035);
        setIntField(term24748, term24748.getClass(), "sizeX", 947897214);
        setIntField(term24748, term24748.getClass(), "sizeY", 1496340209);
        setField(term24733, term24733.getClass(), "explosionAnim", term24748);
        setIntField(term24733, term24733.getClass(), "animationType", 43258317);
        setIntField(term24733, term24733.getClass(), "shipIndex", 1707220033);
        term24770 = new Integer(-1792504217);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.PlanetAnimation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term24770;
        callMethod(klass, "setShipIndex", argTypes, term24733, args);
    }

};



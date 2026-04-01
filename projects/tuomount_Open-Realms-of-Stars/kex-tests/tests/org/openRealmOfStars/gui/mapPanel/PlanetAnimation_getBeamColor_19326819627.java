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
import java.lang.String;

public class PlanetAnimation_getBeamColor_19326819627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12434;

    public PlanetAnimation_getBeamColor_19326819627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12480 = Class.forName((String) "org.openRealmOfStars.gui.mapPanel.ParticleEffectType");
        Field term12479 = ((Class) term12480).getDeclaredField((String) "BULLET_PARTICLE");
        ((Field) term12479).setAccessible(true);
        Object enum35 = ((Field) term12479).get((Object) null);
        Object term12446 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect"));
        Object term12454 = newInstance(Class.forName("java.awt.Color"));
        setDoubleField(term12446, term12446.getClass(), "x", 0.6420798930164424);
        setDoubleField(term12446, term12446.getClass(), "y", 0.0011409626665044303);
        setDoubleField(term12446, term12446.getClass(), "mx", 0.5195852993308188);
        setDoubleField(term12446, term12446.getClass(), "my", 0.6533293939565151);
        setIntField(term12446, term12446.getClass(), "ttl", 991356662);
        setField(term12446, term12446.getClass(), "type", enum35);
        setIntField(term12454, term12454.getClass(), "value", -506958186);
        setField(term12454, term12454.getClass(), "frgbvalue", null);
        setField(term12454, term12454.getClass(), "fvalue", null);
        setFloatField(term12454, term12454.getClass(), "falpha", 0.20687163F);
        setField(term12454, term12454.getClass(), "cs", null);
        setField(term12446, term12446.getClass(), "color", term12454);
        ArrayList term12444 = new ArrayList();
        ((ArrayList) term12444).add(term12446);
        Object term12463 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term12463, term12463.getClass(), "imageType", -1970452551);
        setField(term12463, term12463.getClass(), "colorModel", null);
        setField(term12463, term12463.getClass(), "raster", null);
        setField(term12463, term12463.getClass(), "osis", null);
        setField(term12463, term12463.getClass(), "properties", null);
        setFloatField(term12463, term12463.getClass(), "accelerationPriority", 0.04662496F);
        setField(term12463, term12463.getClass(), "surfaceManager", null);
        Object term12466 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term12466, term12466.getClass(), "imageType", 389427431);
        setField(term12466, term12466.getClass(), "colorModel", null);
        setField(term12466, term12466.getClass(), "raster", null);
        setField(term12466, term12466.getClass(), "osis", null);
        setField(term12466, term12466.getClass(), "properties", null);
        setFloatField(term12466, term12466.getClass(), "accelerationPriority", 0.0F);
        setField(term12466, term12466.getClass(), "surfaceManager", null);
        Object term12469 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term12469, term12469.getClass(), "imageType", 0);
        setField(term12469, term12469.getClass(), "colorModel", null);
        setField(term12469, term12469.getClass(), "raster", null);
        setField(term12469, term12469.getClass(), "osis", null);
        setField(term12469, term12469.getClass(), "properties", null);
        setFloatField(term12469, term12469.getClass(), "accelerationPriority", 0.0F);
        setField(term12469, term12469.getClass(), "surfaceManager", null);
        ArrayList term12461 = new ArrayList();
        ((ArrayList) term12461).add(term12463);
        ((ArrayList) term12461).add(term12466);
        ((ArrayList) term12461).add(term12469);
        term12434 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.PlanetAnimation"));
        Object term12460 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.AnimatedImage"));
        setDoubleField(term12434, term12434.getClass(), "sx", 0.5652495059647745);
        setDoubleField(term12434, term12434.getClass(), "sy", 0.021410850431387685);
        setDoubleField(term12434, term12434.getClass(), "ex", 0.8397628091272534);
        setDoubleField(term12434, term12434.getClass(), "ey", 0.01784667720947175);
        setDoubleField(term12434, term12434.getClass(), "mx", 0.4395312828193261);
        setDoubleField(term12434, term12434.getClass(), "my", 0.5715204226647931);
        setIntField(term12434, term12434.getClass(), "count", -1504890659);
        setIntField(term12434, term12434.getClass(), "animFrame", 1358829571);
        setBooleanField(term12434, term12434.getClass(), "showAnim", true);
        setField(term12434, term12434.getClass(), "particles", term12444);
        setIntField(term12434, term12434.getClass(), "distance", -507387516);
        setField(term12460, term12460.getClass(), "animations", term12461);
        setIntField(term12460, term12460.getClass(), "frame", -1945706126);
        setIntField(term12460, term12460.getClass(), "sizeX", 1152356969);
        setIntField(term12460, term12460.getClass(), "sizeY", -1667990367);
        setField(term12434, term12434.getClass(), "explosionAnim", term12460);
        setIntField(term12434, term12434.getClass(), "animationType", 1102721075);
        setIntField(term12434, term12434.getClass(), "shipIndex", -426764678);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.PlanetAnimation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBeamColor", argTypes, term12434, args);
    }

};



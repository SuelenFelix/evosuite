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

public class PlanetAnimation_getSy_123794831710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15847;

    public PlanetAnimation_getSy_123794831710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15910 = Class.forName((String) "org.openRealmOfStars.gui.mapPanel.ParticleEffectType");
        Field term15909 = ((Class) term15910).getDeclaredField((String) "PLASMA_PARTICLE");
        ((Field) term15909).setAccessible(true);
        Object enum45 = ((Field) term15909).get((Object) null);
        Object term15859 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect"));
        Object term15867 = newInstance(Class.forName("java.awt.Color"));
        setDoubleField(term15859, term15859.getClass(), "x", 0.5820770579753712);
        setDoubleField(term15859, term15859.getClass(), "y", 0.8935041663395363);
        setDoubleField(term15859, term15859.getClass(), "mx", 0.2542403704113868);
        setDoubleField(term15859, term15859.getClass(), "my", 0.4614378239284842);
        setIntField(term15859, term15859.getClass(), "ttl", -1183353915);
        setField(term15859, term15859.getClass(), "type", enum45);
        setIntField(term15867, term15867.getClass(), "value", -420030135);
        setField(term15867, term15867.getClass(), "frgbvalue", null);
        setField(term15867, term15867.getClass(), "fvalue", null);
        setFloatField(term15867, term15867.getClass(), "falpha", 0.64149946F);
        setField(term15867, term15867.getClass(), "cs", null);
        setField(term15859, term15859.getClass(), "color", term15867);
        Class<? extends Object> term16222 = Class.forName((String) "org.openRealmOfStars.gui.mapPanel.ParticleEffectType");
        Field term16221 = ((Class) term16222).getDeclaredField((String) "EXPLOSION_PARTICLE");
        ((Field) term16221).setAccessible(true);
        Object enum46 = ((Field) term16221).get((Object) null);
        Object term15870 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect"));
        Object term15878 = newInstance(Class.forName("java.awt.Color"));
        setDoubleField(term15870, term15870.getClass(), "x", 0.10963898027157926);
        setDoubleField(term15870, term15870.getClass(), "y", 0.34234234602085223);
        setDoubleField(term15870, term15870.getClass(), "mx", 0.8355624480198577);
        setDoubleField(term15870, term15870.getClass(), "my", 0.8303221706066055);
        setIntField(term15870, term15870.getClass(), "ttl", 267763294);
        setField(term15870, term15870.getClass(), "type", enum46);
        setIntField(term15878, term15878.getClass(), "value", -1497710478);
        setField(term15878, term15878.getClass(), "frgbvalue", null);
        setField(term15878, term15878.getClass(), "fvalue", null);
        setFloatField(term15878, term15878.getClass(), "falpha", 0.8399796F);
        setField(term15878, term15878.getClass(), "cs", null);
        setField(term15870, term15870.getClass(), "color", term15878);
        ArrayList term15857 = new ArrayList();
        ((ArrayList) term15857).add(term15859);
        ((ArrayList) term15857).add(term15870);
        Object term15887 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term15887, term15887.getClass(), "imageType", -525257914);
        setField(term15887, term15887.getClass(), "colorModel", null);
        setField(term15887, term15887.getClass(), "raster", null);
        setField(term15887, term15887.getClass(), "osis", null);
        setField(term15887, term15887.getClass(), "properties", null);
        setFloatField(term15887, term15887.getClass(), "accelerationPriority", 0.27949923F);
        setField(term15887, term15887.getClass(), "surfaceManager", null);
        Object term15890 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term15890, term15890.getClass(), "imageType", 199287428);
        setField(term15890, term15890.getClass(), "colorModel", null);
        setField(term15890, term15890.getClass(), "raster", null);
        setField(term15890, term15890.getClass(), "osis", null);
        setField(term15890, term15890.getClass(), "properties", null);
        setFloatField(term15890, term15890.getClass(), "accelerationPriority", 0.0F);
        setField(term15890, term15890.getClass(), "surfaceManager", null);
        Object term15893 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term15893, term15893.getClass(), "imageType", 0);
        setField(term15893, term15893.getClass(), "colorModel", null);
        setField(term15893, term15893.getClass(), "raster", null);
        setField(term15893, term15893.getClass(), "osis", null);
        setField(term15893, term15893.getClass(), "properties", null);
        setFloatField(term15893, term15893.getClass(), "accelerationPriority", 0.0F);
        setField(term15893, term15893.getClass(), "surfaceManager", null);
        Object term15896 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term15896, term15896.getClass(), "imageType", 0);
        setField(term15896, term15896.getClass(), "colorModel", null);
        setField(term15896, term15896.getClass(), "raster", null);
        setField(term15896, term15896.getClass(), "osis", null);
        setField(term15896, term15896.getClass(), "properties", null);
        setFloatField(term15896, term15896.getClass(), "accelerationPriority", 0.0F);
        setField(term15896, term15896.getClass(), "surfaceManager", null);
        Object term15899 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term15899, term15899.getClass(), "imageType", 0);
        setField(term15899, term15899.getClass(), "colorModel", null);
        setField(term15899, term15899.getClass(), "raster", null);
        setField(term15899, term15899.getClass(), "osis", null);
        setField(term15899, term15899.getClass(), "properties", null);
        setFloatField(term15899, term15899.getClass(), "accelerationPriority", 0.0F);
        setField(term15899, term15899.getClass(), "surfaceManager", null);
        ArrayList term15885 = new ArrayList();
        ((ArrayList) term15885).add(term15887);
        ((ArrayList) term15885).add(term15890);
        ((ArrayList) term15885).add(term15893);
        ((ArrayList) term15885).add(term15896);
        ((ArrayList) term15885).add(term15899);
        term15847 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.PlanetAnimation"));
        Object term15884 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.AnimatedImage"));
        setDoubleField(term15847, term15847.getClass(), "sx", 0.41934015614685227);
        setDoubleField(term15847, term15847.getClass(), "sy", 0.07298304401683597);
        setDoubleField(term15847, term15847.getClass(), "ex", 0.6101411757610665);
        setDoubleField(term15847, term15847.getClass(), "ey", 0.07932996853888874);
        setDoubleField(term15847, term15847.getClass(), "mx", 0.4335752168808029);
        setDoubleField(term15847, term15847.getClass(), "my", 0.9196949182738653);
        setIntField(term15847, term15847.getClass(), "count", 1507074215);
        setIntField(term15847, term15847.getClass(), "animFrame", -282881827);
        setBooleanField(term15847, term15847.getClass(), "showAnim", true);
        setField(term15847, term15847.getClass(), "particles", term15857);
        setIntField(term15847, term15847.getClass(), "distance", 49950830);
        setField(term15884, term15884.getClass(), "animations", term15885);
        setIntField(term15884, term15884.getClass(), "frame", -1195339592);
        setIntField(term15884, term15884.getClass(), "sizeX", -376422566);
        setIntField(term15884, term15884.getClass(), "sizeY", 306847454);
        setField(term15847, term15847.getClass(), "explosionAnim", term15884);
        setIntField(term15847, term15847.getClass(), "animationType", 2009020256);
        setIntField(term15847, term15847.getClass(), "shipIndex", 2049577015);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.PlanetAnimation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSy", argTypes, term15847, args);
    }

};



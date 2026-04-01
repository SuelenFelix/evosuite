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

public class PlanetAnimation_getSx_12379492789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15134;

    public PlanetAnimation_getSx_12379492789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15203 = Class.forName((String) "org.openRealmOfStars.gui.mapPanel.ParticleEffectType");
        Field term15202 = ((Class) term15203).getDeclaredField((String) "ANTIMATTER_PARTICLE");
        ((Field) term15202).setAccessible(true);
        Object enum43 = ((Field) term15202).get((Object) null);
        Object term15146 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect"));
        Object term15154 = newInstance(Class.forName("java.awt.Color"));
        setDoubleField(term15146, term15146.getClass(), "x", 0.0013046823258857643);
        setDoubleField(term15146, term15146.getClass(), "y", 0.5404409545293147);
        setDoubleField(term15146, term15146.getClass(), "mx", 0.9172358414700745);
        setDoubleField(term15146, term15146.getClass(), "my", 0.3804251745476508);
        setIntField(term15146, term15146.getClass(), "ttl", -860131894);
        setField(term15146, term15146.getClass(), "type", enum43);
        setIntField(term15154, term15154.getClass(), "value", -1022990421);
        setField(term15154, term15154.getClass(), "frgbvalue", null);
        setField(term15154, term15154.getClass(), "fvalue", null);
        setFloatField(term15154, term15154.getClass(), "falpha", 0.8221641F);
        setField(term15154, term15154.getClass(), "cs", null);
        setField(term15146, term15146.getClass(), "color", term15154);
        Class<? extends Object> term15527 = Class.forName((String) "org.openRealmOfStars.gui.mapPanel.ParticleEffectType");
        Field term15526 = ((Class) term15527).getDeclaredField((String) "EXPLOSION_PARTICLE");
        ((Field) term15526).setAccessible(true);
        Object enum44 = ((Field) term15526).get((Object) null);
        Object term15157 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect"));
        Object term15165 = newInstance(Class.forName("java.awt.Color"));
        setDoubleField(term15157, term15157.getClass(), "x", 0.6704848280926606);
        setDoubleField(term15157, term15157.getClass(), "y", 0.6213122016266206);
        setDoubleField(term15157, term15157.getClass(), "mx", 0.540850203722707);
        setDoubleField(term15157, term15157.getClass(), "my", 6.134294677928587E-4);
        setIntField(term15157, term15157.getClass(), "ttl", 1045547089);
        setField(term15157, term15157.getClass(), "type", enum44);
        setIntField(term15165, term15165.getClass(), "value", -1122880881);
        setField(term15165, term15165.getClass(), "frgbvalue", null);
        setField(term15165, term15165.getClass(), "fvalue", null);
        setFloatField(term15165, term15165.getClass(), "falpha", 0.43372667F);
        setField(term15165, term15165.getClass(), "cs", null);
        setField(term15157, term15157.getClass(), "color", term15165);
        ArrayList term15144 = new ArrayList();
        ((ArrayList) term15144).add(term15146);
        ((ArrayList) term15144).add(term15157);
        Object term15174 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term15174, term15174.getClass(), "imageType", -1254072822);
        setField(term15174, term15174.getClass(), "colorModel", null);
        setField(term15174, term15174.getClass(), "raster", null);
        setField(term15174, term15174.getClass(), "osis", null);
        setField(term15174, term15174.getClass(), "properties", null);
        setFloatField(term15174, term15174.getClass(), "accelerationPriority", 0.74047095F);
        setField(term15174, term15174.getClass(), "surfaceManager", null);
        Object term15177 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term15177, term15177.getClass(), "imageType", 252575029);
        setField(term15177, term15177.getClass(), "colorModel", null);
        setField(term15177, term15177.getClass(), "raster", null);
        setField(term15177, term15177.getClass(), "osis", null);
        setField(term15177, term15177.getClass(), "properties", null);
        setFloatField(term15177, term15177.getClass(), "accelerationPriority", 0.0F);
        setField(term15177, term15177.getClass(), "surfaceManager", null);
        Object term15180 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term15180, term15180.getClass(), "imageType", 0);
        setField(term15180, term15180.getClass(), "colorModel", null);
        setField(term15180, term15180.getClass(), "raster", null);
        setField(term15180, term15180.getClass(), "osis", null);
        setField(term15180, term15180.getClass(), "properties", null);
        setFloatField(term15180, term15180.getClass(), "accelerationPriority", 0.0F);
        setField(term15180, term15180.getClass(), "surfaceManager", null);
        Object term15183 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term15183, term15183.getClass(), "imageType", 0);
        setField(term15183, term15183.getClass(), "colorModel", null);
        setField(term15183, term15183.getClass(), "raster", null);
        setField(term15183, term15183.getClass(), "osis", null);
        setField(term15183, term15183.getClass(), "properties", null);
        setFloatField(term15183, term15183.getClass(), "accelerationPriority", 0.0F);
        setField(term15183, term15183.getClass(), "surfaceManager", null);
        Object term15186 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term15186, term15186.getClass(), "imageType", 0);
        setField(term15186, term15186.getClass(), "colorModel", null);
        setField(term15186, term15186.getClass(), "raster", null);
        setField(term15186, term15186.getClass(), "osis", null);
        setField(term15186, term15186.getClass(), "properties", null);
        setFloatField(term15186, term15186.getClass(), "accelerationPriority", 0.0F);
        setField(term15186, term15186.getClass(), "surfaceManager", null);
        Object term15189 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term15189, term15189.getClass(), "imageType", 0);
        setField(term15189, term15189.getClass(), "colorModel", null);
        setField(term15189, term15189.getClass(), "raster", null);
        setField(term15189, term15189.getClass(), "osis", null);
        setField(term15189, term15189.getClass(), "properties", null);
        setFloatField(term15189, term15189.getClass(), "accelerationPriority", 0.0F);
        setField(term15189, term15189.getClass(), "surfaceManager", null);
        Object term15192 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term15192, term15192.getClass(), "imageType", 0);
        setField(term15192, term15192.getClass(), "colorModel", null);
        setField(term15192, term15192.getClass(), "raster", null);
        setField(term15192, term15192.getClass(), "osis", null);
        setField(term15192, term15192.getClass(), "properties", null);
        setFloatField(term15192, term15192.getClass(), "accelerationPriority", 0.0F);
        setField(term15192, term15192.getClass(), "surfaceManager", null);
        ArrayList term15172 = new ArrayList();
        ((ArrayList) term15172).add(term15174);
        ((ArrayList) term15172).add(term15177);
        ((ArrayList) term15172).add(term15180);
        ((ArrayList) term15172).add(term15183);
        ((ArrayList) term15172).add(term15186);
        ((ArrayList) term15172).add(term15189);
        ((ArrayList) term15172).add(term15192);
        term15134 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.PlanetAnimation"));
        Object term15171 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.AnimatedImage"));
        setDoubleField(term15134, term15134.getClass(), "sx", 0.332320568233212);
        setDoubleField(term15134, term15134.getClass(), "sy", 0.18561351983828822);
        setDoubleField(term15134, term15134.getClass(), "ex", 0.9678135126533798);
        setDoubleField(term15134, term15134.getClass(), "ey", 0.3275035827937727);
        setDoubleField(term15134, term15134.getClass(), "mx", 0.13747524521333288);
        setDoubleField(term15134, term15134.getClass(), "my", 0.7149120009558162);
        setIntField(term15134, term15134.getClass(), "count", 1270666529);
        setIntField(term15134, term15134.getClass(), "animFrame", -1146679443);
        setBooleanField(term15134, term15134.getClass(), "showAnim", false);
        setField(term15134, term15134.getClass(), "particles", term15144);
        setIntField(term15134, term15134.getClass(), "distance", -542712742);
        setField(term15171, term15171.getClass(), "animations", term15172);
        setIntField(term15171, term15171.getClass(), "frame", 57189932);
        setIntField(term15171, term15171.getClass(), "sizeX", 1460722225);
        setIntField(term15171, term15171.getClass(), "sizeY", 1743224434);
        setField(term15134, term15134.getClass(), "explosionAnim", term15171);
        setIntField(term15134, term15134.getClass(), "animationType", 1008080511);
        setIntField(term15134, term15134.getClass(), "shipIndex", 1935707624);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.PlanetAnimation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSx", argTypes, term15134, args);
    }

};



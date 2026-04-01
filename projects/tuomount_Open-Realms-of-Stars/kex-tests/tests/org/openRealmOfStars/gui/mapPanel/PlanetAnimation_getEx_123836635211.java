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

public class PlanetAnimation_getEx_123836635211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16542;

    public PlanetAnimation_getEx_123836635211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16638 = Class.forName((String) "org.openRealmOfStars.gui.mapPanel.ParticleEffectType");
        Field term16637 = ((Class) term16638).getDeclaredField((String) "ION_PARTICLE");
        ((Field) term16637).setAccessible(true);
        Object enum47 = ((Field) term16637).get((Object) null);
        Object term16554 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect"));
        Object term16562 = newInstance(Class.forName("java.awt.Color"));
        setDoubleField(term16554, term16554.getClass(), "x", 0.5180566811475131);
        setDoubleField(term16554, term16554.getClass(), "y", 0.6773553630262286);
        setDoubleField(term16554, term16554.getClass(), "mx", 0.0416412064984476);
        setDoubleField(term16554, term16554.getClass(), "my", 0.9188322321077216);
        setIntField(term16554, term16554.getClass(), "ttl", 474518942);
        setField(term16554, term16554.getClass(), "type", enum47);
        setIntField(term16562, term16562.getClass(), "value", -1656687479);
        setField(term16562, term16562.getClass(), "frgbvalue", null);
        setField(term16562, term16562.getClass(), "fvalue", null);
        setFloatField(term16562, term16562.getClass(), "falpha", 0.06504935F);
        setField(term16562, term16562.getClass(), "cs", null);
        setField(term16554, term16554.getClass(), "color", term16562);
        Class<? extends Object> term16941 = Class.forName((String) "org.openRealmOfStars.gui.mapPanel.ParticleEffectType");
        Field term16940 = ((Class) term16941).getDeclaredField((String) "BLUE_LASER_PARTICLE");
        ((Field) term16940).setAccessible(true);
        Object enum48 = ((Field) term16940).get((Object) null);
        Object term16565 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect"));
        Object term16573 = newInstance(Class.forName("java.awt.Color"));
        setDoubleField(term16565, term16565.getClass(), "x", 0.8046904246652031);
        setDoubleField(term16565, term16565.getClass(), "y", 0.16734523112870836);
        setDoubleField(term16565, term16565.getClass(), "mx", 0.9711083796772954);
        setDoubleField(term16565, term16565.getClass(), "my", 0.329228491476264);
        setIntField(term16565, term16565.getClass(), "ttl", -249614216);
        setField(term16565, term16565.getClass(), "type", enum48);
        setIntField(term16573, term16573.getClass(), "value", 1870727665);
        setField(term16573, term16573.getClass(), "frgbvalue", null);
        setField(term16573, term16573.getClass(), "fvalue", null);
        setFloatField(term16573, term16573.getClass(), "falpha", 0.714912F);
        setField(term16573, term16573.getClass(), "cs", null);
        setField(term16565, term16565.getClass(), "color", term16573);
        Class<? extends Object> term17265 = Class.forName((String) "org.openRealmOfStars.gui.mapPanel.ParticleEffectType");
        Field term17264 = ((Class) term17265).getDeclaredField((String) "BULLET_PARTICLE");
        ((Field) term17264).setAccessible(true);
        Object enum49 = ((Field) term17264).get((Object) null);
        Object term16576 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect"));
        Object term16584 = newInstance(Class.forName("java.awt.Color"));
        setDoubleField(term16576, term16576.getClass(), "x", 0.8664463700873805);
        setDoubleField(term16576, term16576.getClass(), "y", 0.4228841212022646);
        setDoubleField(term16576, term16576.getClass(), "mx", 0.9898207968242465);
        setDoubleField(term16576, term16576.getClass(), "my", 0.025396748287270232);
        setIntField(term16576, term16576.getClass(), "ttl", -519881101);
        setField(term16576, term16576.getClass(), "type", enum49);
        setIntField(term16584, term16584.getClass(), "value", -680920524);
        setField(term16584, term16584.getClass(), "frgbvalue", null);
        setField(term16584, term16584.getClass(), "fvalue", null);
        setFloatField(term16584, term16584.getClass(), "falpha", 0.38042516F);
        setField(term16584, term16584.getClass(), "cs", null);
        setField(term16576, term16576.getClass(), "color", term16584);
        Class<? extends Object> term17577 = Class.forName((String) "org.openRealmOfStars.gui.mapPanel.ParticleEffectType");
        Field term17576 = ((Class) term17577).getDeclaredField((String) "LASER_PARTICLE");
        ((Field) term17576).setAccessible(true);
        Object enum50 = ((Field) term17576).get((Object) null);
        Object term16587 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect"));
        Object term16595 = newInstance(Class.forName("java.awt.Color"));
        setDoubleField(term16587, term16587.getClass(), "x", 0.22437750947699786);
        setDoubleField(term16587, term16587.getClass(), "y", 0.3142783864669928);
        setDoubleField(term16587, term16587.getClass(), "mx", 0.28838369056651414);
        setDoubleField(term16587, term16587.getClass(), "my", 0.3505219043338702);
        setIntField(term16587, term16587.getClass(), "ttl", -916335264);
        setField(term16587, term16587.getClass(), "type", enum50);
        setIntField(term16595, term16595.getClass(), "value", -919416536);
        setField(term16595, term16595.getClass(), "frgbvalue", null);
        setField(term16595, term16595.getClass(), "fvalue", null);
        setFloatField(term16595, term16595.getClass(), "falpha", 6.133914E-4F);
        setField(term16595, term16595.getClass(), "cs", null);
        setField(term16587, term16587.getClass(), "color", term16595);
        Class<? extends Object> term17886 = Class.forName((String) "org.openRealmOfStars.gui.mapPanel.ParticleEffectType");
        Field term17885 = ((Class) term17886).getDeclaredField((String) "ION_PARTICLE_LOW_ACTIVE");
        ((Field) term17885).setAccessible(true);
        Object enum51 = ((Field) term17885).get((Object) null);
        Object term16598 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect"));
        Object term16606 = newInstance(Class.forName("java.awt.Color"));
        setDoubleField(term16598, term16598.getClass(), "x", 0.9926072201505048);
        setDoubleField(term16598, term16598.getClass(), "y", 0.5862272565267508);
        setDoubleField(term16598, term16598.getClass(), "mx", 0.20309716492940588);
        setDoubleField(term16598, term16598.getClass(), "my", 0.2353269756778571);
        setIntField(term16598, term16598.getClass(), "ttl", -43417861);
        setField(term16598, term16598.getClass(), "type", enum51);
        setIntField(term16606, term16606.getClass(), "value", -1533843432);
        setField(term16606, term16606.getClass(), "frgbvalue", null);
        setField(term16606, term16606.getClass(), "fvalue", null);
        setFloatField(term16606, term16606.getClass(), "falpha", 0.50859785F);
        setField(term16606, term16606.getClass(), "cs", null);
        setField(term16598, term16598.getClass(), "color", term16606);
        Object term16609 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.ParticleEffect"));
        Object term16615 = newInstance(Class.forName("java.awt.Color"));
        setDoubleField(term16609, term16609.getClass(), "x", 0.6816920131943206);
        setDoubleField(term16609, term16609.getClass(), "y", 0.2570702043750863);
        setDoubleField(term16609, term16609.getClass(), "mx", 0.1475601354637306);
        setDoubleField(term16609, term16609.getClass(), "my", 0.3597510664032918);
        setIntField(term16609, term16609.getClass(), "ttl", -123338791);
        setField(term16609, term16609.getClass(), "type", enum47);
        setIntField(term16615, term16615.getClass(), "value", -1467089634);
        setField(term16615, term16615.getClass(), "frgbvalue", null);
        setField(term16615, term16615.getClass(), "fvalue", null);
        setFloatField(term16615, term16615.getClass(), "falpha", 0.26342428F);
        setField(term16615, term16615.getClass(), "cs", null);
        setField(term16609, term16609.getClass(), "color", term16615);
        ArrayList term16552 = new ArrayList();
        ((ArrayList) term16552).add(term16554);
        ((ArrayList) term16552).add(term16565);
        ((ArrayList) term16552).add(term16576);
        ((ArrayList) term16552).add(term16587);
        ((ArrayList) term16552).add(term16598);
        ((ArrayList) term16552).add(term16609);
        Object term16624 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term16624, term16624.getClass(), "imageType", 1901317214);
        setField(term16624, term16624.getClass(), "colorModel", null);
        setField(term16624, term16624.getClass(), "raster", null);
        setField(term16624, term16624.getClass(), "osis", null);
        setField(term16624, term16624.getClass(), "properties", null);
        setFloatField(term16624, term16624.getClass(), "accelerationPriority", 0.0F);
        setField(term16624, term16624.getClass(), "surfaceManager", null);
        Object term16627 = newInstance(Class.forName("java.awt.image.BufferedImage"));
        setIntField(term16627, term16627.getClass(), "imageType", 0);
        setField(term16627, term16627.getClass(), "colorModel", null);
        setField(term16627, term16627.getClass(), "raster", null);
        setField(term16627, term16627.getClass(), "osis", null);
        setField(term16627, term16627.getClass(), "properties", null);
        setFloatField(term16627, term16627.getClass(), "accelerationPriority", 0.0F);
        setField(term16627, term16627.getClass(), "surfaceManager", null);
        ArrayList term16622 = new ArrayList();
        ((ArrayList) term16622).add(term16624);
        ((ArrayList) term16622).add(term16627);
        term16542 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.PlanetAnimation"));
        Object term16621 = newInstance(Class.forName("org.openRealmOfStars.gui.icons.AnimatedImage"));
        setDoubleField(term16542, term16542.getClass(), "sx", 0.7102687477135848);
        setDoubleField(term16542, term16542.getClass(), "sy", 0.7984332537471793);
        setDoubleField(term16542, term16542.getClass(), "ex", 0.6782349539183316);
        setDoubleField(term16542, term16542.getClass(), "ey", 0.6464654528667407);
        setDoubleField(term16542, term16542.getClass(), "mx", 0.6416885379658445);
        setDoubleField(term16542, term16542.getClass(), "my", 0.604465128384297);
        setIntField(term16542, term16542.getClass(), "count", 1236004505);
        setIntField(term16542, term16542.getClass(), "animFrame", 1050765721);
        setBooleanField(term16542, term16542.getClass(), "showAnim", false);
        setField(term16542, term16542.getClass(), "particles", term16552);
        setIntField(term16542, term16542.getClass(), "distance", 413548937);
        setField(term16621, term16621.getClass(), "animations", term16622);
        setIntField(term16621, term16621.getClass(), "frame", -1070592289);
        setIntField(term16621, term16621.getClass(), "sizeX", -1464172784);
        setIntField(term16621, term16621.getClass(), "sizeY", 32185364);
        setField(term16542, term16542.getClass(), "explosionAnim", term16621);
        setIntField(term16542, term16542.getClass(), "animationType", 1252951645);
        setIntField(term16542, term16542.getClass(), "shipIndex", 574481092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.PlanetAnimation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEx", argTypes, term16542, args);
    }

};



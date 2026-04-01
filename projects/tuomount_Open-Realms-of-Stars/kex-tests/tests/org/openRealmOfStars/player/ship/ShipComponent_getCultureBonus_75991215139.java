package org.openRealmOfStars.player.ship;

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
import static org.openRealmOfStars.player.ship.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ShipComponent_getCultureBonus_75991215139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term476620;

    public ShipComponent_getCultureBonus_75991215139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term476677 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term476676 = ((Class) term476677).getDeclaredField((String) "DISTORTION_SHIELD");
        ((Field) term476676).setAccessible(true);
        Object enum1511 = ((Field) term476676).get((Object) null);
        term476620 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term476620, term476620.getClass(), "index", 133257591);
        setField(term476620, term476620.getClass(), "type", enum1511);
        setIntField(term476620, term476620.getClass(), "cost", -171155321);
        setIntField(term476620, term476620.getClass(), "metalCost", -677950072);
        setField(term476620, term476620.getClass(), "name", "NIeHFkZeJc");
        setIntField(term476620, term476620.getClass(), "energyRequirement", -904761728);
        setIntField(term476620, term476620.getClass(), "energyResource", 2000897549);
        setIntField(term476620, term476620.getClass(), "ftlSpeed", 1826955502);
        setIntField(term476620, term476620.getClass(), "speed", -757144818);
        setIntField(term476620, term476620.getClass(), "tacticSpeed", 519574863);
        setIntField(term476620, term476620.getClass(), "scannerRange", 1696650503);
        setIntField(term476620, term476620.getClass(), "cloakDetection", 1324332962);
        setIntField(term476620, term476620.getClass(), "cloaking", 1021276927);
        setIntField(term476620, term476620.getClass(), "defenseValue", 871349756);
        setIntField(term476620, term476620.getClass(), "baySize", -543589845);
        setIntField(term476620, term476620.getClass(), "damage", -423912362);
        setIntField(term476620, term476620.getClass(), "weaponRange", 2008331206);
        setIntField(term476620, term476620.getClass(), "initiativeBoost", 1103626679);
        setIntField(term476620, term476620.getClass(), "cultureBonus", 154582855);
        setIntField(term476620, term476620.getClass(), "creditBonus", 2095511598);
        setIntField(term476620, term476620.getClass(), "researchBonus", -723402213);
        setIntField(term476620, term476620.getClass(), "espionageBonus", 622633785);
        setIntField(term476620, term476620.getClass(), "fleetCapacityBonus", -2061364343);
        setIntField(term476620, term476620.getClass(), "hitBonus", 1437426819);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCultureBonus", argTypes, term476620, args);
    }

};



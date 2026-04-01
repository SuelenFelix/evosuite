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
import java.lang.Integer;

public class ShipComponent_setInitiativeBoost_125988794938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term476264;
     Object term476315;

    public ShipComponent_setInitiativeBoost_125988794938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term476318 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term476317 = ((Class) term476318).getDeclaredField((String) "ORBITAL_NUKE");
        ((Field) term476317).setAccessible(true);
        Object enum1510 = ((Field) term476317).get((Object) null);
        term476264 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term476264, term476264.getClass(), "index", -79768819);
        setField(term476264, term476264.getClass(), "type", enum1510);
        setIntField(term476264, term476264.getClass(), "cost", 1575753690);
        setIntField(term476264, term476264.getClass(), "metalCost", 696533441);
        setField(term476264, term476264.getClass(), "name", "FveHsENglh");
        setIntField(term476264, term476264.getClass(), "energyRequirement", 520758279);
        setIntField(term476264, term476264.getClass(), "energyResource", 388729923);
        setIntField(term476264, term476264.getClass(), "ftlSpeed", 1614487902);
        setIntField(term476264, term476264.getClass(), "speed", 965606955);
        setIntField(term476264, term476264.getClass(), "tacticSpeed", 427189621);
        setIntField(term476264, term476264.getClass(), "scannerRange", -1146650520);
        setIntField(term476264, term476264.getClass(), "cloakDetection", 308747026);
        setIntField(term476264, term476264.getClass(), "cloaking", -1142598830);
        setIntField(term476264, term476264.getClass(), "defenseValue", 422197241);
        setIntField(term476264, term476264.getClass(), "baySize", 512839329);
        setIntField(term476264, term476264.getClass(), "damage", -1308727775);
        setIntField(term476264, term476264.getClass(), "weaponRange", 923435355);
        setIntField(term476264, term476264.getClass(), "initiativeBoost", 529707862);
        setIntField(term476264, term476264.getClass(), "cultureBonus", 1163541549);
        setIntField(term476264, term476264.getClass(), "creditBonus", 85255563);
        setIntField(term476264, term476264.getClass(), "researchBonus", 1698224861);
        setIntField(term476264, term476264.getClass(), "espionageBonus", -1675006092);
        setIntField(term476264, term476264.getClass(), "fleetCapacityBonus", -71395930);
        setIntField(term476264, term476264.getClass(), "hitBonus", -1327988712);
        term476315 = new Integer(-481078842);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term476315;
        callMethod(klass, "setInitiativeBoost", argTypes, term476264, args);
    }

};



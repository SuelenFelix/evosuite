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

public class ShipComponent_isPrivateer_4450541684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term464168;

    public ShipComponent_isPrivateer_4450541684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term464219 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term464218 = ((Class) term464219).getDeclaredField((String) "SOLAR_ARMOR");
        ((Field) term464218).setAccessible(true);
        Object enum1476 = ((Field) term464218).get((Object) null);
        term464168 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term464168, term464168.getClass(), "index", 1579670901);
        setField(term464168, term464168.getClass(), "type", enum1476);
        setIntField(term464168, term464168.getClass(), "cost", -1040250853);
        setIntField(term464168, term464168.getClass(), "metalCost", 311680987);
        setField(term464168, term464168.getClass(), "name", "LYolXAGOVy");
        setIntField(term464168, term464168.getClass(), "energyRequirement", 2086480897);
        setIntField(term464168, term464168.getClass(), "energyResource", 774843738);
        setIntField(term464168, term464168.getClass(), "ftlSpeed", 49558267);
        setIntField(term464168, term464168.getClass(), "speed", -1973293496);
        setIntField(term464168, term464168.getClass(), "tacticSpeed", 1252695742);
        setIntField(term464168, term464168.getClass(), "scannerRange", -491910666);
        setIntField(term464168, term464168.getClass(), "cloakDetection", 968090679);
        setIntField(term464168, term464168.getClass(), "cloaking", 300152987);
        setIntField(term464168, term464168.getClass(), "defenseValue", 631176869);
        setIntField(term464168, term464168.getClass(), "baySize", -1579413196);
        setIntField(term464168, term464168.getClass(), "damage", -1296334425);
        setIntField(term464168, term464168.getClass(), "weaponRange", -239179118);
        setIntField(term464168, term464168.getClass(), "initiativeBoost", 651097705);
        setIntField(term464168, term464168.getClass(), "cultureBonus", 249847519);
        setIntField(term464168, term464168.getClass(), "creditBonus", 1938260764);
        setIntField(term464168, term464168.getClass(), "researchBonus", 376902502);
        setIntField(term464168, term464168.getClass(), "espionageBonus", -1504091830);
        setIntField(term464168, term464168.getClass(), "fleetCapacityBonus", 354329189);
        setIntField(term464168, term464168.getClass(), "hitBonus", 337628887);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrivateer", argTypes, term464168, args);
    }

};



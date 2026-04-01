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

public class ShipComponent_getDefenseValue_72034376727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term472430;

    public ShipComponent_getDefenseValue_72034376727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term472481 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term472480 = ((Class) term472481).getDeclaredField((String) "FIGHTER_BAY");
        ((Field) term472480).setAccessible(true);
        Object enum1499 = ((Field) term472480).get((Object) null);
        term472430 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term472430, term472430.getClass(), "index", -1548567396);
        setField(term472430, term472430.getClass(), "type", enum1499);
        setIntField(term472430, term472430.getClass(), "cost", -1192782958);
        setIntField(term472430, term472430.getClass(), "metalCost", 1654390448);
        setField(term472430, term472430.getClass(), "name", "OQKfqoyvDC");
        setIntField(term472430, term472430.getClass(), "energyRequirement", 1172969270);
        setIntField(term472430, term472430.getClass(), "energyResource", -742134992);
        setIntField(term472430, term472430.getClass(), "ftlSpeed", 1533756452);
        setIntField(term472430, term472430.getClass(), "speed", -1888445182);
        setIntField(term472430, term472430.getClass(), "tacticSpeed", 166690129);
        setIntField(term472430, term472430.getClass(), "scannerRange", 242187277);
        setIntField(term472430, term472430.getClass(), "cloakDetection", 1023640987);
        setIntField(term472430, term472430.getClass(), "cloaking", -63686617);
        setIntField(term472430, term472430.getClass(), "defenseValue", 895105769);
        setIntField(term472430, term472430.getClass(), "baySize", -241787119);
        setIntField(term472430, term472430.getClass(), "damage", -405191607);
        setIntField(term472430, term472430.getClass(), "weaponRange", -1381524213);
        setIntField(term472430, term472430.getClass(), "initiativeBoost", -519703952);
        setIntField(term472430, term472430.getClass(), "cultureBonus", 890243475);
        setIntField(term472430, term472430.getClass(), "creditBonus", -641853683);
        setIntField(term472430, term472430.getClass(), "researchBonus", -397533636);
        setIntField(term472430, term472430.getClass(), "espionageBonus", -224543032);
        setIntField(term472430, term472430.getClass(), "fleetCapacityBonus", -347362358);
        setIntField(term472430, term472430.getClass(), "hitBonus", 252203752);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefenseValue", argTypes, term472430, args);
    }

};



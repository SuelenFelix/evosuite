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

public class ShipComponent_getCloakDetection_186876420523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term470994;

    public ShipComponent_getCloakDetection_186876420523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term471046 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term471045 = ((Class) term471046).getDeclaredField((String) "TRACTOR_BEAM");
        ((Field) term471045).setAccessible(true);
        Object enum1495 = ((Field) term471045).get((Object) null);
        term470994 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term470994, term470994.getClass(), "index", 2054837350);
        setField(term470994, term470994.getClass(), "type", enum1495);
        setIntField(term470994, term470994.getClass(), "cost", 1209247785);
        setIntField(term470994, term470994.getClass(), "metalCost", 1950406971);
        setField(term470994, term470994.getClass(), "name", "emyvAyIZir");
        setIntField(term470994, term470994.getClass(), "energyRequirement", 1834357646);
        setIntField(term470994, term470994.getClass(), "energyResource", -934619156);
        setIntField(term470994, term470994.getClass(), "ftlSpeed", 751000283);
        setIntField(term470994, term470994.getClass(), "speed", -591472707);
        setIntField(term470994, term470994.getClass(), "tacticSpeed", -670816490);
        setIntField(term470994, term470994.getClass(), "scannerRange", -552668710);
        setIntField(term470994, term470994.getClass(), "cloakDetection", -760927478);
        setIntField(term470994, term470994.getClass(), "cloaking", -619141849);
        setIntField(term470994, term470994.getClass(), "defenseValue", 1930976366);
        setIntField(term470994, term470994.getClass(), "baySize", -539700568);
        setIntField(term470994, term470994.getClass(), "damage", 1235020855);
        setIntField(term470994, term470994.getClass(), "weaponRange", 589191849);
        setIntField(term470994, term470994.getClass(), "initiativeBoost", -400353527);
        setIntField(term470994, term470994.getClass(), "cultureBonus", -1536675050);
        setIntField(term470994, term470994.getClass(), "creditBonus", 483222058);
        setIntField(term470994, term470994.getClass(), "researchBonus", 2110245271);
        setIntField(term470994, term470994.getClass(), "espionageBonus", 1159718509);
        setIntField(term470994, term470994.getClass(), "fleetCapacityBonus", 1659414643);
        setIntField(term470994, term470994.getClass(), "hitBonus", -1342228000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCloakDetection", argTypes, term470994, args);
    }

};



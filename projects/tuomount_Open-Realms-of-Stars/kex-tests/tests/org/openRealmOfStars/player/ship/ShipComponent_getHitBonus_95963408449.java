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

public class ShipComponent_getHitBonus_95963408449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term480214;

    public ShipComponent_getHitBonus_95963408449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term480270 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term480269 = ((Class) term480270).getDeclaredField((String) "ESPIONAGE_MODULE");
        ((Field) term480269).setAccessible(true);
        Object enum1521 = ((Field) term480269).get((Object) null);
        term480214 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term480214, term480214.getClass(), "index", -2088958897);
        setField(term480214, term480214.getClass(), "type", enum1521);
        setIntField(term480214, term480214.getClass(), "cost", 2078210785);
        setIntField(term480214, term480214.getClass(), "metalCost", 427319716);
        setField(term480214, term480214.getClass(), "name", "QQnxBVdTti");
        setIntField(term480214, term480214.getClass(), "energyRequirement", 1672134929);
        setIntField(term480214, term480214.getClass(), "energyResource", -141732103);
        setIntField(term480214, term480214.getClass(), "ftlSpeed", -1315502709);
        setIntField(term480214, term480214.getClass(), "speed", -755308608);
        setIntField(term480214, term480214.getClass(), "tacticSpeed", -74057307);
        setIntField(term480214, term480214.getClass(), "scannerRange", 1133890568);
        setIntField(term480214, term480214.getClass(), "cloakDetection", -1537842167);
        setIntField(term480214, term480214.getClass(), "cloaking", -1785621434);
        setIntField(term480214, term480214.getClass(), "defenseValue", -1591665469);
        setIntField(term480214, term480214.getClass(), "baySize", -1505625906);
        setIntField(term480214, term480214.getClass(), "damage", -1623892722);
        setIntField(term480214, term480214.getClass(), "weaponRange", 1807438387);
        setIntField(term480214, term480214.getClass(), "initiativeBoost", 911187186);
        setIntField(term480214, term480214.getClass(), "cultureBonus", -772562965);
        setIntField(term480214, term480214.getClass(), "creditBonus", 2081332215);
        setIntField(term480214, term480214.getClass(), "researchBonus", 1586283756);
        setIntField(term480214, term480214.getClass(), "espionageBonus", -335091853);
        setIntField(term480214, term480214.getClass(), "fleetCapacityBonus", -1702801898);
        setIntField(term480214, term480214.getClass(), "hitBonus", 1529874496);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHitBonus", argTypes, term480214, args);
    }

};



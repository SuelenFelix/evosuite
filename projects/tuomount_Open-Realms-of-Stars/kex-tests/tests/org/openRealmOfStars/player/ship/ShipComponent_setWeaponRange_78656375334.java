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

public class ShipComponent_setWeaponRange_78656375334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term474898;
     Object term474950;

    public ShipComponent_setWeaponRange_78656375334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term474953 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term474952 = ((Class) term474953).getDeclaredField((String) "SHADOW_SHIELD");
        ((Field) term474952).setAccessible(true);
        Object enum1506 = ((Field) term474952).get((Object) null);
        term474898 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term474898, term474898.getClass(), "index", 1777759371);
        setField(term474898, term474898.getClass(), "type", enum1506);
        setIntField(term474898, term474898.getClass(), "cost", 2046454754);
        setIntField(term474898, term474898.getClass(), "metalCost", 1782403605);
        setField(term474898, term474898.getClass(), "name", "nPoWdvLVJk");
        setIntField(term474898, term474898.getClass(), "energyRequirement", 796551683);
        setIntField(term474898, term474898.getClass(), "energyResource", 668463794);
        setIntField(term474898, term474898.getClass(), "ftlSpeed", 1412866641);
        setIntField(term474898, term474898.getClass(), "speed", 1177232469);
        setIntField(term474898, term474898.getClass(), "tacticSpeed", 272511309);
        setIntField(term474898, term474898.getClass(), "scannerRange", 1932166997);
        setIntField(term474898, term474898.getClass(), "cloakDetection", -1020349112);
        setIntField(term474898, term474898.getClass(), "cloaking", 1154843160);
        setIntField(term474898, term474898.getClass(), "defenseValue", -499856155);
        setIntField(term474898, term474898.getClass(), "baySize", 533179759);
        setIntField(term474898, term474898.getClass(), "damage", 1712114698);
        setIntField(term474898, term474898.getClass(), "weaponRange", -1000527737);
        setIntField(term474898, term474898.getClass(), "initiativeBoost", -862289291);
        setIntField(term474898, term474898.getClass(), "cultureBonus", 1265374293);
        setIntField(term474898, term474898.getClass(), "creditBonus", 1518831452);
        setIntField(term474898, term474898.getClass(), "researchBonus", -1281963546);
        setIntField(term474898, term474898.getClass(), "espionageBonus", 404778942);
        setIntField(term474898, term474898.getClass(), "fleetCapacityBonus", -2005990393);
        setIntField(term474898, term474898.getClass(), "hitBonus", -2037698232);
        term474950 = new Integer(-257000438);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term474950;
        callMethod(klass, "setWeaponRange", argTypes, term474898, args);
    }

};



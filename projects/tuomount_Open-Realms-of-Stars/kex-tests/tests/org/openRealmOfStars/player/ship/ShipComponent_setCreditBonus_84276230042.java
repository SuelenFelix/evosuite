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

public class ShipComponent_setCreditBonus_84276230042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term477736;
     Object term477786;

    public ShipComponent_setCreditBonus_84276230042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term477789 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term477788 = ((Class) term477789).getDeclaredField((String) "POWERSOURCE");
        ((Field) term477788).setAccessible(true);
        Object enum1514 = ((Field) term477788).get((Object) null);
        term477736 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term477736, term477736.getClass(), "index", -1196961418);
        setField(term477736, term477736.getClass(), "type", enum1514);
        setIntField(term477736, term477736.getClass(), "cost", 1387563120);
        setIntField(term477736, term477736.getClass(), "metalCost", 76477391);
        setField(term477736, term477736.getClass(), "name", "hKGdlGWpgE");
        setIntField(term477736, term477736.getClass(), "energyRequirement", 1959375944);
        setIntField(term477736, term477736.getClass(), "energyResource", -989809275);
        setIntField(term477736, term477736.getClass(), "ftlSpeed", -198811836);
        setIntField(term477736, term477736.getClass(), "speed", 538159596);
        setIntField(term477736, term477736.getClass(), "tacticSpeed", -711082612);
        setIntField(term477736, term477736.getClass(), "scannerRange", -1053368081);
        setIntField(term477736, term477736.getClass(), "cloakDetection", 708346792);
        setIntField(term477736, term477736.getClass(), "cloaking", -402126719);
        setIntField(term477736, term477736.getClass(), "defenseValue", -447989377);
        setIntField(term477736, term477736.getClass(), "baySize", -995008409);
        setIntField(term477736, term477736.getClass(), "damage", -875149663);
        setIntField(term477736, term477736.getClass(), "weaponRange", 127189459);
        setIntField(term477736, term477736.getClass(), "initiativeBoost", 112918829);
        setIntField(term477736, term477736.getClass(), "cultureBonus", 1035574889);
        setIntField(term477736, term477736.getClass(), "creditBonus", 679714254);
        setIntField(term477736, term477736.getClass(), "researchBonus", 87877280);
        setIntField(term477736, term477736.getClass(), "espionageBonus", 1439798945);
        setIntField(term477736, term477736.getClass(), "fleetCapacityBonus", 1123175842);
        setIntField(term477736, term477736.getClass(), "hitBonus", 1522845698);
        term477786 = new Integer(-2025066214);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term477786;
        callMethod(klass, "setCreditBonus", argTypes, term477736, args);
    }

};



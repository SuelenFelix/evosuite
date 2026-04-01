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

public class ShipComponent_getSpeed_197870087717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term468852;

    public ShipComponent_getSpeed_197870087717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term468909 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term468908 = ((Class) term468909).getDeclaredField((String) "WEAPON_HE_MISSILE");
        ((Field) term468908).setAccessible(true);
        Object enum1489 = ((Field) term468908).get((Object) null);
        term468852 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term468852, term468852.getClass(), "index", 561322224);
        setField(term468852, term468852.getClass(), "type", enum1489);
        setIntField(term468852, term468852.getClass(), "cost", 1667257783);
        setIntField(term468852, term468852.getClass(), "metalCost", -766164021);
        setField(term468852, term468852.getClass(), "name", "RnnxeTWRAN");
        setIntField(term468852, term468852.getClass(), "energyRequirement", 233163267);
        setIntField(term468852, term468852.getClass(), "energyResource", 692588997);
        setIntField(term468852, term468852.getClass(), "ftlSpeed", -600023953);
        setIntField(term468852, term468852.getClass(), "speed", -109479766);
        setIntField(term468852, term468852.getClass(), "tacticSpeed", -509531106);
        setIntField(term468852, term468852.getClass(), "scannerRange", -1606779427);
        setIntField(term468852, term468852.getClass(), "cloakDetection", -1122707604);
        setIntField(term468852, term468852.getClass(), "cloaking", -172568076);
        setIntField(term468852, term468852.getClass(), "defenseValue", -794505441);
        setIntField(term468852, term468852.getClass(), "baySize", 791807465);
        setIntField(term468852, term468852.getClass(), "damage", -359105);
        setIntField(term468852, term468852.getClass(), "weaponRange", 868346311);
        setIntField(term468852, term468852.getClass(), "initiativeBoost", 897972978);
        setIntField(term468852, term468852.getClass(), "cultureBonus", -2099349449);
        setIntField(term468852, term468852.getClass(), "creditBonus", 1719182097);
        setIntField(term468852, term468852.getClass(), "researchBonus", -689383574);
        setIntField(term468852, term468852.getClass(), "espionageBonus", -203297975);
        setIntField(term468852, term468852.getClass(), "fleetCapacityBonus", -306200799);
        setIntField(term468852, term468852.getClass(), "hitBonus", -1669655541);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSpeed", argTypes, term468852, args);
    }

};



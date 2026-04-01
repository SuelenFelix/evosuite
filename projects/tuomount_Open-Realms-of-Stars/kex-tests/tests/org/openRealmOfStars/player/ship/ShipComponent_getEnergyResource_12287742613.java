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

public class ShipComponent_getEnergyResource_12287742613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term467444;

    public ShipComponent_getEnergyResource_12287742613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term467490 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term467489 = ((Class) term467490).getDeclaredField((String) "ENGINE");
        ((Field) term467489).setAccessible(true);
        Object enum1485 = ((Field) term467489).get((Object) null);
        term467444 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term467444, term467444.getClass(), "index", 206061309);
        setField(term467444, term467444.getClass(), "type", enum1485);
        setIntField(term467444, term467444.getClass(), "cost", -469486858);
        setIntField(term467444, term467444.getClass(), "metalCost", -1184776933);
        setField(term467444, term467444.getClass(), "name", "IYwvalYGmX");
        setIntField(term467444, term467444.getClass(), "energyRequirement", -947890577);
        setIntField(term467444, term467444.getClass(), "energyResource", -2103526812);
        setIntField(term467444, term467444.getClass(), "ftlSpeed", 2001968974);
        setIntField(term467444, term467444.getClass(), "speed", 2036080787);
        setIntField(term467444, term467444.getClass(), "tacticSpeed", -1187989955);
        setIntField(term467444, term467444.getClass(), "scannerRange", 1522845770);
        setIntField(term467444, term467444.getClass(), "cloakDetection", 457792368);
        setIntField(term467444, term467444.getClass(), "cloaking", 1883178473);
        setIntField(term467444, term467444.getClass(), "defenseValue", -1873487804);
        setIntField(term467444, term467444.getClass(), "baySize", 338162762);
        setIntField(term467444, term467444.getClass(), "damage", -2029988360);
        setIntField(term467444, term467444.getClass(), "weaponRange", 985415961);
        setIntField(term467444, term467444.getClass(), "initiativeBoost", 1163437479);
        setIntField(term467444, term467444.getClass(), "cultureBonus", 446404576);
        setIntField(term467444, term467444.getClass(), "creditBonus", -250771991);
        setIntField(term467444, term467444.getClass(), "researchBonus", -87432188);
        setIntField(term467444, term467444.getClass(), "espionageBonus", 1028623562);
        setIntField(term467444, term467444.getClass(), "fleetCapacityBonus", 731074367);
        setIntField(term467444, term467444.getClass(), "hitBonus", 969220339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEnergyResource", argTypes, term467444, args);
    }

};



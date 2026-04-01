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

public class ShipComponent_setEnergyRequirement_128953230312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term467072;
     Object term467127;

    public ShipComponent_setEnergyRequirement_128953230312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term467130 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term467129 = ((Class) term467130).getDeclaredField((String) "SHIELD_GENERATOR");
        ((Field) term467129).setAccessible(true);
        Object enum1484 = ((Field) term467129).get((Object) null);
        term467072 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term467072, term467072.getClass(), "index", 1720929948);
        setField(term467072, term467072.getClass(), "type", enum1484);
        setIntField(term467072, term467072.getClass(), "cost", -943731935);
        setIntField(term467072, term467072.getClass(), "metalCost", 1657200756);
        setField(term467072, term467072.getClass(), "name", "pciCOjaINO");
        setIntField(term467072, term467072.getClass(), "energyRequirement", -826470678);
        setIntField(term467072, term467072.getClass(), "energyResource", -1987983732);
        setIntField(term467072, term467072.getClass(), "ftlSpeed", -1566042472);
        setIntField(term467072, term467072.getClass(), "speed", 654568310);
        setIntField(term467072, term467072.getClass(), "tacticSpeed", 1379492509);
        setIntField(term467072, term467072.getClass(), "scannerRange", 1859663828);
        setIntField(term467072, term467072.getClass(), "cloakDetection", -241347649);
        setIntField(term467072, term467072.getClass(), "cloaking", -996032013);
        setIntField(term467072, term467072.getClass(), "defenseValue", -499780226);
        setIntField(term467072, term467072.getClass(), "baySize", -2047034320);
        setIntField(term467072, term467072.getClass(), "damage", 229323589);
        setIntField(term467072, term467072.getClass(), "weaponRange", 608950067);
        setIntField(term467072, term467072.getClass(), "initiativeBoost", -1976530324);
        setIntField(term467072, term467072.getClass(), "cultureBonus", -345508496);
        setIntField(term467072, term467072.getClass(), "creditBonus", 1836772931);
        setIntField(term467072, term467072.getClass(), "researchBonus", 1471156136);
        setIntField(term467072, term467072.getClass(), "espionageBonus", 869271750);
        setIntField(term467072, term467072.getClass(), "fleetCapacityBonus", -891906508);
        setIntField(term467072, term467072.getClass(), "hitBonus", 33200561);
        term467127 = new Integer(-391675562);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term467127;
        callMethod(klass, "setEnergyRequirement", argTypes, term467072, args);
    }

};



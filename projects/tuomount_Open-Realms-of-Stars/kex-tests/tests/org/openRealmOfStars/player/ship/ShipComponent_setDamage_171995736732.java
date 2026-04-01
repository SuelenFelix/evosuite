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

public class ShipComponent_setDamage_171995736732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term474180;
     Object term474232;

    public ShipComponent_setDamage_171995736732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term474235 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term474234 = ((Class) term474235).getDeclaredField((String) "PLASMA_CANNON");
        ((Field) term474234).setAccessible(true);
        Object enum1504 = ((Field) term474234).get((Object) null);
        term474180 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term474180, term474180.getClass(), "index", 761784235);
        setField(term474180, term474180.getClass(), "type", enum1504);
        setIntField(term474180, term474180.getClass(), "cost", 222754383);
        setIntField(term474180, term474180.getClass(), "metalCost", 1189087747);
        setField(term474180, term474180.getClass(), "name", "GCdVTQIvhS");
        setIntField(term474180, term474180.getClass(), "energyRequirement", -1148914624);
        setIntField(term474180, term474180.getClass(), "energyResource", -1710576825);
        setIntField(term474180, term474180.getClass(), "ftlSpeed", 105326792);
        setIntField(term474180, term474180.getClass(), "speed", 1285535641);
        setIntField(term474180, term474180.getClass(), "tacticSpeed", -1737700402);
        setIntField(term474180, term474180.getClass(), "scannerRange", 929809508);
        setIntField(term474180, term474180.getClass(), "cloakDetection", 1114212705);
        setIntField(term474180, term474180.getClass(), "cloaking", -837333473);
        setIntField(term474180, term474180.getClass(), "defenseValue", 1211482826);
        setIntField(term474180, term474180.getClass(), "baySize", -1081841435);
        setIntField(term474180, term474180.getClass(), "damage", 2012208998);
        setIntField(term474180, term474180.getClass(), "weaponRange", 1958631775);
        setIntField(term474180, term474180.getClass(), "initiativeBoost", -1935992165);
        setIntField(term474180, term474180.getClass(), "cultureBonus", -63681126);
        setIntField(term474180, term474180.getClass(), "creditBonus", -1682345629);
        setIntField(term474180, term474180.getClass(), "researchBonus", -1117546056);
        setIntField(term474180, term474180.getClass(), "espionageBonus", -991844027);
        setIntField(term474180, term474180.getClass(), "fleetCapacityBonus", -1027243359);
        setIntField(term474180, term474180.getClass(), "hitBonus", 1419359154);
        term474232 = new Integer(1029591327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term474232;
        callMethod(klass, "setDamage", argTypes, term474180, args);
    }

};



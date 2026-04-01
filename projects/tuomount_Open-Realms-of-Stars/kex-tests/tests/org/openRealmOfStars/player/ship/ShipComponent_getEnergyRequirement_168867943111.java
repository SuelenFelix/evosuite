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

public class ShipComponent_getEnergyRequirement_168867943111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term466714;

    public ShipComponent_getEnergyRequirement_168867943111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term466767 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term466766 = ((Class) term466767).getDeclaredField((String) "SHADOW_SHIELD");
        ((Field) term466766).setAccessible(true);
        Object enum1483 = ((Field) term466766).get((Object) null);
        term466714 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term466714, term466714.getClass(), "index", 32544597);
        setField(term466714, term466714.getClass(), "type", enum1483);
        setIntField(term466714, term466714.getClass(), "cost", 2102217630);
        setIntField(term466714, term466714.getClass(), "metalCost", -471183701);
        setField(term466714, term466714.getClass(), "name", "cBguIVnfJC");
        setIntField(term466714, term466714.getClass(), "energyRequirement", 1854074907);
        setIntField(term466714, term466714.getClass(), "energyResource", -408616081);
        setIntField(term466714, term466714.getClass(), "ftlSpeed", 179050285);
        setIntField(term466714, term466714.getClass(), "speed", 1885793754);
        setIntField(term466714, term466714.getClass(), "tacticSpeed", -764569890);
        setIntField(term466714, term466714.getClass(), "scannerRange", 575186277);
        setIntField(term466714, term466714.getClass(), "cloakDetection", -1254865912);
        setIntField(term466714, term466714.getClass(), "cloaking", 672798038);
        setIntField(term466714, term466714.getClass(), "defenseValue", -1733288743);
        setIntField(term466714, term466714.getClass(), "baySize", -258749513);
        setIntField(term466714, term466714.getClass(), "damage", -1844583866);
        setIntField(term466714, term466714.getClass(), "weaponRange", 2042786119);
        setIntField(term466714, term466714.getClass(), "initiativeBoost", -1283362130);
        setIntField(term466714, term466714.getClass(), "cultureBonus", 1665540853);
        setIntField(term466714, term466714.getClass(), "creditBonus", -1906608832);
        setIntField(term466714, term466714.getClass(), "researchBonus", 1588132306);
        setIntField(term466714, term466714.getClass(), "espionageBonus", 1581941988);
        setIntField(term466714, term466714.getClass(), "fleetCapacityBonus", -1603773271);
        setIntField(term466714, term466714.getClass(), "hitBonus", -1605444948);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEnergyRequirement", argTypes, term466714, args);
    }

};



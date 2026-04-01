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

public class ShipComponent_getInitiativeBoost_186718409937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term475934;

    public ShipComponent_getInitiativeBoost_186718409937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term475980 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term475979 = ((Class) term475980).getDeclaredField((String) "JAMMER");
        ((Field) term475979).setAccessible(true);
        Object enum1509 = ((Field) term475979).get((Object) null);
        term475934 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term475934, term475934.getClass(), "index", 1878120919);
        setField(term475934, term475934.getClass(), "type", enum1509);
        setIntField(term475934, term475934.getClass(), "cost", -675148907);
        setIntField(term475934, term475934.getClass(), "metalCost", -1740743042);
        setField(term475934, term475934.getClass(), "name", "DVDTdaDKVX");
        setIntField(term475934, term475934.getClass(), "energyRequirement", 339013147);
        setIntField(term475934, term475934.getClass(), "energyResource", -1317112543);
        setIntField(term475934, term475934.getClass(), "ftlSpeed", 762805823);
        setIntField(term475934, term475934.getClass(), "speed", 1225715719);
        setIntField(term475934, term475934.getClass(), "tacticSpeed", -1423171674);
        setIntField(term475934, term475934.getClass(), "scannerRange", 209728839);
        setIntField(term475934, term475934.getClass(), "cloakDetection", -1109602409);
        setIntField(term475934, term475934.getClass(), "cloaking", 431360354);
        setIntField(term475934, term475934.getClass(), "defenseValue", -1337364986);
        setIntField(term475934, term475934.getClass(), "baySize", -1843956619);
        setIntField(term475934, term475934.getClass(), "damage", -1997929690);
        setIntField(term475934, term475934.getClass(), "weaponRange", -2134647432);
        setIntField(term475934, term475934.getClass(), "initiativeBoost", 1367416020);
        setIntField(term475934, term475934.getClass(), "cultureBonus", -1721259729);
        setIntField(term475934, term475934.getClass(), "creditBonus", -803847072);
        setIntField(term475934, term475934.getClass(), "researchBonus", -503134540);
        setIntField(term475934, term475934.getClass(), "espionageBonus", 1534465143);
        setIntField(term475934, term475934.getClass(), "fleetCapacityBonus", -627988036);
        setIntField(term475934, term475934.getClass(), "hitBonus", 1134719036);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInitiativeBoost", argTypes, term475934, args);
    }

};



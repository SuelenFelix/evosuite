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

public class ShipComponent_isTractor_9102089435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term464518;

    public ShipComponent_isTractor_9102089435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term464573 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term464572 = ((Class) term464573).getDeclaredField((String) "CLOAKING_DEVICE");
        ((Field) term464572).setAccessible(true);
        Object enum1477 = ((Field) term464572).get((Object) null);
        term464518 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term464518, term464518.getClass(), "index", -1623672019);
        setField(term464518, term464518.getClass(), "type", enum1477);
        setIntField(term464518, term464518.getClass(), "cost", 748011175);
        setIntField(term464518, term464518.getClass(), "metalCost", 1872579805);
        setField(term464518, term464518.getClass(), "name", "khHcUBgVet");
        setIntField(term464518, term464518.getClass(), "energyRequirement", 396945726);
        setIntField(term464518, term464518.getClass(), "energyResource", 376449663);
        setIntField(term464518, term464518.getClass(), "ftlSpeed", -453129512);
        setIntField(term464518, term464518.getClass(), "speed", 828513099);
        setIntField(term464518, term464518.getClass(), "tacticSpeed", -1918112820);
        setIntField(term464518, term464518.getClass(), "scannerRange", 104826972);
        setIntField(term464518, term464518.getClass(), "cloakDetection", -1076408006);
        setIntField(term464518, term464518.getClass(), "cloaking", -1344634590);
        setIntField(term464518, term464518.getClass(), "defenseValue", 1517451081);
        setIntField(term464518, term464518.getClass(), "baySize", -1020317108);
        setIntField(term464518, term464518.getClass(), "damage", 450923402);
        setIntField(term464518, term464518.getClass(), "weaponRange", -346441975);
        setIntField(term464518, term464518.getClass(), "initiativeBoost", -252504773);
        setIntField(term464518, term464518.getClass(), "cultureBonus", 1683059400);
        setIntField(term464518, term464518.getClass(), "creditBonus", 1519559286);
        setIntField(term464518, term464518.getClass(), "researchBonus", 1885237730);
        setIntField(term464518, term464518.getClass(), "espionageBonus", 261995675);
        setIntField(term464518, term464518.getClass(), "fleetCapacityBonus", 1400945112);
        setIntField(term464518, term464518.getClass(), "hitBonus", -1431100559);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isTractor", argTypes, term464518, args);
    }

};



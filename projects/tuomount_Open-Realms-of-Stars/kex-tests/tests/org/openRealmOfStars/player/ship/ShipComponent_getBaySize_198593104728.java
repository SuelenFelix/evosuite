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

public class ShipComponent_getBaySize_198593104728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term472780;

    public ShipComponent_getBaySize_198593104728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term472833 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term472832 = ((Class) term472833).getDeclaredField((String) "COLONY_MODULE");
        ((Field) term472832).setAccessible(true);
        Object enum1500 = ((Field) term472832).get((Object) null);
        term472780 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term472780, term472780.getClass(), "index", 1848173042);
        setField(term472780, term472780.getClass(), "type", enum1500);
        setIntField(term472780, term472780.getClass(), "cost", 287572725);
        setIntField(term472780, term472780.getClass(), "metalCost", 900847726);
        setField(term472780, term472780.getClass(), "name", "BkVqpsLSht");
        setIntField(term472780, term472780.getClass(), "energyRequirement", 266617808);
        setIntField(term472780, term472780.getClass(), "energyResource", 1590332494);
        setIntField(term472780, term472780.getClass(), "ftlSpeed", -1493499628);
        setIntField(term472780, term472780.getClass(), "speed", -1696939361);
        setIntField(term472780, term472780.getClass(), "tacticSpeed", 1195351748);
        setIntField(term472780, term472780.getClass(), "scannerRange", 1149553126);
        setIntField(term472780, term472780.getClass(), "cloakDetection", -1838453620);
        setIntField(term472780, term472780.getClass(), "cloaking", -148539898);
        setIntField(term472780, term472780.getClass(), "defenseValue", 254902560);
        setIntField(term472780, term472780.getClass(), "baySize", 92634753);
        setIntField(term472780, term472780.getClass(), "damage", 465922946);
        setIntField(term472780, term472780.getClass(), "weaponRange", -553407174);
        setIntField(term472780, term472780.getClass(), "initiativeBoost", 168988978);
        setIntField(term472780, term472780.getClass(), "cultureBonus", -523133922);
        setIntField(term472780, term472780.getClass(), "creditBonus", -1190413422);
        setIntField(term472780, term472780.getClass(), "researchBonus", -1614665116);
        setIntField(term472780, term472780.getClass(), "espionageBonus", 1721635852);
        setIntField(term472780, term472780.getClass(), "fleetCapacityBonus", 560457275);
        setIntField(term472780, term472780.getClass(), "hitBonus", -1981813317);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBaySize", argTypes, term472780, args);
    }

};



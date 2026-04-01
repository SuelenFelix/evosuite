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

public class ShipComponent_getTacticSpeed_140251037319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term469590;

    public ShipComponent_getTacticSpeed_140251037319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term469644 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term469643 = ((Class) term469644).getDeclaredField((String) "WEAPON_RAILGUN");
        ((Field) term469643).setAccessible(true);
        Object enum1491 = ((Field) term469643).get((Object) null);
        term469590 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term469590, term469590.getClass(), "index", 969920028);
        setField(term469590, term469590.getClass(), "type", enum1491);
        setIntField(term469590, term469590.getClass(), "cost", -609652862);
        setIntField(term469590, term469590.getClass(), "metalCost", -356838469);
        setField(term469590, term469590.getClass(), "name", "nMjXaLZtfE");
        setIntField(term469590, term469590.getClass(), "energyRequirement", -1696711810);
        setIntField(term469590, term469590.getClass(), "energyResource", -147714929);
        setIntField(term469590, term469590.getClass(), "ftlSpeed", -2045202054);
        setIntField(term469590, term469590.getClass(), "speed", 1996188078);
        setIntField(term469590, term469590.getClass(), "tacticSpeed", -56413483);
        setIntField(term469590, term469590.getClass(), "scannerRange", -1181416306);
        setIntField(term469590, term469590.getClass(), "cloakDetection", 2099316913);
        setIntField(term469590, term469590.getClass(), "cloaking", -992105490);
        setIntField(term469590, term469590.getClass(), "defenseValue", -1449542606);
        setIntField(term469590, term469590.getClass(), "baySize", 406259462);
        setIntField(term469590, term469590.getClass(), "damage", 660518206);
        setIntField(term469590, term469590.getClass(), "weaponRange", -2010658317);
        setIntField(term469590, term469590.getClass(), "initiativeBoost", -2061982603);
        setIntField(term469590, term469590.getClass(), "cultureBonus", -1288997751);
        setIntField(term469590, term469590.getClass(), "creditBonus", -218628475);
        setIntField(term469590, term469590.getClass(), "researchBonus", 704093413);
        setIntField(term469590, term469590.getClass(), "espionageBonus", 718574088);
        setIntField(term469590, term469590.getClass(), "fleetCapacityBonus", -1983026826);
        setIntField(term469590, term469590.getClass(), "hitBonus", 340317830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTacticSpeed", argTypes, term469590, args);
    }

};



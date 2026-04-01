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

public class ShipComponent_setCloaking_120306434026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term472078;
     Object term472128;

    public ShipComponent_setCloaking_120306434026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term472131 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term472130 = ((Class) term472131).getDeclaredField((String) "PLASMA_BEAM");
        ((Field) term472130).setAccessible(true);
        Object enum1498 = ((Field) term472130).get((Object) null);
        term472078 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term472078, term472078.getClass(), "index", -161061296);
        setField(term472078, term472078.getClass(), "type", enum1498);
        setIntField(term472078, term472078.getClass(), "cost", 1870072131);
        setIntField(term472078, term472078.getClass(), "metalCost", 2143067629);
        setField(term472078, term472078.getClass(), "name", "XkKAHDYtRx");
        setIntField(term472078, term472078.getClass(), "energyRequirement", 1813631828);
        setIntField(term472078, term472078.getClass(), "energyResource", 1323160882);
        setIntField(term472078, term472078.getClass(), "ftlSpeed", 1113398500);
        setIntField(term472078, term472078.getClass(), "speed", 80339386);
        setIntField(term472078, term472078.getClass(), "tacticSpeed", 10586783);
        setIntField(term472078, term472078.getClass(), "scannerRange", 1404577219);
        setIntField(term472078, term472078.getClass(), "cloakDetection", -1718338317);
        setIntField(term472078, term472078.getClass(), "cloaking", 30310807);
        setIntField(term472078, term472078.getClass(), "defenseValue", 1550335964);
        setIntField(term472078, term472078.getClass(), "baySize", -1163619800);
        setIntField(term472078, term472078.getClass(), "damage", 853492949);
        setIntField(term472078, term472078.getClass(), "weaponRange", 1115052318);
        setIntField(term472078, term472078.getClass(), "initiativeBoost", -1113759328);
        setIntField(term472078, term472078.getClass(), "cultureBonus", 1682421727);
        setIntField(term472078, term472078.getClass(), "creditBonus", 1305604796);
        setIntField(term472078, term472078.getClass(), "researchBonus", -135506333);
        setIntField(term472078, term472078.getClass(), "espionageBonus", 1938906824);
        setIntField(term472078, term472078.getClass(), "fleetCapacityBonus", -1898614835);
        setIntField(term472078, term472078.getClass(), "hitBonus", -102506456);
        term472128 = new Integer(-1813716447);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term472128;
        callMethod(klass, "setCloaking", argTypes, term472078, args);
    }

};



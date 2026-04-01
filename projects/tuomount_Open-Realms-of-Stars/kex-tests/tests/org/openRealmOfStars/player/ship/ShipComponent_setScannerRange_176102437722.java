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

public class ShipComponent_setScannerRange_176102437722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term470642;
     Object term470692;

    public ShipComponent_setScannerRange_176102437722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term470695 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term470694 = ((Class) term470695).getDeclaredField((String) "PLASMA_BEAM");
        ((Field) term470694).setAccessible(true);
        Object enum1494 = ((Field) term470694).get((Object) null);
        term470642 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term470642, term470642.getClass(), "index", -663888705);
        setField(term470642, term470642.getClass(), "type", enum1494);
        setIntField(term470642, term470642.getClass(), "cost", -1081559918);
        setIntField(term470642, term470642.getClass(), "metalCost", 1135106965);
        setField(term470642, term470642.getClass(), "name", "ePSUVTQQcH");
        setIntField(term470642, term470642.getClass(), "energyRequirement", 1832192277);
        setIntField(term470642, term470642.getClass(), "energyResource", 1254864568);
        setIntField(term470642, term470642.getClass(), "ftlSpeed", -571619755);
        setIntField(term470642, term470642.getClass(), "speed", 451376857);
        setIntField(term470642, term470642.getClass(), "tacticSpeed", -1991834397);
        setIntField(term470642, term470642.getClass(), "scannerRange", -1181437252);
        setIntField(term470642, term470642.getClass(), "cloakDetection", 1473244237);
        setIntField(term470642, term470642.getClass(), "cloaking", 1217408539);
        setIntField(term470642, term470642.getClass(), "defenseValue", -80988884);
        setIntField(term470642, term470642.getClass(), "baySize", 1775341759);
        setIntField(term470642, term470642.getClass(), "damage", -1260716399);
        setIntField(term470642, term470642.getClass(), "weaponRange", 2009351154);
        setIntField(term470642, term470642.getClass(), "initiativeBoost", -1078550468);
        setIntField(term470642, term470642.getClass(), "cultureBonus", -1867741312);
        setIntField(term470642, term470642.getClass(), "creditBonus", -795605694);
        setIntField(term470642, term470642.getClass(), "researchBonus", -1791286061);
        setIntField(term470642, term470642.getClass(), "espionageBonus", -326801646);
        setIntField(term470642, term470642.getClass(), "fleetCapacityBonus", 1716329981);
        setIntField(term470642, term470642.getClass(), "hitBonus", 1984104176);
        term470692 = new Integer(1030528931);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term470692;
        callMethod(klass, "setScannerRange", argTypes, term470642, args);
    }

};



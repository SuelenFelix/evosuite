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

public class ShipComponent_setDefenseValue_165686933330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term473486;
     Object term473539;

    public ShipComponent_setDefenseValue_165686933330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term473542 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term473541 = ((Class) term473542).getDeclaredField((String) "GRAVITY_RIPPER");
        ((Field) term473541).setAccessible(true);
        Object enum1502 = ((Field) term473541).get((Object) null);
        term473486 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term473486, term473486.getClass(), "index", -1834941052);
        setField(term473486, term473486.getClass(), "type", enum1502);
        setIntField(term473486, term473486.getClass(), "cost", -720285664);
        setIntField(term473486, term473486.getClass(), "metalCost", 178095497);
        setField(term473486, term473486.getClass(), "name", "GCtSacRpUA");
        setIntField(term473486, term473486.getClass(), "energyRequirement", -211651758);
        setIntField(term473486, term473486.getClass(), "energyResource", 718173188);
        setIntField(term473486, term473486.getClass(), "ftlSpeed", -1945411376);
        setIntField(term473486, term473486.getClass(), "speed", -1070288117);
        setIntField(term473486, term473486.getClass(), "tacticSpeed", 1751137479);
        setIntField(term473486, term473486.getClass(), "scannerRange", -1425278453);
        setIntField(term473486, term473486.getClass(), "cloakDetection", 1791235863);
        setIntField(term473486, term473486.getClass(), "cloaking", 889880081);
        setIntField(term473486, term473486.getClass(), "defenseValue", 711666564);
        setIntField(term473486, term473486.getClass(), "baySize", -1568954017);
        setIntField(term473486, term473486.getClass(), "damage", 1183123217);
        setIntField(term473486, term473486.getClass(), "weaponRange", -106074389);
        setIntField(term473486, term473486.getClass(), "initiativeBoost", 1750571132);
        setIntField(term473486, term473486.getClass(), "cultureBonus", 590753141);
        setIntField(term473486, term473486.getClass(), "creditBonus", 750364664);
        setIntField(term473486, term473486.getClass(), "researchBonus", -762712240);
        setIntField(term473486, term473486.getClass(), "espionageBonus", 437727883);
        setIntField(term473486, term473486.getClass(), "fleetCapacityBonus", 362508069);
        setIntField(term473486, term473486.getClass(), "hitBonus", 1363722184);
        term473539 = new Integer(-35490007);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term473539;
        callMethod(klass, "setDefenseValue", argTypes, term473486, args);
    }

};



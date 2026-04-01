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

public class ShipComponent_setFtlSpeed_59319593916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term468480;
     Object term468535;

    public ShipComponent_setFtlSpeed_59319593916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term468538 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term468537 = ((Class) term468538).getDeclaredField((String) "SHIELD_GENERATOR");
        ((Field) term468537).setAccessible(true);
        Object enum1488 = ((Field) term468537).get((Object) null);
        term468480 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term468480, term468480.getClass(), "index", 1213587618);
        setField(term468480, term468480.getClass(), "type", enum1488);
        setIntField(term468480, term468480.getClass(), "cost", 980395350);
        setIntField(term468480, term468480.getClass(), "metalCost", -941431124);
        setField(term468480, term468480.getClass(), "name", "ptEVZPyKgD");
        setIntField(term468480, term468480.getClass(), "energyRequirement", 228698990);
        setIntField(term468480, term468480.getClass(), "energyResource", -432537089);
        setIntField(term468480, term468480.getClass(), "ftlSpeed", -1871594001);
        setIntField(term468480, term468480.getClass(), "speed", -59629101);
        setIntField(term468480, term468480.getClass(), "tacticSpeed", -1074564020);
        setIntField(term468480, term468480.getClass(), "scannerRange", -897257334);
        setIntField(term468480, term468480.getClass(), "cloakDetection", 761466913);
        setIntField(term468480, term468480.getClass(), "cloaking", 1025254415);
        setIntField(term468480, term468480.getClass(), "defenseValue", -1179135307);
        setIntField(term468480, term468480.getClass(), "baySize", -706418583);
        setIntField(term468480, term468480.getClass(), "damage", -1861491170);
        setIntField(term468480, term468480.getClass(), "weaponRange", 1307613446);
        setIntField(term468480, term468480.getClass(), "initiativeBoost", -1321035168);
        setIntField(term468480, term468480.getClass(), "cultureBonus", 1558927173);
        setIntField(term468480, term468480.getClass(), "creditBonus", -1134124022);
        setIntField(term468480, term468480.getClass(), "researchBonus", -734162613);
        setIntField(term468480, term468480.getClass(), "espionageBonus", 2087704854);
        setIntField(term468480, term468480.getClass(), "fleetCapacityBonus", 2085374508);
        setIntField(term468480, term468480.getClass(), "hitBonus", 323643925);
        term468535 = new Integer(2084863202);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term468535;
        callMethod(klass, "setFtlSpeed", argTypes, term468480, args);
    }

};



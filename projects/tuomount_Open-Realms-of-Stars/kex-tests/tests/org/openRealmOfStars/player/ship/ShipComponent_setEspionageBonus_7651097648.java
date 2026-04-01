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

public class ShipComponent_setEspionageBonus_7651097648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term479834;
     Object term479891;

    public ShipComponent_setEspionageBonus_7651097648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term479894 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term479893 = ((Class) term479894).getDeclaredField((String) "WEAPON_ECM_TORPEDO");
        ((Field) term479893).setAccessible(true);
        Object enum1520 = ((Field) term479893).get((Object) null);
        term479834 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term479834, term479834.getClass(), "index", -309241845);
        setField(term479834, term479834.getClass(), "type", enum1520);
        setIntField(term479834, term479834.getClass(), "cost", -510075480);
        setIntField(term479834, term479834.getClass(), "metalCost", 2108016352);
        setField(term479834, term479834.getClass(), "name", "KVoVHbYxpz");
        setIntField(term479834, term479834.getClass(), "energyRequirement", 1369643206);
        setIntField(term479834, term479834.getClass(), "energyResource", -1289723150);
        setIntField(term479834, term479834.getClass(), "ftlSpeed", 1642362629);
        setIntField(term479834, term479834.getClass(), "speed", -979192435);
        setIntField(term479834, term479834.getClass(), "tacticSpeed", -1921424551);
        setIntField(term479834, term479834.getClass(), "scannerRange", 101983151);
        setIntField(term479834, term479834.getClass(), "cloakDetection", -8336587);
        setIntField(term479834, term479834.getClass(), "cloaking", 1463010893);
        setIntField(term479834, term479834.getClass(), "defenseValue", -1452316637);
        setIntField(term479834, term479834.getClass(), "baySize", -838298764);
        setIntField(term479834, term479834.getClass(), "damage", 953497835);
        setIntField(term479834, term479834.getClass(), "weaponRange", -1249269926);
        setIntField(term479834, term479834.getClass(), "initiativeBoost", -1389133666);
        setIntField(term479834, term479834.getClass(), "cultureBonus", 308996006);
        setIntField(term479834, term479834.getClass(), "creditBonus", 1161088046);
        setIntField(term479834, term479834.getClass(), "researchBonus", 960018546);
        setIntField(term479834, term479834.getClass(), "espionageBonus", -2118429819);
        setIntField(term479834, term479834.getClass(), "fleetCapacityBonus", -2005706286);
        setIntField(term479834, term479834.getClass(), "hitBonus", -556951238);
        term479891 = new Integer(-1728342547);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term479891;
        callMethod(klass, "setEspionageBonus", argTypes, term479834, args);
    }

};



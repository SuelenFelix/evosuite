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

public class ShipComponent_setTacticSpeed_106464134920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term469952;
     Object term469997;

    public ShipComponent_setTacticSpeed_106464134920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term470000 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term469999 = ((Class) term470000).getDeclaredField((String) "ENGINE");
        ((Field) term469999).setAccessible(true);
        Object enum1492 = ((Field) term469999).get((Object) null);
        term469952 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term469952, term469952.getClass(), "index", -1778062754);
        setField(term469952, term469952.getClass(), "type", enum1492);
        setIntField(term469952, term469952.getClass(), "cost", 656886359);
        setIntField(term469952, term469952.getClass(), "metalCost", -1737586602);
        setField(term469952, term469952.getClass(), "name", "SvwgIBVhCT");
        setIntField(term469952, term469952.getClass(), "energyRequirement", -11215244);
        setIntField(term469952, term469952.getClass(), "energyResource", -256225420);
        setIntField(term469952, term469952.getClass(), "ftlSpeed", 42031743);
        setIntField(term469952, term469952.getClass(), "speed", 1933411977);
        setIntField(term469952, term469952.getClass(), "tacticSpeed", 1568448645);
        setIntField(term469952, term469952.getClass(), "scannerRange", 784553974);
        setIntField(term469952, term469952.getClass(), "cloakDetection", -595519675);
        setIntField(term469952, term469952.getClass(), "cloaking", -2047451359);
        setIntField(term469952, term469952.getClass(), "defenseValue", 460067592);
        setIntField(term469952, term469952.getClass(), "baySize", 2077115892);
        setIntField(term469952, term469952.getClass(), "damage", -1419433911);
        setIntField(term469952, term469952.getClass(), "weaponRange", 1822969869);
        setIntField(term469952, term469952.getClass(), "initiativeBoost", -1408911173);
        setIntField(term469952, term469952.getClass(), "cultureBonus", -1658565244);
        setIntField(term469952, term469952.getClass(), "creditBonus", 222302842);
        setIntField(term469952, term469952.getClass(), "researchBonus", -1879308935);
        setIntField(term469952, term469952.getClass(), "espionageBonus", 1433334366);
        setIntField(term469952, term469952.getClass(), "fleetCapacityBonus", 1570982083);
        setIntField(term469952, term469952.getClass(), "hitBonus", 79001036);
        term469997 = new Integer(-2128177291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term469997;
        callMethod(klass, "setTacticSpeed", argTypes, term469952, args);
    }

};



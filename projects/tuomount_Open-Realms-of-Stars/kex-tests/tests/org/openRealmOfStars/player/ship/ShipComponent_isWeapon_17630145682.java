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

public class ShipComponent_isWeapon_17630145682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term463436;

    public ShipComponent_isWeapon_17630145682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term463493 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term463492 = ((Class) term463493).getDeclaredField((String) "DISTORTION_SHIELD");
        ((Field) term463492).setAccessible(true);
        Object enum1474 = ((Field) term463492).get((Object) null);
        term463436 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term463436, term463436.getClass(), "index", 1634229231);
        setField(term463436, term463436.getClass(), "type", enum1474);
        setIntField(term463436, term463436.getClass(), "cost", 91169479);
        setIntField(term463436, term463436.getClass(), "metalCost", 214492019);
        setField(term463436, term463436.getClass(), "name", "kxPWFZqtzn");
        setIntField(term463436, term463436.getClass(), "energyRequirement", -357230273);
        setIntField(term463436, term463436.getClass(), "energyResource", -537888142);
        setIntField(term463436, term463436.getClass(), "ftlSpeed", -1600863169);
        setIntField(term463436, term463436.getClass(), "speed", -151268707);
        setIntField(term463436, term463436.getClass(), "tacticSpeed", 687322930);
        setIntField(term463436, term463436.getClass(), "scannerRange", -1091459660);
        setIntField(term463436, term463436.getClass(), "cloakDetection", -729567674);
        setIntField(term463436, term463436.getClass(), "cloaking", -1285026670);
        setIntField(term463436, term463436.getClass(), "defenseValue", -1081713412);
        setIntField(term463436, term463436.getClass(), "baySize", -698893307);
        setIntField(term463436, term463436.getClass(), "damage", -198530739);
        setIntField(term463436, term463436.getClass(), "weaponRange", -820225259);
        setIntField(term463436, term463436.getClass(), "initiativeBoost", -1310113307);
        setIntField(term463436, term463436.getClass(), "cultureBonus", 1548923560);
        setIntField(term463436, term463436.getClass(), "creditBonus", -624904888);
        setIntField(term463436, term463436.getClass(), "researchBonus", -2104329060);
        setIntField(term463436, term463436.getClass(), "espionageBonus", 69884134);
        setIntField(term463436, term463436.getClass(), "fleetCapacityBonus", 1238870233);
        setIntField(term463436, term463436.getClass(), "hitBonus", -1384138147);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isWeapon", argTypes, term463436, args);
    }

};



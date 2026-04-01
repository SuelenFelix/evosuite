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

public class ShipComponent_getIndex_19730015986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term464884;

    public ShipComponent_getIndex_19730015986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term464943 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term464942 = ((Class) term464943).getDeclaredField((String) "PRIVATEERING_MODULE");
        ((Field) term464942).setAccessible(true);
        Object enum1478 = ((Field) term464942).get((Object) null);
        term464884 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term464884, term464884.getClass(), "index", 2093909511);
        setField(term464884, term464884.getClass(), "type", enum1478);
        setIntField(term464884, term464884.getClass(), "cost", -1440780852);
        setIntField(term464884, term464884.getClass(), "metalCost", -256492547);
        setField(term464884, term464884.getClass(), "name", "nvviywbFNL");
        setIntField(term464884, term464884.getClass(), "energyRequirement", -1893302330);
        setIntField(term464884, term464884.getClass(), "energyResource", 1177746134);
        setIntField(term464884, term464884.getClass(), "ftlSpeed", 1076828616);
        setIntField(term464884, term464884.getClass(), "speed", -621733040);
        setIntField(term464884, term464884.getClass(), "tacticSpeed", -1031608080);
        setIntField(term464884, term464884.getClass(), "scannerRange", -1516023185);
        setIntField(term464884, term464884.getClass(), "cloakDetection", -1813690212);
        setIntField(term464884, term464884.getClass(), "cloaking", 1577352938);
        setIntField(term464884, term464884.getClass(), "defenseValue", 1745100327);
        setIntField(term464884, term464884.getClass(), "baySize", 1136069052);
        setIntField(term464884, term464884.getClass(), "damage", -733793514);
        setIntField(term464884, term464884.getClass(), "weaponRange", -1188742010);
        setIntField(term464884, term464884.getClass(), "initiativeBoost", -143261890);
        setIntField(term464884, term464884.getClass(), "cultureBonus", -20933455);
        setIntField(term464884, term464884.getClass(), "creditBonus", -1448787013);
        setIntField(term464884, term464884.getClass(), "researchBonus", -998901659);
        setIntField(term464884, term464884.getClass(), "espionageBonus", -1128990548);
        setIntField(term464884, term464884.getClass(), "fleetCapacityBonus", -1878697260);
        setIntField(term464884, term464884.getClass(), "hitBonus", 489173758);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIndex", argTypes, term464884, args);
    }

};



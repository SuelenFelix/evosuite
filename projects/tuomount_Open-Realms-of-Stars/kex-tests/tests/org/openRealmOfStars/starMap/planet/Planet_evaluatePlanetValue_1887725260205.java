package org.openRealmOfStars.starMap.planet;

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
import static org.openRealmOfStars.starMap.planet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Planet_evaluatePlanetValue_1887725260205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2875612;
     Object term2875626;

    public Planet_evaluatePlanetValue_1887725260205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2875612 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2875612, term2875612.getClass(), "name", null);
        setIntField(term2875612, term2875612.getClass(), "orderNumber", 0);
        setField(term2875612, term2875612.getClass(), "radiationType", null);
        setField(term2875612, term2875612.getClass(), "gravityType", null);
        setField(term2875612, term2875612.getClass(), "temperatureType", null);
        setField(term2875612, term2875612.getClass(), "waterLevel", null);
        setBooleanField(term2875612, term2875612.getClass(), "gasGiant", false);
        setField(term2875612, term2875612.getClass(), "coordinate", null);
        setField(term2875612, term2875612.getClass(), "planetType", null);
        setIntField(term2875612, term2875612.getClass(), "groundSize", 0);
        setIntField(term2875612, term2875612.getClass(), "amountMetalInGround", 0);
        setIntField(term2875612, term2875612.getClass(), "metal", 0);
        setIntField(term2875612, term2875612.getClass(), "prodResource", 0);
        setIntField(term2875612, term2875612.getClass(), "extraFood", 0);
        setIntField(term2875612, term2875612.getClass(), "culture", 0);
        setIntField(term2875612, term2875612.getClass(), "planetOwner", 0);
        setField(term2875612, term2875612.getClass(), "planetOwnerInfo", null);
        setField(term2875612, term2875612.getClass(), "homeWorldId", null);
        setIntField(term2875612, term2875612.getClass(), "startRealmIndex", 0);
        setIntField(term2875612, term2875612.getClass(), "tax", 0);
        setField(term2875612, term2875612.getClass(), "statuses", null);
        setField(term2875612, term2875612.getClass(), "timedStatuses", null);
        setField(term2875612, term2875612.getClass(), "event", null);
        setBooleanField(term2875612, term2875612.getClass(), "eventFound", false);
        setField(term2875612, term2875612.getClass(), "happinessEffect", null);
        setField(term2875612, term2875612.getClass(), "happinessExplanation", null);
        setField(term2875612, term2875612.getClass(), "farmProdExplain", null);
        setField(term2875612, term2875612.getClass(), "metaProdExplain", null);
        setField(term2875612, term2875612.getClass(), "prodProdExplain", null);
        setField(term2875612, term2875612.getClass(), "reseProdExplain", null);
        setField(term2875612, term2875612.getClass(), "cultProdExplain", null);
        setField(term2875612, term2875612.getClass(), "credProdExplain", null);
        setField(term2875612, term2875612.getClass(), "governor", null);
        setIntField(term2875612, term2875612.getClass(), "governorGuide", 0);
        setField(term2875612, term2875612.getClass(), "orbital", null);
        setField(term2875612, term2875612.getClass(), "workers", null);
        setField(term2875612, term2875612.getClass(), "buildings", null);
        setField(term2875612, term2875612.getClass(), "underConstruction", null);
        term2875626 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term2875626;
        callMethod(klass, "evaluatePlanetValue", argTypes, term2875612, args);
    }

};



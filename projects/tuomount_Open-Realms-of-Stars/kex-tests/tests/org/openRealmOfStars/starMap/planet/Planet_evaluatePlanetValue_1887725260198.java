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

public class Planet_evaluatePlanetValue_1887725260198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term841183;
     Object term841197;

    public Planet_evaluatePlanetValue_1887725260198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term841183 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term841183, term841183.getClass(), "name", null);
        setIntField(term841183, term841183.getClass(), "orderNumber", 0);
        setField(term841183, term841183.getClass(), "radiationType", null);
        setField(term841183, term841183.getClass(), "gravityType", null);
        setField(term841183, term841183.getClass(), "temperatureType", null);
        setField(term841183, term841183.getClass(), "waterLevel", null);
        setBooleanField(term841183, term841183.getClass(), "gasGiant", false);
        setField(term841183, term841183.getClass(), "coordinate", null);
        setField(term841183, term841183.getClass(), "planetType", null);
        setIntField(term841183, term841183.getClass(), "groundSize", 0);
        setIntField(term841183, term841183.getClass(), "amountMetalInGround", 0);
        setIntField(term841183, term841183.getClass(), "metal", 0);
        setIntField(term841183, term841183.getClass(), "prodResource", 0);
        setIntField(term841183, term841183.getClass(), "extraFood", 0);
        setIntField(term841183, term841183.getClass(), "culture", 0);
        setIntField(term841183, term841183.getClass(), "planetOwner", 0);
        setField(term841183, term841183.getClass(), "planetOwnerInfo", null);
        setField(term841183, term841183.getClass(), "homeWorldId", null);
        setIntField(term841183, term841183.getClass(), "startRealmIndex", 0);
        setIntField(term841183, term841183.getClass(), "tax", 0);
        setField(term841183, term841183.getClass(), "statuses", null);
        setField(term841183, term841183.getClass(), "timedStatuses", null);
        setField(term841183, term841183.getClass(), "event", null);
        setBooleanField(term841183, term841183.getClass(), "eventFound", false);
        setField(term841183, term841183.getClass(), "happinessEffect", null);
        setField(term841183, term841183.getClass(), "happinessExplanation", null);
        setField(term841183, term841183.getClass(), "farmProdExplain", null);
        setField(term841183, term841183.getClass(), "metaProdExplain", null);
        setField(term841183, term841183.getClass(), "prodProdExplain", null);
        setField(term841183, term841183.getClass(), "reseProdExplain", null);
        setField(term841183, term841183.getClass(), "cultProdExplain", null);
        setField(term841183, term841183.getClass(), "credProdExplain", null);
        setField(term841183, term841183.getClass(), "governor", null);
        setIntField(term841183, term841183.getClass(), "governorGuide", 0);
        setField(term841183, term841183.getClass(), "orbital", null);
        setField(term841183, term841183.getClass(), "workers", null);
        setField(term841183, term841183.getClass(), "buildings", null);
        setField(term841183, term841183.getClass(), "underConstruction", null);
        term841197 = new Integer(0);
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
        args[2] = term841197;
        callMethod(klass, "evaluatePlanetValue", argTypes, term841183, args);
    }

};



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

public class Planet_updatePlanetFoodForOneTurn_1139554089143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term605137;

    public Planet_updatePlanetFoodForOneTurn_1139554089143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term605137 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term605137, term605137.getClass(), "name", null);
        setIntField(term605137, term605137.getClass(), "orderNumber", 0);
        setField(term605137, term605137.getClass(), "radiationType", null);
        setField(term605137, term605137.getClass(), "gravityType", null);
        setField(term605137, term605137.getClass(), "temperatureType", null);
        setField(term605137, term605137.getClass(), "waterLevel", null);
        setBooleanField(term605137, term605137.getClass(), "gasGiant", false);
        setField(term605137, term605137.getClass(), "coordinate", null);
        setField(term605137, term605137.getClass(), "planetType", null);
        setIntField(term605137, term605137.getClass(), "groundSize", 0);
        setIntField(term605137, term605137.getClass(), "amountMetalInGround", 0);
        setIntField(term605137, term605137.getClass(), "metal", 0);
        setIntField(term605137, term605137.getClass(), "prodResource", 0);
        setIntField(term605137, term605137.getClass(), "extraFood", 0);
        setIntField(term605137, term605137.getClass(), "culture", 0);
        setIntField(term605137, term605137.getClass(), "planetOwner", 0);
        setField(term605137, term605137.getClass(), "planetOwnerInfo", null);
        setField(term605137, term605137.getClass(), "homeWorldId", null);
        setIntField(term605137, term605137.getClass(), "startRealmIndex", 0);
        setIntField(term605137, term605137.getClass(), "tax", 0);
        setField(term605137, term605137.getClass(), "statuses", null);
        setField(term605137, term605137.getClass(), "timedStatuses", null);
        setField(term605137, term605137.getClass(), "event", null);
        setBooleanField(term605137, term605137.getClass(), "eventFound", false);
        setField(term605137, term605137.getClass(), "happinessEffect", null);
        setField(term605137, term605137.getClass(), "happinessExplanation", null);
        setField(term605137, term605137.getClass(), "farmProdExplain", null);
        setField(term605137, term605137.getClass(), "metaProdExplain", null);
        setField(term605137, term605137.getClass(), "prodProdExplain", null);
        setField(term605137, term605137.getClass(), "reseProdExplain", null);
        setField(term605137, term605137.getClass(), "cultProdExplain", null);
        setField(term605137, term605137.getClass(), "credProdExplain", null);
        setField(term605137, term605137.getClass(), "governor", null);
        setIntField(term605137, term605137.getClass(), "governorGuide", 0);
        setField(term605137, term605137.getClass(), "orbital", null);
        setField(term605137, term605137.getClass(), "workers", null);
        setField(term605137, term605137.getClass(), "buildings", null);
        setField(term605137, term605137.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "updatePlanetFoodForOneTurn", argTypes, term605137, args);
    }

};



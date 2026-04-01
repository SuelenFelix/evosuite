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

public class Planet_updatePlanetFoodForOneTurn_1139554089151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2644246;

    public Planet_updatePlanetFoodForOneTurn_1139554089151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2644246 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2644246, term2644246.getClass(), "name", null);
        setIntField(term2644246, term2644246.getClass(), "orderNumber", 0);
        setField(term2644246, term2644246.getClass(), "radiationType", null);
        setField(term2644246, term2644246.getClass(), "gravityType", null);
        setField(term2644246, term2644246.getClass(), "temperatureType", null);
        setField(term2644246, term2644246.getClass(), "waterLevel", null);
        setBooleanField(term2644246, term2644246.getClass(), "gasGiant", false);
        setField(term2644246, term2644246.getClass(), "coordinate", null);
        setField(term2644246, term2644246.getClass(), "planetType", null);
        setIntField(term2644246, term2644246.getClass(), "groundSize", 0);
        setIntField(term2644246, term2644246.getClass(), "amountMetalInGround", 0);
        setIntField(term2644246, term2644246.getClass(), "metal", 0);
        setIntField(term2644246, term2644246.getClass(), "prodResource", 0);
        setIntField(term2644246, term2644246.getClass(), "extraFood", 0);
        setIntField(term2644246, term2644246.getClass(), "culture", 0);
        setIntField(term2644246, term2644246.getClass(), "planetOwner", 0);
        setField(term2644246, term2644246.getClass(), "planetOwnerInfo", null);
        setField(term2644246, term2644246.getClass(), "homeWorldId", null);
        setIntField(term2644246, term2644246.getClass(), "startRealmIndex", 0);
        setIntField(term2644246, term2644246.getClass(), "tax", 0);
        setField(term2644246, term2644246.getClass(), "statuses", null);
        setField(term2644246, term2644246.getClass(), "timedStatuses", null);
        setField(term2644246, term2644246.getClass(), "event", null);
        setBooleanField(term2644246, term2644246.getClass(), "eventFound", false);
        setField(term2644246, term2644246.getClass(), "happinessEffect", null);
        setField(term2644246, term2644246.getClass(), "happinessExplanation", null);
        setField(term2644246, term2644246.getClass(), "farmProdExplain", null);
        setField(term2644246, term2644246.getClass(), "metaProdExplain", null);
        setField(term2644246, term2644246.getClass(), "prodProdExplain", null);
        setField(term2644246, term2644246.getClass(), "reseProdExplain", null);
        setField(term2644246, term2644246.getClass(), "cultProdExplain", null);
        setField(term2644246, term2644246.getClass(), "credProdExplain", null);
        setField(term2644246, term2644246.getClass(), "governor", null);
        setIntField(term2644246, term2644246.getClass(), "governorGuide", 0);
        setField(term2644246, term2644246.getClass(), "orbital", null);
        setField(term2644246, term2644246.getClass(), "workers", null);
        setField(term2644246, term2644246.getClass(), "buildings", null);
        setField(term2644246, term2644246.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "updatePlanetFoodForOneTurn", argTypes, term2644246, args);
    }

};



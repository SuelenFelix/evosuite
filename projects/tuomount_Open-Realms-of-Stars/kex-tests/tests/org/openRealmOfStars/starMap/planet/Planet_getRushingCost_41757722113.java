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

public class Planet_getRushingCost_41757722113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75923;

    public Planet_getRushingCost_41757722113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75923 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term75923, term75923.getClass(), "name", null);
        setIntField(term75923, term75923.getClass(), "orderNumber", 0);
        setField(term75923, term75923.getClass(), "radiationType", null);
        setField(term75923, term75923.getClass(), "gravityType", null);
        setField(term75923, term75923.getClass(), "temperatureType", null);
        setField(term75923, term75923.getClass(), "waterLevel", null);
        setBooleanField(term75923, term75923.getClass(), "gasGiant", false);
        setField(term75923, term75923.getClass(), "coordinate", null);
        setField(term75923, term75923.getClass(), "planetType", null);
        setIntField(term75923, term75923.getClass(), "groundSize", 0);
        setIntField(term75923, term75923.getClass(), "amountMetalInGround", 0);
        setIntField(term75923, term75923.getClass(), "metal", 0);
        setIntField(term75923, term75923.getClass(), "prodResource", 0);
        setIntField(term75923, term75923.getClass(), "extraFood", 0);
        setIntField(term75923, term75923.getClass(), "culture", 0);
        setIntField(term75923, term75923.getClass(), "planetOwner", 0);
        setField(term75923, term75923.getClass(), "planetOwnerInfo", null);
        setField(term75923, term75923.getClass(), "homeWorldId", null);
        setIntField(term75923, term75923.getClass(), "startRealmIndex", 0);
        setIntField(term75923, term75923.getClass(), "tax", 0);
        setField(term75923, term75923.getClass(), "statuses", null);
        setField(term75923, term75923.getClass(), "timedStatuses", null);
        setField(term75923, term75923.getClass(), "event", null);
        setBooleanField(term75923, term75923.getClass(), "eventFound", false);
        setField(term75923, term75923.getClass(), "happinessEffect", null);
        setField(term75923, term75923.getClass(), "happinessExplanation", null);
        setField(term75923, term75923.getClass(), "farmProdExplain", null);
        setField(term75923, term75923.getClass(), "metaProdExplain", null);
        setField(term75923, term75923.getClass(), "prodProdExplain", null);
        setField(term75923, term75923.getClass(), "reseProdExplain", null);
        setField(term75923, term75923.getClass(), "cultProdExplain", null);
        setField(term75923, term75923.getClass(), "credProdExplain", null);
        setField(term75923, term75923.getClass(), "governor", null);
        setIntField(term75923, term75923.getClass(), "governorGuide", 0);
        setField(term75923, term75923.getClass(), "orbital", null);
        setField(term75923, term75923.getClass(), "workers", null);
        setField(term75923, term75923.getClass(), "buildings", null);
        setField(term75923, term75923.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.construction.Construction");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getRushingCost", argTypes, term75923, args);
    }

};



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

public class Planet_getProductionTime_206194545010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61274;

    public Planet_getProductionTime_206194545010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61274 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term61274, term61274.getClass(), "name", null);
        setIntField(term61274, term61274.getClass(), "orderNumber", 0);
        setField(term61274, term61274.getClass(), "radiationType", null);
        setField(term61274, term61274.getClass(), "gravityType", null);
        setField(term61274, term61274.getClass(), "temperatureType", null);
        setField(term61274, term61274.getClass(), "waterLevel", null);
        setBooleanField(term61274, term61274.getClass(), "gasGiant", false);
        setField(term61274, term61274.getClass(), "coordinate", null);
        setField(term61274, term61274.getClass(), "planetType", null);
        setIntField(term61274, term61274.getClass(), "groundSize", 0);
        setIntField(term61274, term61274.getClass(), "amountMetalInGround", 0);
        setIntField(term61274, term61274.getClass(), "metal", 0);
        setIntField(term61274, term61274.getClass(), "prodResource", 0);
        setIntField(term61274, term61274.getClass(), "extraFood", 0);
        setIntField(term61274, term61274.getClass(), "culture", 0);
        setIntField(term61274, term61274.getClass(), "planetOwner", 0);
        setField(term61274, term61274.getClass(), "planetOwnerInfo", null);
        setField(term61274, term61274.getClass(), "homeWorldId", null);
        setIntField(term61274, term61274.getClass(), "startRealmIndex", 0);
        setIntField(term61274, term61274.getClass(), "tax", 0);
        setField(term61274, term61274.getClass(), "statuses", null);
        setField(term61274, term61274.getClass(), "timedStatuses", null);
        setField(term61274, term61274.getClass(), "event", null);
        setBooleanField(term61274, term61274.getClass(), "eventFound", false);
        setField(term61274, term61274.getClass(), "happinessEffect", null);
        setField(term61274, term61274.getClass(), "happinessExplanation", null);
        setField(term61274, term61274.getClass(), "farmProdExplain", null);
        setField(term61274, term61274.getClass(), "metaProdExplain", null);
        setField(term61274, term61274.getClass(), "prodProdExplain", null);
        setField(term61274, term61274.getClass(), "reseProdExplain", null);
        setField(term61274, term61274.getClass(), "cultProdExplain", null);
        setField(term61274, term61274.getClass(), "credProdExplain", null);
        setField(term61274, term61274.getClass(), "governor", null);
        setIntField(term61274, term61274.getClass(), "governorGuide", 0);
        setField(term61274, term61274.getClass(), "orbital", null);
        setField(term61274, term61274.getClass(), "workers", null);
        setField(term61274, term61274.getClass(), "buildings", null);
        setField(term61274, term61274.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.construction.Construction");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getProductionTime", argTypes, term61274, args);
    }

};



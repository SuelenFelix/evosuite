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

public class Planet_bombOneBuilding_275075412202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2854755;

    public Planet_bombOneBuilding_275075412202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2854755 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2854755, term2854755.getClass(), "name", null);
        setIntField(term2854755, term2854755.getClass(), "orderNumber", 0);
        setField(term2854755, term2854755.getClass(), "radiationType", null);
        setField(term2854755, term2854755.getClass(), "gravityType", null);
        setField(term2854755, term2854755.getClass(), "temperatureType", null);
        setField(term2854755, term2854755.getClass(), "waterLevel", null);
        setBooleanField(term2854755, term2854755.getClass(), "gasGiant", false);
        setField(term2854755, term2854755.getClass(), "coordinate", null);
        setField(term2854755, term2854755.getClass(), "planetType", null);
        setIntField(term2854755, term2854755.getClass(), "groundSize", 0);
        setIntField(term2854755, term2854755.getClass(), "amountMetalInGround", 0);
        setIntField(term2854755, term2854755.getClass(), "metal", 0);
        setIntField(term2854755, term2854755.getClass(), "prodResource", 0);
        setIntField(term2854755, term2854755.getClass(), "extraFood", 0);
        setIntField(term2854755, term2854755.getClass(), "culture", 0);
        setIntField(term2854755, term2854755.getClass(), "planetOwner", 0);
        setField(term2854755, term2854755.getClass(), "planetOwnerInfo", null);
        setField(term2854755, term2854755.getClass(), "homeWorldId", null);
        setIntField(term2854755, term2854755.getClass(), "startRealmIndex", 0);
        setIntField(term2854755, term2854755.getClass(), "tax", 0);
        setField(term2854755, term2854755.getClass(), "statuses", null);
        setField(term2854755, term2854755.getClass(), "timedStatuses", null);
        setField(term2854755, term2854755.getClass(), "event", null);
        setBooleanField(term2854755, term2854755.getClass(), "eventFound", false);
        setField(term2854755, term2854755.getClass(), "happinessEffect", null);
        setField(term2854755, term2854755.getClass(), "happinessExplanation", null);
        setField(term2854755, term2854755.getClass(), "farmProdExplain", null);
        setField(term2854755, term2854755.getClass(), "metaProdExplain", null);
        setField(term2854755, term2854755.getClass(), "prodProdExplain", null);
        setField(term2854755, term2854755.getClass(), "reseProdExplain", null);
        setField(term2854755, term2854755.getClass(), "cultProdExplain", null);
        setField(term2854755, term2854755.getClass(), "credProdExplain", null);
        setField(term2854755, term2854755.getClass(), "governor", null);
        setIntField(term2854755, term2854755.getClass(), "governorGuide", 0);
        setField(term2854755, term2854755.getClass(), "orbital", null);
        setField(term2854755, term2854755.getClass(), "workers", null);
        setField(term2854755, term2854755.getClass(), "buildings", null);
        setField(term2854755, term2854755.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "bombOneBuilding", argTypes, term2854755, args);
    }

};



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

public class Planet_addBuilding_9505300162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24970;

    public Planet_addBuilding_9505300162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24970 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term24970, term24970.getClass(), "name", null);
        setIntField(term24970, term24970.getClass(), "orderNumber", 0);
        setField(term24970, term24970.getClass(), "radiationType", null);
        setField(term24970, term24970.getClass(), "gravityType", null);
        setField(term24970, term24970.getClass(), "temperatureType", null);
        setField(term24970, term24970.getClass(), "waterLevel", null);
        setBooleanField(term24970, term24970.getClass(), "gasGiant", false);
        setField(term24970, term24970.getClass(), "coordinate", null);
        setField(term24970, term24970.getClass(), "planetType", null);
        setIntField(term24970, term24970.getClass(), "groundSize", 0);
        setIntField(term24970, term24970.getClass(), "amountMetalInGround", 0);
        setIntField(term24970, term24970.getClass(), "metal", 0);
        setIntField(term24970, term24970.getClass(), "prodResource", 0);
        setIntField(term24970, term24970.getClass(), "extraFood", 0);
        setIntField(term24970, term24970.getClass(), "culture", 0);
        setIntField(term24970, term24970.getClass(), "planetOwner", 0);
        setField(term24970, term24970.getClass(), "planetOwnerInfo", null);
        setField(term24970, term24970.getClass(), "homeWorldId", null);
        setIntField(term24970, term24970.getClass(), "startRealmIndex", 0);
        setIntField(term24970, term24970.getClass(), "tax", 0);
        setField(term24970, term24970.getClass(), "statuses", null);
        setField(term24970, term24970.getClass(), "timedStatuses", null);
        setField(term24970, term24970.getClass(), "event", null);
        setBooleanField(term24970, term24970.getClass(), "eventFound", false);
        setField(term24970, term24970.getClass(), "happinessEffect", null);
        setField(term24970, term24970.getClass(), "happinessExplanation", null);
        setField(term24970, term24970.getClass(), "farmProdExplain", null);
        setField(term24970, term24970.getClass(), "metaProdExplain", null);
        setField(term24970, term24970.getClass(), "prodProdExplain", null);
        setField(term24970, term24970.getClass(), "reseProdExplain", null);
        setField(term24970, term24970.getClass(), "cultProdExplain", null);
        setField(term24970, term24970.getClass(), "credProdExplain", null);
        setField(term24970, term24970.getClass(), "governor", null);
        setIntField(term24970, term24970.getClass(), "governorGuide", 0);
        setField(term24970, term24970.getClass(), "orbital", null);
        setField(term24970, term24970.getClass(), "workers", null);
        setField(term24970, term24970.getClass(), "buildings", null);
        setField(term24970, term24970.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addBuilding", argTypes, term24970, args);
    }

};



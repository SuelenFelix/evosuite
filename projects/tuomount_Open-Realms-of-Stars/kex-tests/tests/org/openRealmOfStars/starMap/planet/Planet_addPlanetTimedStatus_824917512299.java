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

public class Planet_addPlanetTimedStatus_824917512299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3307385;
     Object term3307399;
     Object term3307401;

    public Planet_addPlanetTimedStatus_824917512299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3307385 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3307385, term3307385.getClass(), "name", null);
        setIntField(term3307385, term3307385.getClass(), "orderNumber", 0);
        setField(term3307385, term3307385.getClass(), "radiationType", null);
        setField(term3307385, term3307385.getClass(), "gravityType", null);
        setField(term3307385, term3307385.getClass(), "temperatureType", null);
        setField(term3307385, term3307385.getClass(), "waterLevel", null);
        setBooleanField(term3307385, term3307385.getClass(), "gasGiant", false);
        setField(term3307385, term3307385.getClass(), "coordinate", null);
        setField(term3307385, term3307385.getClass(), "planetType", null);
        setIntField(term3307385, term3307385.getClass(), "groundSize", 0);
        setIntField(term3307385, term3307385.getClass(), "amountMetalInGround", 0);
        setIntField(term3307385, term3307385.getClass(), "metal", 0);
        setIntField(term3307385, term3307385.getClass(), "prodResource", 0);
        setIntField(term3307385, term3307385.getClass(), "extraFood", 0);
        setIntField(term3307385, term3307385.getClass(), "culture", 0);
        setIntField(term3307385, term3307385.getClass(), "planetOwner", 0);
        setField(term3307385, term3307385.getClass(), "planetOwnerInfo", null);
        setField(term3307385, term3307385.getClass(), "homeWorldId", null);
        setIntField(term3307385, term3307385.getClass(), "startRealmIndex", 0);
        setIntField(term3307385, term3307385.getClass(), "tax", 0);
        setField(term3307385, term3307385.getClass(), "statuses", null);
        setField(term3307385, term3307385.getClass(), "timedStatuses", null);
        setField(term3307385, term3307385.getClass(), "event", null);
        setBooleanField(term3307385, term3307385.getClass(), "eventFound", false);
        setField(term3307385, term3307385.getClass(), "happinessEffect", null);
        setField(term3307385, term3307385.getClass(), "happinessExplanation", null);
        setField(term3307385, term3307385.getClass(), "farmProdExplain", null);
        setField(term3307385, term3307385.getClass(), "metaProdExplain", null);
        setField(term3307385, term3307385.getClass(), "prodProdExplain", null);
        setField(term3307385, term3307385.getClass(), "reseProdExplain", null);
        setField(term3307385, term3307385.getClass(), "cultProdExplain", null);
        setField(term3307385, term3307385.getClass(), "credProdExplain", null);
        setField(term3307385, term3307385.getClass(), "governor", null);
        setIntField(term3307385, term3307385.getClass(), "governorGuide", 0);
        setField(term3307385, term3307385.getClass(), "orbital", null);
        setField(term3307385, term3307385.getClass(), "workers", null);
        setField(term3307385, term3307385.getClass(), "buildings", null);
        setField(term3307385, term3307385.getClass(), "underConstruction", null);
        term3307399 = new Integer(0);
        term3307401 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term3307399;
        args[1] = term3307401;
        callMethod(klass, "addPlanetTimedStatus", argTypes, term3307385, args);
    }

};



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

public class Planet_addPlanetTimedStatus_824917512297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1261194;
     Object term1261208;
     Object term1261210;

    public Planet_addPlanetTimedStatus_824917512297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1261194 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term1261194, term1261194.getClass(), "name", null);
        setIntField(term1261194, term1261194.getClass(), "orderNumber", 0);
        setField(term1261194, term1261194.getClass(), "radiationType", null);
        setField(term1261194, term1261194.getClass(), "gravityType", null);
        setField(term1261194, term1261194.getClass(), "temperatureType", null);
        setField(term1261194, term1261194.getClass(), "waterLevel", null);
        setBooleanField(term1261194, term1261194.getClass(), "gasGiant", false);
        setField(term1261194, term1261194.getClass(), "coordinate", null);
        setField(term1261194, term1261194.getClass(), "planetType", null);
        setIntField(term1261194, term1261194.getClass(), "groundSize", 0);
        setIntField(term1261194, term1261194.getClass(), "amountMetalInGround", 0);
        setIntField(term1261194, term1261194.getClass(), "metal", 0);
        setIntField(term1261194, term1261194.getClass(), "prodResource", 0);
        setIntField(term1261194, term1261194.getClass(), "extraFood", 0);
        setIntField(term1261194, term1261194.getClass(), "culture", 0);
        setIntField(term1261194, term1261194.getClass(), "planetOwner", 0);
        setField(term1261194, term1261194.getClass(), "planetOwnerInfo", null);
        setField(term1261194, term1261194.getClass(), "homeWorldId", null);
        setIntField(term1261194, term1261194.getClass(), "startRealmIndex", 0);
        setIntField(term1261194, term1261194.getClass(), "tax", 0);
        setField(term1261194, term1261194.getClass(), "statuses", null);
        setField(term1261194, term1261194.getClass(), "timedStatuses", null);
        setField(term1261194, term1261194.getClass(), "event", null);
        setBooleanField(term1261194, term1261194.getClass(), "eventFound", false);
        setField(term1261194, term1261194.getClass(), "happinessEffect", null);
        setField(term1261194, term1261194.getClass(), "happinessExplanation", null);
        setField(term1261194, term1261194.getClass(), "farmProdExplain", null);
        setField(term1261194, term1261194.getClass(), "metaProdExplain", null);
        setField(term1261194, term1261194.getClass(), "prodProdExplain", null);
        setField(term1261194, term1261194.getClass(), "reseProdExplain", null);
        setField(term1261194, term1261194.getClass(), "cultProdExplain", null);
        setField(term1261194, term1261194.getClass(), "credProdExplain", null);
        setField(term1261194, term1261194.getClass(), "governor", null);
        setIntField(term1261194, term1261194.getClass(), "governorGuide", 0);
        setField(term1261194, term1261194.getClass(), "orbital", null);
        setField(term1261194, term1261194.getClass(), "workers", null);
        setField(term1261194, term1261194.getClass(), "buildings", null);
        setField(term1261194, term1261194.getClass(), "underConstruction", null);
        term1261208 = new Integer(0);
        term1261210 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1261208;
        args[1] = term1261210;
        callMethod(klass, "addPlanetTimedStatus", argTypes, term1261194, args);
    }

};



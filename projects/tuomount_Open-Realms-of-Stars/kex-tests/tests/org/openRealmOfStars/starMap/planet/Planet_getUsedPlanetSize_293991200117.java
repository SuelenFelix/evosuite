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

public class Planet_getUsedPlanetSize_293991200117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term495346;

    public Planet_getUsedPlanetSize_293991200117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term495346 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term495346, term495346.getClass(), "name", null);
        setIntField(term495346, term495346.getClass(), "orderNumber", 0);
        setField(term495346, term495346.getClass(), "radiationType", null);
        setField(term495346, term495346.getClass(), "gravityType", null);
        setField(term495346, term495346.getClass(), "temperatureType", null);
        setField(term495346, term495346.getClass(), "waterLevel", null);
        setBooleanField(term495346, term495346.getClass(), "gasGiant", false);
        setField(term495346, term495346.getClass(), "coordinate", null);
        setField(term495346, term495346.getClass(), "planetType", null);
        setIntField(term495346, term495346.getClass(), "groundSize", 0);
        setIntField(term495346, term495346.getClass(), "amountMetalInGround", 0);
        setIntField(term495346, term495346.getClass(), "metal", 0);
        setIntField(term495346, term495346.getClass(), "prodResource", 0);
        setIntField(term495346, term495346.getClass(), "extraFood", 0);
        setIntField(term495346, term495346.getClass(), "culture", 0);
        setIntField(term495346, term495346.getClass(), "planetOwner", 0);
        setField(term495346, term495346.getClass(), "planetOwnerInfo", null);
        setField(term495346, term495346.getClass(), "homeWorldId", null);
        setIntField(term495346, term495346.getClass(), "startRealmIndex", 0);
        setIntField(term495346, term495346.getClass(), "tax", 0);
        setField(term495346, term495346.getClass(), "statuses", null);
        setField(term495346, term495346.getClass(), "timedStatuses", null);
        setField(term495346, term495346.getClass(), "event", null);
        setBooleanField(term495346, term495346.getClass(), "eventFound", false);
        setField(term495346, term495346.getClass(), "happinessEffect", null);
        setField(term495346, term495346.getClass(), "happinessExplanation", null);
        setField(term495346, term495346.getClass(), "farmProdExplain", null);
        setField(term495346, term495346.getClass(), "metaProdExplain", null);
        setField(term495346, term495346.getClass(), "prodProdExplain", null);
        setField(term495346, term495346.getClass(), "reseProdExplain", null);
        setField(term495346, term495346.getClass(), "cultProdExplain", null);
        setField(term495346, term495346.getClass(), "credProdExplain", null);
        setField(term495346, term495346.getClass(), "governor", null);
        setIntField(term495346, term495346.getClass(), "governorGuide", 0);
        setField(term495346, term495346.getClass(), "orbital", null);
        setField(term495346, term495346.getClass(), "workers", null);
        setField(term495346, term495346.getClass(), "buildings", null);
        setField(term495346, term495346.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsedPlanetSize", argTypes, term495346, args);
    }

};



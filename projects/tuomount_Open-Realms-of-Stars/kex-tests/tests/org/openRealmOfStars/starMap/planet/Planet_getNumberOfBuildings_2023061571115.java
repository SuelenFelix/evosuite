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

public class Planet_getNumberOfBuildings_2023061571115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term487926;

    public Planet_getNumberOfBuildings_2023061571115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term487926 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term487926, term487926.getClass(), "name", null);
        setIntField(term487926, term487926.getClass(), "orderNumber", 0);
        setField(term487926, term487926.getClass(), "radiationType", null);
        setField(term487926, term487926.getClass(), "gravityType", null);
        setField(term487926, term487926.getClass(), "temperatureType", null);
        setField(term487926, term487926.getClass(), "waterLevel", null);
        setBooleanField(term487926, term487926.getClass(), "gasGiant", false);
        setField(term487926, term487926.getClass(), "coordinate", null);
        setField(term487926, term487926.getClass(), "planetType", null);
        setIntField(term487926, term487926.getClass(), "groundSize", 0);
        setIntField(term487926, term487926.getClass(), "amountMetalInGround", 0);
        setIntField(term487926, term487926.getClass(), "metal", 0);
        setIntField(term487926, term487926.getClass(), "prodResource", 0);
        setIntField(term487926, term487926.getClass(), "extraFood", 0);
        setIntField(term487926, term487926.getClass(), "culture", 0);
        setIntField(term487926, term487926.getClass(), "planetOwner", 0);
        setField(term487926, term487926.getClass(), "planetOwnerInfo", null);
        setField(term487926, term487926.getClass(), "homeWorldId", null);
        setIntField(term487926, term487926.getClass(), "startRealmIndex", 0);
        setIntField(term487926, term487926.getClass(), "tax", 0);
        setField(term487926, term487926.getClass(), "statuses", null);
        setField(term487926, term487926.getClass(), "timedStatuses", null);
        setField(term487926, term487926.getClass(), "event", null);
        setBooleanField(term487926, term487926.getClass(), "eventFound", false);
        setField(term487926, term487926.getClass(), "happinessEffect", null);
        setField(term487926, term487926.getClass(), "happinessExplanation", null);
        setField(term487926, term487926.getClass(), "farmProdExplain", null);
        setField(term487926, term487926.getClass(), "metaProdExplain", null);
        setField(term487926, term487926.getClass(), "prodProdExplain", null);
        setField(term487926, term487926.getClass(), "reseProdExplain", null);
        setField(term487926, term487926.getClass(), "cultProdExplain", null);
        setField(term487926, term487926.getClass(), "credProdExplain", null);
        setField(term487926, term487926.getClass(), "governor", null);
        setIntField(term487926, term487926.getClass(), "governorGuide", 0);
        setField(term487926, term487926.getClass(), "orbital", null);
        setField(term487926, term487926.getClass(), "workers", null);
        setField(term487926, term487926.getClass(), "buildings", null);
        setField(term487926, term487926.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNumberOfBuildings", argTypes, term487926, args);
    }

};



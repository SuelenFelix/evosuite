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

public class Planet_getNumberOfBuildings_2023061571122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2518900;

    public Planet_getNumberOfBuildings_2023061571122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2518900 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2518900, term2518900.getClass(), "name", null);
        setIntField(term2518900, term2518900.getClass(), "orderNumber", 0);
        setField(term2518900, term2518900.getClass(), "radiationType", null);
        setField(term2518900, term2518900.getClass(), "gravityType", null);
        setField(term2518900, term2518900.getClass(), "temperatureType", null);
        setField(term2518900, term2518900.getClass(), "waterLevel", null);
        setBooleanField(term2518900, term2518900.getClass(), "gasGiant", false);
        setField(term2518900, term2518900.getClass(), "coordinate", null);
        setField(term2518900, term2518900.getClass(), "planetType", null);
        setIntField(term2518900, term2518900.getClass(), "groundSize", 0);
        setIntField(term2518900, term2518900.getClass(), "amountMetalInGround", 0);
        setIntField(term2518900, term2518900.getClass(), "metal", 0);
        setIntField(term2518900, term2518900.getClass(), "prodResource", 0);
        setIntField(term2518900, term2518900.getClass(), "extraFood", 0);
        setIntField(term2518900, term2518900.getClass(), "culture", 0);
        setIntField(term2518900, term2518900.getClass(), "planetOwner", 0);
        setField(term2518900, term2518900.getClass(), "planetOwnerInfo", null);
        setField(term2518900, term2518900.getClass(), "homeWorldId", null);
        setIntField(term2518900, term2518900.getClass(), "startRealmIndex", 0);
        setIntField(term2518900, term2518900.getClass(), "tax", 0);
        setField(term2518900, term2518900.getClass(), "statuses", null);
        setField(term2518900, term2518900.getClass(), "timedStatuses", null);
        setField(term2518900, term2518900.getClass(), "event", null);
        setBooleanField(term2518900, term2518900.getClass(), "eventFound", false);
        setField(term2518900, term2518900.getClass(), "happinessEffect", null);
        setField(term2518900, term2518900.getClass(), "happinessExplanation", null);
        setField(term2518900, term2518900.getClass(), "farmProdExplain", null);
        setField(term2518900, term2518900.getClass(), "metaProdExplain", null);
        setField(term2518900, term2518900.getClass(), "prodProdExplain", null);
        setField(term2518900, term2518900.getClass(), "reseProdExplain", null);
        setField(term2518900, term2518900.getClass(), "cultProdExplain", null);
        setField(term2518900, term2518900.getClass(), "credProdExplain", null);
        setField(term2518900, term2518900.getClass(), "governor", null);
        setIntField(term2518900, term2518900.getClass(), "governorGuide", 0);
        setField(term2518900, term2518900.getClass(), "orbital", null);
        setField(term2518900, term2518900.getClass(), "workers", null);
        setField(term2518900, term2518900.getClass(), "buildings", null);
        setField(term2518900, term2518900.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNumberOfBuildings", argTypes, term2518900, args);
    }

};



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

public class Planet_removeBuilding_645735074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32619;

    public Planet_removeBuilding_645735074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32619 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term32619, term32619.getClass(), "name", null);
        setIntField(term32619, term32619.getClass(), "orderNumber", 0);
        setField(term32619, term32619.getClass(), "radiationType", null);
        setField(term32619, term32619.getClass(), "gravityType", null);
        setField(term32619, term32619.getClass(), "temperatureType", null);
        setField(term32619, term32619.getClass(), "waterLevel", null);
        setBooleanField(term32619, term32619.getClass(), "gasGiant", false);
        setField(term32619, term32619.getClass(), "coordinate", null);
        setField(term32619, term32619.getClass(), "planetType", null);
        setIntField(term32619, term32619.getClass(), "groundSize", 0);
        setIntField(term32619, term32619.getClass(), "amountMetalInGround", 0);
        setIntField(term32619, term32619.getClass(), "metal", 0);
        setIntField(term32619, term32619.getClass(), "prodResource", 0);
        setIntField(term32619, term32619.getClass(), "extraFood", 0);
        setIntField(term32619, term32619.getClass(), "culture", 0);
        setIntField(term32619, term32619.getClass(), "planetOwner", 0);
        setField(term32619, term32619.getClass(), "planetOwnerInfo", null);
        setField(term32619, term32619.getClass(), "homeWorldId", null);
        setIntField(term32619, term32619.getClass(), "startRealmIndex", 0);
        setIntField(term32619, term32619.getClass(), "tax", 0);
        setField(term32619, term32619.getClass(), "statuses", null);
        setField(term32619, term32619.getClass(), "timedStatuses", null);
        setField(term32619, term32619.getClass(), "event", null);
        setBooleanField(term32619, term32619.getClass(), "eventFound", false);
        setField(term32619, term32619.getClass(), "happinessEffect", null);
        setField(term32619, term32619.getClass(), "happinessExplanation", null);
        setField(term32619, term32619.getClass(), "farmProdExplain", null);
        setField(term32619, term32619.getClass(), "metaProdExplain", null);
        setField(term32619, term32619.getClass(), "prodProdExplain", null);
        setField(term32619, term32619.getClass(), "reseProdExplain", null);
        setField(term32619, term32619.getClass(), "cultProdExplain", null);
        setField(term32619, term32619.getClass(), "credProdExplain", null);
        setField(term32619, term32619.getClass(), "governor", null);
        setIntField(term32619, term32619.getClass(), "governorGuide", 0);
        setField(term32619, term32619.getClass(), "orbital", null);
        setField(term32619, term32619.getClass(), "workers", null);
        setField(term32619, term32619.getClass(), "buildings", null);
        setField(term32619, term32619.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.construction.Building");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "removeBuilding", argTypes, term32619, args);
    }

};



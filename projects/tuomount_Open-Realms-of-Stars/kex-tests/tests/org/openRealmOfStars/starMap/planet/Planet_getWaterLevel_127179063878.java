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

public class Planet_getWaterLevel_127179063878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2360475;

    public Planet_getWaterLevel_127179063878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2360475 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2360475, term2360475.getClass(), "name", null);
        setIntField(term2360475, term2360475.getClass(), "orderNumber", 0);
        setField(term2360475, term2360475.getClass(), "radiationType", null);
        setField(term2360475, term2360475.getClass(), "gravityType", null);
        setField(term2360475, term2360475.getClass(), "temperatureType", null);
        setField(term2360475, term2360475.getClass(), "waterLevel", null);
        setBooleanField(term2360475, term2360475.getClass(), "gasGiant", false);
        setField(term2360475, term2360475.getClass(), "coordinate", null);
        setField(term2360475, term2360475.getClass(), "planetType", null);
        setIntField(term2360475, term2360475.getClass(), "groundSize", 0);
        setIntField(term2360475, term2360475.getClass(), "amountMetalInGround", 0);
        setIntField(term2360475, term2360475.getClass(), "metal", 0);
        setIntField(term2360475, term2360475.getClass(), "prodResource", 0);
        setIntField(term2360475, term2360475.getClass(), "extraFood", 0);
        setIntField(term2360475, term2360475.getClass(), "culture", 0);
        setIntField(term2360475, term2360475.getClass(), "planetOwner", 0);
        setField(term2360475, term2360475.getClass(), "planetOwnerInfo", null);
        setField(term2360475, term2360475.getClass(), "homeWorldId", null);
        setIntField(term2360475, term2360475.getClass(), "startRealmIndex", 0);
        setIntField(term2360475, term2360475.getClass(), "tax", 0);
        setField(term2360475, term2360475.getClass(), "statuses", null);
        setField(term2360475, term2360475.getClass(), "timedStatuses", null);
        setField(term2360475, term2360475.getClass(), "event", null);
        setBooleanField(term2360475, term2360475.getClass(), "eventFound", false);
        setField(term2360475, term2360475.getClass(), "happinessEffect", null);
        setField(term2360475, term2360475.getClass(), "happinessExplanation", null);
        setField(term2360475, term2360475.getClass(), "farmProdExplain", null);
        setField(term2360475, term2360475.getClass(), "metaProdExplain", null);
        setField(term2360475, term2360475.getClass(), "prodProdExplain", null);
        setField(term2360475, term2360475.getClass(), "reseProdExplain", null);
        setField(term2360475, term2360475.getClass(), "cultProdExplain", null);
        setField(term2360475, term2360475.getClass(), "credProdExplain", null);
        setField(term2360475, term2360475.getClass(), "governor", null);
        setIntField(term2360475, term2360475.getClass(), "governorGuide", 0);
        setField(term2360475, term2360475.getClass(), "orbital", null);
        setField(term2360475, term2360475.getClass(), "workers", null);
        setField(term2360475, term2360475.getClass(), "buildings", null);
        setField(term2360475, term2360475.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWaterLevel", argTypes, term2360475, args);
    }

};



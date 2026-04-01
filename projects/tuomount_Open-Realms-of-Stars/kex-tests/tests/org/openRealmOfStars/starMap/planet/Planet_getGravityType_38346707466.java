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

public class Planet_getGravityType_38346707466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2314999;

    public Planet_getGravityType_38346707466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2314999 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2314999, term2314999.getClass(), "name", null);
        setIntField(term2314999, term2314999.getClass(), "orderNumber", 0);
        setField(term2314999, term2314999.getClass(), "radiationType", null);
        setField(term2314999, term2314999.getClass(), "gravityType", null);
        setField(term2314999, term2314999.getClass(), "temperatureType", null);
        setField(term2314999, term2314999.getClass(), "waterLevel", null);
        setBooleanField(term2314999, term2314999.getClass(), "gasGiant", false);
        setField(term2314999, term2314999.getClass(), "coordinate", null);
        setField(term2314999, term2314999.getClass(), "planetType", null);
        setIntField(term2314999, term2314999.getClass(), "groundSize", 0);
        setIntField(term2314999, term2314999.getClass(), "amountMetalInGround", 0);
        setIntField(term2314999, term2314999.getClass(), "metal", 0);
        setIntField(term2314999, term2314999.getClass(), "prodResource", 0);
        setIntField(term2314999, term2314999.getClass(), "extraFood", 0);
        setIntField(term2314999, term2314999.getClass(), "culture", 0);
        setIntField(term2314999, term2314999.getClass(), "planetOwner", 0);
        setField(term2314999, term2314999.getClass(), "planetOwnerInfo", null);
        setField(term2314999, term2314999.getClass(), "homeWorldId", null);
        setIntField(term2314999, term2314999.getClass(), "startRealmIndex", 0);
        setIntField(term2314999, term2314999.getClass(), "tax", 0);
        setField(term2314999, term2314999.getClass(), "statuses", null);
        setField(term2314999, term2314999.getClass(), "timedStatuses", null);
        setField(term2314999, term2314999.getClass(), "event", null);
        setBooleanField(term2314999, term2314999.getClass(), "eventFound", false);
        setField(term2314999, term2314999.getClass(), "happinessEffect", null);
        setField(term2314999, term2314999.getClass(), "happinessExplanation", null);
        setField(term2314999, term2314999.getClass(), "farmProdExplain", null);
        setField(term2314999, term2314999.getClass(), "metaProdExplain", null);
        setField(term2314999, term2314999.getClass(), "prodProdExplain", null);
        setField(term2314999, term2314999.getClass(), "reseProdExplain", null);
        setField(term2314999, term2314999.getClass(), "cultProdExplain", null);
        setField(term2314999, term2314999.getClass(), "credProdExplain", null);
        setField(term2314999, term2314999.getClass(), "governor", null);
        setIntField(term2314999, term2314999.getClass(), "governorGuide", 0);
        setField(term2314999, term2314999.getClass(), "orbital", null);
        setField(term2314999, term2314999.getClass(), "workers", null);
        setField(term2314999, term2314999.getClass(), "buildings", null);
        setField(term2314999, term2314999.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGravityType", argTypes, term2314999, args);
    }

};



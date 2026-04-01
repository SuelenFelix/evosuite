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

public class Planet_getGroundSize_61406305488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2395964;

    public Planet_getGroundSize_61406305488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2395964 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2395964, term2395964.getClass(), "name", null);
        setIntField(term2395964, term2395964.getClass(), "orderNumber", 0);
        setField(term2395964, term2395964.getClass(), "radiationType", null);
        setField(term2395964, term2395964.getClass(), "gravityType", null);
        setField(term2395964, term2395964.getClass(), "temperatureType", null);
        setField(term2395964, term2395964.getClass(), "waterLevel", null);
        setBooleanField(term2395964, term2395964.getClass(), "gasGiant", false);
        setField(term2395964, term2395964.getClass(), "coordinate", null);
        setField(term2395964, term2395964.getClass(), "planetType", null);
        setIntField(term2395964, term2395964.getClass(), "groundSize", 0);
        setIntField(term2395964, term2395964.getClass(), "amountMetalInGround", 0);
        setIntField(term2395964, term2395964.getClass(), "metal", 0);
        setIntField(term2395964, term2395964.getClass(), "prodResource", 0);
        setIntField(term2395964, term2395964.getClass(), "extraFood", 0);
        setIntField(term2395964, term2395964.getClass(), "culture", 0);
        setIntField(term2395964, term2395964.getClass(), "planetOwner", 0);
        setField(term2395964, term2395964.getClass(), "planetOwnerInfo", null);
        setField(term2395964, term2395964.getClass(), "homeWorldId", null);
        setIntField(term2395964, term2395964.getClass(), "startRealmIndex", 0);
        setIntField(term2395964, term2395964.getClass(), "tax", 0);
        setField(term2395964, term2395964.getClass(), "statuses", null);
        setField(term2395964, term2395964.getClass(), "timedStatuses", null);
        setField(term2395964, term2395964.getClass(), "event", null);
        setBooleanField(term2395964, term2395964.getClass(), "eventFound", false);
        setField(term2395964, term2395964.getClass(), "happinessEffect", null);
        setField(term2395964, term2395964.getClass(), "happinessExplanation", null);
        setField(term2395964, term2395964.getClass(), "farmProdExplain", null);
        setField(term2395964, term2395964.getClass(), "metaProdExplain", null);
        setField(term2395964, term2395964.getClass(), "prodProdExplain", null);
        setField(term2395964, term2395964.getClass(), "reseProdExplain", null);
        setField(term2395964, term2395964.getClass(), "cultProdExplain", null);
        setField(term2395964, term2395964.getClass(), "credProdExplain", null);
        setField(term2395964, term2395964.getClass(), "governor", null);
        setIntField(term2395964, term2395964.getClass(), "governorGuide", 0);
        setField(term2395964, term2395964.getClass(), "orbital", null);
        setField(term2395964, term2395964.getClass(), "workers", null);
        setField(term2395964, term2395964.getClass(), "buildings", null);
        setField(term2395964, term2395964.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGroundSize", argTypes, term2395964, args);
    }

};



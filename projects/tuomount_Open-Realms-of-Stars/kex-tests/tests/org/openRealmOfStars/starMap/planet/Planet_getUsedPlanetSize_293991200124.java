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

public class Planet_getUsedPlanetSize_293991200124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2526090;

    public Planet_getUsedPlanetSize_293991200124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2526090 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2526090, term2526090.getClass(), "name", null);
        setIntField(term2526090, term2526090.getClass(), "orderNumber", 0);
        setField(term2526090, term2526090.getClass(), "radiationType", null);
        setField(term2526090, term2526090.getClass(), "gravityType", null);
        setField(term2526090, term2526090.getClass(), "temperatureType", null);
        setField(term2526090, term2526090.getClass(), "waterLevel", null);
        setBooleanField(term2526090, term2526090.getClass(), "gasGiant", false);
        setField(term2526090, term2526090.getClass(), "coordinate", null);
        setField(term2526090, term2526090.getClass(), "planetType", null);
        setIntField(term2526090, term2526090.getClass(), "groundSize", 0);
        setIntField(term2526090, term2526090.getClass(), "amountMetalInGround", 0);
        setIntField(term2526090, term2526090.getClass(), "metal", 0);
        setIntField(term2526090, term2526090.getClass(), "prodResource", 0);
        setIntField(term2526090, term2526090.getClass(), "extraFood", 0);
        setIntField(term2526090, term2526090.getClass(), "culture", 0);
        setIntField(term2526090, term2526090.getClass(), "planetOwner", 0);
        setField(term2526090, term2526090.getClass(), "planetOwnerInfo", null);
        setField(term2526090, term2526090.getClass(), "homeWorldId", null);
        setIntField(term2526090, term2526090.getClass(), "startRealmIndex", 0);
        setIntField(term2526090, term2526090.getClass(), "tax", 0);
        setField(term2526090, term2526090.getClass(), "statuses", null);
        setField(term2526090, term2526090.getClass(), "timedStatuses", null);
        setField(term2526090, term2526090.getClass(), "event", null);
        setBooleanField(term2526090, term2526090.getClass(), "eventFound", false);
        setField(term2526090, term2526090.getClass(), "happinessEffect", null);
        setField(term2526090, term2526090.getClass(), "happinessExplanation", null);
        setField(term2526090, term2526090.getClass(), "farmProdExplain", null);
        setField(term2526090, term2526090.getClass(), "metaProdExplain", null);
        setField(term2526090, term2526090.getClass(), "prodProdExplain", null);
        setField(term2526090, term2526090.getClass(), "reseProdExplain", null);
        setField(term2526090, term2526090.getClass(), "cultProdExplain", null);
        setField(term2526090, term2526090.getClass(), "credProdExplain", null);
        setField(term2526090, term2526090.getClass(), "governor", null);
        setIntField(term2526090, term2526090.getClass(), "governorGuide", 0);
        setField(term2526090, term2526090.getClass(), "orbital", null);
        setField(term2526090, term2526090.getClass(), "workers", null);
        setField(term2526090, term2526090.getClass(), "buildings", null);
        setField(term2526090, term2526090.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsedPlanetSize", argTypes, term2526090, args);
    }

};



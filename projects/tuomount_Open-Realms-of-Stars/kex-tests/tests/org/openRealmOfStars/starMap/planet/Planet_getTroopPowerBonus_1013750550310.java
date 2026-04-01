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

public class Planet_getTroopPowerBonus_1013750550310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1325784;

    public Planet_getTroopPowerBonus_1013750550310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1325784 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term1325784, term1325784.getClass(), "name", null);
        setIntField(term1325784, term1325784.getClass(), "orderNumber", 0);
        setField(term1325784, term1325784.getClass(), "radiationType", null);
        setField(term1325784, term1325784.getClass(), "gravityType", null);
        setField(term1325784, term1325784.getClass(), "temperatureType", null);
        setField(term1325784, term1325784.getClass(), "waterLevel", null);
        setBooleanField(term1325784, term1325784.getClass(), "gasGiant", false);
        setField(term1325784, term1325784.getClass(), "coordinate", null);
        setField(term1325784, term1325784.getClass(), "planetType", null);
        setIntField(term1325784, term1325784.getClass(), "groundSize", 0);
        setIntField(term1325784, term1325784.getClass(), "amountMetalInGround", 0);
        setIntField(term1325784, term1325784.getClass(), "metal", 0);
        setIntField(term1325784, term1325784.getClass(), "prodResource", 0);
        setIntField(term1325784, term1325784.getClass(), "extraFood", 0);
        setIntField(term1325784, term1325784.getClass(), "culture", 0);
        setIntField(term1325784, term1325784.getClass(), "planetOwner", 0);
        setField(term1325784, term1325784.getClass(), "planetOwnerInfo", null);
        setField(term1325784, term1325784.getClass(), "homeWorldId", null);
        setIntField(term1325784, term1325784.getClass(), "startRealmIndex", 0);
        setIntField(term1325784, term1325784.getClass(), "tax", 0);
        setField(term1325784, term1325784.getClass(), "statuses", null);
        setField(term1325784, term1325784.getClass(), "timedStatuses", null);
        setField(term1325784, term1325784.getClass(), "event", null);
        setBooleanField(term1325784, term1325784.getClass(), "eventFound", false);
        setField(term1325784, term1325784.getClass(), "happinessEffect", null);
        setField(term1325784, term1325784.getClass(), "happinessExplanation", null);
        setField(term1325784, term1325784.getClass(), "farmProdExplain", null);
        setField(term1325784, term1325784.getClass(), "metaProdExplain", null);
        setField(term1325784, term1325784.getClass(), "prodProdExplain", null);
        setField(term1325784, term1325784.getClass(), "reseProdExplain", null);
        setField(term1325784, term1325784.getClass(), "cultProdExplain", null);
        setField(term1325784, term1325784.getClass(), "credProdExplain", null);
        setField(term1325784, term1325784.getClass(), "governor", null);
        setIntField(term1325784, term1325784.getClass(), "governorGuide", 0);
        setField(term1325784, term1325784.getClass(), "orbital", null);
        setField(term1325784, term1325784.getClass(), "workers", null);
        setField(term1325784, term1325784.getClass(), "buildings", null);
        setField(term1325784, term1325784.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTroopPowerBonus", argTypes, term1325784, args);
    }

};



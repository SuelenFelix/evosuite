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

public class Planet_getMetalProdExplanation_441956586332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1326102;

    public Planet_getMetalProdExplanation_441956586332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1326102 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term1326102, term1326102.getClass(), "name", null);
        setIntField(term1326102, term1326102.getClass(), "orderNumber", 0);
        setField(term1326102, term1326102.getClass(), "radiationType", null);
        setField(term1326102, term1326102.getClass(), "gravityType", null);
        setField(term1326102, term1326102.getClass(), "temperatureType", null);
        setField(term1326102, term1326102.getClass(), "waterLevel", null);
        setBooleanField(term1326102, term1326102.getClass(), "gasGiant", false);
        setField(term1326102, term1326102.getClass(), "coordinate", null);
        setField(term1326102, term1326102.getClass(), "planetType", null);
        setIntField(term1326102, term1326102.getClass(), "groundSize", 0);
        setIntField(term1326102, term1326102.getClass(), "amountMetalInGround", 0);
        setIntField(term1326102, term1326102.getClass(), "metal", 0);
        setIntField(term1326102, term1326102.getClass(), "prodResource", 0);
        setIntField(term1326102, term1326102.getClass(), "extraFood", 0);
        setIntField(term1326102, term1326102.getClass(), "culture", 0);
        setIntField(term1326102, term1326102.getClass(), "planetOwner", 0);
        setField(term1326102, term1326102.getClass(), "planetOwnerInfo", null);
        setField(term1326102, term1326102.getClass(), "homeWorldId", null);
        setIntField(term1326102, term1326102.getClass(), "startRealmIndex", 0);
        setIntField(term1326102, term1326102.getClass(), "tax", 0);
        setField(term1326102, term1326102.getClass(), "statuses", null);
        setField(term1326102, term1326102.getClass(), "timedStatuses", null);
        setField(term1326102, term1326102.getClass(), "event", null);
        setBooleanField(term1326102, term1326102.getClass(), "eventFound", false);
        setField(term1326102, term1326102.getClass(), "happinessEffect", null);
        setField(term1326102, term1326102.getClass(), "happinessExplanation", null);
        setField(term1326102, term1326102.getClass(), "farmProdExplain", null);
        setField(term1326102, term1326102.getClass(), "metaProdExplain", null);
        setField(term1326102, term1326102.getClass(), "prodProdExplain", null);
        setField(term1326102, term1326102.getClass(), "reseProdExplain", null);
        setField(term1326102, term1326102.getClass(), "cultProdExplain", null);
        setField(term1326102, term1326102.getClass(), "credProdExplain", null);
        setField(term1326102, term1326102.getClass(), "governor", null);
        setIntField(term1326102, term1326102.getClass(), "governorGuide", 0);
        setField(term1326102, term1326102.getClass(), "orbital", null);
        setField(term1326102, term1326102.getClass(), "workers", null);
        setField(term1326102, term1326102.getClass(), "buildings", null);
        setField(term1326102, term1326102.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMetalProdExplanation", argTypes, term1326102, args);
    }

};



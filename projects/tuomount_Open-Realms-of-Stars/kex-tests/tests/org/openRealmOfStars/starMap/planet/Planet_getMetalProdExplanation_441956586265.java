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

public class Planet_getMetalProdExplanation_441956586265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3162014;

    public Planet_getMetalProdExplanation_441956586265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3162014 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3162014, term3162014.getClass(), "name", null);
        setIntField(term3162014, term3162014.getClass(), "orderNumber", 0);
        setField(term3162014, term3162014.getClass(), "radiationType", null);
        setField(term3162014, term3162014.getClass(), "gravityType", null);
        setField(term3162014, term3162014.getClass(), "temperatureType", null);
        setField(term3162014, term3162014.getClass(), "waterLevel", null);
        setBooleanField(term3162014, term3162014.getClass(), "gasGiant", false);
        setField(term3162014, term3162014.getClass(), "coordinate", null);
        setField(term3162014, term3162014.getClass(), "planetType", null);
        setIntField(term3162014, term3162014.getClass(), "groundSize", 0);
        setIntField(term3162014, term3162014.getClass(), "amountMetalInGround", 0);
        setIntField(term3162014, term3162014.getClass(), "metal", 0);
        setIntField(term3162014, term3162014.getClass(), "prodResource", 0);
        setIntField(term3162014, term3162014.getClass(), "extraFood", 0);
        setIntField(term3162014, term3162014.getClass(), "culture", 0);
        setIntField(term3162014, term3162014.getClass(), "planetOwner", 0);
        setField(term3162014, term3162014.getClass(), "planetOwnerInfo", null);
        setField(term3162014, term3162014.getClass(), "homeWorldId", null);
        setIntField(term3162014, term3162014.getClass(), "startRealmIndex", 0);
        setIntField(term3162014, term3162014.getClass(), "tax", 0);
        setField(term3162014, term3162014.getClass(), "statuses", null);
        setField(term3162014, term3162014.getClass(), "timedStatuses", null);
        setField(term3162014, term3162014.getClass(), "event", null);
        setBooleanField(term3162014, term3162014.getClass(), "eventFound", false);
        setField(term3162014, term3162014.getClass(), "happinessEffect", null);
        setField(term3162014, term3162014.getClass(), "happinessExplanation", null);
        setField(term3162014, term3162014.getClass(), "farmProdExplain", null);
        setField(term3162014, term3162014.getClass(), "metaProdExplain", null);
        setField(term3162014, term3162014.getClass(), "prodProdExplain", null);
        setField(term3162014, term3162014.getClass(), "reseProdExplain", null);
        setField(term3162014, term3162014.getClass(), "cultProdExplain", null);
        setField(term3162014, term3162014.getClass(), "credProdExplain", null);
        setField(term3162014, term3162014.getClass(), "governor", null);
        setIntField(term3162014, term3162014.getClass(), "governorGuide", 0);
        setField(term3162014, term3162014.getClass(), "orbital", null);
        setField(term3162014, term3162014.getClass(), "workers", null);
        setField(term3162014, term3162014.getClass(), "buildings", null);
        setField(term3162014, term3162014.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMetalProdExplanation", argTypes, term3162014, args);
    }

};



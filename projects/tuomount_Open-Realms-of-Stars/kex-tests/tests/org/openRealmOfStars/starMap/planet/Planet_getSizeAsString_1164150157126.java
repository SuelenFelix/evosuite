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

public class Planet_getSizeAsString_1164150157126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2532775;

    public Planet_getSizeAsString_1164150157126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2532775 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2532775, term2532775.getClass(), "name", null);
        setIntField(term2532775, term2532775.getClass(), "orderNumber", 0);
        setField(term2532775, term2532775.getClass(), "radiationType", null);
        setField(term2532775, term2532775.getClass(), "gravityType", null);
        setField(term2532775, term2532775.getClass(), "temperatureType", null);
        setField(term2532775, term2532775.getClass(), "waterLevel", null);
        setBooleanField(term2532775, term2532775.getClass(), "gasGiant", false);
        setField(term2532775, term2532775.getClass(), "coordinate", null);
        setField(term2532775, term2532775.getClass(), "planetType", null);
        setIntField(term2532775, term2532775.getClass(), "groundSize", 0);
        setIntField(term2532775, term2532775.getClass(), "amountMetalInGround", 0);
        setIntField(term2532775, term2532775.getClass(), "metal", 0);
        setIntField(term2532775, term2532775.getClass(), "prodResource", 0);
        setIntField(term2532775, term2532775.getClass(), "extraFood", 0);
        setIntField(term2532775, term2532775.getClass(), "culture", 0);
        setIntField(term2532775, term2532775.getClass(), "planetOwner", 0);
        setField(term2532775, term2532775.getClass(), "planetOwnerInfo", null);
        setField(term2532775, term2532775.getClass(), "homeWorldId", null);
        setIntField(term2532775, term2532775.getClass(), "startRealmIndex", 0);
        setIntField(term2532775, term2532775.getClass(), "tax", 0);
        setField(term2532775, term2532775.getClass(), "statuses", null);
        setField(term2532775, term2532775.getClass(), "timedStatuses", null);
        setField(term2532775, term2532775.getClass(), "event", null);
        setBooleanField(term2532775, term2532775.getClass(), "eventFound", false);
        setField(term2532775, term2532775.getClass(), "happinessEffect", null);
        setField(term2532775, term2532775.getClass(), "happinessExplanation", null);
        setField(term2532775, term2532775.getClass(), "farmProdExplain", null);
        setField(term2532775, term2532775.getClass(), "metaProdExplain", null);
        setField(term2532775, term2532775.getClass(), "prodProdExplain", null);
        setField(term2532775, term2532775.getClass(), "reseProdExplain", null);
        setField(term2532775, term2532775.getClass(), "cultProdExplain", null);
        setField(term2532775, term2532775.getClass(), "credProdExplain", null);
        setField(term2532775, term2532775.getClass(), "governor", null);
        setIntField(term2532775, term2532775.getClass(), "governorGuide", 0);
        setField(term2532775, term2532775.getClass(), "orbital", null);
        setField(term2532775, term2532775.getClass(), "workers", null);
        setField(term2532775, term2532775.getClass(), "buildings", null);
        setField(term2532775, term2532775.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSizeAsString", argTypes, term2532775, args);
    }

};



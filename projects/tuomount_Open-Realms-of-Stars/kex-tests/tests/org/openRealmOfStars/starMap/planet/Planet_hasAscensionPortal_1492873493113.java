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

public class Planet_hasAscensionPortal_1492873493113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term479390;

    public Planet_hasAscensionPortal_1492873493113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term479390 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term479390, term479390.getClass(), "name", null);
        setIntField(term479390, term479390.getClass(), "orderNumber", 0);
        setField(term479390, term479390.getClass(), "radiationType", null);
        setField(term479390, term479390.getClass(), "gravityType", null);
        setField(term479390, term479390.getClass(), "temperatureType", null);
        setField(term479390, term479390.getClass(), "waterLevel", null);
        setBooleanField(term479390, term479390.getClass(), "gasGiant", false);
        setField(term479390, term479390.getClass(), "coordinate", null);
        setField(term479390, term479390.getClass(), "planetType", null);
        setIntField(term479390, term479390.getClass(), "groundSize", 0);
        setIntField(term479390, term479390.getClass(), "amountMetalInGround", 0);
        setIntField(term479390, term479390.getClass(), "metal", 0);
        setIntField(term479390, term479390.getClass(), "prodResource", 0);
        setIntField(term479390, term479390.getClass(), "extraFood", 0);
        setIntField(term479390, term479390.getClass(), "culture", 0);
        setIntField(term479390, term479390.getClass(), "planetOwner", 0);
        setField(term479390, term479390.getClass(), "planetOwnerInfo", null);
        setField(term479390, term479390.getClass(), "homeWorldId", null);
        setIntField(term479390, term479390.getClass(), "startRealmIndex", 0);
        setIntField(term479390, term479390.getClass(), "tax", 0);
        setField(term479390, term479390.getClass(), "statuses", null);
        setField(term479390, term479390.getClass(), "timedStatuses", null);
        setField(term479390, term479390.getClass(), "event", null);
        setBooleanField(term479390, term479390.getClass(), "eventFound", false);
        setField(term479390, term479390.getClass(), "happinessEffect", null);
        setField(term479390, term479390.getClass(), "happinessExplanation", null);
        setField(term479390, term479390.getClass(), "farmProdExplain", null);
        setField(term479390, term479390.getClass(), "metaProdExplain", null);
        setField(term479390, term479390.getClass(), "prodProdExplain", null);
        setField(term479390, term479390.getClass(), "reseProdExplain", null);
        setField(term479390, term479390.getClass(), "cultProdExplain", null);
        setField(term479390, term479390.getClass(), "credProdExplain", null);
        setField(term479390, term479390.getClass(), "governor", null);
        setIntField(term479390, term479390.getClass(), "governorGuide", 0);
        setField(term479390, term479390.getClass(), "orbital", null);
        setField(term479390, term479390.getClass(), "workers", null);
        setField(term479390, term479390.getClass(), "buildings", null);
        setField(term479390, term479390.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasAscensionPortal", argTypes, term479390, args);
    }

};



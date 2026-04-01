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

public class Planet_generateWorldType_84004115383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350213;

    public Planet_generateWorldType_84004115383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350213 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term350213, term350213.getClass(), "name", null);
        setIntField(term350213, term350213.getClass(), "orderNumber", 0);
        setField(term350213, term350213.getClass(), "radiationType", null);
        setField(term350213, term350213.getClass(), "gravityType", null);
        setField(term350213, term350213.getClass(), "temperatureType", null);
        setField(term350213, term350213.getClass(), "waterLevel", null);
        setBooleanField(term350213, term350213.getClass(), "gasGiant", false);
        setField(term350213, term350213.getClass(), "coordinate", null);
        setField(term350213, term350213.getClass(), "planetType", null);
        setIntField(term350213, term350213.getClass(), "groundSize", 0);
        setIntField(term350213, term350213.getClass(), "amountMetalInGround", 0);
        setIntField(term350213, term350213.getClass(), "metal", 0);
        setIntField(term350213, term350213.getClass(), "prodResource", 0);
        setIntField(term350213, term350213.getClass(), "extraFood", 0);
        setIntField(term350213, term350213.getClass(), "culture", 0);
        setIntField(term350213, term350213.getClass(), "planetOwner", 0);
        setField(term350213, term350213.getClass(), "planetOwnerInfo", null);
        setField(term350213, term350213.getClass(), "homeWorldId", null);
        setIntField(term350213, term350213.getClass(), "startRealmIndex", 0);
        setIntField(term350213, term350213.getClass(), "tax", 0);
        setField(term350213, term350213.getClass(), "statuses", null);
        setField(term350213, term350213.getClass(), "timedStatuses", null);
        setField(term350213, term350213.getClass(), "event", null);
        setBooleanField(term350213, term350213.getClass(), "eventFound", false);
        setField(term350213, term350213.getClass(), "happinessEffect", null);
        setField(term350213, term350213.getClass(), "happinessExplanation", null);
        setField(term350213, term350213.getClass(), "farmProdExplain", null);
        setField(term350213, term350213.getClass(), "metaProdExplain", null);
        setField(term350213, term350213.getClass(), "prodProdExplain", null);
        setField(term350213, term350213.getClass(), "reseProdExplain", null);
        setField(term350213, term350213.getClass(), "cultProdExplain", null);
        setField(term350213, term350213.getClass(), "credProdExplain", null);
        setField(term350213, term350213.getClass(), "governor", null);
        setIntField(term350213, term350213.getClass(), "governorGuide", 0);
        setField(term350213, term350213.getClass(), "orbital", null);
        setField(term350213, term350213.getClass(), "workers", null);
        setField(term350213, term350213.getClass(), "buildings", null);
        setField(term350213, term350213.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "generateWorldType", argTypes, term350213, args);
    }

};



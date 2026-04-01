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

public class Planet_getGuideSuggestion_1700839682297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3300145;

    public Planet_getGuideSuggestion_1700839682297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3300145 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3300145, term3300145.getClass(), "name", null);
        setIntField(term3300145, term3300145.getClass(), "orderNumber", 0);
        setField(term3300145, term3300145.getClass(), "radiationType", null);
        setField(term3300145, term3300145.getClass(), "gravityType", null);
        setField(term3300145, term3300145.getClass(), "temperatureType", null);
        setField(term3300145, term3300145.getClass(), "waterLevel", null);
        setBooleanField(term3300145, term3300145.getClass(), "gasGiant", false);
        setField(term3300145, term3300145.getClass(), "coordinate", null);
        setField(term3300145, term3300145.getClass(), "planetType", null);
        setIntField(term3300145, term3300145.getClass(), "groundSize", 0);
        setIntField(term3300145, term3300145.getClass(), "amountMetalInGround", 0);
        setIntField(term3300145, term3300145.getClass(), "metal", 0);
        setIntField(term3300145, term3300145.getClass(), "prodResource", 0);
        setIntField(term3300145, term3300145.getClass(), "extraFood", 0);
        setIntField(term3300145, term3300145.getClass(), "culture", 0);
        setIntField(term3300145, term3300145.getClass(), "planetOwner", 0);
        setField(term3300145, term3300145.getClass(), "planetOwnerInfo", null);
        setField(term3300145, term3300145.getClass(), "homeWorldId", null);
        setIntField(term3300145, term3300145.getClass(), "startRealmIndex", 0);
        setIntField(term3300145, term3300145.getClass(), "tax", 0);
        setField(term3300145, term3300145.getClass(), "statuses", null);
        setField(term3300145, term3300145.getClass(), "timedStatuses", null);
        setField(term3300145, term3300145.getClass(), "event", null);
        setBooleanField(term3300145, term3300145.getClass(), "eventFound", false);
        setField(term3300145, term3300145.getClass(), "happinessEffect", null);
        setField(term3300145, term3300145.getClass(), "happinessExplanation", null);
        setField(term3300145, term3300145.getClass(), "farmProdExplain", null);
        setField(term3300145, term3300145.getClass(), "metaProdExplain", null);
        setField(term3300145, term3300145.getClass(), "prodProdExplain", null);
        setField(term3300145, term3300145.getClass(), "reseProdExplain", null);
        setField(term3300145, term3300145.getClass(), "cultProdExplain", null);
        setField(term3300145, term3300145.getClass(), "credProdExplain", null);
        setField(term3300145, term3300145.getClass(), "governor", null);
        setIntField(term3300145, term3300145.getClass(), "governorGuide", 0);
        setField(term3300145, term3300145.getClass(), "orbital", null);
        setField(term3300145, term3300145.getClass(), "workers", null);
        setField(term3300145, term3300145.getClass(), "buildings", null);
        setField(term3300145, term3300145.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGuideSuggestion", argTypes, term3300145, args);
    }

};



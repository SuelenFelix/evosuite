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

public class Planet_getResearchProdExplanation_1940800298269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3174272;

    public Planet_getResearchProdExplanation_1940800298269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3174272 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3174272, term3174272.getClass(), "name", null);
        setIntField(term3174272, term3174272.getClass(), "orderNumber", 0);
        setField(term3174272, term3174272.getClass(), "radiationType", null);
        setField(term3174272, term3174272.getClass(), "gravityType", null);
        setField(term3174272, term3174272.getClass(), "temperatureType", null);
        setField(term3174272, term3174272.getClass(), "waterLevel", null);
        setBooleanField(term3174272, term3174272.getClass(), "gasGiant", false);
        setField(term3174272, term3174272.getClass(), "coordinate", null);
        setField(term3174272, term3174272.getClass(), "planetType", null);
        setIntField(term3174272, term3174272.getClass(), "groundSize", 0);
        setIntField(term3174272, term3174272.getClass(), "amountMetalInGround", 0);
        setIntField(term3174272, term3174272.getClass(), "metal", 0);
        setIntField(term3174272, term3174272.getClass(), "prodResource", 0);
        setIntField(term3174272, term3174272.getClass(), "extraFood", 0);
        setIntField(term3174272, term3174272.getClass(), "culture", 0);
        setIntField(term3174272, term3174272.getClass(), "planetOwner", 0);
        setField(term3174272, term3174272.getClass(), "planetOwnerInfo", null);
        setField(term3174272, term3174272.getClass(), "homeWorldId", null);
        setIntField(term3174272, term3174272.getClass(), "startRealmIndex", 0);
        setIntField(term3174272, term3174272.getClass(), "tax", 0);
        setField(term3174272, term3174272.getClass(), "statuses", null);
        setField(term3174272, term3174272.getClass(), "timedStatuses", null);
        setField(term3174272, term3174272.getClass(), "event", null);
        setBooleanField(term3174272, term3174272.getClass(), "eventFound", false);
        setField(term3174272, term3174272.getClass(), "happinessEffect", null);
        setField(term3174272, term3174272.getClass(), "happinessExplanation", null);
        setField(term3174272, term3174272.getClass(), "farmProdExplain", null);
        setField(term3174272, term3174272.getClass(), "metaProdExplain", null);
        setField(term3174272, term3174272.getClass(), "prodProdExplain", null);
        setField(term3174272, term3174272.getClass(), "reseProdExplain", null);
        setField(term3174272, term3174272.getClass(), "cultProdExplain", null);
        setField(term3174272, term3174272.getClass(), "credProdExplain", null);
        setField(term3174272, term3174272.getClass(), "governor", null);
        setIntField(term3174272, term3174272.getClass(), "governorGuide", 0);
        setField(term3174272, term3174272.getClass(), "orbital", null);
        setField(term3174272, term3174272.getClass(), "workers", null);
        setField(term3174272, term3174272.getClass(), "buildings", null);
        setField(term3174272, term3174272.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResearchProdExplanation", argTypes, term3174272, args);
    }

};



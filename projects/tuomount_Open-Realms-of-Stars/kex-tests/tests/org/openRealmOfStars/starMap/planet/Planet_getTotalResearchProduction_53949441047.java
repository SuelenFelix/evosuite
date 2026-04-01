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

public class Planet_getTotalResearchProduction_53949441047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214862;

    public Planet_getTotalResearchProduction_53949441047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term214862 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term214862, term214862.getClass(), "name", null);
        setIntField(term214862, term214862.getClass(), "orderNumber", 0);
        setField(term214862, term214862.getClass(), "radiationType", null);
        setField(term214862, term214862.getClass(), "gravityType", null);
        setField(term214862, term214862.getClass(), "temperatureType", null);
        setField(term214862, term214862.getClass(), "waterLevel", null);
        setBooleanField(term214862, term214862.getClass(), "gasGiant", false);
        setField(term214862, term214862.getClass(), "coordinate", null);
        setField(term214862, term214862.getClass(), "planetType", null);
        setIntField(term214862, term214862.getClass(), "groundSize", 0);
        setIntField(term214862, term214862.getClass(), "amountMetalInGround", 0);
        setIntField(term214862, term214862.getClass(), "metal", 0);
        setIntField(term214862, term214862.getClass(), "prodResource", 0);
        setIntField(term214862, term214862.getClass(), "extraFood", 0);
        setIntField(term214862, term214862.getClass(), "culture", 0);
        setIntField(term214862, term214862.getClass(), "planetOwner", 0);
        setField(term214862, term214862.getClass(), "planetOwnerInfo", null);
        setField(term214862, term214862.getClass(), "homeWorldId", null);
        setIntField(term214862, term214862.getClass(), "startRealmIndex", 0);
        setIntField(term214862, term214862.getClass(), "tax", 0);
        setField(term214862, term214862.getClass(), "statuses", null);
        setField(term214862, term214862.getClass(), "timedStatuses", null);
        setField(term214862, term214862.getClass(), "event", null);
        setBooleanField(term214862, term214862.getClass(), "eventFound", false);
        setField(term214862, term214862.getClass(), "happinessEffect", null);
        setField(term214862, term214862.getClass(), "happinessExplanation", null);
        setField(term214862, term214862.getClass(), "farmProdExplain", null);
        setField(term214862, term214862.getClass(), "metaProdExplain", null);
        setField(term214862, term214862.getClass(), "prodProdExplain", null);
        setField(term214862, term214862.getClass(), "reseProdExplain", null);
        setField(term214862, term214862.getClass(), "cultProdExplain", null);
        setField(term214862, term214862.getClass(), "credProdExplain", null);
        setField(term214862, term214862.getClass(), "governor", null);
        setIntField(term214862, term214862.getClass(), "governorGuide", 0);
        setField(term214862, term214862.getClass(), "orbital", null);
        setField(term214862, term214862.getClass(), "workers", null);
        setField(term214862, term214862.getClass(), "buildings", null);
        setField(term214862, term214862.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalResearchProduction", argTypes, term214862, args);
    }

};



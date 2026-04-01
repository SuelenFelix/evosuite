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

public class Planet_getEvaluationForTechWorld_417646713286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3254863;

    public Planet_getEvaluationForTechWorld_417646713286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3254863 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3254863, term3254863.getClass(), "name", null);
        setIntField(term3254863, term3254863.getClass(), "orderNumber", 0);
        setField(term3254863, term3254863.getClass(), "radiationType", null);
        setField(term3254863, term3254863.getClass(), "gravityType", null);
        setField(term3254863, term3254863.getClass(), "temperatureType", null);
        setField(term3254863, term3254863.getClass(), "waterLevel", null);
        setBooleanField(term3254863, term3254863.getClass(), "gasGiant", false);
        setField(term3254863, term3254863.getClass(), "coordinate", null);
        setField(term3254863, term3254863.getClass(), "planetType", null);
        setIntField(term3254863, term3254863.getClass(), "groundSize", 0);
        setIntField(term3254863, term3254863.getClass(), "amountMetalInGround", 0);
        setIntField(term3254863, term3254863.getClass(), "metal", 0);
        setIntField(term3254863, term3254863.getClass(), "prodResource", 0);
        setIntField(term3254863, term3254863.getClass(), "extraFood", 0);
        setIntField(term3254863, term3254863.getClass(), "culture", 0);
        setIntField(term3254863, term3254863.getClass(), "planetOwner", 0);
        setField(term3254863, term3254863.getClass(), "planetOwnerInfo", null);
        setField(term3254863, term3254863.getClass(), "homeWorldId", null);
        setIntField(term3254863, term3254863.getClass(), "startRealmIndex", 0);
        setIntField(term3254863, term3254863.getClass(), "tax", 0);
        setField(term3254863, term3254863.getClass(), "statuses", null);
        setField(term3254863, term3254863.getClass(), "timedStatuses", null);
        setField(term3254863, term3254863.getClass(), "event", null);
        setBooleanField(term3254863, term3254863.getClass(), "eventFound", false);
        setField(term3254863, term3254863.getClass(), "happinessEffect", null);
        setField(term3254863, term3254863.getClass(), "happinessExplanation", null);
        setField(term3254863, term3254863.getClass(), "farmProdExplain", null);
        setField(term3254863, term3254863.getClass(), "metaProdExplain", null);
        setField(term3254863, term3254863.getClass(), "prodProdExplain", null);
        setField(term3254863, term3254863.getClass(), "reseProdExplain", null);
        setField(term3254863, term3254863.getClass(), "cultProdExplain", null);
        setField(term3254863, term3254863.getClass(), "credProdExplain", null);
        setField(term3254863, term3254863.getClass(), "governor", null);
        setIntField(term3254863, term3254863.getClass(), "governorGuide", 0);
        setField(term3254863, term3254863.getClass(), "orbital", null);
        setField(term3254863, term3254863.getClass(), "workers", null);
        setField(term3254863, term3254863.getClass(), "buildings", null);
        setField(term3254863, term3254863.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEvaluationForTechWorld", argTypes, term3254863, args);
    }

};



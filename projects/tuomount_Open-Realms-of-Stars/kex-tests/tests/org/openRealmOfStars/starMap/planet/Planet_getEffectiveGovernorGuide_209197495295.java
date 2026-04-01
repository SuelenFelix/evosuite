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

public class Planet_getEffectiveGovernorGuide_209197495295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3293432;

    public Planet_getEffectiveGovernorGuide_209197495295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3293432 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3293432, term3293432.getClass(), "name", null);
        setIntField(term3293432, term3293432.getClass(), "orderNumber", 0);
        setField(term3293432, term3293432.getClass(), "radiationType", null);
        setField(term3293432, term3293432.getClass(), "gravityType", null);
        setField(term3293432, term3293432.getClass(), "temperatureType", null);
        setField(term3293432, term3293432.getClass(), "waterLevel", null);
        setBooleanField(term3293432, term3293432.getClass(), "gasGiant", false);
        setField(term3293432, term3293432.getClass(), "coordinate", null);
        setField(term3293432, term3293432.getClass(), "planetType", null);
        setIntField(term3293432, term3293432.getClass(), "groundSize", 0);
        setIntField(term3293432, term3293432.getClass(), "amountMetalInGround", 0);
        setIntField(term3293432, term3293432.getClass(), "metal", 0);
        setIntField(term3293432, term3293432.getClass(), "prodResource", 0);
        setIntField(term3293432, term3293432.getClass(), "extraFood", 0);
        setIntField(term3293432, term3293432.getClass(), "culture", 0);
        setIntField(term3293432, term3293432.getClass(), "planetOwner", 0);
        setField(term3293432, term3293432.getClass(), "planetOwnerInfo", null);
        setField(term3293432, term3293432.getClass(), "homeWorldId", null);
        setIntField(term3293432, term3293432.getClass(), "startRealmIndex", 0);
        setIntField(term3293432, term3293432.getClass(), "tax", 0);
        setField(term3293432, term3293432.getClass(), "statuses", null);
        setField(term3293432, term3293432.getClass(), "timedStatuses", null);
        setField(term3293432, term3293432.getClass(), "event", null);
        setBooleanField(term3293432, term3293432.getClass(), "eventFound", false);
        setField(term3293432, term3293432.getClass(), "happinessEffect", null);
        setField(term3293432, term3293432.getClass(), "happinessExplanation", null);
        setField(term3293432, term3293432.getClass(), "farmProdExplain", null);
        setField(term3293432, term3293432.getClass(), "metaProdExplain", null);
        setField(term3293432, term3293432.getClass(), "prodProdExplain", null);
        setField(term3293432, term3293432.getClass(), "reseProdExplain", null);
        setField(term3293432, term3293432.getClass(), "cultProdExplain", null);
        setField(term3293432, term3293432.getClass(), "credProdExplain", null);
        setField(term3293432, term3293432.getClass(), "governor", null);
        setIntField(term3293432, term3293432.getClass(), "governorGuide", 0);
        setField(term3293432, term3293432.getClass(), "orbital", null);
        setField(term3293432, term3293432.getClass(), "workers", null);
        setField(term3293432, term3293432.getClass(), "buildings", null);
        setField(term3293432, term3293432.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEffectiveGovernorGuide", argTypes, term3293432, args);
    }

};



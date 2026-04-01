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

public class Planet_getGovernorGuide_1009779900292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3278541;

    public Planet_getGovernorGuide_1009779900292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3278541 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3278541, term3278541.getClass(), "name", null);
        setIntField(term3278541, term3278541.getClass(), "orderNumber", 0);
        setField(term3278541, term3278541.getClass(), "radiationType", null);
        setField(term3278541, term3278541.getClass(), "gravityType", null);
        setField(term3278541, term3278541.getClass(), "temperatureType", null);
        setField(term3278541, term3278541.getClass(), "waterLevel", null);
        setBooleanField(term3278541, term3278541.getClass(), "gasGiant", false);
        setField(term3278541, term3278541.getClass(), "coordinate", null);
        setField(term3278541, term3278541.getClass(), "planetType", null);
        setIntField(term3278541, term3278541.getClass(), "groundSize", 0);
        setIntField(term3278541, term3278541.getClass(), "amountMetalInGround", 0);
        setIntField(term3278541, term3278541.getClass(), "metal", 0);
        setIntField(term3278541, term3278541.getClass(), "prodResource", 0);
        setIntField(term3278541, term3278541.getClass(), "extraFood", 0);
        setIntField(term3278541, term3278541.getClass(), "culture", 0);
        setIntField(term3278541, term3278541.getClass(), "planetOwner", 0);
        setField(term3278541, term3278541.getClass(), "planetOwnerInfo", null);
        setField(term3278541, term3278541.getClass(), "homeWorldId", null);
        setIntField(term3278541, term3278541.getClass(), "startRealmIndex", 0);
        setIntField(term3278541, term3278541.getClass(), "tax", 0);
        setField(term3278541, term3278541.getClass(), "statuses", null);
        setField(term3278541, term3278541.getClass(), "timedStatuses", null);
        setField(term3278541, term3278541.getClass(), "event", null);
        setBooleanField(term3278541, term3278541.getClass(), "eventFound", false);
        setField(term3278541, term3278541.getClass(), "happinessEffect", null);
        setField(term3278541, term3278541.getClass(), "happinessExplanation", null);
        setField(term3278541, term3278541.getClass(), "farmProdExplain", null);
        setField(term3278541, term3278541.getClass(), "metaProdExplain", null);
        setField(term3278541, term3278541.getClass(), "prodProdExplain", null);
        setField(term3278541, term3278541.getClass(), "reseProdExplain", null);
        setField(term3278541, term3278541.getClass(), "cultProdExplain", null);
        setField(term3278541, term3278541.getClass(), "credProdExplain", null);
        setField(term3278541, term3278541.getClass(), "governor", null);
        setIntField(term3278541, term3278541.getClass(), "governorGuide", 0);
        setField(term3278541, term3278541.getClass(), "orbital", null);
        setField(term3278541, term3278541.getClass(), "workers", null);
        setField(term3278541, term3278541.getClass(), "buildings", null);
        setField(term3278541, term3278541.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGovernorGuide", argTypes, term3278541, args);
    }

};



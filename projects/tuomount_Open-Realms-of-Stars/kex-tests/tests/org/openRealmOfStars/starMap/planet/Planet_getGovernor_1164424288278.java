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

public class Planet_getGovernor_1164424288278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3211398;

    public Planet_getGovernor_1164424288278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3211398 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3211398, term3211398.getClass(), "name", null);
        setIntField(term3211398, term3211398.getClass(), "orderNumber", 0);
        setField(term3211398, term3211398.getClass(), "radiationType", null);
        setField(term3211398, term3211398.getClass(), "gravityType", null);
        setField(term3211398, term3211398.getClass(), "temperatureType", null);
        setField(term3211398, term3211398.getClass(), "waterLevel", null);
        setBooleanField(term3211398, term3211398.getClass(), "gasGiant", false);
        setField(term3211398, term3211398.getClass(), "coordinate", null);
        setField(term3211398, term3211398.getClass(), "planetType", null);
        setIntField(term3211398, term3211398.getClass(), "groundSize", 0);
        setIntField(term3211398, term3211398.getClass(), "amountMetalInGround", 0);
        setIntField(term3211398, term3211398.getClass(), "metal", 0);
        setIntField(term3211398, term3211398.getClass(), "prodResource", 0);
        setIntField(term3211398, term3211398.getClass(), "extraFood", 0);
        setIntField(term3211398, term3211398.getClass(), "culture", 0);
        setIntField(term3211398, term3211398.getClass(), "planetOwner", 0);
        setField(term3211398, term3211398.getClass(), "planetOwnerInfo", null);
        setField(term3211398, term3211398.getClass(), "homeWorldId", null);
        setIntField(term3211398, term3211398.getClass(), "startRealmIndex", 0);
        setIntField(term3211398, term3211398.getClass(), "tax", 0);
        setField(term3211398, term3211398.getClass(), "statuses", null);
        setField(term3211398, term3211398.getClass(), "timedStatuses", null);
        setField(term3211398, term3211398.getClass(), "event", null);
        setBooleanField(term3211398, term3211398.getClass(), "eventFound", false);
        setField(term3211398, term3211398.getClass(), "happinessEffect", null);
        setField(term3211398, term3211398.getClass(), "happinessExplanation", null);
        setField(term3211398, term3211398.getClass(), "farmProdExplain", null);
        setField(term3211398, term3211398.getClass(), "metaProdExplain", null);
        setField(term3211398, term3211398.getClass(), "prodProdExplain", null);
        setField(term3211398, term3211398.getClass(), "reseProdExplain", null);
        setField(term3211398, term3211398.getClass(), "cultProdExplain", null);
        setField(term3211398, term3211398.getClass(), "credProdExplain", null);
        setField(term3211398, term3211398.getClass(), "governor", null);
        setIntField(term3211398, term3211398.getClass(), "governorGuide", 0);
        setField(term3211398, term3211398.getClass(), "orbital", null);
        setField(term3211398, term3211398.getClass(), "workers", null);
        setField(term3211398, term3211398.getClass(), "buildings", null);
        setField(term3211398, term3211398.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGovernor", argTypes, term3211398, args);
    }

};



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

public class Planet_getEffectiveGovernorGuide_209197495293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1247239;

    public Planet_getEffectiveGovernorGuide_209197495293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1247239 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term1247239, term1247239.getClass(), "name", null);
        setIntField(term1247239, term1247239.getClass(), "orderNumber", 0);
        setField(term1247239, term1247239.getClass(), "radiationType", null);
        setField(term1247239, term1247239.getClass(), "gravityType", null);
        setField(term1247239, term1247239.getClass(), "temperatureType", null);
        setField(term1247239, term1247239.getClass(), "waterLevel", null);
        setBooleanField(term1247239, term1247239.getClass(), "gasGiant", false);
        setField(term1247239, term1247239.getClass(), "coordinate", null);
        setField(term1247239, term1247239.getClass(), "planetType", null);
        setIntField(term1247239, term1247239.getClass(), "groundSize", 0);
        setIntField(term1247239, term1247239.getClass(), "amountMetalInGround", 0);
        setIntField(term1247239, term1247239.getClass(), "metal", 0);
        setIntField(term1247239, term1247239.getClass(), "prodResource", 0);
        setIntField(term1247239, term1247239.getClass(), "extraFood", 0);
        setIntField(term1247239, term1247239.getClass(), "culture", 0);
        setIntField(term1247239, term1247239.getClass(), "planetOwner", 0);
        setField(term1247239, term1247239.getClass(), "planetOwnerInfo", null);
        setField(term1247239, term1247239.getClass(), "homeWorldId", null);
        setIntField(term1247239, term1247239.getClass(), "startRealmIndex", 0);
        setIntField(term1247239, term1247239.getClass(), "tax", 0);
        setField(term1247239, term1247239.getClass(), "statuses", null);
        setField(term1247239, term1247239.getClass(), "timedStatuses", null);
        setField(term1247239, term1247239.getClass(), "event", null);
        setBooleanField(term1247239, term1247239.getClass(), "eventFound", false);
        setField(term1247239, term1247239.getClass(), "happinessEffect", null);
        setField(term1247239, term1247239.getClass(), "happinessExplanation", null);
        setField(term1247239, term1247239.getClass(), "farmProdExplain", null);
        setField(term1247239, term1247239.getClass(), "metaProdExplain", null);
        setField(term1247239, term1247239.getClass(), "prodProdExplain", null);
        setField(term1247239, term1247239.getClass(), "reseProdExplain", null);
        setField(term1247239, term1247239.getClass(), "cultProdExplain", null);
        setField(term1247239, term1247239.getClass(), "credProdExplain", null);
        setField(term1247239, term1247239.getClass(), "governor", null);
        setIntField(term1247239, term1247239.getClass(), "governorGuide", 0);
        setField(term1247239, term1247239.getClass(), "orbital", null);
        setField(term1247239, term1247239.getClass(), "workers", null);
        setField(term1247239, term1247239.getClass(), "buildings", null);
        setField(term1247239, term1247239.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEffectiveGovernorGuide", argTypes, term1247239, args);
    }

};



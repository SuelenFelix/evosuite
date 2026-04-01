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

public class Planet_getScannerLvl_2091010126320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3373177;

    public Planet_getScannerLvl_2091010126320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3373177 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3373177, term3373177.getClass(), "name", null);
        setIntField(term3373177, term3373177.getClass(), "orderNumber", 0);
        setField(term3373177, term3373177.getClass(), "radiationType", null);
        setField(term3373177, term3373177.getClass(), "gravityType", null);
        setField(term3373177, term3373177.getClass(), "temperatureType", null);
        setField(term3373177, term3373177.getClass(), "waterLevel", null);
        setBooleanField(term3373177, term3373177.getClass(), "gasGiant", false);
        setField(term3373177, term3373177.getClass(), "coordinate", null);
        setField(term3373177, term3373177.getClass(), "planetType", null);
        setIntField(term3373177, term3373177.getClass(), "groundSize", 0);
        setIntField(term3373177, term3373177.getClass(), "amountMetalInGround", 0);
        setIntField(term3373177, term3373177.getClass(), "metal", 0);
        setIntField(term3373177, term3373177.getClass(), "prodResource", 0);
        setIntField(term3373177, term3373177.getClass(), "extraFood", 0);
        setIntField(term3373177, term3373177.getClass(), "culture", 0);
        setIntField(term3373177, term3373177.getClass(), "planetOwner", 0);
        setField(term3373177, term3373177.getClass(), "planetOwnerInfo", null);
        setField(term3373177, term3373177.getClass(), "homeWorldId", null);
        setIntField(term3373177, term3373177.getClass(), "startRealmIndex", 0);
        setIntField(term3373177, term3373177.getClass(), "tax", 0);
        setField(term3373177, term3373177.getClass(), "statuses", null);
        setField(term3373177, term3373177.getClass(), "timedStatuses", null);
        setField(term3373177, term3373177.getClass(), "event", null);
        setBooleanField(term3373177, term3373177.getClass(), "eventFound", false);
        setField(term3373177, term3373177.getClass(), "happinessEffect", null);
        setField(term3373177, term3373177.getClass(), "happinessExplanation", null);
        setField(term3373177, term3373177.getClass(), "farmProdExplain", null);
        setField(term3373177, term3373177.getClass(), "metaProdExplain", null);
        setField(term3373177, term3373177.getClass(), "prodProdExplain", null);
        setField(term3373177, term3373177.getClass(), "reseProdExplain", null);
        setField(term3373177, term3373177.getClass(), "cultProdExplain", null);
        setField(term3373177, term3373177.getClass(), "credProdExplain", null);
        setField(term3373177, term3373177.getClass(), "governor", null);
        setIntField(term3373177, term3373177.getClass(), "governorGuide", 0);
        setField(term3373177, term3373177.getClass(), "orbital", null);
        setField(term3373177, term3373177.getClass(), "workers", null);
        setField(term3373177, term3373177.getClass(), "buildings", null);
        setField(term3373177, term3373177.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScannerLvl", argTypes, term3373177, args);
    }

};



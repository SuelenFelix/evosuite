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

public class Planet_getRecycleBonus_475040554170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term718081;

    public Planet_getRecycleBonus_475040554170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term718081 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term718081, term718081.getClass(), "name", null);
        setIntField(term718081, term718081.getClass(), "orderNumber", 0);
        setField(term718081, term718081.getClass(), "radiationType", null);
        setField(term718081, term718081.getClass(), "gravityType", null);
        setField(term718081, term718081.getClass(), "temperatureType", null);
        setField(term718081, term718081.getClass(), "waterLevel", null);
        setBooleanField(term718081, term718081.getClass(), "gasGiant", false);
        setField(term718081, term718081.getClass(), "coordinate", null);
        setField(term718081, term718081.getClass(), "planetType", null);
        setIntField(term718081, term718081.getClass(), "groundSize", 0);
        setIntField(term718081, term718081.getClass(), "amountMetalInGround", 0);
        setIntField(term718081, term718081.getClass(), "metal", 0);
        setIntField(term718081, term718081.getClass(), "prodResource", 0);
        setIntField(term718081, term718081.getClass(), "extraFood", 0);
        setIntField(term718081, term718081.getClass(), "culture", 0);
        setIntField(term718081, term718081.getClass(), "planetOwner", 0);
        setField(term718081, term718081.getClass(), "planetOwnerInfo", null);
        setField(term718081, term718081.getClass(), "homeWorldId", null);
        setIntField(term718081, term718081.getClass(), "startRealmIndex", 0);
        setIntField(term718081, term718081.getClass(), "tax", 0);
        setField(term718081, term718081.getClass(), "statuses", null);
        setField(term718081, term718081.getClass(), "timedStatuses", null);
        setField(term718081, term718081.getClass(), "event", null);
        setBooleanField(term718081, term718081.getClass(), "eventFound", false);
        setField(term718081, term718081.getClass(), "happinessEffect", null);
        setField(term718081, term718081.getClass(), "happinessExplanation", null);
        setField(term718081, term718081.getClass(), "farmProdExplain", null);
        setField(term718081, term718081.getClass(), "metaProdExplain", null);
        setField(term718081, term718081.getClass(), "prodProdExplain", null);
        setField(term718081, term718081.getClass(), "reseProdExplain", null);
        setField(term718081, term718081.getClass(), "cultProdExplain", null);
        setField(term718081, term718081.getClass(), "credProdExplain", null);
        setField(term718081, term718081.getClass(), "governor", null);
        setIntField(term718081, term718081.getClass(), "governorGuide", 0);
        setField(term718081, term718081.getClass(), "orbital", null);
        setField(term718081, term718081.getClass(), "workers", null);
        setField(term718081, term718081.getClass(), "buildings", null);
        setField(term718081, term718081.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRecycleBonus", argTypes, term718081, args);
    }

};



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

public class Planet_getRecycleBonus_475040554177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2753781;

    public Planet_getRecycleBonus_475040554177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2753781 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2753781, term2753781.getClass(), "name", null);
        setIntField(term2753781, term2753781.getClass(), "orderNumber", 0);
        setField(term2753781, term2753781.getClass(), "radiationType", null);
        setField(term2753781, term2753781.getClass(), "gravityType", null);
        setField(term2753781, term2753781.getClass(), "temperatureType", null);
        setField(term2753781, term2753781.getClass(), "waterLevel", null);
        setBooleanField(term2753781, term2753781.getClass(), "gasGiant", false);
        setField(term2753781, term2753781.getClass(), "coordinate", null);
        setField(term2753781, term2753781.getClass(), "planetType", null);
        setIntField(term2753781, term2753781.getClass(), "groundSize", 0);
        setIntField(term2753781, term2753781.getClass(), "amountMetalInGround", 0);
        setIntField(term2753781, term2753781.getClass(), "metal", 0);
        setIntField(term2753781, term2753781.getClass(), "prodResource", 0);
        setIntField(term2753781, term2753781.getClass(), "extraFood", 0);
        setIntField(term2753781, term2753781.getClass(), "culture", 0);
        setIntField(term2753781, term2753781.getClass(), "planetOwner", 0);
        setField(term2753781, term2753781.getClass(), "planetOwnerInfo", null);
        setField(term2753781, term2753781.getClass(), "homeWorldId", null);
        setIntField(term2753781, term2753781.getClass(), "startRealmIndex", 0);
        setIntField(term2753781, term2753781.getClass(), "tax", 0);
        setField(term2753781, term2753781.getClass(), "statuses", null);
        setField(term2753781, term2753781.getClass(), "timedStatuses", null);
        setField(term2753781, term2753781.getClass(), "event", null);
        setBooleanField(term2753781, term2753781.getClass(), "eventFound", false);
        setField(term2753781, term2753781.getClass(), "happinessEffect", null);
        setField(term2753781, term2753781.getClass(), "happinessExplanation", null);
        setField(term2753781, term2753781.getClass(), "farmProdExplain", null);
        setField(term2753781, term2753781.getClass(), "metaProdExplain", null);
        setField(term2753781, term2753781.getClass(), "prodProdExplain", null);
        setField(term2753781, term2753781.getClass(), "reseProdExplain", null);
        setField(term2753781, term2753781.getClass(), "cultProdExplain", null);
        setField(term2753781, term2753781.getClass(), "credProdExplain", null);
        setField(term2753781, term2753781.getClass(), "governor", null);
        setIntField(term2753781, term2753781.getClass(), "governorGuide", 0);
        setField(term2753781, term2753781.getClass(), "orbital", null);
        setField(term2753781, term2753781.getClass(), "workers", null);
        setField(term2753781, term2753781.getClass(), "buildings", null);
        setField(term2753781, term2753781.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRecycleBonus", argTypes, term2753781, args);
    }

};



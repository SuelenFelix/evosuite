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

public class Planet_getScannerLvl_2091010126172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term726057;

    public Planet_getScannerLvl_2091010126172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term726057 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term726057, term726057.getClass(), "name", null);
        setIntField(term726057, term726057.getClass(), "orderNumber", 0);
        setField(term726057, term726057.getClass(), "radiationType", null);
        setField(term726057, term726057.getClass(), "gravityType", null);
        setField(term726057, term726057.getClass(), "temperatureType", null);
        setField(term726057, term726057.getClass(), "waterLevel", null);
        setBooleanField(term726057, term726057.getClass(), "gasGiant", false);
        setField(term726057, term726057.getClass(), "coordinate", null);
        setField(term726057, term726057.getClass(), "planetType", null);
        setIntField(term726057, term726057.getClass(), "groundSize", 0);
        setIntField(term726057, term726057.getClass(), "amountMetalInGround", 0);
        setIntField(term726057, term726057.getClass(), "metal", 0);
        setIntField(term726057, term726057.getClass(), "prodResource", 0);
        setIntField(term726057, term726057.getClass(), "extraFood", 0);
        setIntField(term726057, term726057.getClass(), "culture", 0);
        setIntField(term726057, term726057.getClass(), "planetOwner", 0);
        setField(term726057, term726057.getClass(), "planetOwnerInfo", null);
        setField(term726057, term726057.getClass(), "homeWorldId", null);
        setIntField(term726057, term726057.getClass(), "startRealmIndex", 0);
        setIntField(term726057, term726057.getClass(), "tax", 0);
        setField(term726057, term726057.getClass(), "statuses", null);
        setField(term726057, term726057.getClass(), "timedStatuses", null);
        setField(term726057, term726057.getClass(), "event", null);
        setBooleanField(term726057, term726057.getClass(), "eventFound", false);
        setField(term726057, term726057.getClass(), "happinessEffect", null);
        setField(term726057, term726057.getClass(), "happinessExplanation", null);
        setField(term726057, term726057.getClass(), "farmProdExplain", null);
        setField(term726057, term726057.getClass(), "metaProdExplain", null);
        setField(term726057, term726057.getClass(), "prodProdExplain", null);
        setField(term726057, term726057.getClass(), "reseProdExplain", null);
        setField(term726057, term726057.getClass(), "cultProdExplain", null);
        setField(term726057, term726057.getClass(), "credProdExplain", null);
        setField(term726057, term726057.getClass(), "governor", null);
        setIntField(term726057, term726057.getClass(), "governorGuide", 0);
        setField(term726057, term726057.getClass(), "orbital", null);
        setField(term726057, term726057.getClass(), "workers", null);
        setField(term726057, term726057.getClass(), "buildings", null);
        setField(term726057, term726057.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScannerLvl", argTypes, term726057, args);
    }

};



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

public class Planet_getTurretLvl_1839565040180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2769799;

    public Planet_getTurretLvl_1839565040180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2769799 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2769799, term2769799.getClass(), "name", null);
        setIntField(term2769799, term2769799.getClass(), "orderNumber", 0);
        setField(term2769799, term2769799.getClass(), "radiationType", null);
        setField(term2769799, term2769799.getClass(), "gravityType", null);
        setField(term2769799, term2769799.getClass(), "temperatureType", null);
        setField(term2769799, term2769799.getClass(), "waterLevel", null);
        setBooleanField(term2769799, term2769799.getClass(), "gasGiant", false);
        setField(term2769799, term2769799.getClass(), "coordinate", null);
        setField(term2769799, term2769799.getClass(), "planetType", null);
        setIntField(term2769799, term2769799.getClass(), "groundSize", 0);
        setIntField(term2769799, term2769799.getClass(), "amountMetalInGround", 0);
        setIntField(term2769799, term2769799.getClass(), "metal", 0);
        setIntField(term2769799, term2769799.getClass(), "prodResource", 0);
        setIntField(term2769799, term2769799.getClass(), "extraFood", 0);
        setIntField(term2769799, term2769799.getClass(), "culture", 0);
        setIntField(term2769799, term2769799.getClass(), "planetOwner", 0);
        setField(term2769799, term2769799.getClass(), "planetOwnerInfo", null);
        setField(term2769799, term2769799.getClass(), "homeWorldId", null);
        setIntField(term2769799, term2769799.getClass(), "startRealmIndex", 0);
        setIntField(term2769799, term2769799.getClass(), "tax", 0);
        setField(term2769799, term2769799.getClass(), "statuses", null);
        setField(term2769799, term2769799.getClass(), "timedStatuses", null);
        setField(term2769799, term2769799.getClass(), "event", null);
        setBooleanField(term2769799, term2769799.getClass(), "eventFound", false);
        setField(term2769799, term2769799.getClass(), "happinessEffect", null);
        setField(term2769799, term2769799.getClass(), "happinessExplanation", null);
        setField(term2769799, term2769799.getClass(), "farmProdExplain", null);
        setField(term2769799, term2769799.getClass(), "metaProdExplain", null);
        setField(term2769799, term2769799.getClass(), "prodProdExplain", null);
        setField(term2769799, term2769799.getClass(), "reseProdExplain", null);
        setField(term2769799, term2769799.getClass(), "cultProdExplain", null);
        setField(term2769799, term2769799.getClass(), "credProdExplain", null);
        setField(term2769799, term2769799.getClass(), "governor", null);
        setIntField(term2769799, term2769799.getClass(), "governorGuide", 0);
        setField(term2769799, term2769799.getClass(), "orbital", null);
        setField(term2769799, term2769799.getClass(), "workers", null);
        setField(term2769799, term2769799.getClass(), "buildings", null);
        setField(term2769799, term2769799.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTurretLvl", argTypes, term2769799, args);
    }

};



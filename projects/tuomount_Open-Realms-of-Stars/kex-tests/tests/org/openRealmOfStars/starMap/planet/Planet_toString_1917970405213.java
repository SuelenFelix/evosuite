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

public class Planet_toString_1917970405213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2920808;

    public Planet_toString_1917970405213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2920808 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2920808, term2920808.getClass(), "name", null);
        setIntField(term2920808, term2920808.getClass(), "orderNumber", 0);
        setField(term2920808, term2920808.getClass(), "radiationType", null);
        setField(term2920808, term2920808.getClass(), "gravityType", null);
        setField(term2920808, term2920808.getClass(), "temperatureType", null);
        setField(term2920808, term2920808.getClass(), "waterLevel", null);
        setBooleanField(term2920808, term2920808.getClass(), "gasGiant", false);
        setField(term2920808, term2920808.getClass(), "coordinate", null);
        setField(term2920808, term2920808.getClass(), "planetType", null);
        setIntField(term2920808, term2920808.getClass(), "groundSize", 0);
        setIntField(term2920808, term2920808.getClass(), "amountMetalInGround", 0);
        setIntField(term2920808, term2920808.getClass(), "metal", 0);
        setIntField(term2920808, term2920808.getClass(), "prodResource", 0);
        setIntField(term2920808, term2920808.getClass(), "extraFood", 0);
        setIntField(term2920808, term2920808.getClass(), "culture", 0);
        setIntField(term2920808, term2920808.getClass(), "planetOwner", 0);
        setField(term2920808, term2920808.getClass(), "planetOwnerInfo", null);
        setField(term2920808, term2920808.getClass(), "homeWorldId", null);
        setIntField(term2920808, term2920808.getClass(), "startRealmIndex", 0);
        setIntField(term2920808, term2920808.getClass(), "tax", 0);
        setField(term2920808, term2920808.getClass(), "statuses", null);
        setField(term2920808, term2920808.getClass(), "timedStatuses", null);
        setField(term2920808, term2920808.getClass(), "event", null);
        setBooleanField(term2920808, term2920808.getClass(), "eventFound", false);
        setField(term2920808, term2920808.getClass(), "happinessEffect", null);
        setField(term2920808, term2920808.getClass(), "happinessExplanation", null);
        setField(term2920808, term2920808.getClass(), "farmProdExplain", null);
        setField(term2920808, term2920808.getClass(), "metaProdExplain", null);
        setField(term2920808, term2920808.getClass(), "prodProdExplain", null);
        setField(term2920808, term2920808.getClass(), "reseProdExplain", null);
        setField(term2920808, term2920808.getClass(), "cultProdExplain", null);
        setField(term2920808, term2920808.getClass(), "credProdExplain", null);
        setField(term2920808, term2920808.getClass(), "governor", null);
        setIntField(term2920808, term2920808.getClass(), "governorGuide", 0);
        setField(term2920808, term2920808.getClass(), "orbital", null);
        setField(term2920808, term2920808.getClass(), "workers", null);
        setField(term2920808, term2920808.getClass(), "buildings", null);
        setField(term2920808, term2920808.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2920808, args);
    }

};



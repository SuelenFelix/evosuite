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

public class Planet_revealing_1348895017187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2797526;

    public Planet_revealing_1348895017187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2797526 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2797526, term2797526.getClass(), "name", null);
        setIntField(term2797526, term2797526.getClass(), "orderNumber", 0);
        setField(term2797526, term2797526.getClass(), "radiationType", null);
        setField(term2797526, term2797526.getClass(), "gravityType", null);
        setField(term2797526, term2797526.getClass(), "temperatureType", null);
        setField(term2797526, term2797526.getClass(), "waterLevel", null);
        setBooleanField(term2797526, term2797526.getClass(), "gasGiant", false);
        setField(term2797526, term2797526.getClass(), "coordinate", null);
        setField(term2797526, term2797526.getClass(), "planetType", null);
        setIntField(term2797526, term2797526.getClass(), "groundSize", 0);
        setIntField(term2797526, term2797526.getClass(), "amountMetalInGround", 0);
        setIntField(term2797526, term2797526.getClass(), "metal", 0);
        setIntField(term2797526, term2797526.getClass(), "prodResource", 0);
        setIntField(term2797526, term2797526.getClass(), "extraFood", 0);
        setIntField(term2797526, term2797526.getClass(), "culture", 0);
        setIntField(term2797526, term2797526.getClass(), "planetOwner", 0);
        setField(term2797526, term2797526.getClass(), "planetOwnerInfo", null);
        setField(term2797526, term2797526.getClass(), "homeWorldId", null);
        setIntField(term2797526, term2797526.getClass(), "startRealmIndex", 0);
        setIntField(term2797526, term2797526.getClass(), "tax", 0);
        setField(term2797526, term2797526.getClass(), "statuses", null);
        setField(term2797526, term2797526.getClass(), "timedStatuses", null);
        setField(term2797526, term2797526.getClass(), "event", null);
        setBooleanField(term2797526, term2797526.getClass(), "eventFound", false);
        setField(term2797526, term2797526.getClass(), "happinessEffect", null);
        setField(term2797526, term2797526.getClass(), "happinessExplanation", null);
        setField(term2797526, term2797526.getClass(), "farmProdExplain", null);
        setField(term2797526, term2797526.getClass(), "metaProdExplain", null);
        setField(term2797526, term2797526.getClass(), "prodProdExplain", null);
        setField(term2797526, term2797526.getClass(), "reseProdExplain", null);
        setField(term2797526, term2797526.getClass(), "cultProdExplain", null);
        setField(term2797526, term2797526.getClass(), "credProdExplain", null);
        setField(term2797526, term2797526.getClass(), "governor", null);
        setIntField(term2797526, term2797526.getClass(), "governorGuide", 0);
        setField(term2797526, term2797526.getClass(), "orbital", null);
        setField(term2797526, term2797526.getClass(), "workers", null);
        setField(term2797526, term2797526.getClass(), "buildings", null);
        setField(term2797526, term2797526.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "revealing", argTypes, term2797526, args);
    }

};



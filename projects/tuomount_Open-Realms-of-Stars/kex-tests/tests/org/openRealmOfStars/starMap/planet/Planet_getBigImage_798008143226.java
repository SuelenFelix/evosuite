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

public class Planet_getBigImage_798008143226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term960894;

    public Planet_getBigImage_798008143226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term960894 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term960894, term960894.getClass(), "name", null);
        setIntField(term960894, term960894.getClass(), "orderNumber", 0);
        setField(term960894, term960894.getClass(), "radiationType", null);
        setField(term960894, term960894.getClass(), "gravityType", null);
        setField(term960894, term960894.getClass(), "temperatureType", null);
        setField(term960894, term960894.getClass(), "waterLevel", null);
        setBooleanField(term960894, term960894.getClass(), "gasGiant", false);
        setField(term960894, term960894.getClass(), "coordinate", null);
        setField(term960894, term960894.getClass(), "planetType", null);
        setIntField(term960894, term960894.getClass(), "groundSize", 0);
        setIntField(term960894, term960894.getClass(), "amountMetalInGround", 0);
        setIntField(term960894, term960894.getClass(), "metal", 0);
        setIntField(term960894, term960894.getClass(), "prodResource", 0);
        setIntField(term960894, term960894.getClass(), "extraFood", 0);
        setIntField(term960894, term960894.getClass(), "culture", 0);
        setIntField(term960894, term960894.getClass(), "planetOwner", 0);
        setField(term960894, term960894.getClass(), "planetOwnerInfo", null);
        setField(term960894, term960894.getClass(), "homeWorldId", null);
        setIntField(term960894, term960894.getClass(), "startRealmIndex", 0);
        setIntField(term960894, term960894.getClass(), "tax", 0);
        setField(term960894, term960894.getClass(), "statuses", null);
        setField(term960894, term960894.getClass(), "timedStatuses", null);
        setField(term960894, term960894.getClass(), "event", null);
        setBooleanField(term960894, term960894.getClass(), "eventFound", false);
        setField(term960894, term960894.getClass(), "happinessEffect", null);
        setField(term960894, term960894.getClass(), "happinessExplanation", null);
        setField(term960894, term960894.getClass(), "farmProdExplain", null);
        setField(term960894, term960894.getClass(), "metaProdExplain", null);
        setField(term960894, term960894.getClass(), "prodProdExplain", null);
        setField(term960894, term960894.getClass(), "reseProdExplain", null);
        setField(term960894, term960894.getClass(), "cultProdExplain", null);
        setField(term960894, term960894.getClass(), "credProdExplain", null);
        setField(term960894, term960894.getClass(), "governor", null);
        setIntField(term960894, term960894.getClass(), "governorGuide", 0);
        setField(term960894, term960894.getClass(), "orbital", null);
        setField(term960894, term960894.getClass(), "workers", null);
        setField(term960894, term960894.getClass(), "buildings", null);
        setField(term960894, term960894.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBigImage", argTypes, term960894, args);
    }

};



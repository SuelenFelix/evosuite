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

public class Planet_getstartRealmIndex_2005864771213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term911741;

    public Planet_getstartRealmIndex_2005864771213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term911741 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term911741, term911741.getClass(), "name", null);
        setIntField(term911741, term911741.getClass(), "orderNumber", 0);
        setField(term911741, term911741.getClass(), "radiationType", null);
        setField(term911741, term911741.getClass(), "gravityType", null);
        setField(term911741, term911741.getClass(), "temperatureType", null);
        setField(term911741, term911741.getClass(), "waterLevel", null);
        setBooleanField(term911741, term911741.getClass(), "gasGiant", false);
        setField(term911741, term911741.getClass(), "coordinate", null);
        setField(term911741, term911741.getClass(), "planetType", null);
        setIntField(term911741, term911741.getClass(), "groundSize", 0);
        setIntField(term911741, term911741.getClass(), "amountMetalInGround", 0);
        setIntField(term911741, term911741.getClass(), "metal", 0);
        setIntField(term911741, term911741.getClass(), "prodResource", 0);
        setIntField(term911741, term911741.getClass(), "extraFood", 0);
        setIntField(term911741, term911741.getClass(), "culture", 0);
        setIntField(term911741, term911741.getClass(), "planetOwner", 0);
        setField(term911741, term911741.getClass(), "planetOwnerInfo", null);
        setField(term911741, term911741.getClass(), "homeWorldId", null);
        setIntField(term911741, term911741.getClass(), "startRealmIndex", 0);
        setIntField(term911741, term911741.getClass(), "tax", 0);
        setField(term911741, term911741.getClass(), "statuses", null);
        setField(term911741, term911741.getClass(), "timedStatuses", null);
        setField(term911741, term911741.getClass(), "event", null);
        setBooleanField(term911741, term911741.getClass(), "eventFound", false);
        setField(term911741, term911741.getClass(), "happinessEffect", null);
        setField(term911741, term911741.getClass(), "happinessExplanation", null);
        setField(term911741, term911741.getClass(), "farmProdExplain", null);
        setField(term911741, term911741.getClass(), "metaProdExplain", null);
        setField(term911741, term911741.getClass(), "prodProdExplain", null);
        setField(term911741, term911741.getClass(), "reseProdExplain", null);
        setField(term911741, term911741.getClass(), "cultProdExplain", null);
        setField(term911741, term911741.getClass(), "credProdExplain", null);
        setField(term911741, term911741.getClass(), "governor", null);
        setIntField(term911741, term911741.getClass(), "governorGuide", 0);
        setField(term911741, term911741.getClass(), "orbital", null);
        setField(term911741, term911741.getClass(), "workers", null);
        setField(term911741, term911741.getClass(), "buildings", null);
        setField(term911741, term911741.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getstartRealmIndex", argTypes, term911741, args);
    }

};



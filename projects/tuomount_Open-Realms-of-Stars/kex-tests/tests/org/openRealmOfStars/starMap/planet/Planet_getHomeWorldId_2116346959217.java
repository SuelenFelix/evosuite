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

public class Planet_getHomeWorldId_2116346959217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2933513;

    public Planet_getHomeWorldId_2116346959217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2933513 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2933513, term2933513.getClass(), "name", null);
        setIntField(term2933513, term2933513.getClass(), "orderNumber", 0);
        setField(term2933513, term2933513.getClass(), "radiationType", null);
        setField(term2933513, term2933513.getClass(), "gravityType", null);
        setField(term2933513, term2933513.getClass(), "temperatureType", null);
        setField(term2933513, term2933513.getClass(), "waterLevel", null);
        setBooleanField(term2933513, term2933513.getClass(), "gasGiant", false);
        setField(term2933513, term2933513.getClass(), "coordinate", null);
        setField(term2933513, term2933513.getClass(), "planetType", null);
        setIntField(term2933513, term2933513.getClass(), "groundSize", 0);
        setIntField(term2933513, term2933513.getClass(), "amountMetalInGround", 0);
        setIntField(term2933513, term2933513.getClass(), "metal", 0);
        setIntField(term2933513, term2933513.getClass(), "prodResource", 0);
        setIntField(term2933513, term2933513.getClass(), "extraFood", 0);
        setIntField(term2933513, term2933513.getClass(), "culture", 0);
        setIntField(term2933513, term2933513.getClass(), "planetOwner", 0);
        setField(term2933513, term2933513.getClass(), "planetOwnerInfo", null);
        setField(term2933513, term2933513.getClass(), "homeWorldId", null);
        setIntField(term2933513, term2933513.getClass(), "startRealmIndex", 0);
        setIntField(term2933513, term2933513.getClass(), "tax", 0);
        setField(term2933513, term2933513.getClass(), "statuses", null);
        setField(term2933513, term2933513.getClass(), "timedStatuses", null);
        setField(term2933513, term2933513.getClass(), "event", null);
        setBooleanField(term2933513, term2933513.getClass(), "eventFound", false);
        setField(term2933513, term2933513.getClass(), "happinessEffect", null);
        setField(term2933513, term2933513.getClass(), "happinessExplanation", null);
        setField(term2933513, term2933513.getClass(), "farmProdExplain", null);
        setField(term2933513, term2933513.getClass(), "metaProdExplain", null);
        setField(term2933513, term2933513.getClass(), "prodProdExplain", null);
        setField(term2933513, term2933513.getClass(), "reseProdExplain", null);
        setField(term2933513, term2933513.getClass(), "cultProdExplain", null);
        setField(term2933513, term2933513.getClass(), "credProdExplain", null);
        setField(term2933513, term2933513.getClass(), "governor", null);
        setIntField(term2933513, term2933513.getClass(), "governorGuide", 0);
        setField(term2933513, term2933513.getClass(), "orbital", null);
        setField(term2933513, term2933513.getClass(), "workers", null);
        setField(term2933513, term2933513.getClass(), "buildings", null);
        setField(term2933513, term2933513.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHomeWorldId", argTypes, term2933513, args);
    }

};



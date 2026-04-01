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

public class Planet_getHomeWorldId_2116346959209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term898881;

    public Planet_getHomeWorldId_2116346959209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term898881 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term898881, term898881.getClass(), "name", null);
        setIntField(term898881, term898881.getClass(), "orderNumber", 0);
        setField(term898881, term898881.getClass(), "radiationType", null);
        setField(term898881, term898881.getClass(), "gravityType", null);
        setField(term898881, term898881.getClass(), "temperatureType", null);
        setField(term898881, term898881.getClass(), "waterLevel", null);
        setBooleanField(term898881, term898881.getClass(), "gasGiant", false);
        setField(term898881, term898881.getClass(), "coordinate", null);
        setField(term898881, term898881.getClass(), "planetType", null);
        setIntField(term898881, term898881.getClass(), "groundSize", 0);
        setIntField(term898881, term898881.getClass(), "amountMetalInGround", 0);
        setIntField(term898881, term898881.getClass(), "metal", 0);
        setIntField(term898881, term898881.getClass(), "prodResource", 0);
        setIntField(term898881, term898881.getClass(), "extraFood", 0);
        setIntField(term898881, term898881.getClass(), "culture", 0);
        setIntField(term898881, term898881.getClass(), "planetOwner", 0);
        setField(term898881, term898881.getClass(), "planetOwnerInfo", null);
        setField(term898881, term898881.getClass(), "homeWorldId", null);
        setIntField(term898881, term898881.getClass(), "startRealmIndex", 0);
        setIntField(term898881, term898881.getClass(), "tax", 0);
        setField(term898881, term898881.getClass(), "statuses", null);
        setField(term898881, term898881.getClass(), "timedStatuses", null);
        setField(term898881, term898881.getClass(), "event", null);
        setBooleanField(term898881, term898881.getClass(), "eventFound", false);
        setField(term898881, term898881.getClass(), "happinessEffect", null);
        setField(term898881, term898881.getClass(), "happinessExplanation", null);
        setField(term898881, term898881.getClass(), "farmProdExplain", null);
        setField(term898881, term898881.getClass(), "metaProdExplain", null);
        setField(term898881, term898881.getClass(), "prodProdExplain", null);
        setField(term898881, term898881.getClass(), "reseProdExplain", null);
        setField(term898881, term898881.getClass(), "cultProdExplain", null);
        setField(term898881, term898881.getClass(), "credProdExplain", null);
        setField(term898881, term898881.getClass(), "governor", null);
        setIntField(term898881, term898881.getClass(), "governorGuide", 0);
        setField(term898881, term898881.getClass(), "orbital", null);
        setField(term898881, term898881.getClass(), "workers", null);
        setField(term898881, term898881.getClass(), "buildings", null);
        setField(term898881, term898881.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHomeWorldId", argTypes, term898881, args);
    }

};



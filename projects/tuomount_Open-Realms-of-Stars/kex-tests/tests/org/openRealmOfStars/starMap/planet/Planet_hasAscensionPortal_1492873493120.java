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

public class Planet_hasAscensionPortal_1492873493120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2511651;

    public Planet_hasAscensionPortal_1492873493120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2511651 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2511651, term2511651.getClass(), "name", null);
        setIntField(term2511651, term2511651.getClass(), "orderNumber", 0);
        setField(term2511651, term2511651.getClass(), "radiationType", null);
        setField(term2511651, term2511651.getClass(), "gravityType", null);
        setField(term2511651, term2511651.getClass(), "temperatureType", null);
        setField(term2511651, term2511651.getClass(), "waterLevel", null);
        setBooleanField(term2511651, term2511651.getClass(), "gasGiant", false);
        setField(term2511651, term2511651.getClass(), "coordinate", null);
        setField(term2511651, term2511651.getClass(), "planetType", null);
        setIntField(term2511651, term2511651.getClass(), "groundSize", 0);
        setIntField(term2511651, term2511651.getClass(), "amountMetalInGround", 0);
        setIntField(term2511651, term2511651.getClass(), "metal", 0);
        setIntField(term2511651, term2511651.getClass(), "prodResource", 0);
        setIntField(term2511651, term2511651.getClass(), "extraFood", 0);
        setIntField(term2511651, term2511651.getClass(), "culture", 0);
        setIntField(term2511651, term2511651.getClass(), "planetOwner", 0);
        setField(term2511651, term2511651.getClass(), "planetOwnerInfo", null);
        setField(term2511651, term2511651.getClass(), "homeWorldId", null);
        setIntField(term2511651, term2511651.getClass(), "startRealmIndex", 0);
        setIntField(term2511651, term2511651.getClass(), "tax", 0);
        setField(term2511651, term2511651.getClass(), "statuses", null);
        setField(term2511651, term2511651.getClass(), "timedStatuses", null);
        setField(term2511651, term2511651.getClass(), "event", null);
        setBooleanField(term2511651, term2511651.getClass(), "eventFound", false);
        setField(term2511651, term2511651.getClass(), "happinessEffect", null);
        setField(term2511651, term2511651.getClass(), "happinessExplanation", null);
        setField(term2511651, term2511651.getClass(), "farmProdExplain", null);
        setField(term2511651, term2511651.getClass(), "metaProdExplain", null);
        setField(term2511651, term2511651.getClass(), "prodProdExplain", null);
        setField(term2511651, term2511651.getClass(), "reseProdExplain", null);
        setField(term2511651, term2511651.getClass(), "cultProdExplain", null);
        setField(term2511651, term2511651.getClass(), "credProdExplain", null);
        setField(term2511651, term2511651.getClass(), "governor", null);
        setIntField(term2511651, term2511651.getClass(), "governorGuide", 0);
        setField(term2511651, term2511651.getClass(), "orbital", null);
        setField(term2511651, term2511651.getClass(), "workers", null);
        setField(term2511651, term2511651.getClass(), "buildings", null);
        setField(term2511651, term2511651.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasAscensionPortal", argTypes, term2511651, args);
    }

};



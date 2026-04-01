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

public class Planet_getTimedStatuses_43108595244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3047408;

    public Planet_getTimedStatuses_43108595244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3047408 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3047408, term3047408.getClass(), "name", null);
        setIntField(term3047408, term3047408.getClass(), "orderNumber", 0);
        setField(term3047408, term3047408.getClass(), "radiationType", null);
        setField(term3047408, term3047408.getClass(), "gravityType", null);
        setField(term3047408, term3047408.getClass(), "temperatureType", null);
        setField(term3047408, term3047408.getClass(), "waterLevel", null);
        setBooleanField(term3047408, term3047408.getClass(), "gasGiant", false);
        setField(term3047408, term3047408.getClass(), "coordinate", null);
        setField(term3047408, term3047408.getClass(), "planetType", null);
        setIntField(term3047408, term3047408.getClass(), "groundSize", 0);
        setIntField(term3047408, term3047408.getClass(), "amountMetalInGround", 0);
        setIntField(term3047408, term3047408.getClass(), "metal", 0);
        setIntField(term3047408, term3047408.getClass(), "prodResource", 0);
        setIntField(term3047408, term3047408.getClass(), "extraFood", 0);
        setIntField(term3047408, term3047408.getClass(), "culture", 0);
        setIntField(term3047408, term3047408.getClass(), "planetOwner", 0);
        setField(term3047408, term3047408.getClass(), "planetOwnerInfo", null);
        setField(term3047408, term3047408.getClass(), "homeWorldId", null);
        setIntField(term3047408, term3047408.getClass(), "startRealmIndex", 0);
        setIntField(term3047408, term3047408.getClass(), "tax", 0);
        setField(term3047408, term3047408.getClass(), "statuses", null);
        setField(term3047408, term3047408.getClass(), "timedStatuses", null);
        setField(term3047408, term3047408.getClass(), "event", null);
        setBooleanField(term3047408, term3047408.getClass(), "eventFound", false);
        setField(term3047408, term3047408.getClass(), "happinessEffect", null);
        setField(term3047408, term3047408.getClass(), "happinessExplanation", null);
        setField(term3047408, term3047408.getClass(), "farmProdExplain", null);
        setField(term3047408, term3047408.getClass(), "metaProdExplain", null);
        setField(term3047408, term3047408.getClass(), "prodProdExplain", null);
        setField(term3047408, term3047408.getClass(), "reseProdExplain", null);
        setField(term3047408, term3047408.getClass(), "cultProdExplain", null);
        setField(term3047408, term3047408.getClass(), "credProdExplain", null);
        setField(term3047408, term3047408.getClass(), "governor", null);
        setIntField(term3047408, term3047408.getClass(), "governorGuide", 0);
        setField(term3047408, term3047408.getClass(), "orbital", null);
        setField(term3047408, term3047408.getClass(), "workers", null);
        setField(term3047408, term3047408.getClass(), "buildings", null);
        setField(term3047408, term3047408.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimedStatuses", argTypes, term3047408, args);
    }

};



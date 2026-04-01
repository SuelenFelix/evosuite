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

public class Planet_addTimedStatus_1583921683236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3009422;

    public Planet_addTimedStatus_1583921683236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3009422 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3009422, term3009422.getClass(), "name", null);
        setIntField(term3009422, term3009422.getClass(), "orderNumber", 0);
        setField(term3009422, term3009422.getClass(), "radiationType", null);
        setField(term3009422, term3009422.getClass(), "gravityType", null);
        setField(term3009422, term3009422.getClass(), "temperatureType", null);
        setField(term3009422, term3009422.getClass(), "waterLevel", null);
        setBooleanField(term3009422, term3009422.getClass(), "gasGiant", false);
        setField(term3009422, term3009422.getClass(), "coordinate", null);
        setField(term3009422, term3009422.getClass(), "planetType", null);
        setIntField(term3009422, term3009422.getClass(), "groundSize", 0);
        setIntField(term3009422, term3009422.getClass(), "amountMetalInGround", 0);
        setIntField(term3009422, term3009422.getClass(), "metal", 0);
        setIntField(term3009422, term3009422.getClass(), "prodResource", 0);
        setIntField(term3009422, term3009422.getClass(), "extraFood", 0);
        setIntField(term3009422, term3009422.getClass(), "culture", 0);
        setIntField(term3009422, term3009422.getClass(), "planetOwner", 0);
        setField(term3009422, term3009422.getClass(), "planetOwnerInfo", null);
        setField(term3009422, term3009422.getClass(), "homeWorldId", null);
        setIntField(term3009422, term3009422.getClass(), "startRealmIndex", 0);
        setIntField(term3009422, term3009422.getClass(), "tax", 0);
        setField(term3009422, term3009422.getClass(), "statuses", null);
        setField(term3009422, term3009422.getClass(), "timedStatuses", null);
        setField(term3009422, term3009422.getClass(), "event", null);
        setBooleanField(term3009422, term3009422.getClass(), "eventFound", false);
        setField(term3009422, term3009422.getClass(), "happinessEffect", null);
        setField(term3009422, term3009422.getClass(), "happinessExplanation", null);
        setField(term3009422, term3009422.getClass(), "farmProdExplain", null);
        setField(term3009422, term3009422.getClass(), "metaProdExplain", null);
        setField(term3009422, term3009422.getClass(), "prodProdExplain", null);
        setField(term3009422, term3009422.getClass(), "reseProdExplain", null);
        setField(term3009422, term3009422.getClass(), "cultProdExplain", null);
        setField(term3009422, term3009422.getClass(), "credProdExplain", null);
        setField(term3009422, term3009422.getClass(), "governor", null);
        setIntField(term3009422, term3009422.getClass(), "governorGuide", 0);
        setField(term3009422, term3009422.getClass(), "orbital", null);
        setField(term3009422, term3009422.getClass(), "workers", null);
        setField(term3009422, term3009422.getClass(), "buildings", null);
        setField(term3009422, term3009422.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.status.TimedStatus");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addTimedStatus", argTypes, term3009422, args);
    }

};



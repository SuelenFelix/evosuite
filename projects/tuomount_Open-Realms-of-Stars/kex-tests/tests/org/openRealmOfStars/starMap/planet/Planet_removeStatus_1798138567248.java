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

public class Planet_removeStatus_1798138567248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3062304;

    public Planet_removeStatus_1798138567248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3062304 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3062304, term3062304.getClass(), "name", null);
        setIntField(term3062304, term3062304.getClass(), "orderNumber", 0);
        setField(term3062304, term3062304.getClass(), "radiationType", null);
        setField(term3062304, term3062304.getClass(), "gravityType", null);
        setField(term3062304, term3062304.getClass(), "temperatureType", null);
        setField(term3062304, term3062304.getClass(), "waterLevel", null);
        setBooleanField(term3062304, term3062304.getClass(), "gasGiant", false);
        setField(term3062304, term3062304.getClass(), "coordinate", null);
        setField(term3062304, term3062304.getClass(), "planetType", null);
        setIntField(term3062304, term3062304.getClass(), "groundSize", 0);
        setIntField(term3062304, term3062304.getClass(), "amountMetalInGround", 0);
        setIntField(term3062304, term3062304.getClass(), "metal", 0);
        setIntField(term3062304, term3062304.getClass(), "prodResource", 0);
        setIntField(term3062304, term3062304.getClass(), "extraFood", 0);
        setIntField(term3062304, term3062304.getClass(), "culture", 0);
        setIntField(term3062304, term3062304.getClass(), "planetOwner", 0);
        setField(term3062304, term3062304.getClass(), "planetOwnerInfo", null);
        setField(term3062304, term3062304.getClass(), "homeWorldId", null);
        setIntField(term3062304, term3062304.getClass(), "startRealmIndex", 0);
        setIntField(term3062304, term3062304.getClass(), "tax", 0);
        setField(term3062304, term3062304.getClass(), "statuses", null);
        setField(term3062304, term3062304.getClass(), "timedStatuses", null);
        setField(term3062304, term3062304.getClass(), "event", null);
        setBooleanField(term3062304, term3062304.getClass(), "eventFound", false);
        setField(term3062304, term3062304.getClass(), "happinessEffect", null);
        setField(term3062304, term3062304.getClass(), "happinessExplanation", null);
        setField(term3062304, term3062304.getClass(), "farmProdExplain", null);
        setField(term3062304, term3062304.getClass(), "metaProdExplain", null);
        setField(term3062304, term3062304.getClass(), "prodProdExplain", null);
        setField(term3062304, term3062304.getClass(), "reseProdExplain", null);
        setField(term3062304, term3062304.getClass(), "cultProdExplain", null);
        setField(term3062304, term3062304.getClass(), "credProdExplain", null);
        setField(term3062304, term3062304.getClass(), "governor", null);
        setIntField(term3062304, term3062304.getClass(), "governorGuide", 0);
        setField(term3062304, term3062304.getClass(), "orbital", null);
        setField(term3062304, term3062304.getClass(), "workers", null);
        setField(term3062304, term3062304.getClass(), "buildings", null);
        setField(term3062304, term3062304.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "removeStatus", argTypes, term3062304, args);
    }

};



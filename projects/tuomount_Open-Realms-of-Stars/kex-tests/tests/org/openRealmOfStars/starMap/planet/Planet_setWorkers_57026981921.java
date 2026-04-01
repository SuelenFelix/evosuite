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
import java.lang.Integer;

public class Planet_setWorkers_57026981921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110402;
     Object term110416;
     Object term110418;

    public Planet_setWorkers_57026981921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110402 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term110402, term110402.getClass(), "name", null);
        setIntField(term110402, term110402.getClass(), "orderNumber", 0);
        setField(term110402, term110402.getClass(), "radiationType", null);
        setField(term110402, term110402.getClass(), "gravityType", null);
        setField(term110402, term110402.getClass(), "temperatureType", null);
        setField(term110402, term110402.getClass(), "waterLevel", null);
        setBooleanField(term110402, term110402.getClass(), "gasGiant", false);
        setField(term110402, term110402.getClass(), "coordinate", null);
        setField(term110402, term110402.getClass(), "planetType", null);
        setIntField(term110402, term110402.getClass(), "groundSize", 0);
        setIntField(term110402, term110402.getClass(), "amountMetalInGround", 0);
        setIntField(term110402, term110402.getClass(), "metal", 0);
        setIntField(term110402, term110402.getClass(), "prodResource", 0);
        setIntField(term110402, term110402.getClass(), "extraFood", 0);
        setIntField(term110402, term110402.getClass(), "culture", 0);
        setIntField(term110402, term110402.getClass(), "planetOwner", 0);
        setField(term110402, term110402.getClass(), "planetOwnerInfo", null);
        setField(term110402, term110402.getClass(), "homeWorldId", null);
        setIntField(term110402, term110402.getClass(), "startRealmIndex", 0);
        setIntField(term110402, term110402.getClass(), "tax", 0);
        setField(term110402, term110402.getClass(), "statuses", null);
        setField(term110402, term110402.getClass(), "timedStatuses", null);
        setField(term110402, term110402.getClass(), "event", null);
        setBooleanField(term110402, term110402.getClass(), "eventFound", false);
        setField(term110402, term110402.getClass(), "happinessEffect", null);
        setField(term110402, term110402.getClass(), "happinessExplanation", null);
        setField(term110402, term110402.getClass(), "farmProdExplain", null);
        setField(term110402, term110402.getClass(), "metaProdExplain", null);
        setField(term110402, term110402.getClass(), "prodProdExplain", null);
        setField(term110402, term110402.getClass(), "reseProdExplain", null);
        setField(term110402, term110402.getClass(), "cultProdExplain", null);
        setField(term110402, term110402.getClass(), "credProdExplain", null);
        setField(term110402, term110402.getClass(), "governor", null);
        setIntField(term110402, term110402.getClass(), "governorGuide", 0);
        setField(term110402, term110402.getClass(), "orbital", null);
        setField(term110402, term110402.getClass(), "workers", null);
        setField(term110402, term110402.getClass(), "buildings", null);
        setField(term110402, term110402.getClass(), "underConstruction", null);
        term110416 = new Integer(0);
        term110418 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term110416;
        args[1] = term110418;
        callMethod(klass, "setWorkers", argTypes, term110402, args);
    }

};



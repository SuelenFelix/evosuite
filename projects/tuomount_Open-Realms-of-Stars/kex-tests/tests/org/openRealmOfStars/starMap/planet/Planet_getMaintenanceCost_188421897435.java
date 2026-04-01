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

public class Planet_getMaintenanceCost_188421897435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170184;

    public Planet_getMaintenanceCost_188421897435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170184 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term170184, term170184.getClass(), "name", null);
        setIntField(term170184, term170184.getClass(), "orderNumber", 0);
        setField(term170184, term170184.getClass(), "radiationType", null);
        setField(term170184, term170184.getClass(), "gravityType", null);
        setField(term170184, term170184.getClass(), "temperatureType", null);
        setField(term170184, term170184.getClass(), "waterLevel", null);
        setBooleanField(term170184, term170184.getClass(), "gasGiant", false);
        setField(term170184, term170184.getClass(), "coordinate", null);
        setField(term170184, term170184.getClass(), "planetType", null);
        setIntField(term170184, term170184.getClass(), "groundSize", 0);
        setIntField(term170184, term170184.getClass(), "amountMetalInGround", 0);
        setIntField(term170184, term170184.getClass(), "metal", 0);
        setIntField(term170184, term170184.getClass(), "prodResource", 0);
        setIntField(term170184, term170184.getClass(), "extraFood", 0);
        setIntField(term170184, term170184.getClass(), "culture", 0);
        setIntField(term170184, term170184.getClass(), "planetOwner", 0);
        setField(term170184, term170184.getClass(), "planetOwnerInfo", null);
        setField(term170184, term170184.getClass(), "homeWorldId", null);
        setIntField(term170184, term170184.getClass(), "startRealmIndex", 0);
        setIntField(term170184, term170184.getClass(), "tax", 0);
        setField(term170184, term170184.getClass(), "statuses", null);
        setField(term170184, term170184.getClass(), "timedStatuses", null);
        setField(term170184, term170184.getClass(), "event", null);
        setBooleanField(term170184, term170184.getClass(), "eventFound", false);
        setField(term170184, term170184.getClass(), "happinessEffect", null);
        setField(term170184, term170184.getClass(), "happinessExplanation", null);
        setField(term170184, term170184.getClass(), "farmProdExplain", null);
        setField(term170184, term170184.getClass(), "metaProdExplain", null);
        setField(term170184, term170184.getClass(), "prodProdExplain", null);
        setField(term170184, term170184.getClass(), "reseProdExplain", null);
        setField(term170184, term170184.getClass(), "cultProdExplain", null);
        setField(term170184, term170184.getClass(), "credProdExplain", null);
        setField(term170184, term170184.getClass(), "governor", null);
        setIntField(term170184, term170184.getClass(), "governorGuide", 0);
        setField(term170184, term170184.getClass(), "orbital", null);
        setField(term170184, term170184.getClass(), "workers", null);
        setField(term170184, term170184.getClass(), "buildings", null);
        setField(term170184, term170184.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaintenanceCost", argTypes, term170184, args);
    }

};



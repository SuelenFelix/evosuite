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

public class Planet_getOrderNumber_104320622995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403124;

    public Planet_getOrderNumber_104320622995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403124 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term403124, term403124.getClass(), "name", null);
        setIntField(term403124, term403124.getClass(), "orderNumber", 0);
        setField(term403124, term403124.getClass(), "radiationType", null);
        setField(term403124, term403124.getClass(), "gravityType", null);
        setField(term403124, term403124.getClass(), "temperatureType", null);
        setField(term403124, term403124.getClass(), "waterLevel", null);
        setBooleanField(term403124, term403124.getClass(), "gasGiant", false);
        setField(term403124, term403124.getClass(), "coordinate", null);
        setField(term403124, term403124.getClass(), "planetType", null);
        setIntField(term403124, term403124.getClass(), "groundSize", 0);
        setIntField(term403124, term403124.getClass(), "amountMetalInGround", 0);
        setIntField(term403124, term403124.getClass(), "metal", 0);
        setIntField(term403124, term403124.getClass(), "prodResource", 0);
        setIntField(term403124, term403124.getClass(), "extraFood", 0);
        setIntField(term403124, term403124.getClass(), "culture", 0);
        setIntField(term403124, term403124.getClass(), "planetOwner", 0);
        setField(term403124, term403124.getClass(), "planetOwnerInfo", null);
        setField(term403124, term403124.getClass(), "homeWorldId", null);
        setIntField(term403124, term403124.getClass(), "startRealmIndex", 0);
        setIntField(term403124, term403124.getClass(), "tax", 0);
        setField(term403124, term403124.getClass(), "statuses", null);
        setField(term403124, term403124.getClass(), "timedStatuses", null);
        setField(term403124, term403124.getClass(), "event", null);
        setBooleanField(term403124, term403124.getClass(), "eventFound", false);
        setField(term403124, term403124.getClass(), "happinessEffect", null);
        setField(term403124, term403124.getClass(), "happinessExplanation", null);
        setField(term403124, term403124.getClass(), "farmProdExplain", null);
        setField(term403124, term403124.getClass(), "metaProdExplain", null);
        setField(term403124, term403124.getClass(), "prodProdExplain", null);
        setField(term403124, term403124.getClass(), "reseProdExplain", null);
        setField(term403124, term403124.getClass(), "cultProdExplain", null);
        setField(term403124, term403124.getClass(), "credProdExplain", null);
        setField(term403124, term403124.getClass(), "governor", null);
        setIntField(term403124, term403124.getClass(), "governorGuide", 0);
        setField(term403124, term403124.getClass(), "orbital", null);
        setField(term403124, term403124.getClass(), "workers", null);
        setField(term403124, term403124.getClass(), "buildings", null);
        setField(term403124, term403124.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrderNumber", argTypes, term403124, args);
    }

};



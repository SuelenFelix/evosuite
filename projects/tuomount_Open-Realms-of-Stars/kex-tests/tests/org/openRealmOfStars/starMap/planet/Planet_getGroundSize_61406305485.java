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

public class Planet_getGroundSize_61406305485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term359302;

    public Planet_getGroundSize_61406305485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term359302 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term359302, term359302.getClass(), "name", null);
        setIntField(term359302, term359302.getClass(), "orderNumber", 0);
        setField(term359302, term359302.getClass(), "radiationType", null);
        setField(term359302, term359302.getClass(), "gravityType", null);
        setField(term359302, term359302.getClass(), "temperatureType", null);
        setField(term359302, term359302.getClass(), "waterLevel", null);
        setBooleanField(term359302, term359302.getClass(), "gasGiant", false);
        setField(term359302, term359302.getClass(), "coordinate", null);
        setField(term359302, term359302.getClass(), "planetType", null);
        setIntField(term359302, term359302.getClass(), "groundSize", 0);
        setIntField(term359302, term359302.getClass(), "amountMetalInGround", 0);
        setIntField(term359302, term359302.getClass(), "metal", 0);
        setIntField(term359302, term359302.getClass(), "prodResource", 0);
        setIntField(term359302, term359302.getClass(), "extraFood", 0);
        setIntField(term359302, term359302.getClass(), "culture", 0);
        setIntField(term359302, term359302.getClass(), "planetOwner", 0);
        setField(term359302, term359302.getClass(), "planetOwnerInfo", null);
        setField(term359302, term359302.getClass(), "homeWorldId", null);
        setIntField(term359302, term359302.getClass(), "startRealmIndex", 0);
        setIntField(term359302, term359302.getClass(), "tax", 0);
        setField(term359302, term359302.getClass(), "statuses", null);
        setField(term359302, term359302.getClass(), "timedStatuses", null);
        setField(term359302, term359302.getClass(), "event", null);
        setBooleanField(term359302, term359302.getClass(), "eventFound", false);
        setField(term359302, term359302.getClass(), "happinessEffect", null);
        setField(term359302, term359302.getClass(), "happinessExplanation", null);
        setField(term359302, term359302.getClass(), "farmProdExplain", null);
        setField(term359302, term359302.getClass(), "metaProdExplain", null);
        setField(term359302, term359302.getClass(), "prodProdExplain", null);
        setField(term359302, term359302.getClass(), "reseProdExplain", null);
        setField(term359302, term359302.getClass(), "cultProdExplain", null);
        setField(term359302, term359302.getClass(), "credProdExplain", null);
        setField(term359302, term359302.getClass(), "governor", null);
        setIntField(term359302, term359302.getClass(), "governorGuide", 0);
        setField(term359302, term359302.getClass(), "orbital", null);
        setField(term359302, term359302.getClass(), "workers", null);
        setField(term359302, term359302.getClass(), "buildings", null);
        setField(term359302, term359302.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGroundSize", argTypes, term359302, args);
    }

};



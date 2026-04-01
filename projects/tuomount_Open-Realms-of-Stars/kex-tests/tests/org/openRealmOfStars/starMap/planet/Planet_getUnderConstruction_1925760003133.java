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

public class Planet_getUnderConstruction_1925760003133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term571313;

    public Planet_getUnderConstruction_1925760003133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term571313 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term571313, term571313.getClass(), "name", null);
        setIntField(term571313, term571313.getClass(), "orderNumber", 0);
        setField(term571313, term571313.getClass(), "radiationType", null);
        setField(term571313, term571313.getClass(), "gravityType", null);
        setField(term571313, term571313.getClass(), "temperatureType", null);
        setField(term571313, term571313.getClass(), "waterLevel", null);
        setBooleanField(term571313, term571313.getClass(), "gasGiant", false);
        setField(term571313, term571313.getClass(), "coordinate", null);
        setField(term571313, term571313.getClass(), "planetType", null);
        setIntField(term571313, term571313.getClass(), "groundSize", 0);
        setIntField(term571313, term571313.getClass(), "amountMetalInGround", 0);
        setIntField(term571313, term571313.getClass(), "metal", 0);
        setIntField(term571313, term571313.getClass(), "prodResource", 0);
        setIntField(term571313, term571313.getClass(), "extraFood", 0);
        setIntField(term571313, term571313.getClass(), "culture", 0);
        setIntField(term571313, term571313.getClass(), "planetOwner", 0);
        setField(term571313, term571313.getClass(), "planetOwnerInfo", null);
        setField(term571313, term571313.getClass(), "homeWorldId", null);
        setIntField(term571313, term571313.getClass(), "startRealmIndex", 0);
        setIntField(term571313, term571313.getClass(), "tax", 0);
        setField(term571313, term571313.getClass(), "statuses", null);
        setField(term571313, term571313.getClass(), "timedStatuses", null);
        setField(term571313, term571313.getClass(), "event", null);
        setBooleanField(term571313, term571313.getClass(), "eventFound", false);
        setField(term571313, term571313.getClass(), "happinessEffect", null);
        setField(term571313, term571313.getClass(), "happinessExplanation", null);
        setField(term571313, term571313.getClass(), "farmProdExplain", null);
        setField(term571313, term571313.getClass(), "metaProdExplain", null);
        setField(term571313, term571313.getClass(), "prodProdExplain", null);
        setField(term571313, term571313.getClass(), "reseProdExplain", null);
        setField(term571313, term571313.getClass(), "cultProdExplain", null);
        setField(term571313, term571313.getClass(), "credProdExplain", null);
        setField(term571313, term571313.getClass(), "governor", null);
        setIntField(term571313, term571313.getClass(), "governorGuide", 0);
        setField(term571313, term571313.getClass(), "orbital", null);
        setField(term571313, term571313.getClass(), "workers", null);
        setField(term571313, term571313.getClass(), "buildings", null);
        setField(term571313, term571313.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnderConstruction", argTypes, term571313, args);
    }

};



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

public class Planet_setCoordinate_1325614584321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1325944;

    public Planet_setCoordinate_1325614584321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1325944 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term1325944, term1325944.getClass(), "name", null);
        setIntField(term1325944, term1325944.getClass(), "orderNumber", 0);
        setField(term1325944, term1325944.getClass(), "radiationType", null);
        setField(term1325944, term1325944.getClass(), "gravityType", null);
        setField(term1325944, term1325944.getClass(), "temperatureType", null);
        setField(term1325944, term1325944.getClass(), "waterLevel", null);
        setBooleanField(term1325944, term1325944.getClass(), "gasGiant", false);
        setField(term1325944, term1325944.getClass(), "coordinate", null);
        setField(term1325944, term1325944.getClass(), "planetType", null);
        setIntField(term1325944, term1325944.getClass(), "groundSize", 0);
        setIntField(term1325944, term1325944.getClass(), "amountMetalInGround", 0);
        setIntField(term1325944, term1325944.getClass(), "metal", 0);
        setIntField(term1325944, term1325944.getClass(), "prodResource", 0);
        setIntField(term1325944, term1325944.getClass(), "extraFood", 0);
        setIntField(term1325944, term1325944.getClass(), "culture", 0);
        setIntField(term1325944, term1325944.getClass(), "planetOwner", 0);
        setField(term1325944, term1325944.getClass(), "planetOwnerInfo", null);
        setField(term1325944, term1325944.getClass(), "homeWorldId", null);
        setIntField(term1325944, term1325944.getClass(), "startRealmIndex", 0);
        setIntField(term1325944, term1325944.getClass(), "tax", 0);
        setField(term1325944, term1325944.getClass(), "statuses", null);
        setField(term1325944, term1325944.getClass(), "timedStatuses", null);
        setField(term1325944, term1325944.getClass(), "event", null);
        setBooleanField(term1325944, term1325944.getClass(), "eventFound", false);
        setField(term1325944, term1325944.getClass(), "happinessEffect", null);
        setField(term1325944, term1325944.getClass(), "happinessExplanation", null);
        setField(term1325944, term1325944.getClass(), "farmProdExplain", null);
        setField(term1325944, term1325944.getClass(), "metaProdExplain", null);
        setField(term1325944, term1325944.getClass(), "prodProdExplain", null);
        setField(term1325944, term1325944.getClass(), "reseProdExplain", null);
        setField(term1325944, term1325944.getClass(), "cultProdExplain", null);
        setField(term1325944, term1325944.getClass(), "credProdExplain", null);
        setField(term1325944, term1325944.getClass(), "governor", null);
        setIntField(term1325944, term1325944.getClass(), "governorGuide", 0);
        setField(term1325944, term1325944.getClass(), "orbital", null);
        setField(term1325944, term1325944.getClass(), "workers", null);
        setField(term1325944, term1325944.getClass(), "buildings", null);
        setField(term1325944, term1325944.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCoordinate", argTypes, term1325944, args);
    }

};



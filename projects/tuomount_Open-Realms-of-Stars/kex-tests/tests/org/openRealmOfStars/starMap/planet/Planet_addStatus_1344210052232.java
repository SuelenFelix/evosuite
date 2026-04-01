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

public class Planet_addStatus_1344210052232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term982120;

    public Planet_addStatus_1344210052232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term982120 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term982120, term982120.getClass(), "name", null);
        setIntField(term982120, term982120.getClass(), "orderNumber", 0);
        setField(term982120, term982120.getClass(), "radiationType", null);
        setField(term982120, term982120.getClass(), "gravityType", null);
        setField(term982120, term982120.getClass(), "temperatureType", null);
        setField(term982120, term982120.getClass(), "waterLevel", null);
        setBooleanField(term982120, term982120.getClass(), "gasGiant", false);
        setField(term982120, term982120.getClass(), "coordinate", null);
        setField(term982120, term982120.getClass(), "planetType", null);
        setIntField(term982120, term982120.getClass(), "groundSize", 0);
        setIntField(term982120, term982120.getClass(), "amountMetalInGround", 0);
        setIntField(term982120, term982120.getClass(), "metal", 0);
        setIntField(term982120, term982120.getClass(), "prodResource", 0);
        setIntField(term982120, term982120.getClass(), "extraFood", 0);
        setIntField(term982120, term982120.getClass(), "culture", 0);
        setIntField(term982120, term982120.getClass(), "planetOwner", 0);
        setField(term982120, term982120.getClass(), "planetOwnerInfo", null);
        setField(term982120, term982120.getClass(), "homeWorldId", null);
        setIntField(term982120, term982120.getClass(), "startRealmIndex", 0);
        setIntField(term982120, term982120.getClass(), "tax", 0);
        setField(term982120, term982120.getClass(), "statuses", null);
        setField(term982120, term982120.getClass(), "timedStatuses", null);
        setField(term982120, term982120.getClass(), "event", null);
        setBooleanField(term982120, term982120.getClass(), "eventFound", false);
        setField(term982120, term982120.getClass(), "happinessEffect", null);
        setField(term982120, term982120.getClass(), "happinessExplanation", null);
        setField(term982120, term982120.getClass(), "farmProdExplain", null);
        setField(term982120, term982120.getClass(), "metaProdExplain", null);
        setField(term982120, term982120.getClass(), "prodProdExplain", null);
        setField(term982120, term982120.getClass(), "reseProdExplain", null);
        setField(term982120, term982120.getClass(), "cultProdExplain", null);
        setField(term982120, term982120.getClass(), "credProdExplain", null);
        setField(term982120, term982120.getClass(), "governor", null);
        setIntField(term982120, term982120.getClass(), "governorGuide", 0);
        setField(term982120, term982120.getClass(), "orbital", null);
        setField(term982120, term982120.getClass(), "workers", null);
        setField(term982120, term982120.getClass(), "buildings", null);
        setField(term982120, term982120.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.status.AppliedStatus");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addStatus", argTypes, term982120, args);
    }

};



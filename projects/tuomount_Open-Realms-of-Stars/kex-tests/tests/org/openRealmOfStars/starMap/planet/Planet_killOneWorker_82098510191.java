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

public class Planet_killOneWorker_82098510191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term805382;

    public Planet_killOneWorker_82098510191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term805382 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term805382, term805382.getClass(), "name", null);
        setIntField(term805382, term805382.getClass(), "orderNumber", 0);
        setField(term805382, term805382.getClass(), "radiationType", null);
        setField(term805382, term805382.getClass(), "gravityType", null);
        setField(term805382, term805382.getClass(), "temperatureType", null);
        setField(term805382, term805382.getClass(), "waterLevel", null);
        setBooleanField(term805382, term805382.getClass(), "gasGiant", false);
        setField(term805382, term805382.getClass(), "coordinate", null);
        setField(term805382, term805382.getClass(), "planetType", null);
        setIntField(term805382, term805382.getClass(), "groundSize", 0);
        setIntField(term805382, term805382.getClass(), "amountMetalInGround", 0);
        setIntField(term805382, term805382.getClass(), "metal", 0);
        setIntField(term805382, term805382.getClass(), "prodResource", 0);
        setIntField(term805382, term805382.getClass(), "extraFood", 0);
        setIntField(term805382, term805382.getClass(), "culture", 0);
        setIntField(term805382, term805382.getClass(), "planetOwner", 0);
        setField(term805382, term805382.getClass(), "planetOwnerInfo", null);
        setField(term805382, term805382.getClass(), "homeWorldId", null);
        setIntField(term805382, term805382.getClass(), "startRealmIndex", 0);
        setIntField(term805382, term805382.getClass(), "tax", 0);
        setField(term805382, term805382.getClass(), "statuses", null);
        setField(term805382, term805382.getClass(), "timedStatuses", null);
        setField(term805382, term805382.getClass(), "event", null);
        setBooleanField(term805382, term805382.getClass(), "eventFound", false);
        setField(term805382, term805382.getClass(), "happinessEffect", null);
        setField(term805382, term805382.getClass(), "happinessExplanation", null);
        setField(term805382, term805382.getClass(), "farmProdExplain", null);
        setField(term805382, term805382.getClass(), "metaProdExplain", null);
        setField(term805382, term805382.getClass(), "prodProdExplain", null);
        setField(term805382, term805382.getClass(), "reseProdExplain", null);
        setField(term805382, term805382.getClass(), "cultProdExplain", null);
        setField(term805382, term805382.getClass(), "credProdExplain", null);
        setField(term805382, term805382.getClass(), "governor", null);
        setIntField(term805382, term805382.getClass(), "governorGuide", 0);
        setField(term805382, term805382.getClass(), "orbital", null);
        setField(term805382, term805382.getClass(), "workers", null);
        setField(term805382, term805382.getClass(), "buildings", null);
        setField(term805382, term805382.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "killOneWorker", argTypes, term805382, args);
    }

};



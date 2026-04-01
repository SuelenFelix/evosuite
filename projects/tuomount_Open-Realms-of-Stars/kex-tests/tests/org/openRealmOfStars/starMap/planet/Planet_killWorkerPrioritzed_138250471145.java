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

public class Planet_killWorkerPrioritzed_138250471145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term612409;

    public Planet_killWorkerPrioritzed_138250471145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term612409 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term612409, term612409.getClass(), "name", null);
        setIntField(term612409, term612409.getClass(), "orderNumber", 0);
        setField(term612409, term612409.getClass(), "radiationType", null);
        setField(term612409, term612409.getClass(), "gravityType", null);
        setField(term612409, term612409.getClass(), "temperatureType", null);
        setField(term612409, term612409.getClass(), "waterLevel", null);
        setBooleanField(term612409, term612409.getClass(), "gasGiant", false);
        setField(term612409, term612409.getClass(), "coordinate", null);
        setField(term612409, term612409.getClass(), "planetType", null);
        setIntField(term612409, term612409.getClass(), "groundSize", 0);
        setIntField(term612409, term612409.getClass(), "amountMetalInGround", 0);
        setIntField(term612409, term612409.getClass(), "metal", 0);
        setIntField(term612409, term612409.getClass(), "prodResource", 0);
        setIntField(term612409, term612409.getClass(), "extraFood", 0);
        setIntField(term612409, term612409.getClass(), "culture", 0);
        setIntField(term612409, term612409.getClass(), "planetOwner", 0);
        setField(term612409, term612409.getClass(), "planetOwnerInfo", null);
        setField(term612409, term612409.getClass(), "homeWorldId", null);
        setIntField(term612409, term612409.getClass(), "startRealmIndex", 0);
        setIntField(term612409, term612409.getClass(), "tax", 0);
        setField(term612409, term612409.getClass(), "statuses", null);
        setField(term612409, term612409.getClass(), "timedStatuses", null);
        setField(term612409, term612409.getClass(), "event", null);
        setBooleanField(term612409, term612409.getClass(), "eventFound", false);
        setField(term612409, term612409.getClass(), "happinessEffect", null);
        setField(term612409, term612409.getClass(), "happinessExplanation", null);
        setField(term612409, term612409.getClass(), "farmProdExplain", null);
        setField(term612409, term612409.getClass(), "metaProdExplain", null);
        setField(term612409, term612409.getClass(), "prodProdExplain", null);
        setField(term612409, term612409.getClass(), "reseProdExplain", null);
        setField(term612409, term612409.getClass(), "cultProdExplain", null);
        setField(term612409, term612409.getClass(), "credProdExplain", null);
        setField(term612409, term612409.getClass(), "governor", null);
        setIntField(term612409, term612409.getClass(), "governorGuide", 0);
        setField(term612409, term612409.getClass(), "orbital", null);
        setField(term612409, term612409.getClass(), "workers", null);
        setField(term612409, term612409.getClass(), "buildings", null);
        setField(term612409, term612409.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "killWorkerPrioritzed", argTypes, term612409, args);
    }

};



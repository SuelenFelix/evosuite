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

public class Planet_killWorkerPrioritzed_138250471153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2650011;

    public Planet_killWorkerPrioritzed_138250471153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2650011 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2650011, term2650011.getClass(), "name", null);
        setIntField(term2650011, term2650011.getClass(), "orderNumber", 0);
        setField(term2650011, term2650011.getClass(), "radiationType", null);
        setField(term2650011, term2650011.getClass(), "gravityType", null);
        setField(term2650011, term2650011.getClass(), "temperatureType", null);
        setField(term2650011, term2650011.getClass(), "waterLevel", null);
        setBooleanField(term2650011, term2650011.getClass(), "gasGiant", false);
        setField(term2650011, term2650011.getClass(), "coordinate", null);
        setField(term2650011, term2650011.getClass(), "planetType", null);
        setIntField(term2650011, term2650011.getClass(), "groundSize", 0);
        setIntField(term2650011, term2650011.getClass(), "amountMetalInGround", 0);
        setIntField(term2650011, term2650011.getClass(), "metal", 0);
        setIntField(term2650011, term2650011.getClass(), "prodResource", 0);
        setIntField(term2650011, term2650011.getClass(), "extraFood", 0);
        setIntField(term2650011, term2650011.getClass(), "culture", 0);
        setIntField(term2650011, term2650011.getClass(), "planetOwner", 0);
        setField(term2650011, term2650011.getClass(), "planetOwnerInfo", null);
        setField(term2650011, term2650011.getClass(), "homeWorldId", null);
        setIntField(term2650011, term2650011.getClass(), "startRealmIndex", 0);
        setIntField(term2650011, term2650011.getClass(), "tax", 0);
        setField(term2650011, term2650011.getClass(), "statuses", null);
        setField(term2650011, term2650011.getClass(), "timedStatuses", null);
        setField(term2650011, term2650011.getClass(), "event", null);
        setBooleanField(term2650011, term2650011.getClass(), "eventFound", false);
        setField(term2650011, term2650011.getClass(), "happinessEffect", null);
        setField(term2650011, term2650011.getClass(), "happinessExplanation", null);
        setField(term2650011, term2650011.getClass(), "farmProdExplain", null);
        setField(term2650011, term2650011.getClass(), "metaProdExplain", null);
        setField(term2650011, term2650011.getClass(), "prodProdExplain", null);
        setField(term2650011, term2650011.getClass(), "reseProdExplain", null);
        setField(term2650011, term2650011.getClass(), "cultProdExplain", null);
        setField(term2650011, term2650011.getClass(), "credProdExplain", null);
        setField(term2650011, term2650011.getClass(), "governor", null);
        setIntField(term2650011, term2650011.getClass(), "governorGuide", 0);
        setField(term2650011, term2650011.getClass(), "orbital", null);
        setField(term2650011, term2650011.getClass(), "workers", null);
        setField(term2650011, term2650011.getClass(), "buildings", null);
        setField(term2650011, term2650011.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "killWorkerPrioritzed", argTypes, term2650011, args);
    }

};



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

public class Planet_killOneWorker_1889443446196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2834291;

    public Planet_killOneWorker_1889443446196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2834291 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2834291, term2834291.getClass(), "name", null);
        setIntField(term2834291, term2834291.getClass(), "orderNumber", 0);
        setField(term2834291, term2834291.getClass(), "radiationType", null);
        setField(term2834291, term2834291.getClass(), "gravityType", null);
        setField(term2834291, term2834291.getClass(), "temperatureType", null);
        setField(term2834291, term2834291.getClass(), "waterLevel", null);
        setBooleanField(term2834291, term2834291.getClass(), "gasGiant", false);
        setField(term2834291, term2834291.getClass(), "coordinate", null);
        setField(term2834291, term2834291.getClass(), "planetType", null);
        setIntField(term2834291, term2834291.getClass(), "groundSize", 0);
        setIntField(term2834291, term2834291.getClass(), "amountMetalInGround", 0);
        setIntField(term2834291, term2834291.getClass(), "metal", 0);
        setIntField(term2834291, term2834291.getClass(), "prodResource", 0);
        setIntField(term2834291, term2834291.getClass(), "extraFood", 0);
        setIntField(term2834291, term2834291.getClass(), "culture", 0);
        setIntField(term2834291, term2834291.getClass(), "planetOwner", 0);
        setField(term2834291, term2834291.getClass(), "planetOwnerInfo", null);
        setField(term2834291, term2834291.getClass(), "homeWorldId", null);
        setIntField(term2834291, term2834291.getClass(), "startRealmIndex", 0);
        setIntField(term2834291, term2834291.getClass(), "tax", 0);
        setField(term2834291, term2834291.getClass(), "statuses", null);
        setField(term2834291, term2834291.getClass(), "timedStatuses", null);
        setField(term2834291, term2834291.getClass(), "event", null);
        setBooleanField(term2834291, term2834291.getClass(), "eventFound", false);
        setField(term2834291, term2834291.getClass(), "happinessEffect", null);
        setField(term2834291, term2834291.getClass(), "happinessExplanation", null);
        setField(term2834291, term2834291.getClass(), "farmProdExplain", null);
        setField(term2834291, term2834291.getClass(), "metaProdExplain", null);
        setField(term2834291, term2834291.getClass(), "prodProdExplain", null);
        setField(term2834291, term2834291.getClass(), "reseProdExplain", null);
        setField(term2834291, term2834291.getClass(), "cultProdExplain", null);
        setField(term2834291, term2834291.getClass(), "credProdExplain", null);
        setField(term2834291, term2834291.getClass(), "governor", null);
        setIntField(term2834291, term2834291.getClass(), "governorGuide", 0);
        setField(term2834291, term2834291.getClass(), "orbital", null);
        setField(term2834291, term2834291.getClass(), "workers", null);
        setField(term2834291, term2834291.getClass(), "buildings", null);
        setField(term2834291, term2834291.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "killOneWorker", argTypes, term2834291, args);
    }

};



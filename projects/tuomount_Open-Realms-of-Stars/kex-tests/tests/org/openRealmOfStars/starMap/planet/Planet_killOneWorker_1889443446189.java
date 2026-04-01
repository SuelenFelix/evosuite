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

public class Planet_killOneWorker_1889443446189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term798364;

    public Planet_killOneWorker_1889443446189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term798364 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term798364, term798364.getClass(), "name", null);
        setIntField(term798364, term798364.getClass(), "orderNumber", 0);
        setField(term798364, term798364.getClass(), "radiationType", null);
        setField(term798364, term798364.getClass(), "gravityType", null);
        setField(term798364, term798364.getClass(), "temperatureType", null);
        setField(term798364, term798364.getClass(), "waterLevel", null);
        setBooleanField(term798364, term798364.getClass(), "gasGiant", false);
        setField(term798364, term798364.getClass(), "coordinate", null);
        setField(term798364, term798364.getClass(), "planetType", null);
        setIntField(term798364, term798364.getClass(), "groundSize", 0);
        setIntField(term798364, term798364.getClass(), "amountMetalInGround", 0);
        setIntField(term798364, term798364.getClass(), "metal", 0);
        setIntField(term798364, term798364.getClass(), "prodResource", 0);
        setIntField(term798364, term798364.getClass(), "extraFood", 0);
        setIntField(term798364, term798364.getClass(), "culture", 0);
        setIntField(term798364, term798364.getClass(), "planetOwner", 0);
        setField(term798364, term798364.getClass(), "planetOwnerInfo", null);
        setField(term798364, term798364.getClass(), "homeWorldId", null);
        setIntField(term798364, term798364.getClass(), "startRealmIndex", 0);
        setIntField(term798364, term798364.getClass(), "tax", 0);
        setField(term798364, term798364.getClass(), "statuses", null);
        setField(term798364, term798364.getClass(), "timedStatuses", null);
        setField(term798364, term798364.getClass(), "event", null);
        setBooleanField(term798364, term798364.getClass(), "eventFound", false);
        setField(term798364, term798364.getClass(), "happinessEffect", null);
        setField(term798364, term798364.getClass(), "happinessExplanation", null);
        setField(term798364, term798364.getClass(), "farmProdExplain", null);
        setField(term798364, term798364.getClass(), "metaProdExplain", null);
        setField(term798364, term798364.getClass(), "prodProdExplain", null);
        setField(term798364, term798364.getClass(), "reseProdExplain", null);
        setField(term798364, term798364.getClass(), "cultProdExplain", null);
        setField(term798364, term798364.getClass(), "credProdExplain", null);
        setField(term798364, term798364.getClass(), "governor", null);
        setIntField(term798364, term798364.getClass(), "governorGuide", 0);
        setField(term798364, term798364.getClass(), "orbital", null);
        setField(term798364, term798364.getClass(), "workers", null);
        setField(term798364, term798364.getClass(), "buildings", null);
        setField(term798364, term798364.getClass(), "underConstruction", null);
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
        callMethod(klass, "killOneWorker", argTypes, term798364, args);
    }

};



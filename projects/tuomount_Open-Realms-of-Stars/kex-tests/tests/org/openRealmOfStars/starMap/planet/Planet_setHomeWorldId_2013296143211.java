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

public class Planet_setHomeWorldId_2013296143211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term904936;

    public Planet_setHomeWorldId_2013296143211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term904936 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term904936, term904936.getClass(), "name", null);
        setIntField(term904936, term904936.getClass(), "orderNumber", 0);
        setField(term904936, term904936.getClass(), "radiationType", null);
        setField(term904936, term904936.getClass(), "gravityType", null);
        setField(term904936, term904936.getClass(), "temperatureType", null);
        setField(term904936, term904936.getClass(), "waterLevel", null);
        setBooleanField(term904936, term904936.getClass(), "gasGiant", false);
        setField(term904936, term904936.getClass(), "coordinate", null);
        setField(term904936, term904936.getClass(), "planetType", null);
        setIntField(term904936, term904936.getClass(), "groundSize", 0);
        setIntField(term904936, term904936.getClass(), "amountMetalInGround", 0);
        setIntField(term904936, term904936.getClass(), "metal", 0);
        setIntField(term904936, term904936.getClass(), "prodResource", 0);
        setIntField(term904936, term904936.getClass(), "extraFood", 0);
        setIntField(term904936, term904936.getClass(), "culture", 0);
        setIntField(term904936, term904936.getClass(), "planetOwner", 0);
        setField(term904936, term904936.getClass(), "planetOwnerInfo", null);
        setField(term904936, term904936.getClass(), "homeWorldId", null);
        setIntField(term904936, term904936.getClass(), "startRealmIndex", 0);
        setIntField(term904936, term904936.getClass(), "tax", 0);
        setField(term904936, term904936.getClass(), "statuses", null);
        setField(term904936, term904936.getClass(), "timedStatuses", null);
        setField(term904936, term904936.getClass(), "event", null);
        setBooleanField(term904936, term904936.getClass(), "eventFound", false);
        setField(term904936, term904936.getClass(), "happinessEffect", null);
        setField(term904936, term904936.getClass(), "happinessExplanation", null);
        setField(term904936, term904936.getClass(), "farmProdExplain", null);
        setField(term904936, term904936.getClass(), "metaProdExplain", null);
        setField(term904936, term904936.getClass(), "prodProdExplain", null);
        setField(term904936, term904936.getClass(), "reseProdExplain", null);
        setField(term904936, term904936.getClass(), "cultProdExplain", null);
        setField(term904936, term904936.getClass(), "credProdExplain", null);
        setField(term904936, term904936.getClass(), "governor", null);
        setIntField(term904936, term904936.getClass(), "governorGuide", 0);
        setField(term904936, term904936.getClass(), "orbital", null);
        setField(term904936, term904936.getClass(), "workers", null);
        setField(term904936, term904936.getClass(), "buildings", null);
        setField(term904936, term904936.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setHomeWorldId", argTypes, term904936, args);
    }

};



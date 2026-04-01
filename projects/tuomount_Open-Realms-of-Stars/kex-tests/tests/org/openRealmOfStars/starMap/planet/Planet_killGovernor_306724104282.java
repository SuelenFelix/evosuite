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

public class Planet_killGovernor_306724104282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3240584;

    public Planet_killGovernor_306724104282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3240584 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3240584, term3240584.getClass(), "name", null);
        setIntField(term3240584, term3240584.getClass(), "orderNumber", 0);
        setField(term3240584, term3240584.getClass(), "radiationType", null);
        setField(term3240584, term3240584.getClass(), "gravityType", null);
        setField(term3240584, term3240584.getClass(), "temperatureType", null);
        setField(term3240584, term3240584.getClass(), "waterLevel", null);
        setBooleanField(term3240584, term3240584.getClass(), "gasGiant", false);
        setField(term3240584, term3240584.getClass(), "coordinate", null);
        setField(term3240584, term3240584.getClass(), "planetType", null);
        setIntField(term3240584, term3240584.getClass(), "groundSize", 0);
        setIntField(term3240584, term3240584.getClass(), "amountMetalInGround", 0);
        setIntField(term3240584, term3240584.getClass(), "metal", 0);
        setIntField(term3240584, term3240584.getClass(), "prodResource", 0);
        setIntField(term3240584, term3240584.getClass(), "extraFood", 0);
        setIntField(term3240584, term3240584.getClass(), "culture", 0);
        setIntField(term3240584, term3240584.getClass(), "planetOwner", 0);
        setField(term3240584, term3240584.getClass(), "planetOwnerInfo", null);
        setField(term3240584, term3240584.getClass(), "homeWorldId", null);
        setIntField(term3240584, term3240584.getClass(), "startRealmIndex", 0);
        setIntField(term3240584, term3240584.getClass(), "tax", 0);
        setField(term3240584, term3240584.getClass(), "statuses", null);
        setField(term3240584, term3240584.getClass(), "timedStatuses", null);
        setField(term3240584, term3240584.getClass(), "event", null);
        setBooleanField(term3240584, term3240584.getClass(), "eventFound", false);
        setField(term3240584, term3240584.getClass(), "happinessEffect", null);
        setField(term3240584, term3240584.getClass(), "happinessExplanation", null);
        setField(term3240584, term3240584.getClass(), "farmProdExplain", null);
        setField(term3240584, term3240584.getClass(), "metaProdExplain", null);
        setField(term3240584, term3240584.getClass(), "prodProdExplain", null);
        setField(term3240584, term3240584.getClass(), "reseProdExplain", null);
        setField(term3240584, term3240584.getClass(), "cultProdExplain", null);
        setField(term3240584, term3240584.getClass(), "credProdExplain", null);
        setField(term3240584, term3240584.getClass(), "governor", null);
        setIntField(term3240584, term3240584.getClass(), "governorGuide", 0);
        setField(term3240584, term3240584.getClass(), "orbital", null);
        setField(term3240584, term3240584.getClass(), "workers", null);
        setField(term3240584, term3240584.getClass(), "buildings", null);
        setField(term3240584, term3240584.getClass(), "underConstruction", null);
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
        callMethod(klass, "killGovernor", argTypes, term3240584, args);
    }

};



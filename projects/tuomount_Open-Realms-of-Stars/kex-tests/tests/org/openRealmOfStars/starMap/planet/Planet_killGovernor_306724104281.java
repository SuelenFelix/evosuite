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

public class Planet_killGovernor_306724104281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1194295;

    public Planet_killGovernor_306724104281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1194295 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term1194295, term1194295.getClass(), "name", null);
        setIntField(term1194295, term1194295.getClass(), "orderNumber", 0);
        setField(term1194295, term1194295.getClass(), "radiationType", null);
        setField(term1194295, term1194295.getClass(), "gravityType", null);
        setField(term1194295, term1194295.getClass(), "temperatureType", null);
        setField(term1194295, term1194295.getClass(), "waterLevel", null);
        setBooleanField(term1194295, term1194295.getClass(), "gasGiant", false);
        setField(term1194295, term1194295.getClass(), "coordinate", null);
        setField(term1194295, term1194295.getClass(), "planetType", null);
        setIntField(term1194295, term1194295.getClass(), "groundSize", 0);
        setIntField(term1194295, term1194295.getClass(), "amountMetalInGround", 0);
        setIntField(term1194295, term1194295.getClass(), "metal", 0);
        setIntField(term1194295, term1194295.getClass(), "prodResource", 0);
        setIntField(term1194295, term1194295.getClass(), "extraFood", 0);
        setIntField(term1194295, term1194295.getClass(), "culture", 0);
        setIntField(term1194295, term1194295.getClass(), "planetOwner", 0);
        setField(term1194295, term1194295.getClass(), "planetOwnerInfo", null);
        setField(term1194295, term1194295.getClass(), "homeWorldId", null);
        setIntField(term1194295, term1194295.getClass(), "startRealmIndex", 0);
        setIntField(term1194295, term1194295.getClass(), "tax", 0);
        setField(term1194295, term1194295.getClass(), "statuses", null);
        setField(term1194295, term1194295.getClass(), "timedStatuses", null);
        setField(term1194295, term1194295.getClass(), "event", null);
        setBooleanField(term1194295, term1194295.getClass(), "eventFound", false);
        setField(term1194295, term1194295.getClass(), "happinessEffect", null);
        setField(term1194295, term1194295.getClass(), "happinessExplanation", null);
        setField(term1194295, term1194295.getClass(), "farmProdExplain", null);
        setField(term1194295, term1194295.getClass(), "metaProdExplain", null);
        setField(term1194295, term1194295.getClass(), "prodProdExplain", null);
        setField(term1194295, term1194295.getClass(), "reseProdExplain", null);
        setField(term1194295, term1194295.getClass(), "cultProdExplain", null);
        setField(term1194295, term1194295.getClass(), "credProdExplain", null);
        setField(term1194295, term1194295.getClass(), "governor", null);
        setIntField(term1194295, term1194295.getClass(), "governorGuide", 0);
        setField(term1194295, term1194295.getClass(), "orbital", null);
        setField(term1194295, term1194295.getClass(), "workers", null);
        setField(term1194295, term1194295.getClass(), "buildings", null);
        setField(term1194295, term1194295.getClass(), "underConstruction", null);
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
        callMethod(klass, "killGovernor", argTypes, term1194295, args);
    }

};



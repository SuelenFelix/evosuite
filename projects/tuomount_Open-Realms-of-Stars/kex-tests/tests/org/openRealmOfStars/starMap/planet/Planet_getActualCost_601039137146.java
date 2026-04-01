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
import java.lang.Integer;

public class Planet_getActualCost_601039137146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2622826;
     Object term2622840;

    public Planet_getActualCost_601039137146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2622826 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2622826, term2622826.getClass(), "name", null);
        setIntField(term2622826, term2622826.getClass(), "orderNumber", 0);
        setField(term2622826, term2622826.getClass(), "radiationType", null);
        setField(term2622826, term2622826.getClass(), "gravityType", null);
        setField(term2622826, term2622826.getClass(), "temperatureType", null);
        setField(term2622826, term2622826.getClass(), "waterLevel", null);
        setBooleanField(term2622826, term2622826.getClass(), "gasGiant", false);
        setField(term2622826, term2622826.getClass(), "coordinate", null);
        setField(term2622826, term2622826.getClass(), "planetType", null);
        setIntField(term2622826, term2622826.getClass(), "groundSize", 0);
        setIntField(term2622826, term2622826.getClass(), "amountMetalInGround", 0);
        setIntField(term2622826, term2622826.getClass(), "metal", 0);
        setIntField(term2622826, term2622826.getClass(), "prodResource", 0);
        setIntField(term2622826, term2622826.getClass(), "extraFood", 0);
        setIntField(term2622826, term2622826.getClass(), "culture", 0);
        setIntField(term2622826, term2622826.getClass(), "planetOwner", 0);
        setField(term2622826, term2622826.getClass(), "planetOwnerInfo", null);
        setField(term2622826, term2622826.getClass(), "homeWorldId", null);
        setIntField(term2622826, term2622826.getClass(), "startRealmIndex", 0);
        setIntField(term2622826, term2622826.getClass(), "tax", 0);
        setField(term2622826, term2622826.getClass(), "statuses", null);
        setField(term2622826, term2622826.getClass(), "timedStatuses", null);
        setField(term2622826, term2622826.getClass(), "event", null);
        setBooleanField(term2622826, term2622826.getClass(), "eventFound", false);
        setField(term2622826, term2622826.getClass(), "happinessEffect", null);
        setField(term2622826, term2622826.getClass(), "happinessExplanation", null);
        setField(term2622826, term2622826.getClass(), "farmProdExplain", null);
        setField(term2622826, term2622826.getClass(), "metaProdExplain", null);
        setField(term2622826, term2622826.getClass(), "prodProdExplain", null);
        setField(term2622826, term2622826.getClass(), "reseProdExplain", null);
        setField(term2622826, term2622826.getClass(), "cultProdExplain", null);
        setField(term2622826, term2622826.getClass(), "credProdExplain", null);
        setField(term2622826, term2622826.getClass(), "governor", null);
        setIntField(term2622826, term2622826.getClass(), "governorGuide", 0);
        setField(term2622826, term2622826.getClass(), "orbital", null);
        setField(term2622826, term2622826.getClass(), "workers", null);
        setField(term2622826, term2622826.getClass(), "buildings", null);
        setField(term2622826, term2622826.getClass(), "underConstruction", null);
        term2622840 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.construction.Construction");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2622840;
        callMethod(klass, "getActualCost", argTypes, term2622826, args);
    }

};



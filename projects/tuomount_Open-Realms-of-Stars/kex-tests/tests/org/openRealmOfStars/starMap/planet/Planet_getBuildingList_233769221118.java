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

public class Planet_getBuildingList_233769221118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2505747;

    public Planet_getBuildingList_233769221118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2505747 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2505747, term2505747.getClass(), "name", null);
        setIntField(term2505747, term2505747.getClass(), "orderNumber", 0);
        setField(term2505747, term2505747.getClass(), "radiationType", null);
        setField(term2505747, term2505747.getClass(), "gravityType", null);
        setField(term2505747, term2505747.getClass(), "temperatureType", null);
        setField(term2505747, term2505747.getClass(), "waterLevel", null);
        setBooleanField(term2505747, term2505747.getClass(), "gasGiant", false);
        setField(term2505747, term2505747.getClass(), "coordinate", null);
        setField(term2505747, term2505747.getClass(), "planetType", null);
        setIntField(term2505747, term2505747.getClass(), "groundSize", 0);
        setIntField(term2505747, term2505747.getClass(), "amountMetalInGround", 0);
        setIntField(term2505747, term2505747.getClass(), "metal", 0);
        setIntField(term2505747, term2505747.getClass(), "prodResource", 0);
        setIntField(term2505747, term2505747.getClass(), "extraFood", 0);
        setIntField(term2505747, term2505747.getClass(), "culture", 0);
        setIntField(term2505747, term2505747.getClass(), "planetOwner", 0);
        setField(term2505747, term2505747.getClass(), "planetOwnerInfo", null);
        setField(term2505747, term2505747.getClass(), "homeWorldId", null);
        setIntField(term2505747, term2505747.getClass(), "startRealmIndex", 0);
        setIntField(term2505747, term2505747.getClass(), "tax", 0);
        setField(term2505747, term2505747.getClass(), "statuses", null);
        setField(term2505747, term2505747.getClass(), "timedStatuses", null);
        setField(term2505747, term2505747.getClass(), "event", null);
        setBooleanField(term2505747, term2505747.getClass(), "eventFound", false);
        setField(term2505747, term2505747.getClass(), "happinessEffect", null);
        setField(term2505747, term2505747.getClass(), "happinessExplanation", null);
        setField(term2505747, term2505747.getClass(), "farmProdExplain", null);
        setField(term2505747, term2505747.getClass(), "metaProdExplain", null);
        setField(term2505747, term2505747.getClass(), "prodProdExplain", null);
        setField(term2505747, term2505747.getClass(), "reseProdExplain", null);
        setField(term2505747, term2505747.getClass(), "cultProdExplain", null);
        setField(term2505747, term2505747.getClass(), "credProdExplain", null);
        setField(term2505747, term2505747.getClass(), "governor", null);
        setIntField(term2505747, term2505747.getClass(), "governorGuide", 0);
        setField(term2505747, term2505747.getClass(), "orbital", null);
        setField(term2505747, term2505747.getClass(), "workers", null);
        setField(term2505747, term2505747.getClass(), "buildings", null);
        setField(term2505747, term2505747.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBuildingList", argTypes, term2505747, args);
    }

};



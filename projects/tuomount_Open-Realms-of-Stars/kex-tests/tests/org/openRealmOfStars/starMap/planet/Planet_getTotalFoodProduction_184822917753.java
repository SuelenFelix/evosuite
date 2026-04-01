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

public class Planet_getTotalFoodProduction_184822917753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237724;

    public Planet_getTotalFoodProduction_184822917753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237724 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term237724, term237724.getClass(), "name", null);
        setIntField(term237724, term237724.getClass(), "orderNumber", 0);
        setField(term237724, term237724.getClass(), "radiationType", null);
        setField(term237724, term237724.getClass(), "gravityType", null);
        setField(term237724, term237724.getClass(), "temperatureType", null);
        setField(term237724, term237724.getClass(), "waterLevel", null);
        setBooleanField(term237724, term237724.getClass(), "gasGiant", false);
        setField(term237724, term237724.getClass(), "coordinate", null);
        setField(term237724, term237724.getClass(), "planetType", null);
        setIntField(term237724, term237724.getClass(), "groundSize", 0);
        setIntField(term237724, term237724.getClass(), "amountMetalInGround", 0);
        setIntField(term237724, term237724.getClass(), "metal", 0);
        setIntField(term237724, term237724.getClass(), "prodResource", 0);
        setIntField(term237724, term237724.getClass(), "extraFood", 0);
        setIntField(term237724, term237724.getClass(), "culture", 0);
        setIntField(term237724, term237724.getClass(), "planetOwner", 0);
        setField(term237724, term237724.getClass(), "planetOwnerInfo", null);
        setField(term237724, term237724.getClass(), "homeWorldId", null);
        setIntField(term237724, term237724.getClass(), "startRealmIndex", 0);
        setIntField(term237724, term237724.getClass(), "tax", 0);
        setField(term237724, term237724.getClass(), "statuses", null);
        setField(term237724, term237724.getClass(), "timedStatuses", null);
        setField(term237724, term237724.getClass(), "event", null);
        setBooleanField(term237724, term237724.getClass(), "eventFound", false);
        setField(term237724, term237724.getClass(), "happinessEffect", null);
        setField(term237724, term237724.getClass(), "happinessExplanation", null);
        setField(term237724, term237724.getClass(), "farmProdExplain", null);
        setField(term237724, term237724.getClass(), "metaProdExplain", null);
        setField(term237724, term237724.getClass(), "prodProdExplain", null);
        setField(term237724, term237724.getClass(), "reseProdExplain", null);
        setField(term237724, term237724.getClass(), "cultProdExplain", null);
        setField(term237724, term237724.getClass(), "credProdExplain", null);
        setField(term237724, term237724.getClass(), "governor", null);
        setIntField(term237724, term237724.getClass(), "governorGuide", 0);
        setField(term237724, term237724.getClass(), "orbital", null);
        setField(term237724, term237724.getClass(), "workers", null);
        setField(term237724, term237724.getClass(), "buildings", null);
        setField(term237724, term237724.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalFoodProduction", argTypes, term237724, args);
    }

};



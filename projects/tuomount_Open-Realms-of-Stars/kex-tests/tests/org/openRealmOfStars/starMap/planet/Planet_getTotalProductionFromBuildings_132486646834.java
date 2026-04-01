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

public class Planet_getTotalProductionFromBuildings_132486646834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2203852;
     Object term2203866;

    public Planet_getTotalProductionFromBuildings_132486646834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2203852 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2203852, term2203852.getClass(), "name", null);
        setIntField(term2203852, term2203852.getClass(), "orderNumber", 0);
        setField(term2203852, term2203852.getClass(), "radiationType", null);
        setField(term2203852, term2203852.getClass(), "gravityType", null);
        setField(term2203852, term2203852.getClass(), "temperatureType", null);
        setField(term2203852, term2203852.getClass(), "waterLevel", null);
        setBooleanField(term2203852, term2203852.getClass(), "gasGiant", false);
        setField(term2203852, term2203852.getClass(), "coordinate", null);
        setField(term2203852, term2203852.getClass(), "planetType", null);
        setIntField(term2203852, term2203852.getClass(), "groundSize", 0);
        setIntField(term2203852, term2203852.getClass(), "amountMetalInGround", 0);
        setIntField(term2203852, term2203852.getClass(), "metal", 0);
        setIntField(term2203852, term2203852.getClass(), "prodResource", 0);
        setIntField(term2203852, term2203852.getClass(), "extraFood", 0);
        setIntField(term2203852, term2203852.getClass(), "culture", 0);
        setIntField(term2203852, term2203852.getClass(), "planetOwner", 0);
        setField(term2203852, term2203852.getClass(), "planetOwnerInfo", null);
        setField(term2203852, term2203852.getClass(), "homeWorldId", null);
        setIntField(term2203852, term2203852.getClass(), "startRealmIndex", 0);
        setIntField(term2203852, term2203852.getClass(), "tax", 0);
        setField(term2203852, term2203852.getClass(), "statuses", null);
        setField(term2203852, term2203852.getClass(), "timedStatuses", null);
        setField(term2203852, term2203852.getClass(), "event", null);
        setBooleanField(term2203852, term2203852.getClass(), "eventFound", false);
        setField(term2203852, term2203852.getClass(), "happinessEffect", null);
        setField(term2203852, term2203852.getClass(), "happinessExplanation", null);
        setField(term2203852, term2203852.getClass(), "farmProdExplain", null);
        setField(term2203852, term2203852.getClass(), "metaProdExplain", null);
        setField(term2203852, term2203852.getClass(), "prodProdExplain", null);
        setField(term2203852, term2203852.getClass(), "reseProdExplain", null);
        setField(term2203852, term2203852.getClass(), "cultProdExplain", null);
        setField(term2203852, term2203852.getClass(), "credProdExplain", null);
        setField(term2203852, term2203852.getClass(), "governor", null);
        setIntField(term2203852, term2203852.getClass(), "governorGuide", 0);
        setField(term2203852, term2203852.getClass(), "orbital", null);
        setField(term2203852, term2203852.getClass(), "workers", null);
        setField(term2203852, term2203852.getClass(), "buildings", null);
        setField(term2203852, term2203852.getClass(), "underConstruction", null);
        term2203866 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2203866;
        callMethod(klass, "getTotalProductionFromBuildings", argTypes, term2203852, args);
    }

};



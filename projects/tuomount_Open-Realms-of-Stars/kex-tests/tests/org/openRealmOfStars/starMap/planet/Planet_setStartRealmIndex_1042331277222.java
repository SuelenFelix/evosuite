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

public class Planet_setStartRealmIndex_1042331277222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2954468;
     Object term2954482;

    public Planet_setStartRealmIndex_1042331277222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2954468 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2954468, term2954468.getClass(), "name", null);
        setIntField(term2954468, term2954468.getClass(), "orderNumber", 0);
        setField(term2954468, term2954468.getClass(), "radiationType", null);
        setField(term2954468, term2954468.getClass(), "gravityType", null);
        setField(term2954468, term2954468.getClass(), "temperatureType", null);
        setField(term2954468, term2954468.getClass(), "waterLevel", null);
        setBooleanField(term2954468, term2954468.getClass(), "gasGiant", false);
        setField(term2954468, term2954468.getClass(), "coordinate", null);
        setField(term2954468, term2954468.getClass(), "planetType", null);
        setIntField(term2954468, term2954468.getClass(), "groundSize", 0);
        setIntField(term2954468, term2954468.getClass(), "amountMetalInGround", 0);
        setIntField(term2954468, term2954468.getClass(), "metal", 0);
        setIntField(term2954468, term2954468.getClass(), "prodResource", 0);
        setIntField(term2954468, term2954468.getClass(), "extraFood", 0);
        setIntField(term2954468, term2954468.getClass(), "culture", 0);
        setIntField(term2954468, term2954468.getClass(), "planetOwner", 0);
        setField(term2954468, term2954468.getClass(), "planetOwnerInfo", null);
        setField(term2954468, term2954468.getClass(), "homeWorldId", null);
        setIntField(term2954468, term2954468.getClass(), "startRealmIndex", 0);
        setIntField(term2954468, term2954468.getClass(), "tax", 0);
        setField(term2954468, term2954468.getClass(), "statuses", null);
        setField(term2954468, term2954468.getClass(), "timedStatuses", null);
        setField(term2954468, term2954468.getClass(), "event", null);
        setBooleanField(term2954468, term2954468.getClass(), "eventFound", false);
        setField(term2954468, term2954468.getClass(), "happinessEffect", null);
        setField(term2954468, term2954468.getClass(), "happinessExplanation", null);
        setField(term2954468, term2954468.getClass(), "farmProdExplain", null);
        setField(term2954468, term2954468.getClass(), "metaProdExplain", null);
        setField(term2954468, term2954468.getClass(), "prodProdExplain", null);
        setField(term2954468, term2954468.getClass(), "reseProdExplain", null);
        setField(term2954468, term2954468.getClass(), "cultProdExplain", null);
        setField(term2954468, term2954468.getClass(), "credProdExplain", null);
        setField(term2954468, term2954468.getClass(), "governor", null);
        setIntField(term2954468, term2954468.getClass(), "governorGuide", 0);
        setField(term2954468, term2954468.getClass(), "orbital", null);
        setField(term2954468, term2954468.getClass(), "workers", null);
        setField(term2954468, term2954468.getClass(), "buildings", null);
        setField(term2954468, term2954468.getClass(), "underConstruction", null);
        term2954482 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2954482;
        callMethod(klass, "setStartRealmIndex", argTypes, term2954468, args);
    }

};



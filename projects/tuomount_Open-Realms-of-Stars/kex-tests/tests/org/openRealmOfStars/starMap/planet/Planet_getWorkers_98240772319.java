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

public class Planet_getWorkers_98240772319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103183;
     Object term103197;

    public Planet_getWorkers_98240772319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103183 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term103183, term103183.getClass(), "name", null);
        setIntField(term103183, term103183.getClass(), "orderNumber", 0);
        setField(term103183, term103183.getClass(), "radiationType", null);
        setField(term103183, term103183.getClass(), "gravityType", null);
        setField(term103183, term103183.getClass(), "temperatureType", null);
        setField(term103183, term103183.getClass(), "waterLevel", null);
        setBooleanField(term103183, term103183.getClass(), "gasGiant", false);
        setField(term103183, term103183.getClass(), "coordinate", null);
        setField(term103183, term103183.getClass(), "planetType", null);
        setIntField(term103183, term103183.getClass(), "groundSize", 0);
        setIntField(term103183, term103183.getClass(), "amountMetalInGround", 0);
        setIntField(term103183, term103183.getClass(), "metal", 0);
        setIntField(term103183, term103183.getClass(), "prodResource", 0);
        setIntField(term103183, term103183.getClass(), "extraFood", 0);
        setIntField(term103183, term103183.getClass(), "culture", 0);
        setIntField(term103183, term103183.getClass(), "planetOwner", 0);
        setField(term103183, term103183.getClass(), "planetOwnerInfo", null);
        setField(term103183, term103183.getClass(), "homeWorldId", null);
        setIntField(term103183, term103183.getClass(), "startRealmIndex", 0);
        setIntField(term103183, term103183.getClass(), "tax", 0);
        setField(term103183, term103183.getClass(), "statuses", null);
        setField(term103183, term103183.getClass(), "timedStatuses", null);
        setField(term103183, term103183.getClass(), "event", null);
        setBooleanField(term103183, term103183.getClass(), "eventFound", false);
        setField(term103183, term103183.getClass(), "happinessEffect", null);
        setField(term103183, term103183.getClass(), "happinessExplanation", null);
        setField(term103183, term103183.getClass(), "farmProdExplain", null);
        setField(term103183, term103183.getClass(), "metaProdExplain", null);
        setField(term103183, term103183.getClass(), "prodProdExplain", null);
        setField(term103183, term103183.getClass(), "reseProdExplain", null);
        setField(term103183, term103183.getClass(), "cultProdExplain", null);
        setField(term103183, term103183.getClass(), "credProdExplain", null);
        setField(term103183, term103183.getClass(), "governor", null);
        setIntField(term103183, term103183.getClass(), "governorGuide", 0);
        setField(term103183, term103183.getClass(), "orbital", null);
        setField(term103183, term103183.getClass(), "workers", null);
        setField(term103183, term103183.getClass(), "buildings", null);
        setField(term103183, term103183.getClass(), "underConstruction", null);
        term103197 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term103197;
        callMethod(klass, "getWorkers", argTypes, term103183, args);
    }

};



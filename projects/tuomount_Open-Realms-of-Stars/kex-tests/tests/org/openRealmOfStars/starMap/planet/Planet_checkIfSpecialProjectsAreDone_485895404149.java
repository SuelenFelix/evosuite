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

public class Planet_checkIfSpecialProjectsAreDone_485895404149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term626462;
     Object term626476;
     Object term626478;

    public Planet_checkIfSpecialProjectsAreDone_485895404149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term626462 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term626462, term626462.getClass(), "name", null);
        setIntField(term626462, term626462.getClass(), "orderNumber", 0);
        setField(term626462, term626462.getClass(), "radiationType", null);
        setField(term626462, term626462.getClass(), "gravityType", null);
        setField(term626462, term626462.getClass(), "temperatureType", null);
        setField(term626462, term626462.getClass(), "waterLevel", null);
        setBooleanField(term626462, term626462.getClass(), "gasGiant", false);
        setField(term626462, term626462.getClass(), "coordinate", null);
        setField(term626462, term626462.getClass(), "planetType", null);
        setIntField(term626462, term626462.getClass(), "groundSize", 0);
        setIntField(term626462, term626462.getClass(), "amountMetalInGround", 0);
        setIntField(term626462, term626462.getClass(), "metal", 0);
        setIntField(term626462, term626462.getClass(), "prodResource", 0);
        setIntField(term626462, term626462.getClass(), "extraFood", 0);
        setIntField(term626462, term626462.getClass(), "culture", 0);
        setIntField(term626462, term626462.getClass(), "planetOwner", 0);
        setField(term626462, term626462.getClass(), "planetOwnerInfo", null);
        setField(term626462, term626462.getClass(), "homeWorldId", null);
        setIntField(term626462, term626462.getClass(), "startRealmIndex", 0);
        setIntField(term626462, term626462.getClass(), "tax", 0);
        setField(term626462, term626462.getClass(), "statuses", null);
        setField(term626462, term626462.getClass(), "timedStatuses", null);
        setField(term626462, term626462.getClass(), "event", null);
        setBooleanField(term626462, term626462.getClass(), "eventFound", false);
        setField(term626462, term626462.getClass(), "happinessEffect", null);
        setField(term626462, term626462.getClass(), "happinessExplanation", null);
        setField(term626462, term626462.getClass(), "farmProdExplain", null);
        setField(term626462, term626462.getClass(), "metaProdExplain", null);
        setField(term626462, term626462.getClass(), "prodProdExplain", null);
        setField(term626462, term626462.getClass(), "reseProdExplain", null);
        setField(term626462, term626462.getClass(), "cultProdExplain", null);
        setField(term626462, term626462.getClass(), "credProdExplain", null);
        setField(term626462, term626462.getClass(), "governor", null);
        setIntField(term626462, term626462.getClass(), "governorGuide", 0);
        setField(term626462, term626462.getClass(), "orbital", null);
        setField(term626462, term626462.getClass(), "workers", null);
        setField(term626462, term626462.getClass(), "buildings", null);
        setField(term626462, term626462.getClass(), "underConstruction", null);
        term626476 = new Integer(0);
        term626478 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term626476;
        args[2] = term626478;
        callMethod(klass, "checkIfSpecialProjectsAreDone", argTypes, term626462, args);
    }

};



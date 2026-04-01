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

public class Planet_handleTimedStatuses_1334446509305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1325720;

    public Planet_handleTimedStatuses_1334446509305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1325720 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term1325720, term1325720.getClass(), "name", null);
        setIntField(term1325720, term1325720.getClass(), "orderNumber", 0);
        setField(term1325720, term1325720.getClass(), "radiationType", null);
        setField(term1325720, term1325720.getClass(), "gravityType", null);
        setField(term1325720, term1325720.getClass(), "temperatureType", null);
        setField(term1325720, term1325720.getClass(), "waterLevel", null);
        setBooleanField(term1325720, term1325720.getClass(), "gasGiant", false);
        setField(term1325720, term1325720.getClass(), "coordinate", null);
        setField(term1325720, term1325720.getClass(), "planetType", null);
        setIntField(term1325720, term1325720.getClass(), "groundSize", 0);
        setIntField(term1325720, term1325720.getClass(), "amountMetalInGround", 0);
        setIntField(term1325720, term1325720.getClass(), "metal", 0);
        setIntField(term1325720, term1325720.getClass(), "prodResource", 0);
        setIntField(term1325720, term1325720.getClass(), "extraFood", 0);
        setIntField(term1325720, term1325720.getClass(), "culture", 0);
        setIntField(term1325720, term1325720.getClass(), "planetOwner", 0);
        setField(term1325720, term1325720.getClass(), "planetOwnerInfo", null);
        setField(term1325720, term1325720.getClass(), "homeWorldId", null);
        setIntField(term1325720, term1325720.getClass(), "startRealmIndex", 0);
        setIntField(term1325720, term1325720.getClass(), "tax", 0);
        setField(term1325720, term1325720.getClass(), "statuses", null);
        setField(term1325720, term1325720.getClass(), "timedStatuses", null);
        setField(term1325720, term1325720.getClass(), "event", null);
        setBooleanField(term1325720, term1325720.getClass(), "eventFound", false);
        setField(term1325720, term1325720.getClass(), "happinessEffect", null);
        setField(term1325720, term1325720.getClass(), "happinessExplanation", null);
        setField(term1325720, term1325720.getClass(), "farmProdExplain", null);
        setField(term1325720, term1325720.getClass(), "metaProdExplain", null);
        setField(term1325720, term1325720.getClass(), "prodProdExplain", null);
        setField(term1325720, term1325720.getClass(), "reseProdExplain", null);
        setField(term1325720, term1325720.getClass(), "cultProdExplain", null);
        setField(term1325720, term1325720.getClass(), "credProdExplain", null);
        setField(term1325720, term1325720.getClass(), "governor", null);
        setIntField(term1325720, term1325720.getClass(), "governorGuide", 0);
        setField(term1325720, term1325720.getClass(), "orbital", null);
        setField(term1325720, term1325720.getClass(), "workers", null);
        setField(term1325720, term1325720.getClass(), "buildings", null);
        setField(term1325720, term1325720.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleTimedStatuses", argTypes, term1325720, args);
    }

};



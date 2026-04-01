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

public class Planet_handleTimedStatuses_1334446509307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3372997;

    public Planet_handleTimedStatuses_1334446509307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3372997 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3372997, term3372997.getClass(), "name", null);
        setIntField(term3372997, term3372997.getClass(), "orderNumber", 0);
        setField(term3372997, term3372997.getClass(), "radiationType", null);
        setField(term3372997, term3372997.getClass(), "gravityType", null);
        setField(term3372997, term3372997.getClass(), "temperatureType", null);
        setField(term3372997, term3372997.getClass(), "waterLevel", null);
        setBooleanField(term3372997, term3372997.getClass(), "gasGiant", false);
        setField(term3372997, term3372997.getClass(), "coordinate", null);
        setField(term3372997, term3372997.getClass(), "planetType", null);
        setIntField(term3372997, term3372997.getClass(), "groundSize", 0);
        setIntField(term3372997, term3372997.getClass(), "amountMetalInGround", 0);
        setIntField(term3372997, term3372997.getClass(), "metal", 0);
        setIntField(term3372997, term3372997.getClass(), "prodResource", 0);
        setIntField(term3372997, term3372997.getClass(), "extraFood", 0);
        setIntField(term3372997, term3372997.getClass(), "culture", 0);
        setIntField(term3372997, term3372997.getClass(), "planetOwner", 0);
        setField(term3372997, term3372997.getClass(), "planetOwnerInfo", null);
        setField(term3372997, term3372997.getClass(), "homeWorldId", null);
        setIntField(term3372997, term3372997.getClass(), "startRealmIndex", 0);
        setIntField(term3372997, term3372997.getClass(), "tax", 0);
        setField(term3372997, term3372997.getClass(), "statuses", null);
        setField(term3372997, term3372997.getClass(), "timedStatuses", null);
        setField(term3372997, term3372997.getClass(), "event", null);
        setBooleanField(term3372997, term3372997.getClass(), "eventFound", false);
        setField(term3372997, term3372997.getClass(), "happinessEffect", null);
        setField(term3372997, term3372997.getClass(), "happinessExplanation", null);
        setField(term3372997, term3372997.getClass(), "farmProdExplain", null);
        setField(term3372997, term3372997.getClass(), "metaProdExplain", null);
        setField(term3372997, term3372997.getClass(), "prodProdExplain", null);
        setField(term3372997, term3372997.getClass(), "reseProdExplain", null);
        setField(term3372997, term3372997.getClass(), "cultProdExplain", null);
        setField(term3372997, term3372997.getClass(), "credProdExplain", null);
        setField(term3372997, term3372997.getClass(), "governor", null);
        setIntField(term3372997, term3372997.getClass(), "governorGuide", 0);
        setField(term3372997, term3372997.getClass(), "orbital", null);
        setField(term3372997, term3372997.getClass(), "workers", null);
        setField(term3372997, term3372997.getClass(), "buildings", null);
        setField(term3372997, term3372997.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleTimedStatuses", argTypes, term3372997, args);
    }

};



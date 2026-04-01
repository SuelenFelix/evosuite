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

public class Planet_addTimedStatus_1583921683230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term974744;

    public Planet_addTimedStatus_1583921683230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term974744 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term974744, term974744.getClass(), "name", null);
        setIntField(term974744, term974744.getClass(), "orderNumber", 0);
        setField(term974744, term974744.getClass(), "radiationType", null);
        setField(term974744, term974744.getClass(), "gravityType", null);
        setField(term974744, term974744.getClass(), "temperatureType", null);
        setField(term974744, term974744.getClass(), "waterLevel", null);
        setBooleanField(term974744, term974744.getClass(), "gasGiant", false);
        setField(term974744, term974744.getClass(), "coordinate", null);
        setField(term974744, term974744.getClass(), "planetType", null);
        setIntField(term974744, term974744.getClass(), "groundSize", 0);
        setIntField(term974744, term974744.getClass(), "amountMetalInGround", 0);
        setIntField(term974744, term974744.getClass(), "metal", 0);
        setIntField(term974744, term974744.getClass(), "prodResource", 0);
        setIntField(term974744, term974744.getClass(), "extraFood", 0);
        setIntField(term974744, term974744.getClass(), "culture", 0);
        setIntField(term974744, term974744.getClass(), "planetOwner", 0);
        setField(term974744, term974744.getClass(), "planetOwnerInfo", null);
        setField(term974744, term974744.getClass(), "homeWorldId", null);
        setIntField(term974744, term974744.getClass(), "startRealmIndex", 0);
        setIntField(term974744, term974744.getClass(), "tax", 0);
        setField(term974744, term974744.getClass(), "statuses", null);
        setField(term974744, term974744.getClass(), "timedStatuses", null);
        setField(term974744, term974744.getClass(), "event", null);
        setBooleanField(term974744, term974744.getClass(), "eventFound", false);
        setField(term974744, term974744.getClass(), "happinessEffect", null);
        setField(term974744, term974744.getClass(), "happinessExplanation", null);
        setField(term974744, term974744.getClass(), "farmProdExplain", null);
        setField(term974744, term974744.getClass(), "metaProdExplain", null);
        setField(term974744, term974744.getClass(), "prodProdExplain", null);
        setField(term974744, term974744.getClass(), "reseProdExplain", null);
        setField(term974744, term974744.getClass(), "cultProdExplain", null);
        setField(term974744, term974744.getClass(), "credProdExplain", null);
        setField(term974744, term974744.getClass(), "governor", null);
        setIntField(term974744, term974744.getClass(), "governorGuide", 0);
        setField(term974744, term974744.getClass(), "orbital", null);
        setField(term974744, term974744.getClass(), "workers", null);
        setField(term974744, term974744.getClass(), "buildings", null);
        setField(term974744, term974744.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.status.TimedStatus");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addTimedStatus", argTypes, term974744, args);
    }

};



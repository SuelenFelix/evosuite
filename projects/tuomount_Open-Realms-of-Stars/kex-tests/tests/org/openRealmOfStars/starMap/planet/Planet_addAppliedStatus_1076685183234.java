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

public class Planet_addAppliedStatus_1076685183234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term989561;

    public Planet_addAppliedStatus_1076685183234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term989561 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term989561, term989561.getClass(), "name", null);
        setIntField(term989561, term989561.getClass(), "orderNumber", 0);
        setField(term989561, term989561.getClass(), "radiationType", null);
        setField(term989561, term989561.getClass(), "gravityType", null);
        setField(term989561, term989561.getClass(), "temperatureType", null);
        setField(term989561, term989561.getClass(), "waterLevel", null);
        setBooleanField(term989561, term989561.getClass(), "gasGiant", false);
        setField(term989561, term989561.getClass(), "coordinate", null);
        setField(term989561, term989561.getClass(), "planetType", null);
        setIntField(term989561, term989561.getClass(), "groundSize", 0);
        setIntField(term989561, term989561.getClass(), "amountMetalInGround", 0);
        setIntField(term989561, term989561.getClass(), "metal", 0);
        setIntField(term989561, term989561.getClass(), "prodResource", 0);
        setIntField(term989561, term989561.getClass(), "extraFood", 0);
        setIntField(term989561, term989561.getClass(), "culture", 0);
        setIntField(term989561, term989561.getClass(), "planetOwner", 0);
        setField(term989561, term989561.getClass(), "planetOwnerInfo", null);
        setField(term989561, term989561.getClass(), "homeWorldId", null);
        setIntField(term989561, term989561.getClass(), "startRealmIndex", 0);
        setIntField(term989561, term989561.getClass(), "tax", 0);
        setField(term989561, term989561.getClass(), "statuses", null);
        setField(term989561, term989561.getClass(), "timedStatuses", null);
        setField(term989561, term989561.getClass(), "event", null);
        setBooleanField(term989561, term989561.getClass(), "eventFound", false);
        setField(term989561, term989561.getClass(), "happinessEffect", null);
        setField(term989561, term989561.getClass(), "happinessExplanation", null);
        setField(term989561, term989561.getClass(), "farmProdExplain", null);
        setField(term989561, term989561.getClass(), "metaProdExplain", null);
        setField(term989561, term989561.getClass(), "prodProdExplain", null);
        setField(term989561, term989561.getClass(), "reseProdExplain", null);
        setField(term989561, term989561.getClass(), "cultProdExplain", null);
        setField(term989561, term989561.getClass(), "credProdExplain", null);
        setField(term989561, term989561.getClass(), "governor", null);
        setIntField(term989561, term989561.getClass(), "governorGuide", 0);
        setField(term989561, term989561.getClass(), "orbital", null);
        setField(term989561, term989561.getClass(), "workers", null);
        setField(term989561, term989561.getClass(), "buildings", null);
        setField(term989561, term989561.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.status.AppliedStatus");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addAppliedStatus", argTypes, term989561, args);
    }

};



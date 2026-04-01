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

public class Planet_getY_976806039103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term437504;

    public Planet_getY_976806039103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term437504 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term437504, term437504.getClass(), "name", null);
        setIntField(term437504, term437504.getClass(), "orderNumber", 0);
        setField(term437504, term437504.getClass(), "radiationType", null);
        setField(term437504, term437504.getClass(), "gravityType", null);
        setField(term437504, term437504.getClass(), "temperatureType", null);
        setField(term437504, term437504.getClass(), "waterLevel", null);
        setBooleanField(term437504, term437504.getClass(), "gasGiant", false);
        setField(term437504, term437504.getClass(), "coordinate", null);
        setField(term437504, term437504.getClass(), "planetType", null);
        setIntField(term437504, term437504.getClass(), "groundSize", 0);
        setIntField(term437504, term437504.getClass(), "amountMetalInGround", 0);
        setIntField(term437504, term437504.getClass(), "metal", 0);
        setIntField(term437504, term437504.getClass(), "prodResource", 0);
        setIntField(term437504, term437504.getClass(), "extraFood", 0);
        setIntField(term437504, term437504.getClass(), "culture", 0);
        setIntField(term437504, term437504.getClass(), "planetOwner", 0);
        setField(term437504, term437504.getClass(), "planetOwnerInfo", null);
        setField(term437504, term437504.getClass(), "homeWorldId", null);
        setIntField(term437504, term437504.getClass(), "startRealmIndex", 0);
        setIntField(term437504, term437504.getClass(), "tax", 0);
        setField(term437504, term437504.getClass(), "statuses", null);
        setField(term437504, term437504.getClass(), "timedStatuses", null);
        setField(term437504, term437504.getClass(), "event", null);
        setBooleanField(term437504, term437504.getClass(), "eventFound", false);
        setField(term437504, term437504.getClass(), "happinessEffect", null);
        setField(term437504, term437504.getClass(), "happinessExplanation", null);
        setField(term437504, term437504.getClass(), "farmProdExplain", null);
        setField(term437504, term437504.getClass(), "metaProdExplain", null);
        setField(term437504, term437504.getClass(), "prodProdExplain", null);
        setField(term437504, term437504.getClass(), "reseProdExplain", null);
        setField(term437504, term437504.getClass(), "cultProdExplain", null);
        setField(term437504, term437504.getClass(), "credProdExplain", null);
        setField(term437504, term437504.getClass(), "governor", null);
        setIntField(term437504, term437504.getClass(), "governorGuide", 0);
        setField(term437504, term437504.getClass(), "orbital", null);
        setField(term437504, term437504.getClass(), "workers", null);
        setField(term437504, term437504.getClass(), "buildings", null);
        setField(term437504, term437504.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getY", argTypes, term437504, args);
    }

};



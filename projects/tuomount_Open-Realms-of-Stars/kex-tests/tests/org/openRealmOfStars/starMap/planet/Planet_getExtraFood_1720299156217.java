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

public class Planet_getExtraFood_1720299156217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term924822;

    public Planet_getExtraFood_1720299156217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term924822 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term924822, term924822.getClass(), "name", null);
        setIntField(term924822, term924822.getClass(), "orderNumber", 0);
        setField(term924822, term924822.getClass(), "radiationType", null);
        setField(term924822, term924822.getClass(), "gravityType", null);
        setField(term924822, term924822.getClass(), "temperatureType", null);
        setField(term924822, term924822.getClass(), "waterLevel", null);
        setBooleanField(term924822, term924822.getClass(), "gasGiant", false);
        setField(term924822, term924822.getClass(), "coordinate", null);
        setField(term924822, term924822.getClass(), "planetType", null);
        setIntField(term924822, term924822.getClass(), "groundSize", 0);
        setIntField(term924822, term924822.getClass(), "amountMetalInGround", 0);
        setIntField(term924822, term924822.getClass(), "metal", 0);
        setIntField(term924822, term924822.getClass(), "prodResource", 0);
        setIntField(term924822, term924822.getClass(), "extraFood", 0);
        setIntField(term924822, term924822.getClass(), "culture", 0);
        setIntField(term924822, term924822.getClass(), "planetOwner", 0);
        setField(term924822, term924822.getClass(), "planetOwnerInfo", null);
        setField(term924822, term924822.getClass(), "homeWorldId", null);
        setIntField(term924822, term924822.getClass(), "startRealmIndex", 0);
        setIntField(term924822, term924822.getClass(), "tax", 0);
        setField(term924822, term924822.getClass(), "statuses", null);
        setField(term924822, term924822.getClass(), "timedStatuses", null);
        setField(term924822, term924822.getClass(), "event", null);
        setBooleanField(term924822, term924822.getClass(), "eventFound", false);
        setField(term924822, term924822.getClass(), "happinessEffect", null);
        setField(term924822, term924822.getClass(), "happinessExplanation", null);
        setField(term924822, term924822.getClass(), "farmProdExplain", null);
        setField(term924822, term924822.getClass(), "metaProdExplain", null);
        setField(term924822, term924822.getClass(), "prodProdExplain", null);
        setField(term924822, term924822.getClass(), "reseProdExplain", null);
        setField(term924822, term924822.getClass(), "cultProdExplain", null);
        setField(term924822, term924822.getClass(), "credProdExplain", null);
        setField(term924822, term924822.getClass(), "governor", null);
        setIntField(term924822, term924822.getClass(), "governorGuide", 0);
        setField(term924822, term924822.getClass(), "orbital", null);
        setField(term924822, term924822.getClass(), "workers", null);
        setField(term924822, term924822.getClass(), "buildings", null);
        setField(term924822, term924822.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExtraFood", argTypes, term924822, args);
    }

};



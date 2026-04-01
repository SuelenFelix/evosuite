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

public class Planet_revealing_1348895017181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term760624;

    public Planet_revealing_1348895017181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term760624 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term760624, term760624.getClass(), "name", null);
        setIntField(term760624, term760624.getClass(), "orderNumber", 0);
        setField(term760624, term760624.getClass(), "radiationType", null);
        setField(term760624, term760624.getClass(), "gravityType", null);
        setField(term760624, term760624.getClass(), "temperatureType", null);
        setField(term760624, term760624.getClass(), "waterLevel", null);
        setBooleanField(term760624, term760624.getClass(), "gasGiant", false);
        setField(term760624, term760624.getClass(), "coordinate", null);
        setField(term760624, term760624.getClass(), "planetType", null);
        setIntField(term760624, term760624.getClass(), "groundSize", 0);
        setIntField(term760624, term760624.getClass(), "amountMetalInGround", 0);
        setIntField(term760624, term760624.getClass(), "metal", 0);
        setIntField(term760624, term760624.getClass(), "prodResource", 0);
        setIntField(term760624, term760624.getClass(), "extraFood", 0);
        setIntField(term760624, term760624.getClass(), "culture", 0);
        setIntField(term760624, term760624.getClass(), "planetOwner", 0);
        setField(term760624, term760624.getClass(), "planetOwnerInfo", null);
        setField(term760624, term760624.getClass(), "homeWorldId", null);
        setIntField(term760624, term760624.getClass(), "startRealmIndex", 0);
        setIntField(term760624, term760624.getClass(), "tax", 0);
        setField(term760624, term760624.getClass(), "statuses", null);
        setField(term760624, term760624.getClass(), "timedStatuses", null);
        setField(term760624, term760624.getClass(), "event", null);
        setBooleanField(term760624, term760624.getClass(), "eventFound", false);
        setField(term760624, term760624.getClass(), "happinessEffect", null);
        setField(term760624, term760624.getClass(), "happinessExplanation", null);
        setField(term760624, term760624.getClass(), "farmProdExplain", null);
        setField(term760624, term760624.getClass(), "metaProdExplain", null);
        setField(term760624, term760624.getClass(), "prodProdExplain", null);
        setField(term760624, term760624.getClass(), "reseProdExplain", null);
        setField(term760624, term760624.getClass(), "cultProdExplain", null);
        setField(term760624, term760624.getClass(), "credProdExplain", null);
        setField(term760624, term760624.getClass(), "governor", null);
        setIntField(term760624, term760624.getClass(), "governorGuide", 0);
        setField(term760624, term760624.getClass(), "orbital", null);
        setField(term760624, term760624.getClass(), "workers", null);
        setField(term760624, term760624.getClass(), "buildings", null);
        setField(term760624, term760624.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "revealing", argTypes, term760624, args);
    }

};



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
import java.lang.Boolean;

public class Planet_checkIfConstructionIsDone_1618740260159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2670656;
     Object term2670670;

    public Planet_checkIfConstructionIsDone_1618740260159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2670656 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2670656, term2670656.getClass(), "name", null);
        setIntField(term2670656, term2670656.getClass(), "orderNumber", 0);
        setField(term2670656, term2670656.getClass(), "radiationType", null);
        setField(term2670656, term2670656.getClass(), "gravityType", null);
        setField(term2670656, term2670656.getClass(), "temperatureType", null);
        setField(term2670656, term2670656.getClass(), "waterLevel", null);
        setBooleanField(term2670656, term2670656.getClass(), "gasGiant", false);
        setField(term2670656, term2670656.getClass(), "coordinate", null);
        setField(term2670656, term2670656.getClass(), "planetType", null);
        setIntField(term2670656, term2670656.getClass(), "groundSize", 0);
        setIntField(term2670656, term2670656.getClass(), "amountMetalInGround", 0);
        setIntField(term2670656, term2670656.getClass(), "metal", 0);
        setIntField(term2670656, term2670656.getClass(), "prodResource", 0);
        setIntField(term2670656, term2670656.getClass(), "extraFood", 0);
        setIntField(term2670656, term2670656.getClass(), "culture", 0);
        setIntField(term2670656, term2670656.getClass(), "planetOwner", 0);
        setField(term2670656, term2670656.getClass(), "planetOwnerInfo", null);
        setField(term2670656, term2670656.getClass(), "homeWorldId", null);
        setIntField(term2670656, term2670656.getClass(), "startRealmIndex", 0);
        setIntField(term2670656, term2670656.getClass(), "tax", 0);
        setField(term2670656, term2670656.getClass(), "statuses", null);
        setField(term2670656, term2670656.getClass(), "timedStatuses", null);
        setField(term2670656, term2670656.getClass(), "event", null);
        setBooleanField(term2670656, term2670656.getClass(), "eventFound", false);
        setField(term2670656, term2670656.getClass(), "happinessEffect", null);
        setField(term2670656, term2670656.getClass(), "happinessExplanation", null);
        setField(term2670656, term2670656.getClass(), "farmProdExplain", null);
        setField(term2670656, term2670656.getClass(), "metaProdExplain", null);
        setField(term2670656, term2670656.getClass(), "prodProdExplain", null);
        setField(term2670656, term2670656.getClass(), "reseProdExplain", null);
        setField(term2670656, term2670656.getClass(), "cultProdExplain", null);
        setField(term2670656, term2670656.getClass(), "credProdExplain", null);
        setField(term2670656, term2670656.getClass(), "governor", null);
        setIntField(term2670656, term2670656.getClass(), "governorGuide", 0);
        setField(term2670656, term2670656.getClass(), "orbital", null);
        setField(term2670656, term2670656.getClass(), "workers", null);
        setField(term2670656, term2670656.getClass(), "buildings", null);
        setField(term2670656, term2670656.getClass(), "underConstruction", null);
        term2670670 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Object[] args = new Object[2];
        args[0] = term2670670;
        args[1] = null;
        callMethod(klass, "checkIfConstructionIsDone", argTypes, term2670656, args);
    }

};



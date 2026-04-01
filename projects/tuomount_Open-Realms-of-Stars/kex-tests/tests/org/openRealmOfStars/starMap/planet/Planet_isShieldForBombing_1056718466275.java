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

public class Planet_isShieldForBombing_1056718466275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3194551;

    public Planet_isShieldForBombing_1056718466275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3194551 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3194551, term3194551.getClass(), "name", null);
        setIntField(term3194551, term3194551.getClass(), "orderNumber", 0);
        setField(term3194551, term3194551.getClass(), "radiationType", null);
        setField(term3194551, term3194551.getClass(), "gravityType", null);
        setField(term3194551, term3194551.getClass(), "temperatureType", null);
        setField(term3194551, term3194551.getClass(), "waterLevel", null);
        setBooleanField(term3194551, term3194551.getClass(), "gasGiant", false);
        setField(term3194551, term3194551.getClass(), "coordinate", null);
        setField(term3194551, term3194551.getClass(), "planetType", null);
        setIntField(term3194551, term3194551.getClass(), "groundSize", 0);
        setIntField(term3194551, term3194551.getClass(), "amountMetalInGround", 0);
        setIntField(term3194551, term3194551.getClass(), "metal", 0);
        setIntField(term3194551, term3194551.getClass(), "prodResource", 0);
        setIntField(term3194551, term3194551.getClass(), "extraFood", 0);
        setIntField(term3194551, term3194551.getClass(), "culture", 0);
        setIntField(term3194551, term3194551.getClass(), "planetOwner", 0);
        setField(term3194551, term3194551.getClass(), "planetOwnerInfo", null);
        setField(term3194551, term3194551.getClass(), "homeWorldId", null);
        setIntField(term3194551, term3194551.getClass(), "startRealmIndex", 0);
        setIntField(term3194551, term3194551.getClass(), "tax", 0);
        setField(term3194551, term3194551.getClass(), "statuses", null);
        setField(term3194551, term3194551.getClass(), "timedStatuses", null);
        setField(term3194551, term3194551.getClass(), "event", null);
        setBooleanField(term3194551, term3194551.getClass(), "eventFound", false);
        setField(term3194551, term3194551.getClass(), "happinessEffect", null);
        setField(term3194551, term3194551.getClass(), "happinessExplanation", null);
        setField(term3194551, term3194551.getClass(), "farmProdExplain", null);
        setField(term3194551, term3194551.getClass(), "metaProdExplain", null);
        setField(term3194551, term3194551.getClass(), "prodProdExplain", null);
        setField(term3194551, term3194551.getClass(), "reseProdExplain", null);
        setField(term3194551, term3194551.getClass(), "cultProdExplain", null);
        setField(term3194551, term3194551.getClass(), "credProdExplain", null);
        setField(term3194551, term3194551.getClass(), "governor", null);
        setIntField(term3194551, term3194551.getClass(), "governorGuide", 0);
        setField(term3194551, term3194551.getClass(), "orbital", null);
        setField(term3194551, term3194551.getClass(), "workers", null);
        setField(term3194551, term3194551.getClass(), "buildings", null);
        setField(term3194551, term3194551.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isShieldForBombing", argTypes, term3194551, args);
    }

};



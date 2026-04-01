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

public class Planet_hasStatusForAwayTeam_842861828246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3055153;

    public Planet_hasStatusForAwayTeam_842861828246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3055153 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3055153, term3055153.getClass(), "name", null);
        setIntField(term3055153, term3055153.getClass(), "orderNumber", 0);
        setField(term3055153, term3055153.getClass(), "radiationType", null);
        setField(term3055153, term3055153.getClass(), "gravityType", null);
        setField(term3055153, term3055153.getClass(), "temperatureType", null);
        setField(term3055153, term3055153.getClass(), "waterLevel", null);
        setBooleanField(term3055153, term3055153.getClass(), "gasGiant", false);
        setField(term3055153, term3055153.getClass(), "coordinate", null);
        setField(term3055153, term3055153.getClass(), "planetType", null);
        setIntField(term3055153, term3055153.getClass(), "groundSize", 0);
        setIntField(term3055153, term3055153.getClass(), "amountMetalInGround", 0);
        setIntField(term3055153, term3055153.getClass(), "metal", 0);
        setIntField(term3055153, term3055153.getClass(), "prodResource", 0);
        setIntField(term3055153, term3055153.getClass(), "extraFood", 0);
        setIntField(term3055153, term3055153.getClass(), "culture", 0);
        setIntField(term3055153, term3055153.getClass(), "planetOwner", 0);
        setField(term3055153, term3055153.getClass(), "planetOwnerInfo", null);
        setField(term3055153, term3055153.getClass(), "homeWorldId", null);
        setIntField(term3055153, term3055153.getClass(), "startRealmIndex", 0);
        setIntField(term3055153, term3055153.getClass(), "tax", 0);
        setField(term3055153, term3055153.getClass(), "statuses", null);
        setField(term3055153, term3055153.getClass(), "timedStatuses", null);
        setField(term3055153, term3055153.getClass(), "event", null);
        setBooleanField(term3055153, term3055153.getClass(), "eventFound", false);
        setField(term3055153, term3055153.getClass(), "happinessEffect", null);
        setField(term3055153, term3055153.getClass(), "happinessExplanation", null);
        setField(term3055153, term3055153.getClass(), "farmProdExplain", null);
        setField(term3055153, term3055153.getClass(), "metaProdExplain", null);
        setField(term3055153, term3055153.getClass(), "prodProdExplain", null);
        setField(term3055153, term3055153.getClass(), "reseProdExplain", null);
        setField(term3055153, term3055153.getClass(), "cultProdExplain", null);
        setField(term3055153, term3055153.getClass(), "credProdExplain", null);
        setField(term3055153, term3055153.getClass(), "governor", null);
        setIntField(term3055153, term3055153.getClass(), "governorGuide", 0);
        setField(term3055153, term3055153.getClass(), "orbital", null);
        setField(term3055153, term3055153.getClass(), "workers", null);
        setField(term3055153, term3055153.getClass(), "buildings", null);
        setField(term3055153, term3055153.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasStatusForAwayTeam", argTypes, term3055153, args);
    }

};



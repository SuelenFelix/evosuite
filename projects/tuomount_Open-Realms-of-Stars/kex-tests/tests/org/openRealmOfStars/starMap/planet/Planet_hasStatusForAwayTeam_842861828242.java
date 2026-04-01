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

public class Planet_hasStatusForAwayTeam_842861828242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1016029;

    public Planet_hasStatusForAwayTeam_842861828242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1016029 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term1016029, term1016029.getClass(), "name", null);
        setIntField(term1016029, term1016029.getClass(), "orderNumber", 0);
        setField(term1016029, term1016029.getClass(), "radiationType", null);
        setField(term1016029, term1016029.getClass(), "gravityType", null);
        setField(term1016029, term1016029.getClass(), "temperatureType", null);
        setField(term1016029, term1016029.getClass(), "waterLevel", null);
        setBooleanField(term1016029, term1016029.getClass(), "gasGiant", false);
        setField(term1016029, term1016029.getClass(), "coordinate", null);
        setField(term1016029, term1016029.getClass(), "planetType", null);
        setIntField(term1016029, term1016029.getClass(), "groundSize", 0);
        setIntField(term1016029, term1016029.getClass(), "amountMetalInGround", 0);
        setIntField(term1016029, term1016029.getClass(), "metal", 0);
        setIntField(term1016029, term1016029.getClass(), "prodResource", 0);
        setIntField(term1016029, term1016029.getClass(), "extraFood", 0);
        setIntField(term1016029, term1016029.getClass(), "culture", 0);
        setIntField(term1016029, term1016029.getClass(), "planetOwner", 0);
        setField(term1016029, term1016029.getClass(), "planetOwnerInfo", null);
        setField(term1016029, term1016029.getClass(), "homeWorldId", null);
        setIntField(term1016029, term1016029.getClass(), "startRealmIndex", 0);
        setIntField(term1016029, term1016029.getClass(), "tax", 0);
        setField(term1016029, term1016029.getClass(), "statuses", null);
        setField(term1016029, term1016029.getClass(), "timedStatuses", null);
        setField(term1016029, term1016029.getClass(), "event", null);
        setBooleanField(term1016029, term1016029.getClass(), "eventFound", false);
        setField(term1016029, term1016029.getClass(), "happinessEffect", null);
        setField(term1016029, term1016029.getClass(), "happinessExplanation", null);
        setField(term1016029, term1016029.getClass(), "farmProdExplain", null);
        setField(term1016029, term1016029.getClass(), "metaProdExplain", null);
        setField(term1016029, term1016029.getClass(), "prodProdExplain", null);
        setField(term1016029, term1016029.getClass(), "reseProdExplain", null);
        setField(term1016029, term1016029.getClass(), "cultProdExplain", null);
        setField(term1016029, term1016029.getClass(), "credProdExplain", null);
        setField(term1016029, term1016029.getClass(), "governor", null);
        setIntField(term1016029, term1016029.getClass(), "governorGuide", 0);
        setField(term1016029, term1016029.getClass(), "orbital", null);
        setField(term1016029, term1016029.getClass(), "workers", null);
        setField(term1016029, term1016029.getClass(), "buildings", null);
        setField(term1016029, term1016029.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasStatusForAwayTeam", argTypes, term1016029, args);
    }

};



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

public class Planet_getStatuses_2047157384328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3373291;

    public Planet_getStatuses_2047157384328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3373291 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3373291, term3373291.getClass(), "name", null);
        setIntField(term3373291, term3373291.getClass(), "orderNumber", 0);
        setField(term3373291, term3373291.getClass(), "radiationType", null);
        setField(term3373291, term3373291.getClass(), "gravityType", null);
        setField(term3373291, term3373291.getClass(), "temperatureType", null);
        setField(term3373291, term3373291.getClass(), "waterLevel", null);
        setBooleanField(term3373291, term3373291.getClass(), "gasGiant", false);
        setField(term3373291, term3373291.getClass(), "coordinate", null);
        setField(term3373291, term3373291.getClass(), "planetType", null);
        setIntField(term3373291, term3373291.getClass(), "groundSize", 0);
        setIntField(term3373291, term3373291.getClass(), "amountMetalInGround", 0);
        setIntField(term3373291, term3373291.getClass(), "metal", 0);
        setIntField(term3373291, term3373291.getClass(), "prodResource", 0);
        setIntField(term3373291, term3373291.getClass(), "extraFood", 0);
        setIntField(term3373291, term3373291.getClass(), "culture", 0);
        setIntField(term3373291, term3373291.getClass(), "planetOwner", 0);
        setField(term3373291, term3373291.getClass(), "planetOwnerInfo", null);
        setField(term3373291, term3373291.getClass(), "homeWorldId", null);
        setIntField(term3373291, term3373291.getClass(), "startRealmIndex", 0);
        setIntField(term3373291, term3373291.getClass(), "tax", 0);
        setField(term3373291, term3373291.getClass(), "statuses", null);
        setField(term3373291, term3373291.getClass(), "timedStatuses", null);
        setField(term3373291, term3373291.getClass(), "event", null);
        setBooleanField(term3373291, term3373291.getClass(), "eventFound", false);
        setField(term3373291, term3373291.getClass(), "happinessEffect", null);
        setField(term3373291, term3373291.getClass(), "happinessExplanation", null);
        setField(term3373291, term3373291.getClass(), "farmProdExplain", null);
        setField(term3373291, term3373291.getClass(), "metaProdExplain", null);
        setField(term3373291, term3373291.getClass(), "prodProdExplain", null);
        setField(term3373291, term3373291.getClass(), "reseProdExplain", null);
        setField(term3373291, term3373291.getClass(), "cultProdExplain", null);
        setField(term3373291, term3373291.getClass(), "credProdExplain", null);
        setField(term3373291, term3373291.getClass(), "governor", null);
        setIntField(term3373291, term3373291.getClass(), "governorGuide", 0);
        setField(term3373291, term3373291.getClass(), "orbital", null);
        setField(term3373291, term3373291.getClass(), "workers", null);
        setField(term3373291, term3373291.getClass(), "buildings", null);
        setField(term3373291, term3373291.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatuses", argTypes, term3373291, args);
    }

};



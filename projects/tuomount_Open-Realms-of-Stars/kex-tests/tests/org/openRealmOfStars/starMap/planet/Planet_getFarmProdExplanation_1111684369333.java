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

public class Planet_getFarmProdExplanation_1111684369333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3373363;

    public Planet_getFarmProdExplanation_1111684369333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3373363 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3373363, term3373363.getClass(), "name", null);
        setIntField(term3373363, term3373363.getClass(), "orderNumber", 0);
        setField(term3373363, term3373363.getClass(), "radiationType", null);
        setField(term3373363, term3373363.getClass(), "gravityType", null);
        setField(term3373363, term3373363.getClass(), "temperatureType", null);
        setField(term3373363, term3373363.getClass(), "waterLevel", null);
        setBooleanField(term3373363, term3373363.getClass(), "gasGiant", false);
        setField(term3373363, term3373363.getClass(), "coordinate", null);
        setField(term3373363, term3373363.getClass(), "planetType", null);
        setIntField(term3373363, term3373363.getClass(), "groundSize", 0);
        setIntField(term3373363, term3373363.getClass(), "amountMetalInGround", 0);
        setIntField(term3373363, term3373363.getClass(), "metal", 0);
        setIntField(term3373363, term3373363.getClass(), "prodResource", 0);
        setIntField(term3373363, term3373363.getClass(), "extraFood", 0);
        setIntField(term3373363, term3373363.getClass(), "culture", 0);
        setIntField(term3373363, term3373363.getClass(), "planetOwner", 0);
        setField(term3373363, term3373363.getClass(), "planetOwnerInfo", null);
        setField(term3373363, term3373363.getClass(), "homeWorldId", null);
        setIntField(term3373363, term3373363.getClass(), "startRealmIndex", 0);
        setIntField(term3373363, term3373363.getClass(), "tax", 0);
        setField(term3373363, term3373363.getClass(), "statuses", null);
        setField(term3373363, term3373363.getClass(), "timedStatuses", null);
        setField(term3373363, term3373363.getClass(), "event", null);
        setBooleanField(term3373363, term3373363.getClass(), "eventFound", false);
        setField(term3373363, term3373363.getClass(), "happinessEffect", null);
        setField(term3373363, term3373363.getClass(), "happinessExplanation", null);
        setField(term3373363, term3373363.getClass(), "farmProdExplain", null);
        setField(term3373363, term3373363.getClass(), "metaProdExplain", null);
        setField(term3373363, term3373363.getClass(), "prodProdExplain", null);
        setField(term3373363, term3373363.getClass(), "reseProdExplain", null);
        setField(term3373363, term3373363.getClass(), "cultProdExplain", null);
        setField(term3373363, term3373363.getClass(), "credProdExplain", null);
        setField(term3373363, term3373363.getClass(), "governor", null);
        setIntField(term3373363, term3373363.getClass(), "governorGuide", 0);
        setField(term3373363, term3373363.getClass(), "orbital", null);
        setField(term3373363, term3373363.getClass(), "workers", null);
        setField(term3373363, term3373363.getClass(), "buildings", null);
        setField(term3373363, term3373363.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFarmProdExplanation", argTypes, term3373363, args);
    }

};



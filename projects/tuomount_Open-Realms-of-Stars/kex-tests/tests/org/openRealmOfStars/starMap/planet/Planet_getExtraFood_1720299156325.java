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

public class Planet_getExtraFood_1720299156325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3373249;

    public Planet_getExtraFood_1720299156325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3373249 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3373249, term3373249.getClass(), "name", null);
        setIntField(term3373249, term3373249.getClass(), "orderNumber", 0);
        setField(term3373249, term3373249.getClass(), "radiationType", null);
        setField(term3373249, term3373249.getClass(), "gravityType", null);
        setField(term3373249, term3373249.getClass(), "temperatureType", null);
        setField(term3373249, term3373249.getClass(), "waterLevel", null);
        setBooleanField(term3373249, term3373249.getClass(), "gasGiant", false);
        setField(term3373249, term3373249.getClass(), "coordinate", null);
        setField(term3373249, term3373249.getClass(), "planetType", null);
        setIntField(term3373249, term3373249.getClass(), "groundSize", 0);
        setIntField(term3373249, term3373249.getClass(), "amountMetalInGround", 0);
        setIntField(term3373249, term3373249.getClass(), "metal", 0);
        setIntField(term3373249, term3373249.getClass(), "prodResource", 0);
        setIntField(term3373249, term3373249.getClass(), "extraFood", 0);
        setIntField(term3373249, term3373249.getClass(), "culture", 0);
        setIntField(term3373249, term3373249.getClass(), "planetOwner", 0);
        setField(term3373249, term3373249.getClass(), "planetOwnerInfo", null);
        setField(term3373249, term3373249.getClass(), "homeWorldId", null);
        setIntField(term3373249, term3373249.getClass(), "startRealmIndex", 0);
        setIntField(term3373249, term3373249.getClass(), "tax", 0);
        setField(term3373249, term3373249.getClass(), "statuses", null);
        setField(term3373249, term3373249.getClass(), "timedStatuses", null);
        setField(term3373249, term3373249.getClass(), "event", null);
        setBooleanField(term3373249, term3373249.getClass(), "eventFound", false);
        setField(term3373249, term3373249.getClass(), "happinessEffect", null);
        setField(term3373249, term3373249.getClass(), "happinessExplanation", null);
        setField(term3373249, term3373249.getClass(), "farmProdExplain", null);
        setField(term3373249, term3373249.getClass(), "metaProdExplain", null);
        setField(term3373249, term3373249.getClass(), "prodProdExplain", null);
        setField(term3373249, term3373249.getClass(), "reseProdExplain", null);
        setField(term3373249, term3373249.getClass(), "cultProdExplain", null);
        setField(term3373249, term3373249.getClass(), "credProdExplain", null);
        setField(term3373249, term3373249.getClass(), "governor", null);
        setIntField(term3373249, term3373249.getClass(), "governorGuide", 0);
        setField(term3373249, term3373249.getClass(), "orbital", null);
        setField(term3373249, term3373249.getClass(), "workers", null);
        setField(term3373249, term3373249.getClass(), "buildings", null);
        setField(term3373249, term3373249.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExtraFood", argTypes, term3373249, args);
    }

};



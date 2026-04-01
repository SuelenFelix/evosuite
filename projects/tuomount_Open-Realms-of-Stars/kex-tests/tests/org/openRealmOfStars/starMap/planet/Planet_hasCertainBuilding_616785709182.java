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

public class Planet_hasCertainBuilding_616785709182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2775514;

    public Planet_hasCertainBuilding_616785709182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2775514 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2775514, term2775514.getClass(), "name", null);
        setIntField(term2775514, term2775514.getClass(), "orderNumber", 0);
        setField(term2775514, term2775514.getClass(), "radiationType", null);
        setField(term2775514, term2775514.getClass(), "gravityType", null);
        setField(term2775514, term2775514.getClass(), "temperatureType", null);
        setField(term2775514, term2775514.getClass(), "waterLevel", null);
        setBooleanField(term2775514, term2775514.getClass(), "gasGiant", false);
        setField(term2775514, term2775514.getClass(), "coordinate", null);
        setField(term2775514, term2775514.getClass(), "planetType", null);
        setIntField(term2775514, term2775514.getClass(), "groundSize", 0);
        setIntField(term2775514, term2775514.getClass(), "amountMetalInGround", 0);
        setIntField(term2775514, term2775514.getClass(), "metal", 0);
        setIntField(term2775514, term2775514.getClass(), "prodResource", 0);
        setIntField(term2775514, term2775514.getClass(), "extraFood", 0);
        setIntField(term2775514, term2775514.getClass(), "culture", 0);
        setIntField(term2775514, term2775514.getClass(), "planetOwner", 0);
        setField(term2775514, term2775514.getClass(), "planetOwnerInfo", null);
        setField(term2775514, term2775514.getClass(), "homeWorldId", null);
        setIntField(term2775514, term2775514.getClass(), "startRealmIndex", 0);
        setIntField(term2775514, term2775514.getClass(), "tax", 0);
        setField(term2775514, term2775514.getClass(), "statuses", null);
        setField(term2775514, term2775514.getClass(), "timedStatuses", null);
        setField(term2775514, term2775514.getClass(), "event", null);
        setBooleanField(term2775514, term2775514.getClass(), "eventFound", false);
        setField(term2775514, term2775514.getClass(), "happinessEffect", null);
        setField(term2775514, term2775514.getClass(), "happinessExplanation", null);
        setField(term2775514, term2775514.getClass(), "farmProdExplain", null);
        setField(term2775514, term2775514.getClass(), "metaProdExplain", null);
        setField(term2775514, term2775514.getClass(), "prodProdExplain", null);
        setField(term2775514, term2775514.getClass(), "reseProdExplain", null);
        setField(term2775514, term2775514.getClass(), "cultProdExplain", null);
        setField(term2775514, term2775514.getClass(), "credProdExplain", null);
        setField(term2775514, term2775514.getClass(), "governor", null);
        setIntField(term2775514, term2775514.getClass(), "governorGuide", 0);
        setField(term2775514, term2775514.getClass(), "orbital", null);
        setField(term2775514, term2775514.getClass(), "workers", null);
        setField(term2775514, term2775514.getClass(), "buildings", null);
        setField(term2775514, term2775514.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "hasCertainBuilding", argTypes, term2775514, args);
    }

};



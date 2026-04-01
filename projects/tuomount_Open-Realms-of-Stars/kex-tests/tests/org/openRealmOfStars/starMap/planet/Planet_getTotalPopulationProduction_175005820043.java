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

public class Planet_getTotalPopulationProduction_175005820043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199373;

    public Planet_getTotalPopulationProduction_175005820043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199373 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term199373, term199373.getClass(), "name", null);
        setIntField(term199373, term199373.getClass(), "orderNumber", 0);
        setField(term199373, term199373.getClass(), "radiationType", null);
        setField(term199373, term199373.getClass(), "gravityType", null);
        setField(term199373, term199373.getClass(), "temperatureType", null);
        setField(term199373, term199373.getClass(), "waterLevel", null);
        setBooleanField(term199373, term199373.getClass(), "gasGiant", false);
        setField(term199373, term199373.getClass(), "coordinate", null);
        setField(term199373, term199373.getClass(), "planetType", null);
        setIntField(term199373, term199373.getClass(), "groundSize", 0);
        setIntField(term199373, term199373.getClass(), "amountMetalInGround", 0);
        setIntField(term199373, term199373.getClass(), "metal", 0);
        setIntField(term199373, term199373.getClass(), "prodResource", 0);
        setIntField(term199373, term199373.getClass(), "extraFood", 0);
        setIntField(term199373, term199373.getClass(), "culture", 0);
        setIntField(term199373, term199373.getClass(), "planetOwner", 0);
        setField(term199373, term199373.getClass(), "planetOwnerInfo", null);
        setField(term199373, term199373.getClass(), "homeWorldId", null);
        setIntField(term199373, term199373.getClass(), "startRealmIndex", 0);
        setIntField(term199373, term199373.getClass(), "tax", 0);
        setField(term199373, term199373.getClass(), "statuses", null);
        setField(term199373, term199373.getClass(), "timedStatuses", null);
        setField(term199373, term199373.getClass(), "event", null);
        setBooleanField(term199373, term199373.getClass(), "eventFound", false);
        setField(term199373, term199373.getClass(), "happinessEffect", null);
        setField(term199373, term199373.getClass(), "happinessExplanation", null);
        setField(term199373, term199373.getClass(), "farmProdExplain", null);
        setField(term199373, term199373.getClass(), "metaProdExplain", null);
        setField(term199373, term199373.getClass(), "prodProdExplain", null);
        setField(term199373, term199373.getClass(), "reseProdExplain", null);
        setField(term199373, term199373.getClass(), "cultProdExplain", null);
        setField(term199373, term199373.getClass(), "credProdExplain", null);
        setField(term199373, term199373.getClass(), "governor", null);
        setIntField(term199373, term199373.getClass(), "governorGuide", 0);
        setField(term199373, term199373.getClass(), "orbital", null);
        setField(term199373, term199373.getClass(), "workers", null);
        setField(term199373, term199373.getClass(), "buildings", null);
        setField(term199373, term199373.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalPopulationProduction", argTypes, term199373, args);
    }

};



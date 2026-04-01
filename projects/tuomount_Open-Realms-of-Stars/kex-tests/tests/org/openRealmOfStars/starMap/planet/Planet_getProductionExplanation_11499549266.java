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

public class Planet_getProductionExplanation_11499549266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1126021;

    public Planet_getProductionExplanation_11499549266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1126021 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term1126021, term1126021.getClass(), "name", null);
        setIntField(term1126021, term1126021.getClass(), "orderNumber", 0);
        setField(term1126021, term1126021.getClass(), "radiationType", null);
        setField(term1126021, term1126021.getClass(), "gravityType", null);
        setField(term1126021, term1126021.getClass(), "temperatureType", null);
        setField(term1126021, term1126021.getClass(), "waterLevel", null);
        setBooleanField(term1126021, term1126021.getClass(), "gasGiant", false);
        setField(term1126021, term1126021.getClass(), "coordinate", null);
        setField(term1126021, term1126021.getClass(), "planetType", null);
        setIntField(term1126021, term1126021.getClass(), "groundSize", 0);
        setIntField(term1126021, term1126021.getClass(), "amountMetalInGround", 0);
        setIntField(term1126021, term1126021.getClass(), "metal", 0);
        setIntField(term1126021, term1126021.getClass(), "prodResource", 0);
        setIntField(term1126021, term1126021.getClass(), "extraFood", 0);
        setIntField(term1126021, term1126021.getClass(), "culture", 0);
        setIntField(term1126021, term1126021.getClass(), "planetOwner", 0);
        setField(term1126021, term1126021.getClass(), "planetOwnerInfo", null);
        setField(term1126021, term1126021.getClass(), "homeWorldId", null);
        setIntField(term1126021, term1126021.getClass(), "startRealmIndex", 0);
        setIntField(term1126021, term1126021.getClass(), "tax", 0);
        setField(term1126021, term1126021.getClass(), "statuses", null);
        setField(term1126021, term1126021.getClass(), "timedStatuses", null);
        setField(term1126021, term1126021.getClass(), "event", null);
        setBooleanField(term1126021, term1126021.getClass(), "eventFound", false);
        setField(term1126021, term1126021.getClass(), "happinessEffect", null);
        setField(term1126021, term1126021.getClass(), "happinessExplanation", null);
        setField(term1126021, term1126021.getClass(), "farmProdExplain", null);
        setField(term1126021, term1126021.getClass(), "metaProdExplain", null);
        setField(term1126021, term1126021.getClass(), "prodProdExplain", null);
        setField(term1126021, term1126021.getClass(), "reseProdExplain", null);
        setField(term1126021, term1126021.getClass(), "cultProdExplain", null);
        setField(term1126021, term1126021.getClass(), "credProdExplain", null);
        setField(term1126021, term1126021.getClass(), "governor", null);
        setIntField(term1126021, term1126021.getClass(), "governorGuide", 0);
        setField(term1126021, term1126021.getClass(), "orbital", null);
        setField(term1126021, term1126021.getClass(), "workers", null);
        setField(term1126021, term1126021.getClass(), "buildings", null);
        setField(term1126021, term1126021.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProductionExplanation", argTypes, term1126021, args);
    }

};



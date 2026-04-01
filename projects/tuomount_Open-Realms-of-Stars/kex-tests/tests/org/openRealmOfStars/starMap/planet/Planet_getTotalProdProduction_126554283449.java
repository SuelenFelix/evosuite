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

public class Planet_getTotalProdProduction_126554283449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221607;

    public Planet_getTotalProdProduction_126554283449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221607 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term221607, term221607.getClass(), "name", null);
        setIntField(term221607, term221607.getClass(), "orderNumber", 0);
        setField(term221607, term221607.getClass(), "radiationType", null);
        setField(term221607, term221607.getClass(), "gravityType", null);
        setField(term221607, term221607.getClass(), "temperatureType", null);
        setField(term221607, term221607.getClass(), "waterLevel", null);
        setBooleanField(term221607, term221607.getClass(), "gasGiant", false);
        setField(term221607, term221607.getClass(), "coordinate", null);
        setField(term221607, term221607.getClass(), "planetType", null);
        setIntField(term221607, term221607.getClass(), "groundSize", 0);
        setIntField(term221607, term221607.getClass(), "amountMetalInGround", 0);
        setIntField(term221607, term221607.getClass(), "metal", 0);
        setIntField(term221607, term221607.getClass(), "prodResource", 0);
        setIntField(term221607, term221607.getClass(), "extraFood", 0);
        setIntField(term221607, term221607.getClass(), "culture", 0);
        setIntField(term221607, term221607.getClass(), "planetOwner", 0);
        setField(term221607, term221607.getClass(), "planetOwnerInfo", null);
        setField(term221607, term221607.getClass(), "homeWorldId", null);
        setIntField(term221607, term221607.getClass(), "startRealmIndex", 0);
        setIntField(term221607, term221607.getClass(), "tax", 0);
        setField(term221607, term221607.getClass(), "statuses", null);
        setField(term221607, term221607.getClass(), "timedStatuses", null);
        setField(term221607, term221607.getClass(), "event", null);
        setBooleanField(term221607, term221607.getClass(), "eventFound", false);
        setField(term221607, term221607.getClass(), "happinessEffect", null);
        setField(term221607, term221607.getClass(), "happinessExplanation", null);
        setField(term221607, term221607.getClass(), "farmProdExplain", null);
        setField(term221607, term221607.getClass(), "metaProdExplain", null);
        setField(term221607, term221607.getClass(), "prodProdExplain", null);
        setField(term221607, term221607.getClass(), "reseProdExplain", null);
        setField(term221607, term221607.getClass(), "cultProdExplain", null);
        setField(term221607, term221607.getClass(), "credProdExplain", null);
        setField(term221607, term221607.getClass(), "governor", null);
        setIntField(term221607, term221607.getClass(), "governorGuide", 0);
        setField(term221607, term221607.getClass(), "orbital", null);
        setField(term221607, term221607.getClass(), "workers", null);
        setField(term221607, term221607.getClass(), "buildings", null);
        setField(term221607, term221607.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalProdProduction", argTypes, term221607, args);
    }

};



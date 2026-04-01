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

public class Planet_getTotalCreditProduction_119302188313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1325830;

    public Planet_getTotalCreditProduction_119302188313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1325830 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term1325830, term1325830.getClass(), "name", null);
        setIntField(term1325830, term1325830.getClass(), "orderNumber", 0);
        setField(term1325830, term1325830.getClass(), "radiationType", null);
        setField(term1325830, term1325830.getClass(), "gravityType", null);
        setField(term1325830, term1325830.getClass(), "temperatureType", null);
        setField(term1325830, term1325830.getClass(), "waterLevel", null);
        setBooleanField(term1325830, term1325830.getClass(), "gasGiant", false);
        setField(term1325830, term1325830.getClass(), "coordinate", null);
        setField(term1325830, term1325830.getClass(), "planetType", null);
        setIntField(term1325830, term1325830.getClass(), "groundSize", 0);
        setIntField(term1325830, term1325830.getClass(), "amountMetalInGround", 0);
        setIntField(term1325830, term1325830.getClass(), "metal", 0);
        setIntField(term1325830, term1325830.getClass(), "prodResource", 0);
        setIntField(term1325830, term1325830.getClass(), "extraFood", 0);
        setIntField(term1325830, term1325830.getClass(), "culture", 0);
        setIntField(term1325830, term1325830.getClass(), "planetOwner", 0);
        setField(term1325830, term1325830.getClass(), "planetOwnerInfo", null);
        setField(term1325830, term1325830.getClass(), "homeWorldId", null);
        setIntField(term1325830, term1325830.getClass(), "startRealmIndex", 0);
        setIntField(term1325830, term1325830.getClass(), "tax", 0);
        setField(term1325830, term1325830.getClass(), "statuses", null);
        setField(term1325830, term1325830.getClass(), "timedStatuses", null);
        setField(term1325830, term1325830.getClass(), "event", null);
        setBooleanField(term1325830, term1325830.getClass(), "eventFound", false);
        setField(term1325830, term1325830.getClass(), "happinessEffect", null);
        setField(term1325830, term1325830.getClass(), "happinessExplanation", null);
        setField(term1325830, term1325830.getClass(), "farmProdExplain", null);
        setField(term1325830, term1325830.getClass(), "metaProdExplain", null);
        setField(term1325830, term1325830.getClass(), "prodProdExplain", null);
        setField(term1325830, term1325830.getClass(), "reseProdExplain", null);
        setField(term1325830, term1325830.getClass(), "cultProdExplain", null);
        setField(term1325830, term1325830.getClass(), "credProdExplain", null);
        setField(term1325830, term1325830.getClass(), "governor", null);
        setIntField(term1325830, term1325830.getClass(), "governorGuide", 0);
        setField(term1325830, term1325830.getClass(), "orbital", null);
        setField(term1325830, term1325830.getClass(), "workers", null);
        setField(term1325830, term1325830.getClass(), "buildings", null);
        setField(term1325830, term1325830.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalCreditProduction", argTypes, term1325830, args);
    }

};



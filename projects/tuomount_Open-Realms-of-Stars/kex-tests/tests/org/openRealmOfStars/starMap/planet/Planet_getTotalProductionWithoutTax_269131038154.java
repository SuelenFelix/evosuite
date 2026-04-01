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

public class Planet_getTotalProductionWithoutTax_269131038154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term647863;

    public Planet_getTotalProductionWithoutTax_269131038154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term647863 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term647863, term647863.getClass(), "name", null);
        setIntField(term647863, term647863.getClass(), "orderNumber", 0);
        setField(term647863, term647863.getClass(), "radiationType", null);
        setField(term647863, term647863.getClass(), "gravityType", null);
        setField(term647863, term647863.getClass(), "temperatureType", null);
        setField(term647863, term647863.getClass(), "waterLevel", null);
        setBooleanField(term647863, term647863.getClass(), "gasGiant", false);
        setField(term647863, term647863.getClass(), "coordinate", null);
        setField(term647863, term647863.getClass(), "planetType", null);
        setIntField(term647863, term647863.getClass(), "groundSize", 0);
        setIntField(term647863, term647863.getClass(), "amountMetalInGround", 0);
        setIntField(term647863, term647863.getClass(), "metal", 0);
        setIntField(term647863, term647863.getClass(), "prodResource", 0);
        setIntField(term647863, term647863.getClass(), "extraFood", 0);
        setIntField(term647863, term647863.getClass(), "culture", 0);
        setIntField(term647863, term647863.getClass(), "planetOwner", 0);
        setField(term647863, term647863.getClass(), "planetOwnerInfo", null);
        setField(term647863, term647863.getClass(), "homeWorldId", null);
        setIntField(term647863, term647863.getClass(), "startRealmIndex", 0);
        setIntField(term647863, term647863.getClass(), "tax", 0);
        setField(term647863, term647863.getClass(), "statuses", null);
        setField(term647863, term647863.getClass(), "timedStatuses", null);
        setField(term647863, term647863.getClass(), "event", null);
        setBooleanField(term647863, term647863.getClass(), "eventFound", false);
        setField(term647863, term647863.getClass(), "happinessEffect", null);
        setField(term647863, term647863.getClass(), "happinessExplanation", null);
        setField(term647863, term647863.getClass(), "farmProdExplain", null);
        setField(term647863, term647863.getClass(), "metaProdExplain", null);
        setField(term647863, term647863.getClass(), "prodProdExplain", null);
        setField(term647863, term647863.getClass(), "reseProdExplain", null);
        setField(term647863, term647863.getClass(), "cultProdExplain", null);
        setField(term647863, term647863.getClass(), "credProdExplain", null);
        setField(term647863, term647863.getClass(), "governor", null);
        setIntField(term647863, term647863.getClass(), "governorGuide", 0);
        setField(term647863, term647863.getClass(), "orbital", null);
        setField(term647863, term647863.getClass(), "workers", null);
        setField(term647863, term647863.getClass(), "buildings", null);
        setField(term647863, term647863.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalProductionWithoutTax", argTypes, term647863, args);
    }

};



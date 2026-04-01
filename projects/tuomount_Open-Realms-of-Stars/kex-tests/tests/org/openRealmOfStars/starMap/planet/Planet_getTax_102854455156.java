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

public class Planet_getTax_102854455156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term654826;

    public Planet_getTax_102854455156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term654826 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term654826, term654826.getClass(), "name", null);
        setIntField(term654826, term654826.getClass(), "orderNumber", 0);
        setField(term654826, term654826.getClass(), "radiationType", null);
        setField(term654826, term654826.getClass(), "gravityType", null);
        setField(term654826, term654826.getClass(), "temperatureType", null);
        setField(term654826, term654826.getClass(), "waterLevel", null);
        setBooleanField(term654826, term654826.getClass(), "gasGiant", false);
        setField(term654826, term654826.getClass(), "coordinate", null);
        setField(term654826, term654826.getClass(), "planetType", null);
        setIntField(term654826, term654826.getClass(), "groundSize", 0);
        setIntField(term654826, term654826.getClass(), "amountMetalInGround", 0);
        setIntField(term654826, term654826.getClass(), "metal", 0);
        setIntField(term654826, term654826.getClass(), "prodResource", 0);
        setIntField(term654826, term654826.getClass(), "extraFood", 0);
        setIntField(term654826, term654826.getClass(), "culture", 0);
        setIntField(term654826, term654826.getClass(), "planetOwner", 0);
        setField(term654826, term654826.getClass(), "planetOwnerInfo", null);
        setField(term654826, term654826.getClass(), "homeWorldId", null);
        setIntField(term654826, term654826.getClass(), "startRealmIndex", 0);
        setIntField(term654826, term654826.getClass(), "tax", 0);
        setField(term654826, term654826.getClass(), "statuses", null);
        setField(term654826, term654826.getClass(), "timedStatuses", null);
        setField(term654826, term654826.getClass(), "event", null);
        setBooleanField(term654826, term654826.getClass(), "eventFound", false);
        setField(term654826, term654826.getClass(), "happinessEffect", null);
        setField(term654826, term654826.getClass(), "happinessExplanation", null);
        setField(term654826, term654826.getClass(), "farmProdExplain", null);
        setField(term654826, term654826.getClass(), "metaProdExplain", null);
        setField(term654826, term654826.getClass(), "prodProdExplain", null);
        setField(term654826, term654826.getClass(), "reseProdExplain", null);
        setField(term654826, term654826.getClass(), "cultProdExplain", null);
        setField(term654826, term654826.getClass(), "credProdExplain", null);
        setField(term654826, term654826.getClass(), "governor", null);
        setIntField(term654826, term654826.getClass(), "governorGuide", 0);
        setField(term654826, term654826.getClass(), "orbital", null);
        setField(term654826, term654826.getClass(), "workers", null);
        setField(term654826, term654826.getClass(), "buildings", null);
        setField(term654826, term654826.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTax", argTypes, term654826, args);
    }

};



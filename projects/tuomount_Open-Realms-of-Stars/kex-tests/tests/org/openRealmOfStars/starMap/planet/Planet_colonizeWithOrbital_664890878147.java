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

public class Planet_colonizeWithOrbital_664890878147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term619688;

    public Planet_colonizeWithOrbital_664890878147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term619688 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term619688, term619688.getClass(), "name", null);
        setIntField(term619688, term619688.getClass(), "orderNumber", 0);
        setField(term619688, term619688.getClass(), "radiationType", null);
        setField(term619688, term619688.getClass(), "gravityType", null);
        setField(term619688, term619688.getClass(), "temperatureType", null);
        setField(term619688, term619688.getClass(), "waterLevel", null);
        setBooleanField(term619688, term619688.getClass(), "gasGiant", false);
        setField(term619688, term619688.getClass(), "coordinate", null);
        setField(term619688, term619688.getClass(), "planetType", null);
        setIntField(term619688, term619688.getClass(), "groundSize", 0);
        setIntField(term619688, term619688.getClass(), "amountMetalInGround", 0);
        setIntField(term619688, term619688.getClass(), "metal", 0);
        setIntField(term619688, term619688.getClass(), "prodResource", 0);
        setIntField(term619688, term619688.getClass(), "extraFood", 0);
        setIntField(term619688, term619688.getClass(), "culture", 0);
        setIntField(term619688, term619688.getClass(), "planetOwner", 0);
        setField(term619688, term619688.getClass(), "planetOwnerInfo", null);
        setField(term619688, term619688.getClass(), "homeWorldId", null);
        setIntField(term619688, term619688.getClass(), "startRealmIndex", 0);
        setIntField(term619688, term619688.getClass(), "tax", 0);
        setField(term619688, term619688.getClass(), "statuses", null);
        setField(term619688, term619688.getClass(), "timedStatuses", null);
        setField(term619688, term619688.getClass(), "event", null);
        setBooleanField(term619688, term619688.getClass(), "eventFound", false);
        setField(term619688, term619688.getClass(), "happinessEffect", null);
        setField(term619688, term619688.getClass(), "happinessExplanation", null);
        setField(term619688, term619688.getClass(), "farmProdExplain", null);
        setField(term619688, term619688.getClass(), "metaProdExplain", null);
        setField(term619688, term619688.getClass(), "prodProdExplain", null);
        setField(term619688, term619688.getClass(), "reseProdExplain", null);
        setField(term619688, term619688.getClass(), "cultProdExplain", null);
        setField(term619688, term619688.getClass(), "credProdExplain", null);
        setField(term619688, term619688.getClass(), "governor", null);
        setIntField(term619688, term619688.getClass(), "governorGuide", 0);
        setField(term619688, term619688.getClass(), "orbital", null);
        setField(term619688, term619688.getClass(), "workers", null);
        setField(term619688, term619688.getClass(), "buildings", null);
        setField(term619688, term619688.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "colonizeWithOrbital", argTypes, term619688, args);
    }

};



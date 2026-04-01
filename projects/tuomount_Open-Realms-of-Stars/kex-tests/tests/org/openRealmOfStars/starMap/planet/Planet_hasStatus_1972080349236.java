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

public class Planet_hasStatus_1972080349236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term996361;

    public Planet_hasStatus_1972080349236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term996361 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term996361, term996361.getClass(), "name", null);
        setIntField(term996361, term996361.getClass(), "orderNumber", 0);
        setField(term996361, term996361.getClass(), "radiationType", null);
        setField(term996361, term996361.getClass(), "gravityType", null);
        setField(term996361, term996361.getClass(), "temperatureType", null);
        setField(term996361, term996361.getClass(), "waterLevel", null);
        setBooleanField(term996361, term996361.getClass(), "gasGiant", false);
        setField(term996361, term996361.getClass(), "coordinate", null);
        setField(term996361, term996361.getClass(), "planetType", null);
        setIntField(term996361, term996361.getClass(), "groundSize", 0);
        setIntField(term996361, term996361.getClass(), "amountMetalInGround", 0);
        setIntField(term996361, term996361.getClass(), "metal", 0);
        setIntField(term996361, term996361.getClass(), "prodResource", 0);
        setIntField(term996361, term996361.getClass(), "extraFood", 0);
        setIntField(term996361, term996361.getClass(), "culture", 0);
        setIntField(term996361, term996361.getClass(), "planetOwner", 0);
        setField(term996361, term996361.getClass(), "planetOwnerInfo", null);
        setField(term996361, term996361.getClass(), "homeWorldId", null);
        setIntField(term996361, term996361.getClass(), "startRealmIndex", 0);
        setIntField(term996361, term996361.getClass(), "tax", 0);
        setField(term996361, term996361.getClass(), "statuses", null);
        setField(term996361, term996361.getClass(), "timedStatuses", null);
        setField(term996361, term996361.getClass(), "event", null);
        setBooleanField(term996361, term996361.getClass(), "eventFound", false);
        setField(term996361, term996361.getClass(), "happinessEffect", null);
        setField(term996361, term996361.getClass(), "happinessExplanation", null);
        setField(term996361, term996361.getClass(), "farmProdExplain", null);
        setField(term996361, term996361.getClass(), "metaProdExplain", null);
        setField(term996361, term996361.getClass(), "prodProdExplain", null);
        setField(term996361, term996361.getClass(), "reseProdExplain", null);
        setField(term996361, term996361.getClass(), "cultProdExplain", null);
        setField(term996361, term996361.getClass(), "credProdExplain", null);
        setField(term996361, term996361.getClass(), "governor", null);
        setIntField(term996361, term996361.getClass(), "governorGuide", 0);
        setField(term996361, term996361.getClass(), "orbital", null);
        setField(term996361, term996361.getClass(), "workers", null);
        setField(term996361, term996361.getClass(), "buildings", null);
        setField(term996361, term996361.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "hasStatus", argTypes, term996361, args);
    }

};



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

public class Planet_getTotalRadiationLevel_69211496061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265090;

    public Planet_getTotalRadiationLevel_69211496061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265090 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term265090, term265090.getClass(), "name", null);
        setIntField(term265090, term265090.getClass(), "orderNumber", 0);
        setField(term265090, term265090.getClass(), "radiationType", null);
        setField(term265090, term265090.getClass(), "gravityType", null);
        setField(term265090, term265090.getClass(), "temperatureType", null);
        setField(term265090, term265090.getClass(), "waterLevel", null);
        setBooleanField(term265090, term265090.getClass(), "gasGiant", false);
        setField(term265090, term265090.getClass(), "coordinate", null);
        setField(term265090, term265090.getClass(), "planetType", null);
        setIntField(term265090, term265090.getClass(), "groundSize", 0);
        setIntField(term265090, term265090.getClass(), "amountMetalInGround", 0);
        setIntField(term265090, term265090.getClass(), "metal", 0);
        setIntField(term265090, term265090.getClass(), "prodResource", 0);
        setIntField(term265090, term265090.getClass(), "extraFood", 0);
        setIntField(term265090, term265090.getClass(), "culture", 0);
        setIntField(term265090, term265090.getClass(), "planetOwner", 0);
        setField(term265090, term265090.getClass(), "planetOwnerInfo", null);
        setField(term265090, term265090.getClass(), "homeWorldId", null);
        setIntField(term265090, term265090.getClass(), "startRealmIndex", 0);
        setIntField(term265090, term265090.getClass(), "tax", 0);
        setField(term265090, term265090.getClass(), "statuses", null);
        setField(term265090, term265090.getClass(), "timedStatuses", null);
        setField(term265090, term265090.getClass(), "event", null);
        setBooleanField(term265090, term265090.getClass(), "eventFound", false);
        setField(term265090, term265090.getClass(), "happinessEffect", null);
        setField(term265090, term265090.getClass(), "happinessExplanation", null);
        setField(term265090, term265090.getClass(), "farmProdExplain", null);
        setField(term265090, term265090.getClass(), "metaProdExplain", null);
        setField(term265090, term265090.getClass(), "prodProdExplain", null);
        setField(term265090, term265090.getClass(), "reseProdExplain", null);
        setField(term265090, term265090.getClass(), "cultProdExplain", null);
        setField(term265090, term265090.getClass(), "credProdExplain", null);
        setField(term265090, term265090.getClass(), "governor", null);
        setIntField(term265090, term265090.getClass(), "governorGuide", 0);
        setField(term265090, term265090.getClass(), "orbital", null);
        setField(term265090, term265090.getClass(), "workers", null);
        setField(term265090, term265090.getClass(), "buildings", null);
        setField(term265090, term265090.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalRadiationLevel", argTypes, term265090, args);
    }

};



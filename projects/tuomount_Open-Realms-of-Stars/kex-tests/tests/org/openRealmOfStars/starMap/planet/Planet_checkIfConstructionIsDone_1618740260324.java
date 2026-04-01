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
import java.lang.Boolean;

public class Planet_checkIfConstructionIsDone_1618740260324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1325986;
     Object term1326000;

    public Planet_checkIfConstructionIsDone_1618740260324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1325986 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term1325986, term1325986.getClass(), "name", null);
        setIntField(term1325986, term1325986.getClass(), "orderNumber", 0);
        setField(term1325986, term1325986.getClass(), "radiationType", null);
        setField(term1325986, term1325986.getClass(), "gravityType", null);
        setField(term1325986, term1325986.getClass(), "temperatureType", null);
        setField(term1325986, term1325986.getClass(), "waterLevel", null);
        setBooleanField(term1325986, term1325986.getClass(), "gasGiant", false);
        setField(term1325986, term1325986.getClass(), "coordinate", null);
        setField(term1325986, term1325986.getClass(), "planetType", null);
        setIntField(term1325986, term1325986.getClass(), "groundSize", 0);
        setIntField(term1325986, term1325986.getClass(), "amountMetalInGround", 0);
        setIntField(term1325986, term1325986.getClass(), "metal", 0);
        setIntField(term1325986, term1325986.getClass(), "prodResource", 0);
        setIntField(term1325986, term1325986.getClass(), "extraFood", 0);
        setIntField(term1325986, term1325986.getClass(), "culture", 0);
        setIntField(term1325986, term1325986.getClass(), "planetOwner", 0);
        setField(term1325986, term1325986.getClass(), "planetOwnerInfo", null);
        setField(term1325986, term1325986.getClass(), "homeWorldId", null);
        setIntField(term1325986, term1325986.getClass(), "startRealmIndex", 0);
        setIntField(term1325986, term1325986.getClass(), "tax", 0);
        setField(term1325986, term1325986.getClass(), "statuses", null);
        setField(term1325986, term1325986.getClass(), "timedStatuses", null);
        setField(term1325986, term1325986.getClass(), "event", null);
        setBooleanField(term1325986, term1325986.getClass(), "eventFound", false);
        setField(term1325986, term1325986.getClass(), "happinessEffect", null);
        setField(term1325986, term1325986.getClass(), "happinessExplanation", null);
        setField(term1325986, term1325986.getClass(), "farmProdExplain", null);
        setField(term1325986, term1325986.getClass(), "metaProdExplain", null);
        setField(term1325986, term1325986.getClass(), "prodProdExplain", null);
        setField(term1325986, term1325986.getClass(), "reseProdExplain", null);
        setField(term1325986, term1325986.getClass(), "cultProdExplain", null);
        setField(term1325986, term1325986.getClass(), "credProdExplain", null);
        setField(term1325986, term1325986.getClass(), "governor", null);
        setIntField(term1325986, term1325986.getClass(), "governorGuide", 0);
        setField(term1325986, term1325986.getClass(), "orbital", null);
        setField(term1325986, term1325986.getClass(), "workers", null);
        setField(term1325986, term1325986.getClass(), "buildings", null);
        setField(term1325986, term1325986.getClass(), "underConstruction", null);
        term1326000 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Object[] args = new Object[2];
        args[0] = term1326000;
        args[1] = null;
        callMethod(klass, "checkIfConstructionIsDone", argTypes, term1325986, args);
    }

};



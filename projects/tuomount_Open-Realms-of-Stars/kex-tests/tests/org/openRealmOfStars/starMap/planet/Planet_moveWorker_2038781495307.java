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
import java.lang.Integer;

public class Planet_moveWorker_2038781495307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1325738;
     Object term1325752;
     Object term1325754;

    public Planet_moveWorker_2038781495307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1325738 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term1325738, term1325738.getClass(), "name", null);
        setIntField(term1325738, term1325738.getClass(), "orderNumber", 0);
        setField(term1325738, term1325738.getClass(), "radiationType", null);
        setField(term1325738, term1325738.getClass(), "gravityType", null);
        setField(term1325738, term1325738.getClass(), "temperatureType", null);
        setField(term1325738, term1325738.getClass(), "waterLevel", null);
        setBooleanField(term1325738, term1325738.getClass(), "gasGiant", false);
        setField(term1325738, term1325738.getClass(), "coordinate", null);
        setField(term1325738, term1325738.getClass(), "planetType", null);
        setIntField(term1325738, term1325738.getClass(), "groundSize", 0);
        setIntField(term1325738, term1325738.getClass(), "amountMetalInGround", 0);
        setIntField(term1325738, term1325738.getClass(), "metal", 0);
        setIntField(term1325738, term1325738.getClass(), "prodResource", 0);
        setIntField(term1325738, term1325738.getClass(), "extraFood", 0);
        setIntField(term1325738, term1325738.getClass(), "culture", 0);
        setIntField(term1325738, term1325738.getClass(), "planetOwner", 0);
        setField(term1325738, term1325738.getClass(), "planetOwnerInfo", null);
        setField(term1325738, term1325738.getClass(), "homeWorldId", null);
        setIntField(term1325738, term1325738.getClass(), "startRealmIndex", 0);
        setIntField(term1325738, term1325738.getClass(), "tax", 0);
        setField(term1325738, term1325738.getClass(), "statuses", null);
        setField(term1325738, term1325738.getClass(), "timedStatuses", null);
        setField(term1325738, term1325738.getClass(), "event", null);
        setBooleanField(term1325738, term1325738.getClass(), "eventFound", false);
        setField(term1325738, term1325738.getClass(), "happinessEffect", null);
        setField(term1325738, term1325738.getClass(), "happinessExplanation", null);
        setField(term1325738, term1325738.getClass(), "farmProdExplain", null);
        setField(term1325738, term1325738.getClass(), "metaProdExplain", null);
        setField(term1325738, term1325738.getClass(), "prodProdExplain", null);
        setField(term1325738, term1325738.getClass(), "reseProdExplain", null);
        setField(term1325738, term1325738.getClass(), "cultProdExplain", null);
        setField(term1325738, term1325738.getClass(), "credProdExplain", null);
        setField(term1325738, term1325738.getClass(), "governor", null);
        setIntField(term1325738, term1325738.getClass(), "governorGuide", 0);
        setField(term1325738, term1325738.getClass(), "orbital", null);
        setField(term1325738, term1325738.getClass(), "workers", null);
        setField(term1325738, term1325738.getClass(), "buildings", null);
        setField(term1325738, term1325738.getClass(), "underConstruction", null);
        term1325752 = new Integer(0);
        term1325754 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1325752;
        args[1] = term1325754;
        callMethod(klass, "moveWorker", argTypes, term1325738, args);
    }

};



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

public class Planet_moveWorker_2038781495309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3373015;
     Object term3373029;
     Object term3373031;

    public Planet_moveWorker_2038781495309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3373015 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3373015, term3373015.getClass(), "name", null);
        setIntField(term3373015, term3373015.getClass(), "orderNumber", 0);
        setField(term3373015, term3373015.getClass(), "radiationType", null);
        setField(term3373015, term3373015.getClass(), "gravityType", null);
        setField(term3373015, term3373015.getClass(), "temperatureType", null);
        setField(term3373015, term3373015.getClass(), "waterLevel", null);
        setBooleanField(term3373015, term3373015.getClass(), "gasGiant", false);
        setField(term3373015, term3373015.getClass(), "coordinate", null);
        setField(term3373015, term3373015.getClass(), "planetType", null);
        setIntField(term3373015, term3373015.getClass(), "groundSize", 0);
        setIntField(term3373015, term3373015.getClass(), "amountMetalInGround", 0);
        setIntField(term3373015, term3373015.getClass(), "metal", 0);
        setIntField(term3373015, term3373015.getClass(), "prodResource", 0);
        setIntField(term3373015, term3373015.getClass(), "extraFood", 0);
        setIntField(term3373015, term3373015.getClass(), "culture", 0);
        setIntField(term3373015, term3373015.getClass(), "planetOwner", 0);
        setField(term3373015, term3373015.getClass(), "planetOwnerInfo", null);
        setField(term3373015, term3373015.getClass(), "homeWorldId", null);
        setIntField(term3373015, term3373015.getClass(), "startRealmIndex", 0);
        setIntField(term3373015, term3373015.getClass(), "tax", 0);
        setField(term3373015, term3373015.getClass(), "statuses", null);
        setField(term3373015, term3373015.getClass(), "timedStatuses", null);
        setField(term3373015, term3373015.getClass(), "event", null);
        setBooleanField(term3373015, term3373015.getClass(), "eventFound", false);
        setField(term3373015, term3373015.getClass(), "happinessEffect", null);
        setField(term3373015, term3373015.getClass(), "happinessExplanation", null);
        setField(term3373015, term3373015.getClass(), "farmProdExplain", null);
        setField(term3373015, term3373015.getClass(), "metaProdExplain", null);
        setField(term3373015, term3373015.getClass(), "prodProdExplain", null);
        setField(term3373015, term3373015.getClass(), "reseProdExplain", null);
        setField(term3373015, term3373015.getClass(), "cultProdExplain", null);
        setField(term3373015, term3373015.getClass(), "credProdExplain", null);
        setField(term3373015, term3373015.getClass(), "governor", null);
        setIntField(term3373015, term3373015.getClass(), "governorGuide", 0);
        setField(term3373015, term3373015.getClass(), "orbital", null);
        setField(term3373015, term3373015.getClass(), "workers", null);
        setField(term3373015, term3373015.getClass(), "buildings", null);
        setField(term3373015, term3373015.getClass(), "underConstruction", null);
        term3373029 = new Integer(0);
        term3373031 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term3373029;
        args[1] = term3373031;
        callMethod(klass, "moveWorker", argTypes, term3373015, args);
    }

};



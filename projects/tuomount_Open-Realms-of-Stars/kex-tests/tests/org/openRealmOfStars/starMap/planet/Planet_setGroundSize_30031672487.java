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

public class Planet_setGroundSize_30031672487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366017;
     Object term366031;

    public Planet_setGroundSize_30031672487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term366017 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term366017, term366017.getClass(), "name", null);
        setIntField(term366017, term366017.getClass(), "orderNumber", 0);
        setField(term366017, term366017.getClass(), "radiationType", null);
        setField(term366017, term366017.getClass(), "gravityType", null);
        setField(term366017, term366017.getClass(), "temperatureType", null);
        setField(term366017, term366017.getClass(), "waterLevel", null);
        setBooleanField(term366017, term366017.getClass(), "gasGiant", false);
        setField(term366017, term366017.getClass(), "coordinate", null);
        setField(term366017, term366017.getClass(), "planetType", null);
        setIntField(term366017, term366017.getClass(), "groundSize", 0);
        setIntField(term366017, term366017.getClass(), "amountMetalInGround", 0);
        setIntField(term366017, term366017.getClass(), "metal", 0);
        setIntField(term366017, term366017.getClass(), "prodResource", 0);
        setIntField(term366017, term366017.getClass(), "extraFood", 0);
        setIntField(term366017, term366017.getClass(), "culture", 0);
        setIntField(term366017, term366017.getClass(), "planetOwner", 0);
        setField(term366017, term366017.getClass(), "planetOwnerInfo", null);
        setField(term366017, term366017.getClass(), "homeWorldId", null);
        setIntField(term366017, term366017.getClass(), "startRealmIndex", 0);
        setIntField(term366017, term366017.getClass(), "tax", 0);
        setField(term366017, term366017.getClass(), "statuses", null);
        setField(term366017, term366017.getClass(), "timedStatuses", null);
        setField(term366017, term366017.getClass(), "event", null);
        setBooleanField(term366017, term366017.getClass(), "eventFound", false);
        setField(term366017, term366017.getClass(), "happinessEffect", null);
        setField(term366017, term366017.getClass(), "happinessExplanation", null);
        setField(term366017, term366017.getClass(), "farmProdExplain", null);
        setField(term366017, term366017.getClass(), "metaProdExplain", null);
        setField(term366017, term366017.getClass(), "prodProdExplain", null);
        setField(term366017, term366017.getClass(), "reseProdExplain", null);
        setField(term366017, term366017.getClass(), "cultProdExplain", null);
        setField(term366017, term366017.getClass(), "credProdExplain", null);
        setField(term366017, term366017.getClass(), "governor", null);
        setIntField(term366017, term366017.getClass(), "governorGuide", 0);
        setField(term366017, term366017.getClass(), "orbital", null);
        setField(term366017, term366017.getClass(), "workers", null);
        setField(term366017, term366017.getClass(), "buildings", null);
        setField(term366017, term366017.getClass(), "underConstruction", null);
        term366031 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term366031;
        callMethod(klass, "setGroundSize", argTypes, term366017, args);
    }

};



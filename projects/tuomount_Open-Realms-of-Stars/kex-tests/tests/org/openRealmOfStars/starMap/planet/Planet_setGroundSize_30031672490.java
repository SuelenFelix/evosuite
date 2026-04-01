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

public class Planet_setGroundSize_30031672490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2403028;
     Object term2403042;

    public Planet_setGroundSize_30031672490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2403028 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2403028, term2403028.getClass(), "name", null);
        setIntField(term2403028, term2403028.getClass(), "orderNumber", 0);
        setField(term2403028, term2403028.getClass(), "radiationType", null);
        setField(term2403028, term2403028.getClass(), "gravityType", null);
        setField(term2403028, term2403028.getClass(), "temperatureType", null);
        setField(term2403028, term2403028.getClass(), "waterLevel", null);
        setBooleanField(term2403028, term2403028.getClass(), "gasGiant", false);
        setField(term2403028, term2403028.getClass(), "coordinate", null);
        setField(term2403028, term2403028.getClass(), "planetType", null);
        setIntField(term2403028, term2403028.getClass(), "groundSize", 0);
        setIntField(term2403028, term2403028.getClass(), "amountMetalInGround", 0);
        setIntField(term2403028, term2403028.getClass(), "metal", 0);
        setIntField(term2403028, term2403028.getClass(), "prodResource", 0);
        setIntField(term2403028, term2403028.getClass(), "extraFood", 0);
        setIntField(term2403028, term2403028.getClass(), "culture", 0);
        setIntField(term2403028, term2403028.getClass(), "planetOwner", 0);
        setField(term2403028, term2403028.getClass(), "planetOwnerInfo", null);
        setField(term2403028, term2403028.getClass(), "homeWorldId", null);
        setIntField(term2403028, term2403028.getClass(), "startRealmIndex", 0);
        setIntField(term2403028, term2403028.getClass(), "tax", 0);
        setField(term2403028, term2403028.getClass(), "statuses", null);
        setField(term2403028, term2403028.getClass(), "timedStatuses", null);
        setField(term2403028, term2403028.getClass(), "event", null);
        setBooleanField(term2403028, term2403028.getClass(), "eventFound", false);
        setField(term2403028, term2403028.getClass(), "happinessEffect", null);
        setField(term2403028, term2403028.getClass(), "happinessExplanation", null);
        setField(term2403028, term2403028.getClass(), "farmProdExplain", null);
        setField(term2403028, term2403028.getClass(), "metaProdExplain", null);
        setField(term2403028, term2403028.getClass(), "prodProdExplain", null);
        setField(term2403028, term2403028.getClass(), "reseProdExplain", null);
        setField(term2403028, term2403028.getClass(), "cultProdExplain", null);
        setField(term2403028, term2403028.getClass(), "credProdExplain", null);
        setField(term2403028, term2403028.getClass(), "governor", null);
        setIntField(term2403028, term2403028.getClass(), "governorGuide", 0);
        setField(term2403028, term2403028.getClass(), "orbital", null);
        setField(term2403028, term2403028.getClass(), "workers", null);
        setField(term2403028, term2403028.getClass(), "buildings", null);
        setField(term2403028, term2403028.getClass(), "underConstruction", null);
        term2403042 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2403042;
        callMethod(klass, "setGroundSize", argTypes, term2403028, args);
    }

};



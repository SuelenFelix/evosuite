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

public class Planet_setProdResource_388993327140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2597740;
     Object term2597754;

    public Planet_setProdResource_388993327140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2597740 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2597740, term2597740.getClass(), "name", null);
        setIntField(term2597740, term2597740.getClass(), "orderNumber", 0);
        setField(term2597740, term2597740.getClass(), "radiationType", null);
        setField(term2597740, term2597740.getClass(), "gravityType", null);
        setField(term2597740, term2597740.getClass(), "temperatureType", null);
        setField(term2597740, term2597740.getClass(), "waterLevel", null);
        setBooleanField(term2597740, term2597740.getClass(), "gasGiant", false);
        setField(term2597740, term2597740.getClass(), "coordinate", null);
        setField(term2597740, term2597740.getClass(), "planetType", null);
        setIntField(term2597740, term2597740.getClass(), "groundSize", 0);
        setIntField(term2597740, term2597740.getClass(), "amountMetalInGround", 0);
        setIntField(term2597740, term2597740.getClass(), "metal", 0);
        setIntField(term2597740, term2597740.getClass(), "prodResource", 0);
        setIntField(term2597740, term2597740.getClass(), "extraFood", 0);
        setIntField(term2597740, term2597740.getClass(), "culture", 0);
        setIntField(term2597740, term2597740.getClass(), "planetOwner", 0);
        setField(term2597740, term2597740.getClass(), "planetOwnerInfo", null);
        setField(term2597740, term2597740.getClass(), "homeWorldId", null);
        setIntField(term2597740, term2597740.getClass(), "startRealmIndex", 0);
        setIntField(term2597740, term2597740.getClass(), "tax", 0);
        setField(term2597740, term2597740.getClass(), "statuses", null);
        setField(term2597740, term2597740.getClass(), "timedStatuses", null);
        setField(term2597740, term2597740.getClass(), "event", null);
        setBooleanField(term2597740, term2597740.getClass(), "eventFound", false);
        setField(term2597740, term2597740.getClass(), "happinessEffect", null);
        setField(term2597740, term2597740.getClass(), "happinessExplanation", null);
        setField(term2597740, term2597740.getClass(), "farmProdExplain", null);
        setField(term2597740, term2597740.getClass(), "metaProdExplain", null);
        setField(term2597740, term2597740.getClass(), "prodProdExplain", null);
        setField(term2597740, term2597740.getClass(), "reseProdExplain", null);
        setField(term2597740, term2597740.getClass(), "cultProdExplain", null);
        setField(term2597740, term2597740.getClass(), "credProdExplain", null);
        setField(term2597740, term2597740.getClass(), "governor", null);
        setIntField(term2597740, term2597740.getClass(), "governorGuide", 0);
        setField(term2597740, term2597740.getClass(), "orbital", null);
        setField(term2597740, term2597740.getClass(), "workers", null);
        setField(term2597740, term2597740.getClass(), "buildings", null);
        setField(term2597740, term2597740.getClass(), "underConstruction", null);
        term2597754 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2597754;
        callMethod(klass, "setProdResource", argTypes, term2597740, args);
    }

};



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

public class Planet_setProdResource_388993327131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term564762;
     Object term564776;

    public Planet_setProdResource_388993327131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term564762 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term564762, term564762.getClass(), "name", null);
        setIntField(term564762, term564762.getClass(), "orderNumber", 0);
        setField(term564762, term564762.getClass(), "radiationType", null);
        setField(term564762, term564762.getClass(), "gravityType", null);
        setField(term564762, term564762.getClass(), "temperatureType", null);
        setField(term564762, term564762.getClass(), "waterLevel", null);
        setBooleanField(term564762, term564762.getClass(), "gasGiant", false);
        setField(term564762, term564762.getClass(), "coordinate", null);
        setField(term564762, term564762.getClass(), "planetType", null);
        setIntField(term564762, term564762.getClass(), "groundSize", 0);
        setIntField(term564762, term564762.getClass(), "amountMetalInGround", 0);
        setIntField(term564762, term564762.getClass(), "metal", 0);
        setIntField(term564762, term564762.getClass(), "prodResource", 0);
        setIntField(term564762, term564762.getClass(), "extraFood", 0);
        setIntField(term564762, term564762.getClass(), "culture", 0);
        setIntField(term564762, term564762.getClass(), "planetOwner", 0);
        setField(term564762, term564762.getClass(), "planetOwnerInfo", null);
        setField(term564762, term564762.getClass(), "homeWorldId", null);
        setIntField(term564762, term564762.getClass(), "startRealmIndex", 0);
        setIntField(term564762, term564762.getClass(), "tax", 0);
        setField(term564762, term564762.getClass(), "statuses", null);
        setField(term564762, term564762.getClass(), "timedStatuses", null);
        setField(term564762, term564762.getClass(), "event", null);
        setBooleanField(term564762, term564762.getClass(), "eventFound", false);
        setField(term564762, term564762.getClass(), "happinessEffect", null);
        setField(term564762, term564762.getClass(), "happinessExplanation", null);
        setField(term564762, term564762.getClass(), "farmProdExplain", null);
        setField(term564762, term564762.getClass(), "metaProdExplain", null);
        setField(term564762, term564762.getClass(), "prodProdExplain", null);
        setField(term564762, term564762.getClass(), "reseProdExplain", null);
        setField(term564762, term564762.getClass(), "cultProdExplain", null);
        setField(term564762, term564762.getClass(), "credProdExplain", null);
        setField(term564762, term564762.getClass(), "governor", null);
        setIntField(term564762, term564762.getClass(), "governorGuide", 0);
        setField(term564762, term564762.getClass(), "orbital", null);
        setField(term564762, term564762.getClass(), "workers", null);
        setField(term564762, term564762.getClass(), "buildings", null);
        setField(term564762, term564762.getClass(), "underConstruction", null);
        term564776 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term564776;
        callMethod(klass, "setProdResource", argTypes, term564762, args);
    }

};



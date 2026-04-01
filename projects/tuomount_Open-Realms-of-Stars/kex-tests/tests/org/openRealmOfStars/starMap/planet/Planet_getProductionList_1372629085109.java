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

public class Planet_getProductionList_1372629085109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term465779;

    public Planet_getProductionList_1372629085109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term465779 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term465779, term465779.getClass(), "name", null);
        setIntField(term465779, term465779.getClass(), "orderNumber", 0);
        setField(term465779, term465779.getClass(), "radiationType", null);
        setField(term465779, term465779.getClass(), "gravityType", null);
        setField(term465779, term465779.getClass(), "temperatureType", null);
        setField(term465779, term465779.getClass(), "waterLevel", null);
        setBooleanField(term465779, term465779.getClass(), "gasGiant", false);
        setField(term465779, term465779.getClass(), "coordinate", null);
        setField(term465779, term465779.getClass(), "planetType", null);
        setIntField(term465779, term465779.getClass(), "groundSize", 0);
        setIntField(term465779, term465779.getClass(), "amountMetalInGround", 0);
        setIntField(term465779, term465779.getClass(), "metal", 0);
        setIntField(term465779, term465779.getClass(), "prodResource", 0);
        setIntField(term465779, term465779.getClass(), "extraFood", 0);
        setIntField(term465779, term465779.getClass(), "culture", 0);
        setIntField(term465779, term465779.getClass(), "planetOwner", 0);
        setField(term465779, term465779.getClass(), "planetOwnerInfo", null);
        setField(term465779, term465779.getClass(), "homeWorldId", null);
        setIntField(term465779, term465779.getClass(), "startRealmIndex", 0);
        setIntField(term465779, term465779.getClass(), "tax", 0);
        setField(term465779, term465779.getClass(), "statuses", null);
        setField(term465779, term465779.getClass(), "timedStatuses", null);
        setField(term465779, term465779.getClass(), "event", null);
        setBooleanField(term465779, term465779.getClass(), "eventFound", false);
        setField(term465779, term465779.getClass(), "happinessEffect", null);
        setField(term465779, term465779.getClass(), "happinessExplanation", null);
        setField(term465779, term465779.getClass(), "farmProdExplain", null);
        setField(term465779, term465779.getClass(), "metaProdExplain", null);
        setField(term465779, term465779.getClass(), "prodProdExplain", null);
        setField(term465779, term465779.getClass(), "reseProdExplain", null);
        setField(term465779, term465779.getClass(), "cultProdExplain", null);
        setField(term465779, term465779.getClass(), "credProdExplain", null);
        setField(term465779, term465779.getClass(), "governor", null);
        setIntField(term465779, term465779.getClass(), "governorGuide", 0);
        setField(term465779, term465779.getClass(), "orbital", null);
        setField(term465779, term465779.getClass(), "workers", null);
        setField(term465779, term465779.getClass(), "buildings", null);
        setField(term465779, term465779.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProductionList", argTypes, term465779, args);
    }

};



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

public class Planet_getProductionList_1372629085316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3373119;

    public Planet_getProductionList_1372629085316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3373119 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3373119, term3373119.getClass(), "name", null);
        setIntField(term3373119, term3373119.getClass(), "orderNumber", 0);
        setField(term3373119, term3373119.getClass(), "radiationType", null);
        setField(term3373119, term3373119.getClass(), "gravityType", null);
        setField(term3373119, term3373119.getClass(), "temperatureType", null);
        setField(term3373119, term3373119.getClass(), "waterLevel", null);
        setBooleanField(term3373119, term3373119.getClass(), "gasGiant", false);
        setField(term3373119, term3373119.getClass(), "coordinate", null);
        setField(term3373119, term3373119.getClass(), "planetType", null);
        setIntField(term3373119, term3373119.getClass(), "groundSize", 0);
        setIntField(term3373119, term3373119.getClass(), "amountMetalInGround", 0);
        setIntField(term3373119, term3373119.getClass(), "metal", 0);
        setIntField(term3373119, term3373119.getClass(), "prodResource", 0);
        setIntField(term3373119, term3373119.getClass(), "extraFood", 0);
        setIntField(term3373119, term3373119.getClass(), "culture", 0);
        setIntField(term3373119, term3373119.getClass(), "planetOwner", 0);
        setField(term3373119, term3373119.getClass(), "planetOwnerInfo", null);
        setField(term3373119, term3373119.getClass(), "homeWorldId", null);
        setIntField(term3373119, term3373119.getClass(), "startRealmIndex", 0);
        setIntField(term3373119, term3373119.getClass(), "tax", 0);
        setField(term3373119, term3373119.getClass(), "statuses", null);
        setField(term3373119, term3373119.getClass(), "timedStatuses", null);
        setField(term3373119, term3373119.getClass(), "event", null);
        setBooleanField(term3373119, term3373119.getClass(), "eventFound", false);
        setField(term3373119, term3373119.getClass(), "happinessEffect", null);
        setField(term3373119, term3373119.getClass(), "happinessExplanation", null);
        setField(term3373119, term3373119.getClass(), "farmProdExplain", null);
        setField(term3373119, term3373119.getClass(), "metaProdExplain", null);
        setField(term3373119, term3373119.getClass(), "prodProdExplain", null);
        setField(term3373119, term3373119.getClass(), "reseProdExplain", null);
        setField(term3373119, term3373119.getClass(), "cultProdExplain", null);
        setField(term3373119, term3373119.getClass(), "credProdExplain", null);
        setField(term3373119, term3373119.getClass(), "governor", null);
        setIntField(term3373119, term3373119.getClass(), "governorGuide", 0);
        setField(term3373119, term3373119.getClass(), "orbital", null);
        setField(term3373119, term3373119.getClass(), "workers", null);
        setField(term3373119, term3373119.getClass(), "buildings", null);
        setField(term3373119, term3373119.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProductionList", argTypes, term3373119, args);
    }

};



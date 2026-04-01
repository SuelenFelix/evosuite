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

public class Planet_getstartRealmIndex_2005864771324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3373235;

    public Planet_getstartRealmIndex_2005864771324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3373235 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term3373235, term3373235.getClass(), "name", null);
        setIntField(term3373235, term3373235.getClass(), "orderNumber", 0);
        setField(term3373235, term3373235.getClass(), "radiationType", null);
        setField(term3373235, term3373235.getClass(), "gravityType", null);
        setField(term3373235, term3373235.getClass(), "temperatureType", null);
        setField(term3373235, term3373235.getClass(), "waterLevel", null);
        setBooleanField(term3373235, term3373235.getClass(), "gasGiant", false);
        setField(term3373235, term3373235.getClass(), "coordinate", null);
        setField(term3373235, term3373235.getClass(), "planetType", null);
        setIntField(term3373235, term3373235.getClass(), "groundSize", 0);
        setIntField(term3373235, term3373235.getClass(), "amountMetalInGround", 0);
        setIntField(term3373235, term3373235.getClass(), "metal", 0);
        setIntField(term3373235, term3373235.getClass(), "prodResource", 0);
        setIntField(term3373235, term3373235.getClass(), "extraFood", 0);
        setIntField(term3373235, term3373235.getClass(), "culture", 0);
        setIntField(term3373235, term3373235.getClass(), "planetOwner", 0);
        setField(term3373235, term3373235.getClass(), "planetOwnerInfo", null);
        setField(term3373235, term3373235.getClass(), "homeWorldId", null);
        setIntField(term3373235, term3373235.getClass(), "startRealmIndex", 0);
        setIntField(term3373235, term3373235.getClass(), "tax", 0);
        setField(term3373235, term3373235.getClass(), "statuses", null);
        setField(term3373235, term3373235.getClass(), "timedStatuses", null);
        setField(term3373235, term3373235.getClass(), "event", null);
        setBooleanField(term3373235, term3373235.getClass(), "eventFound", false);
        setField(term3373235, term3373235.getClass(), "happinessEffect", null);
        setField(term3373235, term3373235.getClass(), "happinessExplanation", null);
        setField(term3373235, term3373235.getClass(), "farmProdExplain", null);
        setField(term3373235, term3373235.getClass(), "metaProdExplain", null);
        setField(term3373235, term3373235.getClass(), "prodProdExplain", null);
        setField(term3373235, term3373235.getClass(), "reseProdExplain", null);
        setField(term3373235, term3373235.getClass(), "cultProdExplain", null);
        setField(term3373235, term3373235.getClass(), "credProdExplain", null);
        setField(term3373235, term3373235.getClass(), "governor", null);
        setIntField(term3373235, term3373235.getClass(), "governorGuide", 0);
        setField(term3373235, term3373235.getClass(), "orbital", null);
        setField(term3373235, term3373235.getClass(), "workers", null);
        setField(term3373235, term3373235.getClass(), "buildings", null);
        setField(term3373235, term3373235.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getstartRealmIndex", argTypes, term3373235, args);
    }

};



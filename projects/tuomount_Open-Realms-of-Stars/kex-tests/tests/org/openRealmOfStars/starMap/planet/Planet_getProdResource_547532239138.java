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

public class Planet_getProdResource_547532239138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2590742;

    public Planet_getProdResource_547532239138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2590742 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2590742, term2590742.getClass(), "name", null);
        setIntField(term2590742, term2590742.getClass(), "orderNumber", 0);
        setField(term2590742, term2590742.getClass(), "radiationType", null);
        setField(term2590742, term2590742.getClass(), "gravityType", null);
        setField(term2590742, term2590742.getClass(), "temperatureType", null);
        setField(term2590742, term2590742.getClass(), "waterLevel", null);
        setBooleanField(term2590742, term2590742.getClass(), "gasGiant", false);
        setField(term2590742, term2590742.getClass(), "coordinate", null);
        setField(term2590742, term2590742.getClass(), "planetType", null);
        setIntField(term2590742, term2590742.getClass(), "groundSize", 0);
        setIntField(term2590742, term2590742.getClass(), "amountMetalInGround", 0);
        setIntField(term2590742, term2590742.getClass(), "metal", 0);
        setIntField(term2590742, term2590742.getClass(), "prodResource", 0);
        setIntField(term2590742, term2590742.getClass(), "extraFood", 0);
        setIntField(term2590742, term2590742.getClass(), "culture", 0);
        setIntField(term2590742, term2590742.getClass(), "planetOwner", 0);
        setField(term2590742, term2590742.getClass(), "planetOwnerInfo", null);
        setField(term2590742, term2590742.getClass(), "homeWorldId", null);
        setIntField(term2590742, term2590742.getClass(), "startRealmIndex", 0);
        setIntField(term2590742, term2590742.getClass(), "tax", 0);
        setField(term2590742, term2590742.getClass(), "statuses", null);
        setField(term2590742, term2590742.getClass(), "timedStatuses", null);
        setField(term2590742, term2590742.getClass(), "event", null);
        setBooleanField(term2590742, term2590742.getClass(), "eventFound", false);
        setField(term2590742, term2590742.getClass(), "happinessEffect", null);
        setField(term2590742, term2590742.getClass(), "happinessExplanation", null);
        setField(term2590742, term2590742.getClass(), "farmProdExplain", null);
        setField(term2590742, term2590742.getClass(), "metaProdExplain", null);
        setField(term2590742, term2590742.getClass(), "prodProdExplain", null);
        setField(term2590742, term2590742.getClass(), "reseProdExplain", null);
        setField(term2590742, term2590742.getClass(), "cultProdExplain", null);
        setField(term2590742, term2590742.getClass(), "credProdExplain", null);
        setField(term2590742, term2590742.getClass(), "governor", null);
        setIntField(term2590742, term2590742.getClass(), "governorGuide", 0);
        setField(term2590742, term2590742.getClass(), "orbital", null);
        setField(term2590742, term2590742.getClass(), "workers", null);
        setField(term2590742, term2590742.getClass(), "buildings", null);
        setField(term2590742, term2590742.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProdResource", argTypes, term2590742, args);
    }

};



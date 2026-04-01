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

public class Planet_decreaseTemperatureType_211481668072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306506;

    public Planet_decreaseTemperatureType_211481668072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term306506 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term306506, term306506.getClass(), "name", null);
        setIntField(term306506, term306506.getClass(), "orderNumber", 0);
        setField(term306506, term306506.getClass(), "radiationType", null);
        setField(term306506, term306506.getClass(), "gravityType", null);
        setField(term306506, term306506.getClass(), "temperatureType", null);
        setField(term306506, term306506.getClass(), "waterLevel", null);
        setBooleanField(term306506, term306506.getClass(), "gasGiant", false);
        setField(term306506, term306506.getClass(), "coordinate", null);
        setField(term306506, term306506.getClass(), "planetType", null);
        setIntField(term306506, term306506.getClass(), "groundSize", 0);
        setIntField(term306506, term306506.getClass(), "amountMetalInGround", 0);
        setIntField(term306506, term306506.getClass(), "metal", 0);
        setIntField(term306506, term306506.getClass(), "prodResource", 0);
        setIntField(term306506, term306506.getClass(), "extraFood", 0);
        setIntField(term306506, term306506.getClass(), "culture", 0);
        setIntField(term306506, term306506.getClass(), "planetOwner", 0);
        setField(term306506, term306506.getClass(), "planetOwnerInfo", null);
        setField(term306506, term306506.getClass(), "homeWorldId", null);
        setIntField(term306506, term306506.getClass(), "startRealmIndex", 0);
        setIntField(term306506, term306506.getClass(), "tax", 0);
        setField(term306506, term306506.getClass(), "statuses", null);
        setField(term306506, term306506.getClass(), "timedStatuses", null);
        setField(term306506, term306506.getClass(), "event", null);
        setBooleanField(term306506, term306506.getClass(), "eventFound", false);
        setField(term306506, term306506.getClass(), "happinessEffect", null);
        setField(term306506, term306506.getClass(), "happinessExplanation", null);
        setField(term306506, term306506.getClass(), "farmProdExplain", null);
        setField(term306506, term306506.getClass(), "metaProdExplain", null);
        setField(term306506, term306506.getClass(), "prodProdExplain", null);
        setField(term306506, term306506.getClass(), "reseProdExplain", null);
        setField(term306506, term306506.getClass(), "cultProdExplain", null);
        setField(term306506, term306506.getClass(), "credProdExplain", null);
        setField(term306506, term306506.getClass(), "governor", null);
        setIntField(term306506, term306506.getClass(), "governorGuide", 0);
        setField(term306506, term306506.getClass(), "orbital", null);
        setField(term306506, term306506.getClass(), "workers", null);
        setField(term306506, term306506.getClass(), "buildings", null);
        setField(term306506, term306506.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "decreaseTemperatureType", argTypes, term306506, args);
    }

};



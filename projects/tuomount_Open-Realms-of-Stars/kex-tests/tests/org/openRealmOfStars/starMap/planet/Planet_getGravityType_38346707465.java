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

public class Planet_getGravityType_38346707465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278791;

    public Planet_getGravityType_38346707465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278791 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term278791, term278791.getClass(), "name", null);
        setIntField(term278791, term278791.getClass(), "orderNumber", 0);
        setField(term278791, term278791.getClass(), "radiationType", null);
        setField(term278791, term278791.getClass(), "gravityType", null);
        setField(term278791, term278791.getClass(), "temperatureType", null);
        setField(term278791, term278791.getClass(), "waterLevel", null);
        setBooleanField(term278791, term278791.getClass(), "gasGiant", false);
        setField(term278791, term278791.getClass(), "coordinate", null);
        setField(term278791, term278791.getClass(), "planetType", null);
        setIntField(term278791, term278791.getClass(), "groundSize", 0);
        setIntField(term278791, term278791.getClass(), "amountMetalInGround", 0);
        setIntField(term278791, term278791.getClass(), "metal", 0);
        setIntField(term278791, term278791.getClass(), "prodResource", 0);
        setIntField(term278791, term278791.getClass(), "extraFood", 0);
        setIntField(term278791, term278791.getClass(), "culture", 0);
        setIntField(term278791, term278791.getClass(), "planetOwner", 0);
        setField(term278791, term278791.getClass(), "planetOwnerInfo", null);
        setField(term278791, term278791.getClass(), "homeWorldId", null);
        setIntField(term278791, term278791.getClass(), "startRealmIndex", 0);
        setIntField(term278791, term278791.getClass(), "tax", 0);
        setField(term278791, term278791.getClass(), "statuses", null);
        setField(term278791, term278791.getClass(), "timedStatuses", null);
        setField(term278791, term278791.getClass(), "event", null);
        setBooleanField(term278791, term278791.getClass(), "eventFound", false);
        setField(term278791, term278791.getClass(), "happinessEffect", null);
        setField(term278791, term278791.getClass(), "happinessExplanation", null);
        setField(term278791, term278791.getClass(), "farmProdExplain", null);
        setField(term278791, term278791.getClass(), "metaProdExplain", null);
        setField(term278791, term278791.getClass(), "prodProdExplain", null);
        setField(term278791, term278791.getClass(), "reseProdExplain", null);
        setField(term278791, term278791.getClass(), "cultProdExplain", null);
        setField(term278791, term278791.getClass(), "credProdExplain", null);
        setField(term278791, term278791.getClass(), "governor", null);
        setIntField(term278791, term278791.getClass(), "governorGuide", 0);
        setField(term278791, term278791.getClass(), "orbital", null);
        setField(term278791, term278791.getClass(), "workers", null);
        setField(term278791, term278791.getClass(), "buildings", null);
        setField(term278791, term278791.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGravityType", argTypes, term278791, args);
    }

};



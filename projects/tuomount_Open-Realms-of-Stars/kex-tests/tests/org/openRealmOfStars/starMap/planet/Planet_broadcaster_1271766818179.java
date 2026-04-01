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

public class Planet_broadcaster_1271766818179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term754305;

    public Planet_broadcaster_1271766818179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term754305 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term754305, term754305.getClass(), "name", null);
        setIntField(term754305, term754305.getClass(), "orderNumber", 0);
        setField(term754305, term754305.getClass(), "radiationType", null);
        setField(term754305, term754305.getClass(), "gravityType", null);
        setField(term754305, term754305.getClass(), "temperatureType", null);
        setField(term754305, term754305.getClass(), "waterLevel", null);
        setBooleanField(term754305, term754305.getClass(), "gasGiant", false);
        setField(term754305, term754305.getClass(), "coordinate", null);
        setField(term754305, term754305.getClass(), "planetType", null);
        setIntField(term754305, term754305.getClass(), "groundSize", 0);
        setIntField(term754305, term754305.getClass(), "amountMetalInGround", 0);
        setIntField(term754305, term754305.getClass(), "metal", 0);
        setIntField(term754305, term754305.getClass(), "prodResource", 0);
        setIntField(term754305, term754305.getClass(), "extraFood", 0);
        setIntField(term754305, term754305.getClass(), "culture", 0);
        setIntField(term754305, term754305.getClass(), "planetOwner", 0);
        setField(term754305, term754305.getClass(), "planetOwnerInfo", null);
        setField(term754305, term754305.getClass(), "homeWorldId", null);
        setIntField(term754305, term754305.getClass(), "startRealmIndex", 0);
        setIntField(term754305, term754305.getClass(), "tax", 0);
        setField(term754305, term754305.getClass(), "statuses", null);
        setField(term754305, term754305.getClass(), "timedStatuses", null);
        setField(term754305, term754305.getClass(), "event", null);
        setBooleanField(term754305, term754305.getClass(), "eventFound", false);
        setField(term754305, term754305.getClass(), "happinessEffect", null);
        setField(term754305, term754305.getClass(), "happinessExplanation", null);
        setField(term754305, term754305.getClass(), "farmProdExplain", null);
        setField(term754305, term754305.getClass(), "metaProdExplain", null);
        setField(term754305, term754305.getClass(), "prodProdExplain", null);
        setField(term754305, term754305.getClass(), "reseProdExplain", null);
        setField(term754305, term754305.getClass(), "cultProdExplain", null);
        setField(term754305, term754305.getClass(), "credProdExplain", null);
        setField(term754305, term754305.getClass(), "governor", null);
        setIntField(term754305, term754305.getClass(), "governorGuide", 0);
        setField(term754305, term754305.getClass(), "orbital", null);
        setField(term754305, term754305.getClass(), "workers", null);
        setField(term754305, term754305.getClass(), "buildings", null);
        setField(term754305, term754305.getClass(), "underConstruction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "broadcaster", argTypes, term754305, args);
    }

};



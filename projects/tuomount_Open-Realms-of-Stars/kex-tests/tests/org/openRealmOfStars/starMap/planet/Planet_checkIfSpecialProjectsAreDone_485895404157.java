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

public class Planet_checkIfSpecialProjectsAreDone_485895404157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2663085;
     Object term2663099;
     Object term2663101;

    public Planet_checkIfSpecialProjectsAreDone_485895404157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2663085 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2663085, term2663085.getClass(), "name", null);
        setIntField(term2663085, term2663085.getClass(), "orderNumber", 0);
        setField(term2663085, term2663085.getClass(), "radiationType", null);
        setField(term2663085, term2663085.getClass(), "gravityType", null);
        setField(term2663085, term2663085.getClass(), "temperatureType", null);
        setField(term2663085, term2663085.getClass(), "waterLevel", null);
        setBooleanField(term2663085, term2663085.getClass(), "gasGiant", false);
        setField(term2663085, term2663085.getClass(), "coordinate", null);
        setField(term2663085, term2663085.getClass(), "planetType", null);
        setIntField(term2663085, term2663085.getClass(), "groundSize", 0);
        setIntField(term2663085, term2663085.getClass(), "amountMetalInGround", 0);
        setIntField(term2663085, term2663085.getClass(), "metal", 0);
        setIntField(term2663085, term2663085.getClass(), "prodResource", 0);
        setIntField(term2663085, term2663085.getClass(), "extraFood", 0);
        setIntField(term2663085, term2663085.getClass(), "culture", 0);
        setIntField(term2663085, term2663085.getClass(), "planetOwner", 0);
        setField(term2663085, term2663085.getClass(), "planetOwnerInfo", null);
        setField(term2663085, term2663085.getClass(), "homeWorldId", null);
        setIntField(term2663085, term2663085.getClass(), "startRealmIndex", 0);
        setIntField(term2663085, term2663085.getClass(), "tax", 0);
        setField(term2663085, term2663085.getClass(), "statuses", null);
        setField(term2663085, term2663085.getClass(), "timedStatuses", null);
        setField(term2663085, term2663085.getClass(), "event", null);
        setBooleanField(term2663085, term2663085.getClass(), "eventFound", false);
        setField(term2663085, term2663085.getClass(), "happinessEffect", null);
        setField(term2663085, term2663085.getClass(), "happinessExplanation", null);
        setField(term2663085, term2663085.getClass(), "farmProdExplain", null);
        setField(term2663085, term2663085.getClass(), "metaProdExplain", null);
        setField(term2663085, term2663085.getClass(), "prodProdExplain", null);
        setField(term2663085, term2663085.getClass(), "reseProdExplain", null);
        setField(term2663085, term2663085.getClass(), "cultProdExplain", null);
        setField(term2663085, term2663085.getClass(), "credProdExplain", null);
        setField(term2663085, term2663085.getClass(), "governor", null);
        setIntField(term2663085, term2663085.getClass(), "governorGuide", 0);
        setField(term2663085, term2663085.getClass(), "orbital", null);
        setField(term2663085, term2663085.getClass(), "workers", null);
        setField(term2663085, term2663085.getClass(), "buildings", null);
        setField(term2663085, term2663085.getClass(), "underConstruction", null);
        term2663099 = new Integer(0);
        term2663101 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term2663099;
        args[2] = term2663101;
        callMethod(klass, "checkIfSpecialProjectsAreDone", argTypes, term2663085, args);
    }

};



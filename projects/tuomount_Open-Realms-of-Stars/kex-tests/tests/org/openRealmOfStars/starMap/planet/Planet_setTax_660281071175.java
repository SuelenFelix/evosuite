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
import java.lang.Boolean;

public class Planet_setTax_660281071175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2746632;
     Object term2746646;
     Object term2746648;

    public Planet_setTax_660281071175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2746632 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2746632, term2746632.getClass(), "name", null);
        setIntField(term2746632, term2746632.getClass(), "orderNumber", 0);
        setField(term2746632, term2746632.getClass(), "radiationType", null);
        setField(term2746632, term2746632.getClass(), "gravityType", null);
        setField(term2746632, term2746632.getClass(), "temperatureType", null);
        setField(term2746632, term2746632.getClass(), "waterLevel", null);
        setBooleanField(term2746632, term2746632.getClass(), "gasGiant", false);
        setField(term2746632, term2746632.getClass(), "coordinate", null);
        setField(term2746632, term2746632.getClass(), "planetType", null);
        setIntField(term2746632, term2746632.getClass(), "groundSize", 0);
        setIntField(term2746632, term2746632.getClass(), "amountMetalInGround", 0);
        setIntField(term2746632, term2746632.getClass(), "metal", 0);
        setIntField(term2746632, term2746632.getClass(), "prodResource", 0);
        setIntField(term2746632, term2746632.getClass(), "extraFood", 0);
        setIntField(term2746632, term2746632.getClass(), "culture", 0);
        setIntField(term2746632, term2746632.getClass(), "planetOwner", 0);
        setField(term2746632, term2746632.getClass(), "planetOwnerInfo", null);
        setField(term2746632, term2746632.getClass(), "homeWorldId", null);
        setIntField(term2746632, term2746632.getClass(), "startRealmIndex", 0);
        setIntField(term2746632, term2746632.getClass(), "tax", 0);
        setField(term2746632, term2746632.getClass(), "statuses", null);
        setField(term2746632, term2746632.getClass(), "timedStatuses", null);
        setField(term2746632, term2746632.getClass(), "event", null);
        setBooleanField(term2746632, term2746632.getClass(), "eventFound", false);
        setField(term2746632, term2746632.getClass(), "happinessEffect", null);
        setField(term2746632, term2746632.getClass(), "happinessExplanation", null);
        setField(term2746632, term2746632.getClass(), "farmProdExplain", null);
        setField(term2746632, term2746632.getClass(), "metaProdExplain", null);
        setField(term2746632, term2746632.getClass(), "prodProdExplain", null);
        setField(term2746632, term2746632.getClass(), "reseProdExplain", null);
        setField(term2746632, term2746632.getClass(), "cultProdExplain", null);
        setField(term2746632, term2746632.getClass(), "credProdExplain", null);
        setField(term2746632, term2746632.getClass(), "governor", null);
        setIntField(term2746632, term2746632.getClass(), "governorGuide", 0);
        setField(term2746632, term2746632.getClass(), "orbital", null);
        setField(term2746632, term2746632.getClass(), "workers", null);
        setField(term2746632, term2746632.getClass(), "buildings", null);
        setField(term2746632, term2746632.getClass(), "underConstruction", null);
        term2746646 = new Integer(0);
        term2746648 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term2746646;
        args[1] = term2746648;
        callMethod(klass, "setTax", argTypes, term2746632, args);
    }

};



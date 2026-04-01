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

public class Planet_setTax_660281071168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term710684;
     Object term710698;
     Object term710700;

    public Planet_setTax_660281071168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term710684 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term710684, term710684.getClass(), "name", null);
        setIntField(term710684, term710684.getClass(), "orderNumber", 0);
        setField(term710684, term710684.getClass(), "radiationType", null);
        setField(term710684, term710684.getClass(), "gravityType", null);
        setField(term710684, term710684.getClass(), "temperatureType", null);
        setField(term710684, term710684.getClass(), "waterLevel", null);
        setBooleanField(term710684, term710684.getClass(), "gasGiant", false);
        setField(term710684, term710684.getClass(), "coordinate", null);
        setField(term710684, term710684.getClass(), "planetType", null);
        setIntField(term710684, term710684.getClass(), "groundSize", 0);
        setIntField(term710684, term710684.getClass(), "amountMetalInGround", 0);
        setIntField(term710684, term710684.getClass(), "metal", 0);
        setIntField(term710684, term710684.getClass(), "prodResource", 0);
        setIntField(term710684, term710684.getClass(), "extraFood", 0);
        setIntField(term710684, term710684.getClass(), "culture", 0);
        setIntField(term710684, term710684.getClass(), "planetOwner", 0);
        setField(term710684, term710684.getClass(), "planetOwnerInfo", null);
        setField(term710684, term710684.getClass(), "homeWorldId", null);
        setIntField(term710684, term710684.getClass(), "startRealmIndex", 0);
        setIntField(term710684, term710684.getClass(), "tax", 0);
        setField(term710684, term710684.getClass(), "statuses", null);
        setField(term710684, term710684.getClass(), "timedStatuses", null);
        setField(term710684, term710684.getClass(), "event", null);
        setBooleanField(term710684, term710684.getClass(), "eventFound", false);
        setField(term710684, term710684.getClass(), "happinessEffect", null);
        setField(term710684, term710684.getClass(), "happinessExplanation", null);
        setField(term710684, term710684.getClass(), "farmProdExplain", null);
        setField(term710684, term710684.getClass(), "metaProdExplain", null);
        setField(term710684, term710684.getClass(), "prodProdExplain", null);
        setField(term710684, term710684.getClass(), "reseProdExplain", null);
        setField(term710684, term710684.getClass(), "cultProdExplain", null);
        setField(term710684, term710684.getClass(), "credProdExplain", null);
        setField(term710684, term710684.getClass(), "governor", null);
        setIntField(term710684, term710684.getClass(), "governorGuide", 0);
        setField(term710684, term710684.getClass(), "orbital", null);
        setField(term710684, term710684.getClass(), "workers", null);
        setField(term710684, term710684.getClass(), "buildings", null);
        setField(term710684, term710684.getClass(), "underConstruction", null);
        term710698 = new Integer(0);
        term710700 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term710698;
        args[1] = term710700;
        callMethod(klass, "setTax", argTypes, term710684, args);
    }

};



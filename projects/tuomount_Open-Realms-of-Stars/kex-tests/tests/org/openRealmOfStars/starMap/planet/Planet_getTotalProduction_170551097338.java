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

public class Planet_getTotalProduction_170551097338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2218996;
     Object term2219010;

    public Planet_getTotalProduction_170551097338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2218996 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2218996, term2218996.getClass(), "name", null);
        setIntField(term2218996, term2218996.getClass(), "orderNumber", 0);
        setField(term2218996, term2218996.getClass(), "radiationType", null);
        setField(term2218996, term2218996.getClass(), "gravityType", null);
        setField(term2218996, term2218996.getClass(), "temperatureType", null);
        setField(term2218996, term2218996.getClass(), "waterLevel", null);
        setBooleanField(term2218996, term2218996.getClass(), "gasGiant", false);
        setField(term2218996, term2218996.getClass(), "coordinate", null);
        setField(term2218996, term2218996.getClass(), "planetType", null);
        setIntField(term2218996, term2218996.getClass(), "groundSize", 0);
        setIntField(term2218996, term2218996.getClass(), "amountMetalInGround", 0);
        setIntField(term2218996, term2218996.getClass(), "metal", 0);
        setIntField(term2218996, term2218996.getClass(), "prodResource", 0);
        setIntField(term2218996, term2218996.getClass(), "extraFood", 0);
        setIntField(term2218996, term2218996.getClass(), "culture", 0);
        setIntField(term2218996, term2218996.getClass(), "planetOwner", 0);
        setField(term2218996, term2218996.getClass(), "planetOwnerInfo", null);
        setField(term2218996, term2218996.getClass(), "homeWorldId", null);
        setIntField(term2218996, term2218996.getClass(), "startRealmIndex", 0);
        setIntField(term2218996, term2218996.getClass(), "tax", 0);
        setField(term2218996, term2218996.getClass(), "statuses", null);
        setField(term2218996, term2218996.getClass(), "timedStatuses", null);
        setField(term2218996, term2218996.getClass(), "event", null);
        setBooleanField(term2218996, term2218996.getClass(), "eventFound", false);
        setField(term2218996, term2218996.getClass(), "happinessEffect", null);
        setField(term2218996, term2218996.getClass(), "happinessExplanation", null);
        setField(term2218996, term2218996.getClass(), "farmProdExplain", null);
        setField(term2218996, term2218996.getClass(), "metaProdExplain", null);
        setField(term2218996, term2218996.getClass(), "prodProdExplain", null);
        setField(term2218996, term2218996.getClass(), "reseProdExplain", null);
        setField(term2218996, term2218996.getClass(), "cultProdExplain", null);
        setField(term2218996, term2218996.getClass(), "credProdExplain", null);
        setField(term2218996, term2218996.getClass(), "governor", null);
        setIntField(term2218996, term2218996.getClass(), "governorGuide", 0);
        setField(term2218996, term2218996.getClass(), "orbital", null);
        setField(term2218996, term2218996.getClass(), "workers", null);
        setField(term2218996, term2218996.getClass(), "buildings", null);
        setField(term2218996, term2218996.getClass(), "underConstruction", null);
        term2219010 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2219010;
        callMethod(klass, "getTotalProduction", argTypes, term2218996, args);
    }

};



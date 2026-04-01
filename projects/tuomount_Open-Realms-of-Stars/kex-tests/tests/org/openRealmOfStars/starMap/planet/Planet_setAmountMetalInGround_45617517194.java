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

public class Planet_setAmountMetalInGround_45617517194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2416566;
     Object term2416580;

    public Planet_setAmountMetalInGround_45617517194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2416566 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2416566, term2416566.getClass(), "name", null);
        setIntField(term2416566, term2416566.getClass(), "orderNumber", 0);
        setField(term2416566, term2416566.getClass(), "radiationType", null);
        setField(term2416566, term2416566.getClass(), "gravityType", null);
        setField(term2416566, term2416566.getClass(), "temperatureType", null);
        setField(term2416566, term2416566.getClass(), "waterLevel", null);
        setBooleanField(term2416566, term2416566.getClass(), "gasGiant", false);
        setField(term2416566, term2416566.getClass(), "coordinate", null);
        setField(term2416566, term2416566.getClass(), "planetType", null);
        setIntField(term2416566, term2416566.getClass(), "groundSize", 0);
        setIntField(term2416566, term2416566.getClass(), "amountMetalInGround", 0);
        setIntField(term2416566, term2416566.getClass(), "metal", 0);
        setIntField(term2416566, term2416566.getClass(), "prodResource", 0);
        setIntField(term2416566, term2416566.getClass(), "extraFood", 0);
        setIntField(term2416566, term2416566.getClass(), "culture", 0);
        setIntField(term2416566, term2416566.getClass(), "planetOwner", 0);
        setField(term2416566, term2416566.getClass(), "planetOwnerInfo", null);
        setField(term2416566, term2416566.getClass(), "homeWorldId", null);
        setIntField(term2416566, term2416566.getClass(), "startRealmIndex", 0);
        setIntField(term2416566, term2416566.getClass(), "tax", 0);
        setField(term2416566, term2416566.getClass(), "statuses", null);
        setField(term2416566, term2416566.getClass(), "timedStatuses", null);
        setField(term2416566, term2416566.getClass(), "event", null);
        setBooleanField(term2416566, term2416566.getClass(), "eventFound", false);
        setField(term2416566, term2416566.getClass(), "happinessEffect", null);
        setField(term2416566, term2416566.getClass(), "happinessExplanation", null);
        setField(term2416566, term2416566.getClass(), "farmProdExplain", null);
        setField(term2416566, term2416566.getClass(), "metaProdExplain", null);
        setField(term2416566, term2416566.getClass(), "prodProdExplain", null);
        setField(term2416566, term2416566.getClass(), "reseProdExplain", null);
        setField(term2416566, term2416566.getClass(), "cultProdExplain", null);
        setField(term2416566, term2416566.getClass(), "credProdExplain", null);
        setField(term2416566, term2416566.getClass(), "governor", null);
        setIntField(term2416566, term2416566.getClass(), "governorGuide", 0);
        setField(term2416566, term2416566.getClass(), "orbital", null);
        setField(term2416566, term2416566.getClass(), "workers", null);
        setField(term2416566, term2416566.getClass(), "buildings", null);
        setField(term2416566, term2416566.getClass(), "underConstruction", null);
        term2416580 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2416580;
        callMethod(klass, "setAmountMetalInGround", argTypes, term2416566, args);
    }

};



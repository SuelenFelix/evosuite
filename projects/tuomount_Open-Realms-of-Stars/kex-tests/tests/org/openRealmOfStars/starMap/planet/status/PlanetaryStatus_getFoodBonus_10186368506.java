package org.openRealmOfStars.starMap.planet.status;

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
import static org.openRealmOfStars.starMap.planet.status.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PlanetaryStatus_getFoodBonus_10186368506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6885;

    public PlanetaryStatus_getFoodBonus_10186368506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6885 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus"));
        Object[] term6922 = (Object[]) newArray("java.lang.String", 5);
        setField(term6885, term6885.getClass(), "statusId", "vwbEQQNQrx");
        setField(term6885, term6885.getClass(), "name", "xtftXXMbem");
        setField(term6885, term6885.getClass(), "description", "cudZvLMQon");
        setElement(term6922, 0, "lihXWlGDxk");
        setElement(term6922, 1, "JmcmxoGhIK");
        setElement(term6922, 2, "jXzmYyrnnT");
        setElement(term6922, 3, "igCAtimmYB");
        setElement(term6922, 4, "DyiXbeYIaN");
        setField(term6885, term6885.getClass(), "conflictingIds", term6922);
        setIntField(term6885, term6885.getClass(), "foodBonus", 71190297);
        setIntField(term6885, term6885.getClass(), "happinessBonus", 1202361360);
        setIntField(term6885, term6885.getClass(), "mineBonus", -2015048153);
        setIntField(term6885, term6885.getClass(), "prodBonus", -2063457669);
        setIntField(term6885, term6885.getClass(), "credBonus", -1222006000);
        setIntField(term6885, term6885.getClass(), "reseBonus", 2095798786);
        setBooleanField(term6885, term6885.getClass(), "hidden", true);
        setField(term6885, term6885.getClass(), "discoveryText", "VGizxZnyHX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.status.PlanetaryStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFoodBonus", argTypes, term6885, args);
    }

};



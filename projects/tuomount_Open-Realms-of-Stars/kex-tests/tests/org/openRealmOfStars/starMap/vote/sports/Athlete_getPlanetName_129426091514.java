package org.openRealmOfStars.starMap.vote.sports;

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
import static org.openRealmOfStars.starMap.vote.sports.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Athlete_getPlanetName_129426091514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89373;

    public Athlete_getPlanetName_129426091514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89373 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.sports.Athlete"));
        setIntField(term89373, term89373.getClass(), "bonus", 0);
        setField(term89373, term89373.getClass(), "planetName", null);
        setField(term89373, term89373.getClass(), "realm", null);
        setIntField(term89373, term89373.getClass(), "sportingValue", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.sports.Athlete");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlanetName", argTypes, term89373, args);
    }

};



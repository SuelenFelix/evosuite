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
import java.lang.Integer;

public class Athlete_setSportingValue_171851417014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55696;
     Object term55699;

    public Athlete_setSportingValue_171851417014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55696 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.sports.Athlete"));
        setIntField(term55696, term55696.getClass(), "bonus", 0);
        setField(term55696, term55696.getClass(), "planetName", null);
        setField(term55696, term55696.getClass(), "realm", null);
        setIntField(term55696, term55696.getClass(), "sportingValue", 0);
        term55699 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.sports.Athlete");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term55699;
        callMethod(klass, "setSportingValue", argTypes, term55696, args);
    }

};



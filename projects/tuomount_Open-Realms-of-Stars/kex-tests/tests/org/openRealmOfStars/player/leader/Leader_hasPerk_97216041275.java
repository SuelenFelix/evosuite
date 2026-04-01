package org.openRealmOfStars.player.leader;

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
import static org.openRealmOfStars.player.leader.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Leader_hasPerk_97216041275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1266496;

    public Leader_hasPerk_97216041275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1266496 = newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"));
        setField(term1266496, term1266496.getClass(), "name", null);
        setField(term1266496, term1266496.getClass(), "homeworld", null);
        setIntField(term1266496, term1266496.getClass(), "age", 0);
        setIntField(term1266496, term1266496.getClass(), "timeInJob", 0);
        setIntField(term1266496, term1266496.getClass(), "level", 0);
        setIntField(term1266496, term1266496.getClass(), "experience", 0);
        setField(term1266496, term1266496.getClass(), "militaryRank", null);
        setField(term1266496, term1266496.getClass(), "gender", null);
        setField(term1266496, term1266496.getClass(), "race", null);
        setField(term1266496, term1266496.getClass(), "title", null);
        setField(term1266496, term1266496.getClass(), "job", null);
        setField(term1266496, term1266496.getClass(), "parent", null);
        setIntField(term1266496, term1266496.getClass(), "parentIndex", 0);
        setField(term1266496, term1266496.getClass(), "perkList", null);
        setField(term1266496, term1266496.getClass(), "stats", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.leader.Leader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.leader.Perk");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "hasPerk", argTypes, term1266496, args);
    }

};



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

public class RecruitableLeader_getLeader_12931007488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263919;

    public RecruitableLeader_getLeader_12931007488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term263919 = newInstance(Class.forName("org.openRealmOfStars.player.leader.RecruitableLeader"));
        setIntField(term263919, term263919.getClass(), "recruitCost", 0);
        setField(term263919, term263919.getClass(), "leader", null);
        setBooleanField(term263919, term263919.getClass(), "requirePopulation", false);
        setIntField(term263919, term263919.getClass(), "realmIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.leader.RecruitableLeader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLeader", argTypes, term263919, args);
    }

};



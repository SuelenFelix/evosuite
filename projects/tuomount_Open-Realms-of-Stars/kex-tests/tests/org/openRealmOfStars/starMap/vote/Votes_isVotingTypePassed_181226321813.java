package org.openRealmOfStars.starMap.vote;

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
import static org.openRealmOfStars.starMap.vote.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class Votes_isVotingTypePassed_181226321813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24387;
     Object enum72;

    public Votes_isVotingTypePassed_181226321813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term24388 = new ArrayList();
        term24387 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Votes"));
        setField(term24387, term24387.getClass(), "listOfVotes", term24388);
        Class<? extends Object> term24412 = Class.forName((String) "org.openRealmOfStars.starMap.vote.VotingType");
        Field term24411 = ((Class) term24412).getDeclaredField((String) "RULER_OF_GALAXY");
        ((Field) term24411).setAccessible(true);
        enum72 = ((Field) term24411).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Votes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.vote.VotingType");
        Object[] args = new Object[1];
        args[0] = enum72;
        callMethod(klass, "isVotingTypePassed", argTypes, term24387, args);
    }

};



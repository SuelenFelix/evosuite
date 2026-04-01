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
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class Vote_setSecondCandidateIndex_110361611120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21931;
     Object term22005;

    public Vote_setSecondCandidateIndex_110361611120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22008 = Class.forName((String) "org.openRealmOfStars.starMap.vote.VotingType");
        Field term22007 = ((Class) term22008).getDeclaredField((String) "TAXATION_OF_RICHEST_REALM");
        ((Field) term22007).setAccessible(true);
        Object enum65 = ((Field) term22007).get((Object) null);
        Class<? extends Object> term22310 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term22309 = ((Class) term22310).getDeclaredField((String) "VOTED_NO");
        ((Field) term22309).setAccessible(true);
        Object enum66 = ((Field) term22309).get((Object) null);
        Class<? extends Object> term22606 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term22605 = ((Class) term22606).getDeclaredField((String) "NOT_VOTED");
        ((Field) term22605).setAccessible(true);
        Object enum67 = ((Field) term22605).get((Object) null);
        term21931 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        Object[] term21961 = (Object[]) newArray("org.openRealmOfStars.starMap.vote.sports.VotingChoice", 2);
        int[] term21987 = (int[]) newIntArray(2);
        setField(term21931, term21931.getClass(), "type", enum65);
        setElement(term21961, 0, enum66);
        setElement(term21961, 1, enum67);
        setField(term21931, term21931.getClass(), "choices", term21961);
        setIntElement(term21987, 0, -376422566);
        setIntElement(term21987, 1, 306847454);
        setField(term21931, term21931.getClass(), "numberOfVotes", term21987);
        setIntField(term21931, term21931.getClass(), "turnsToVote", 1745276158);
        setIntField(term21931, term21931.getClass(), "organizerIndex", 2009020256);
        setIntField(term21931, term21931.getClass(), "secondCandidateIndex", 2049577015);
        setField(term21931, term21931.getClass(), "planetName", "flxyYxBRtu");
        term22005 = new Integer(1236004505);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term22005;
        callMethod(klass, "setSecondCandidateIndex", argTypes, term21931, args);
    }

};



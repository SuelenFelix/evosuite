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

public class Vote_setTurnsToVote_11446920297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6623;
     Object term6694;

    public Vote_setTurnsToVote_11446920297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6697 = Class.forName((String) "org.openRealmOfStars.starMap.vote.VotingType");
        Field term6696 = ((Class) term6697).getDeclaredField((String) "SECOND_CANDIDATE_MILITARY");
        ((Field) term6696).setAccessible(true);
        Object enum20 = ((Field) term6696).get((Object) null);
        Class<? extends Object> term6999 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term6998 = ((Class) term6999).getDeclaredField((String) "ABSTAIN");
        ((Field) term6998).setAccessible(true);
        Object enum21 = ((Field) term6998).get((Object) null);
        Class<? extends Object> term7292 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term7291 = ((Class) term7292).getDeclaredField((String) "VOTED_NO");
        ((Field) term7291).setAccessible(true);
        Object enum22 = ((Field) term7291).get((Object) null);
        term6623 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        Object[] term6653 = (Object[]) newArray("org.openRealmOfStars.starMap.vote.sports.VotingChoice", 3);
        int[] term6677 = (int[]) newIntArray(1);
        setField(term6623, term6623.getClass(), "type", enum20);
        setElement(term6653, 0, enum21);
        setElement(term6653, 1, enum22);
        setElement(term6653, 2, enum21);
        setField(term6623, term6623.getClass(), "choices", term6653);
        setIntElement(term6677, 0, 1962444399);
        setField(term6623, term6623.getClass(), "numberOfVotes", term6677);
        setIntField(term6623, term6623.getClass(), "turnsToVote", 767834723);
        setIntField(term6623, term6623.getClass(), "organizerIndex", -602026508);
        setIntField(term6623, term6623.getClass(), "secondCandidateIndex", -157887805);
        setField(term6623, term6623.getClass(), "planetName", "EGtDIRbSSb");
        term6694 = new Integer(1876565163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6694;
        callMethod(klass, "setTurnsToVote", argTypes, term6623, args);
    }

};



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

public class Votes_addNewVote_19575010353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23062;
     Object term23067;

    public Votes_addNewVote_19575010353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term23063 = new ArrayList();
        term23062 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Votes"));
        setField(term23062, term23062.getClass(), "listOfVotes", term23063);
        Class<? extends Object> term23146 = Class.forName((String) "org.openRealmOfStars.starMap.vote.VotingType");
        Field term23145 = ((Class) term23146).getDeclaredField((String) "FIRST_CANDIDATE");
        ((Field) term23145).setAccessible(true);
        Object enum68 = ((Field) term23145).get((Object) null);
        Class<? extends Object> term23418 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term23417 = ((Class) term23418).getDeclaredField((String) "VOTED_YES");
        ((Field) term23417).setAccessible(true);
        Object enum69 = ((Field) term23417).get((Object) null);
        Class<? extends Object> term23717 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term23716 = ((Class) term23717).getDeclaredField((String) "ABSTAIN");
        ((Field) term23716).setAccessible(true);
        Object enum70 = ((Field) term23716).get((Object) null);
        Class<? extends Object> term24010 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term24009 = ((Class) term24010).getDeclaredField((String) "NOT_VOTED");
        ((Field) term24009).setAccessible(true);
        Object enum71 = ((Field) term24009).get((Object) null);
        term23067 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        Object[] term23087 = (Object[]) newArray("org.openRealmOfStars.starMap.vote.sports.VotingChoice", 5);
        int[] term23125 = (int[]) newIntArray(4);
        setField(term23067, term23067.getClass(), "type", enum68);
        setElement(term23087, 0, enum69);
        setElement(term23087, 1, enum70);
        setElement(term23087, 2, enum71);
        setElement(term23087, 3, enum69);
        setElement(term23087, 4, enum70);
        setField(term23067, term23067.getClass(), "choices", term23087);
        setIntElement(term23125, 0, 474518942);
        setIntElement(term23125, 1, -1656687479);
        setIntElement(term23125, 2, -249614216);
        setIntElement(term23125, 3, 1870727665);
        setField(term23067, term23067.getClass(), "numberOfVotes", term23125);
        setIntField(term23067, term23067.getClass(), "turnsToVote", -519881101);
        setIntField(term23067, term23067.getClass(), "organizerIndex", -680920524);
        setIntField(term23067, term23067.getClass(), "secondCandidateIndex", -916335264);
        setField(term23067, term23067.getClass(), "planetName", "OclPbYPkcH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Votes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        Object[] args = new Object[1];
        args[0] = term23067;
        callMethod(klass, "addNewVote", argTypes, term23062, args);
    }

};


